/*Q1) Define a Item class (item_number, item_name, item_price). Define a default and parameterized constructor. 
Keep a count of objects created. Create objects using parameterized constructor and display the object count after 
each object is created.(Use static member and method). Also display the contents of each object. [10 marks] */

class Item {

    int ino;

    String iname;

    double iprice;

    static int count = 0;

    public Item() 

    {

        count++;

    }

    public Item(int ino, String iname, double iprice) 

    {

        this.ino = ino;

        this.iname = iname;

        this.iprice = iprice;

     	count++;

    }

    public static int getObjectCount() 

    {

        return count;

    }

   public void displayItemDetails() 

   {

        System.out.println("Item Details:");

        System.out.println("Item Number: " + ino);

        System.out.println("Item Name: " + iname);

        System.out.println("Item Price: $" + iprice);

        System.out.println();

    }

}

class Slip26_1

{

    public static void main(String[] args) 

    {

        Item item1 = new Item(101, "Laptop", 850.00);

        item1.displayItemDetails();

        System.out.println("Objects created: " + Item.getObjectCount());

        System.out.println();

        Item item2 = new Item(102, "Smartphone", 650.00);

        item2.displayItemDetails();

        System.out.println("Objects created: " + Item.getObjectCount());

        System.out.println();

        Item item3 = new Item(103, "Tablet", 300.00);

        item3.displayItemDetails();

        System.out.println("Objects created: " + Item.getObjectCount());

    }

}