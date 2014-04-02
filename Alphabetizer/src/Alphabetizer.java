import java.util.Scanner;
import java.util.Arrays;

public class Alphabetizer
	{

	public static void main(String[] args) 
		{
		String [] name = new String [3];
		Scanner scan = new Scanner (System.in);
		
		for (int i=1; i<4; i++) 
			{
			System.out.println("Enter name #" + i + ":");
			name[i - 1] = scan.nextLine();
			}
		
		Arrays.sort(name);
		
		System.out.println();
		System.out.println("The names are ");
		for (int i=0; i<name.length; i++)
			{
			System.out.println(name[i]);
			}
		}
	}
