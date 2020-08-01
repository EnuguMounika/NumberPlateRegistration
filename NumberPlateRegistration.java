import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
class NumberPlateRegistration extends Thread implements Runnable,Serializable
{	static Scanner scanf = new Scanner(System.in);
	static String applicant_name;
	static String father_name;
	static int age;
	static String address;
	static String class_of_vehicle;
	static String makers_name;
	static int mfg_year;
	static String chasis_no;
	static String engine_no;
	static String fuel_type;
	static int seating_capacity;
	static float vehicle_weight;
	static float cubic_capacity;
	static String insurance_no;
	static String licence_no;
	static int rtacentre;
	static String registration_no;
	
	NumberPlateRegistration()
	{
		
	}
	NumberPlateRegistration(int rta)
	{
		rta = rtacentre;
	}

	NumberPlateRegistration(String applicant,String father,int age_yr,String adrs)
	{
		applicant = applicant_name;
		father = father_name;
		age_yr = age;
		adrs = address;
	}
	
	NumberPlateRegistration(String vehicle_type,String company,int mfg)
	{
		vehicle_type = class_of_vehicle;
		company = makers_name;
		mfg = mfg_year;
	}
	
	NumberPlateRegistration(String chasis,String engine,String fuel,int seats,float weight,float cc)
	{
		chasis = chasis_no;
		engine = engine_no;
		fuel = fuel_type;
		seats = seating_capacity;
		weight = vehicle_weight;
		cc = cubic_capacity;
	}
	
	NumberPlateRegistration(String insurance,String licence)
	{
		insurance = insurance_no;
		licence = licence_no;
	}
	
    void input() throws AgeException,InsuranceException,LicenceException
	{
		scanf = new Scanner(System.in);
		System.out.println("Fill the below Application Form:  ");
		System.out.println("Enter the Applicant's Name: ");
		applicant_name = scanf.next();
		System.out.println("Enter your Father's Name: ");
		father_name = scanf.next();
		
		System.out.println("Enter your Address: ");
		address = scanf.next();
		
		System.out.println("Enter the class of your Vehicle: ");
		class_of_vehicle = scanf.next();
		System.out.println("Enter the makers name of your vehicle: ");
		makers_name = scanf.next();
		System.out.println("Enter the manufacturing year: ");
		mfg_year = scanf.nextInt();
		System.out.println("Enter the Chasis number: ");
		chasis_no = scanf.next();
		System.out.println("Enter the Engine number: ");
		engine_no = scanf.next();
		System.out.println("Enter the fuel type: ");
		fuel_type = scanf.next();
		System.out.println("Enter the seating capacity: ");
		seating_capacity = scanf.nextInt();
		System.out.println("Enter the weight of the vehicle: ");
		vehicle_weight = scanf.nextFloat();
		System.out.println("Enter the Cubic Capacity: ");
		cubic_capacity = scanf.nextFloat();
		System.out.println("Enter your age in years : ");
		age = scanf.nextInt();

		
		System.out.println("Enter vehicle's Insurance Number:  ");
		insurance_no = scanf.next();
		
		System.out.println("Enter your Driving Licence Number: ");
		licence_no = scanf.next();
	}
    void rtainput()
    {
    	System.out.println("The List of Registering Authority is: ");
    	System.out.println("1.Adilabad");
    	System.out.println("2.Karimnagar");
    	System.out.println("3.Warangal");
    	System.out.println("4.Khammam");
    	System.out.println("5.Nalgonda");
    	System.out.println("6.Mahaboobnagar");
    	System.out.println("6.Rangareddy");
    	System.out.println("8.Medchal");
    	System.out.println("9.Hyderabad");
    	System.out.println("10.Sangareddy");
    	System.out.println("11.Nizamabad");
    	System.out.println("12.Kamareddy");
    	System.out.println("13.Nirmal");
    	System.out.println("14.Mancherial");
    	System.out.println("15.Komrambheem");
    	System.out.println("16.Jaityal");
    	System.out.println("17.Peddapalli");
    	System.out.println("18.Rajanna");
    	System.out.println("19.Warangal Rural");
    	System.out.println("20.Jayashankar");
    	System.out.println("21.Mahabubabad");
    	System.out.println("22.Jangoan");
    	System.out.println("23.Bhadradri");
    	System.out.println("24.Suryapet");
    	System.out.println("25.Yadadri");
    	System.out.println("26.Nagarkurnool");
    	System.out.println("27.Wanaparthy");
    	System.out.println("28.Jogulamba");
    	System.out.println("29.Vikarabad");
    	System.out.println("30.Medak");
    	System.out.println("31.Siddipet");
    	
    }
    void map()
	{
		System.out.println("Enter number of your Registrating Authority from the above list :");
		rtacentre=scanf.nextInt();
		Map<Integer,String> map = new HashMap<>();
		map.put(1,"TS01TS");
		map.put(2,"TS02TS");
		map.put(3,"TS03TS");
		map.put(4,"TS04TS");
		map.put(5,"TS05TS");
		map.put(6,"TS06TS");
		map.put(7,"TS07TS");
		map.put(8,"TS08TS");
		map.put(9,"TS09TS");
		map.put(10,"TS15TS");
		map.put(11,"TS16TS");
		map.put(12,"TS17TS");
		map.put(13,"TS18TS");
		map.put(14,"TS19TS");
		map.put(15,"TS20TS");
		map.put(16,"TS21TS");
		map.put(17,"TS22TS");
		map.put(18,"TS23TS");
		map.put(19,"TS24TS");
		map.put(20,"TS25TS");
		map.put(21,"TS26TS");
		map.put(22,"TS27TS");
		map.put(23,"TS28TS");
		map.put(24,"TS29TS");
		map.put(25,"TS30TS");
		map.put(26,"TS31TS");
		map.put(27,"TS32TS");
		map.put(28,"TS33TS");
		map.put(29,"TS34TS");
		map.put(30,"TS35TS");
		map.put(31,"TS36TS");
		Set<Integer> set = map.keySet();
		for(int i:set)
		{
			if(rtacentre==i)
			{
				Random r = new Random();
				registration_no = map.get(i)+r.nextInt(10000);
				System.out.println("Your Registration Number is : "+registration_no);
			}
		}
	}
    boolean approval()
    {
    	if((age>=18)&&(insurance_no.length()==9)&&(licence_no.length()==13))
    	{
    		return true;
    	}
    	return false;
    }
    ArrayList<NumberPlateRegistration> a = new ArrayList<>();
    
    public String toString()
    {
    	return "Name: "+applicant_name+"  Registration Number: "+registration_no;
    }
	@Override
	public void run()
	{
		NumberPlateRegistration n1 = new NumberPlateRegistration();
		try {
			n1.input();
		} catch (AgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InsuranceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (LicenceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(approval()==false)
		{
			if(age<18)
			{
				try {
					throw new AgeException();
				} catch (AgeException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(insurance_no.length()!=9)
			{
				try {
					throw new InsuranceException();
				} catch (InsuranceException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(licence_no.length()!=13)
			{
				try {
					throw new LicenceException();
				} catch (LicenceException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		if(approval())
		{
			n1.rtainput();
			n1.map();
			a.add(n1);
			
			try
			{
			FileOutputStream f = new FileOutputStream("F:\\JAVA LAB\\java programs eclipse\\file.txt");
			ObjectOutputStream o = new ObjectOutputStream(f);
			for(NumberPlateRegistration j:a)
			{
				o.writeObject(j);
			}
			o.close();
			/*ObjectInputStream o2 = new ObjectInputStream(new FileInputStream("F:\\JAVA LAB\\java programs eclipse\\file.txt"));
			NumberPlateRegistration obj = (NumberPlateRegistration)o2.readObject();
			System.out.println(obj);*/
			}
			catch(Exception e)
			{
				System.out.println("File Not Found");
			}
		}
	}
}