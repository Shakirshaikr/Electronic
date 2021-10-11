package com.elctronic.laptop;

public interface LaptopDAO {
	
		
		void saveLaptopRecord();

		void updateBrand();

		void deleteLaptopByID();

		void readSingleRecordByID();

		void readAllRecords();
		
		}


