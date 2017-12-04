package ie.lyit.serialize;

import java.io.Serializable;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

import ie.lyit.hotel.Customer;

public class CustomerSerializer implements Serializable {

	/**
	 * 
	 */

	public final String FILENAME = "customers.bin";
 	public Path p = Paths.get(FILENAME);
	
	public int sizeOfArray;
	public ArrayList<Customer> customers;
	
	public CustomerSerializer() {
		 customers  = new ArrayList<Customer>();
		 
	}
}

