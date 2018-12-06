	//import File
import java.io.File;
	//import FileNotFoundException
import java.io.FileNotFoundException;
	//import Scanner
import java.util.Scanner;

	//create class name Employee
	public class Employee
{
		//main method
	public static void main(String[] args)
{
		//include .csv - comma separated values
		String fileName = "Data.csv";
		
		 //Read about file
		File file = new File(fileName);
		
		//Using Exception Handling method try, catch...
		try				//try block
{		
			Scanner InputStream = new Scanner(file);
			/* InputStream.next();	//ignore the first line */
			while (InputStream.hasNext())
{
				//gets a whole line
				String data = InputStream.next();
				
		/*
		 * String[] values = data.split(","); //String object used to split values; 
		 * System.out.println(values[1]);  //split the separate column values;
		 */
				// print statement;
				System.out.println(data +".");
	}
			//Here InputStream closed;
			InputStream.close(); 
			
	} 	
		//catch block parameter;
		catch (FileNotFoundException e)
{

			e.printStackTrace();
			}

		}

	}
