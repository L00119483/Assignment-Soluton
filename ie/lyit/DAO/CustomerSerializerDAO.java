package ie.lyit.DAO;
import java.io.Serializable;

import ie.lyit.hotel.*;

public interface CustomerSerializerDAO{

	public void add();
	public Customer view();
	public void list();
	public void edit();
	public void delete();
	public int getSizeArray();
	public void writeToFile();
	public void readFromFile();
	
}
