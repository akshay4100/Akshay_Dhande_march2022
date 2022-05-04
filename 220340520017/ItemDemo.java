import java.util.ArrayList;
import java.util.Scanner;
import java.util.Comparator;
import java.util.Collections;
import java.util.*;

class Item implements Comparable<Item>
{
	Integer itemId;
	String itemName;
	
	Item()
	{
		this.itemId = 1;
		this.itemName = "A";
	}
	
	Item(Integer itemId,String itemName)
	{
		this.itemId = itemId;
		this.itemName = itemName;
	}
	
	public String toString()
	{
		return "itemId  : "+itemId+" "+"itemName : "+itemName;
	}
	public boolean equals(Object o)
	{
		if(o instanceof Item)
		{
			Item temp = (Item)o;
			if(this.itemId.equals(temp.itemId) &&
			   this.itemName.equals(temp.itemName)
			   )
			   {
				   return true;
			   }
			   
		}
		return false;
	}
	
	public int hashCode()
	{
		int prime = 17;
		prime = prime+prime*this.itemId.hashCode();
		prime = prime+prime*this.itemName.hashCode();
		return prime;
	}
	
	@Override
	public int compareTo(Item i)
	{
		return this.itemId.compareTo(i.itemId);
	}
	
	
}

/*class NameSort implements Comparator<Item>
{
	//@Override
	public int compare(Item i1,Item i1)
	{
		return i1.itemName.compareTo(i2.itemName);
	}
}*/
class ItemDemo
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		
		ArrayList<Item> list = new ArrayList<>();
		
		int choice;
		
		
		
		do
		{
				System.out.println("1.Add: ");
				System.out.println("2.Display: ");
				System.out.println("3.Remove ");
				System.out.println("4.Exit ");
				System.out.println("Enter choice : ");
				choice = sc.nextInt();
			
			switch(choice)
			{
			case 1:
				System.out.println("Enter itemId : ");
				Integer id = sc.nextInt();
				System.out.println("Enter itemName : ");
				String name =  sc1.nextLine();
				list.add(new Item(id,name));
				break;
				
				case 2:
			
				Collections.sort(list);
				System.out.println(list);
				break;
				
				case 3:
				
				System.out.println("Enter index to remove : ");
				int index = sc.nextInt();
				list.remove(index);
				break;
				
			}
			
		}
		while(choice!=4);
		
		
	}
}