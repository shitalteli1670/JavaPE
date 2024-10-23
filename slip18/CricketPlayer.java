import java.util.*;
class CricketPlayer
{
    String name;
    int no_of_ings;
    int no_of_notout;
    int total_runs;
    float bat_avg;

    void avg()
    {
        bat_avg=total_runs/no_of_ings;
    }

    void display()
    {
        System.out.println(name + "\t" + no_of_ings + "\t" + no_of_notout + "\t" + total_runs + "\t" + bat_avg);
    }


    static void sortPlayer(CricketPlayer a[])
    {
        CricketPlayer temp;
        for(int i=0; i<a.length; i++)
        {
            for(int j=i+1; j<a.length; j++)
            {
                if(a[i].bat_avg>a[j].bat_avg)
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;

                }
            }
        }
    }

    public static void main(String args[])
    {
        CricketPlayer s[]=new CricketPlayer[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter player details");

        for(int i=0; i<5; i++)
        {
            s[i]=new CricketPlayer();
            System.out.println("Enter the name of player"+(i+1));
            s[i].name=sc.next();
            System.out.println("Enter the no of ingd of player"+(i+1));
            s[i].no_of_ings=sc.nextInt();
            System.out.println("Enter the no of notout of player"+(i+1));
            s[i].no_of_notout=sc.nextInt();
            System.out.println("Enter the no of total runs of player"+(i+1));
            s[i].total_runs=sc.nextInt();
            s[i].avg();
        }
        CricketPlayer.sortPlayer(s);
        System.out.println();
        System.out.println("name \tno_of_ing \tno_of_notout \ttotal_runs \tbat_avg");

        for(int i=0; i<5; i++)
        {
            s[i].display();
        }
    }

}
