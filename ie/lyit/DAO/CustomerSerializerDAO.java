//
//Assignment two
//L00119483	
//Oisin O'Donnell
//Software Implementation 
//BSC Computing 
//3rd Year
//

package ie.lyit.DAO;
import java.io.Serializable;

import ie.lyit.hotel.*;
//CustomerSerializerDAO interface declared. 
public interface CustomerSerializerDAO{

	// add,view, list, edit, delete, getsizeArray, writeTofile, readFromfile 
	//methods that are going to be overridden in CustomerSerializerDAOImp class. 
	public void add();
	public Customer view();
	public void list();
	public void edit();
	public void delete();
	public int getSizeArray();
	public void writeToFile();
	public void readFromFile();
	
}
