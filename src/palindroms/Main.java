package palindroms;
import java.util.Scanner;

public class Main 
{
	private static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		Palindrom pal = new Palindrom();
		
		System.out.println("Podaj liczbe do sprawdzenia : ");
		String liczba = scn.nextLine();
		pal.czyPalindrom(liczba);

	}
	
}
