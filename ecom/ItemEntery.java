import java.util.Scanner;

public class ItemEntery {
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	
	String item[] = new String [sc.nextInt()];
	int cost [] = new int [item.length];
	for (int i=0;i<item.length;i++)
	{
		item[i]=sc.next();
		cost[i]=sc.nextInt();
	}
	System.out.println("	Item	" + "	Price	"+"\n" );
	for(int i=0;i<item.length;i++)
	{
		System.out.println("	"+item[i] +"	" + "	"+cost[i] );
	}
	sc.close();
	
}
}