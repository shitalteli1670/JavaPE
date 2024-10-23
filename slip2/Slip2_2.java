//Q2) Define a class CricketPlayer (name,no_of_innings,no_of_times_notout, totatruns, bat_avg). Create an array of n player objects .Calculate the batting average for each player using static method avg(). Define a static sort method which sorts the array on the basis of average. Display the player details in sorted order.

import java.io.*;



class CricketPlayer 

{

	String Name;

	int no_of_ings;

	int no_of_notout;

	int total_runs;

	float bat_avg;

	

	public CricketPlayer()

	{

		Name="";

		no_of_ings=0;

		no_of_notout=0;

		total_runs=0;

		bat_avg=0.0f;

	}

	

	public CricketPlayer(String n,int i,int o,int r)

	{

		Name=n;

		no_of_ings=i;

                no_of_notout=o;

        	total_runs=r;

        }

	public static void average(CricketPlayer c[])

	{

		int n=c.length;

		for(int i=0;i<n;i++)

		c[i].bat_avg=(float)c[i].total_runs/c[i].no_of_ings;

	}

    	public  static void sortPlayer(CricketPlayer c[])

	{

		int n=c.length;

		for(int i=0;i<n;i++)

		{

			for(int j=i+1;j<n;j++)

			{

				if(c[i].bat_avg < c[j].bat_avg)

			      {

				String temp=c[i].Name;

				int t=c[i].no_of_ings;

				int e=c[i].no_of_notout;

				int p=c[i].total_runs;

				float m=c[i].bat_avg;



		c[i].Name=c[j].Name;

                c[i].no_of_ings=c[j].no_of_ings;

                c[i].no_of_notout=c[j].no_of_notout;

                c[i].total_runs=c[j].total_runs;

                c[i].bat_avg=c[j].bat_avg;



				 c[j].Name=temp;

                                c[j].no_of_ings=t;

                                c[j].no_of_notout=e;

                                c[j].total_runs=p;

                                c[j].bat_avg=m;



			    }

			}

			

		

		}

	}

	

	void print()

	{

		System.out.println("Name="+Name);

		System.out.println("No_Of_Innings="+no_of_ings);

		System.out.println("No_times_notout="+no_of_notout);

		System.out.println("Total Runs="+total_runs);

		System.out.println("Average="+bat_avg);

		System.out.println("-----------------------------");



	}

	

}



class  Ass2setB2 

{

	public static void main(String a[])throws IOException

	{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter how many players");

		int n=Integer.parseInt(br.readLine());

		CricketPlayer cp[]= new CricketPlayer[n];

		System.out.println("Enter players");

		 for(int i=0;i<n;i++)

		 {

System.out.println("Enter name,innings,notout,total runs");

			String na=br.readLine();

			int g=Integer.parseInt(br.readLine());

			int o=Integer.parseInt(br.readLine());

			int t=Integer.parseInt(br.readLine());

			cp[i]=new CricketPlayer(na,g,o,t);

			

		}

		

			CricketPlayer.average(cp);

			CricketPlayer.sortPlayer(cp);

			for(int i=0;i<n;i++)

			cp[i].print();

	}

}