package ie.lyit.hotel;

import java.io.Serializable;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Customer extends Person implements Serializable{// INHERITANCE - Customer IS-A Person
	// Customer has name, address, & phoneNumber from Person
	private String emailAddress;    // AND emailAddress
	private int number;			    // AND number

	private static int nextNumber=1;// static for unique number - starts off at 1
	
	// Default Constructor
	// Called when object is created like this ==> 
	//   Customer cObj = new Customer();	
	public Customer(){
		super();			// NOTE:Don't need to call super() explicitly.
		emailAddress=null;
		// Set number to static nextNumber before incrementing nextNumber
		number=nextNumber++;
	}
	
	// Initialization Constructor
	// Called when object is created like this ==>
	// Customer cObj = new Customer("Mr","Joe","Doe","12 Hi Rd,Letterkenny",
	//                              "0871234567","joe@hotmail.com");
	public Customer(String t, String fN, String sn, String address, 
			        String pNo, String email){
		// Call super class constructor - Passing parameters required by Person ONLY!
		super(t, fN, sn, address, pNo);
		// And then initialise Customers own instance variables
		emailAddress=email;
		// And finally set number to static nextNumber before incrementing nextNumber
		number=nextNumber++;
	}

	// OVERRIDING the Person toString() method!
	// Calling Persons toString() method, and adding additional bits
	@Override
	public String toString(){
		return super.toString() + "," + emailAddress;
	}

	// equals() method
	// ==> Called when comparing an object with another object, 
	//     e.g. - if(c1.equals(c2))				
	// ==> Probably sufficient to compare customer numbers as they're unique
	@Override
	public boolean equals(Object obj){
		Customer cObject;
		if (obj instanceof Customer)
		   cObject = (Customer)obj;
		else
		   return false;
		   
	    return(this.number==cObject.number);
	}

	// set() and get() methods
	public void setEmailAddress(String emailAddress){
		this.emailAddress=emailAddress;
	}
	public String getEmailAddress(){
		return this.emailAddress;
	}	
	// You shouldn't be able to setNumber() as it is unique, 
	// so don't provide a setNumber() method
	public int getNumber(){
		return number;
	}

//	public void read(){
//	      JTextField id= new JTextField();
//	      id.setText("" + this.getNumber());
//	      JTextField title = new JTextField();
//	      JTextField FName = new JTextField();
//	      JTextField LName = new JTextField();
//	      LName.requestFocus();
//	      JTextField Address = new JTextField();
//	      JTextField PhoneN = new JTextField();
//	      JTextField Email = new JTextField();
//
//	      Object[] message = {
//	          "Title:", title,
//	          "First Name:", FName,
//	          "last Name:", LName,
//	          "Address:", Address,
//	          "Phone Number:", PhoneN,
//	          "Email:", Email,
//	      };
//
//	      int option = JOptionPane.showConfirmDialog(null, message, "Enter book details", JOptionPane.OK_CANCEL_OPTION);
//
//	      if (option == JOptionPane.OK_OPTION){
//	          this.name = Name.getName();
//	          this.email = txtIsnbNumber.getText();
//	          this.author = txtAuthor.getText();
//	          this.publishingCompany = txtPublishingCompany.getText();
//	      }   
//		}
//	
	public void read() throws IllegalArgumentException{
		Scanner kbString = new Scanner(System.in);	
		
		String t, fN, sN, EA;
		int customerNum;
		customerNum=0;
		
	//	boolean GoodInput = false;
		
		System.out.println("Enter Customer Details:");
   	    System.out.print("Title : "); t=kbString.nextLine();
	    System.out.println("NAME : ");
   	    System.out.print("First Name : "); fN=kbString.nextLine();
	    System.out.print("Surname : "); sN=kbString.nextLine();
	    name = new Name(t, fN, sN);
		System.out.print("ADDRESS: ");address=kbString.nextLine();
		System.out.print("Phone Number : ");
		phoneNumber=kbString.nextLine();
		System.out.print("Email Address: ");emailAddress=kbString.nextLine();
		
			}
		
//		do{
//			try{
//				System.out.println("Customer Number  : ");customerNum=kbString.nextInt();
//				GoodInput = true;
//			}
//			catch(InputMismatchException e){
//				System.out.println("Please enter correct details"); 
//				kbString.nextLine();
//			}
//		}while(!(GoodInput));
		
	}
 	

