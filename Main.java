import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main
{
	public static void main(String args[]) throws AgeException,InsuranceException, LicenceException, InterruptedException
	{
		//Thread t1 = new Thread(new NumberPlateRegistration(),"n1");
		//t1.start();
		
		for(int i =0;i<2;i++)
		{
			NumberPlateRegistration object = new NumberPlateRegistration();
			object.start();
			object.join();
		}
		
	}
}