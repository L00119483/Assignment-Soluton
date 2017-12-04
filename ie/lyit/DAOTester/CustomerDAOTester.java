//
//Assignment two
//L00119483	
//Oisin O'Donnell
//Software Implementation 
//BSC Computing 
//3rd Year
//
package ie.lyit.DAOTester;

import java.io.IOException;

import ie.lyit.DAO.CustomerSerializerDAOImpl;
import ie.lyit.hotel.Menu;

public class CustomerDAOTester {

	public static void main(String[] args) throws IOException {
	
		// Creating a instance of CustomerSerializerDAOImp called Cust.
		CustomerSerializerDAOImpl Cust = new CustomerSerializerDAOImpl();
		
		Menu menu = Menu.getInstance();
		
		Cust.readFromFile();
		System.out.println(Cust.getSizeArray());
		do{
			menu.display();
			menu.readOption();
			
			switch(menu.getOption()){
				case 1: Cust.add();
					break;
				case 2: Cust.view();
					break;
				case 3: Cust.list();
					break;
				case 4: Cust.edit();
					break;
				case 5: Cust.delete();
					break;
				case 6:
					break;
				default: System.out.println("INVALID OPTION...");
			}
		}while(menu.getOption() != 6);
		
		// Write the ArrayList to the File
		Cust.writeToFile();

		// Read the ArrayList from the File back into the ArrayList currents
		//Cust.readFromFile();
		
		// Call the list() method to list the Current Account objects in the ArrayList
		//Cust.list();
		System.out.print("GoodBye!! ");
	}
}


