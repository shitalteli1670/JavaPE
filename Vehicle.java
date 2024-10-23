import java.io.*;

class Vehicle

{

int price;

String company;

   Vehicle(String c,int p)

   {

       company=c;

       price=p;

   }

	

   public void display()

   {

	System.out.print("Company : "+company+"\tPrice : "+price);

   }

}

class LightMotorVehicle extends Vehicle

{

   int mileage;

   LightMotorVehicle(String c,int p,int m) 

   {

	super(c,p);

        mileage=m;

   }

    public void display()

   {

	super.display();

	System.out.println("\tMileage : "+mileage);

   }

}

class HeavyMotorVehicle extends Vehicle

{

   int cap_in_tons;

   HeavyMotorVehicle(String c,int p,int cap) 

   {

	super(c,p);

        cap_in_tons=cap;

   }

    public void display()

   {

	super.display();

	System.out.println("\tCapacity_in_tons : "+cap_in_tons);

   }

}  

class Slip29_2

{       

        public static void main(String args[]) throws IOException

        {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter Total No. Vehicles");

                int n=Integer.parseInt(br.readLine());

		Vehicle[] c=new Vehicle[n];           

		for(int i=0;i<n;i++)

		{

	   	System.out.println("Enter Company");

		String com=br.readLine();

		System.out.println("Enter Price");

	   	int p=Integer.parseInt(br.readLine());	   		   	

	   	System.out.println("Enter 1:Light Motor Vehicle  2: Heavy Motor Vehicle");

	   	int ch=Integer.parseInt(br.readLine());

		switch(ch)

	   	{

			case 1:

				System.out.println("Enter Mileage");

		             	int m=Integer.parseInt(br.readLine());

                                 c[i]=new LightMotorVehicle(com,p,m);								        

			break;

		case 2:

			System.out.println("Enter Capacity in tons");

		        int cap=Integer.parseInt(br.readLine());							                  

                        c[i]=new HeavyMotorVehicle(com,p,cap);		

                        break;

	   }

	}

	System.out.println("---------------Vehicle Information---------------");

	for(int i=0;i<n;i++)

	   c[i].display();                             

        }        

}


