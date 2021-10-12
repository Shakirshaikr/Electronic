package com.elctronic.laptop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class LaptopDAOImpl implements LaptopDAO {

		@Override
		public void saveLaptopRecord() {
			 System.out.println("invoke saveLapyopRecord()");
				
			 String url = "jdbc:mysql://localhost:3306/Laptopdb";
				
			 String userName ="root"; 
				
			 String password ="shaikhshakir11"; 
				
			 String insertQuery = "insert into laptopdb.laptop values(3,'black','Dell',40000.0)";
				
				
			  Connection connection = null;
			    
				try {
					//Class.forName("com.mysql.cj.jdbc.Driver");//this line is optional 
					connection = DriverManager.getConnection(url, userName, password);
					
					System.out.println("connection is successful " +url);
					
					Statement statement = connection.createStatement();
					
					statement.execute(insertQuery);
				
				} catch (SQLException exception) {
					  System.out.println(" inside catch blockSQLException ");
					  System.out.println(exception.getMessage());
					  exception.printStackTrace();
				} catch (Exception classNotFoundException) {
						System.out.println(classNotFoundException.getMessage());
				
				    }   finally {
				    		try {
				    			if(connection != null) {
				    				connection.close();
				    				System.out.println("connection is closed");
						}
					    else {
						System.out.println("connection is not closed");
					}
				 }catch (SQLException e) {	
					e.printStackTrace();
				    }
				
		      }

	        }
		
		@Override
		public void updateBrand() {
			String url = "jdbc:mysql://localhost:3306/Laptopdb";
			
			String userName ="root"; 
			
			String password ="Shaikhshakir11"; 
			
			String updateBrandQuery = "update laptopdb.laptop set BRAND='macbook'Where LAPTOP_ID=3";
			
		       Connection connection = null;
		    
			 try {
				  //Class.forName("com.mysql.cj.jdbc.Driver");//this line is optional 
				  connection = DriverManager.getConnection(url, userName, password);
				
				  System.out.println("connection is successful " +url);
				
				  Statement statement = connection.createStatement();
				
				  statement.execute(updateBrandQuery);
				
			} catch (SQLException exception) {
				  System.out.println(" inside catch blockSQLException ");
				  System.out.println(exception.getMessage());
				  exception.printStackTrace();
			} catch (Exception classNotFoundException) {
					System.out.println(classNotFoundException.getMessage());
			
			    }   finally {
			    		try {
			    			if(connection != null) {
			    				connection.close();
			    				System.out.println("connection is closed");
					}
				    else {
					System.out.println("connection is not closed");
				}
			 }catch (SQLException e) {	
				e.printStackTrace();
			    }
			
	           }	
			
		}

		@Override
		public void deleteLaptopByID() {
			
                         String url = "jdbc:mysql://localhost:3306/Laptopdb";
			
			 String userName ="root"; 
			
			 String password ="shaikhshakir11"; 
			
			 String deleteLaptop = "delete from laptopdb.laptop where LAPTOP_ID=3";
			
			
		         Connection connection = null;
		    
			try {
				//Class.forName("com.mysql.cj.jdbc.Driver");//this line is optional 
				connection = DriverManager.getConnection(url, userName, password);
				
				System.out.println("connection is successful " +url);
				
				Statement statement = connection.createStatement();
				
				statement.execute(deleteLaptop);
				
			} catch (SQLException exception) {
				  System.out.println(" inside catch blockSQLException ");
				  System.out.println(exception.getMessage());
				  exception.printStackTrace();
			} catch (Exception classNotFoundException) {
					System.out.println(classNotFoundException.getMessage());
			
			    }   finally {
			    		try {
			    			if(connection != null) {
			    				connection.close();
			    				System.out.println("connection is closed");
					}
				    else {
					System.out.println("connection is not closed");
				}
			 }catch (SQLException e) {	
				e.printStackTrace();
			 }
			    		
		   }	
			
			
		}

		@Override
		public void readSingleRecordByID() {
			
		    String url = "jdbc:mysql://localhost:3306/Laptopdb";
				
		    String userName ="root"; 
				
		    String password ="shaikhshakir11"; 
				
		    String readSingleRecordByID = "select * from laptopdb.laptop where LAPTOP_ID=3";
				
		    Connection connection = null;
			    
			try {
				//Class.forName("com.mysql.cj.jdbc.Driver");//this line is optional 
				connection = DriverManager.getConnection(url, userName, password);
					
				System.out.println("connection is successful " +url);
					
				Statement statement = connection.createStatement();
					
				statement.execute(readSingleRecordByID);
					
			} catch (SQLException exception) {
					  System.out.println(" inside catch blockSQLException ");
					  System.out.println(exception.getMessage());
					  exception.printStackTrace();
			} catch (Exception classNotFoundException) {
						System.out.println(classNotFoundException.getMessage());
				
				    }   finally {
				    		try {
				    			if(connection != null) {
				    				connection.close();
				    				System.out.println("connection is closed");
						}
					    else {
						System.out.println("connection is not closed");
					}
				 }catch (SQLException e) {	
					e.printStackTrace();
				    }
				
		      }
				
		}

		@Override
		public void readAllRecords() {
			String url = "jdbc:mysql://localhost:3306/Laptopdb";
			
			String userName ="root"; 
			
			String password ="shaikhshakir11"; 
			
			String readAllRecords = "select * from laptopdb.laptop";
			
		        Connection connection = null;
		    
			try {
				//Class.forName("com.mysql.cj.jdbc.Driver");//this line is optional 
				connection = DriverManager.getConnection(url, userName, password);
				
				System.out.println("connection is successful " +url);
				
				Statement statement = connection.createStatement();
				
				statement.execute(readAllRecords);
				
			} catch (SQLException exception) {
				  System.out.println(" inside catch blockSQLException ");
				  System.out.println(exception.getMessage());
				  exception.printStackTrace();
			} catch (Exception classNotFoundException) {
					System.out.println(classNotFoundException.getMessage());
			
			    }   finally {
			    		try {
			    			if(connection != null) {
			    				connection.close();
			    				System.out.println("connection is closed");
					}
				    else {
					System.out.println("connection is not closed");
				}
			 }catch (SQLException e) {	
				e.printStackTrace();
			    }
			
	        }				
	}  
		
    }  
