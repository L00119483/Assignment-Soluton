package ie.lyit.DAO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Scanner;
import ie.lyit.serialize.*;

import ie.lyit.hotel.Customer;

public class CustomerSerializerDAOImpl implements CustomerSerializerDAO{

	CustomerSerializer cus = new CustomerSerializer();
	
	@Override
	public void add() {
	Customer customer = new Customer();
		
		customer.read();
		cus.customers.add(customer);
	}

	@Override
	public Customer view() {
		Scanner KeybaordIn = new Scanner(System.in);
		
		System.out.print("Please enter Customer Number: ");
		int cusNumb = KeybaordIn.nextInt();
		
		for(int i=0;i<cus.customers.size();i++){
			if(cusNumb == cus.customers.indexOf(i)) {
				return cus.customers.get(i);
			}
		}
		
		return null;
	}

	@Override
	public void list() {
		
		for(int i =0;i< cus.customers.size();i++) {
			System.out.println("Customer number:"+(i+1)+"\n"+cus.customers.get(i)+"\n----------------------");
		}
	}

	@Override
	public void edit() {
		
		Customer x = view();
		
		if(x !=  null) {
		
			int index= cus.customers.indexOf(x);
			x.read();
			cus.customers.set(index, x);
		}
		
	}

	@Override
	public void delete() {
	    Scanner KeybaordIn = new Scanner(System.in);
		
			System.out.print("Please enter Customer Number: ");
			int cuserNumb = KeybaordIn.nextInt();
			
			System.out.println(cus.customers.indexOf(2));
			for(int i=0; i < cus.customers.size();i++) {
				
			}	
	}

	@Override
	public int getSizeArray() {
		return cus.sizeOfArray;
	}

	@Override
	public void writeToFile() {
		
		cus.sizeOfArray = cus.customers.size();
		if(Files.exists(cus.p))
		try{

			
			FileOutputStream fos = new FileOutputStream(cus.FILENAME);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(cus.customers);
			oos.writeInt(cus.sizeOfArray);//arraylistsize
			
			oos.close();
					

	}
		catch(FileNotFoundException fNFE){
			System.out.println("Cannot find currents file.");
		}
		catch(Exception e) {
			System.out.print(e.getMessage());
		}
		}

	@Override
	public void readFromFile() {
		
		
		if(Files.exists(cus.p))
		try {
			
			FileInputStream fis = new FileInputStream(cus.FILENAME);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			cus.customers = (ArrayList<Customer>)ois.readObject();
			cus.sizeOfArray = cus.customers.size();
			ois.close();
			
		}
	
	catch(FileNotFoundException fNFE) {
		System.out.print("not working");
	}
		catch(Exception e){
			System.out.println(e.getMessage());
	}}
	}


