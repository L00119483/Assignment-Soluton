package ie.lyit.serialize;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

import ie.lyit.hotel.Customer;

public class CustomerSerializer implements Serializable {

	public final String FILENAME = "customers.bin";
 	public Path p = Paths.get(FILENAME);
	
	public int sizeOfArray;
	public ArrayList<Customer> customers;
	
	public CustomerSerializer() {
		 customers  = new ArrayList<Customer>();
		 
	}
}

