package ie.lyit.hotel;

import java.util.Scanner;

public class Menu {
	private int option;
	
	public void display(){

		System.out.println("\t1. Add");
		System.out.println("\t2. View");
		System.out.println("\t3. List");
		System.out.println("\t4. Edit");
		System.out.println("\t5. Delete");
		System.out.println("\t6. Quit");
	}
	
	public void readOption(){
		//if(option == 1)
		System.out.println("Enter Option 1-6");
		Scanner kbInt = new Scanner(System.in);
	    option = kbInt.nextInt();
	}
	
	public int getOption(){
		return option;
	}

}

