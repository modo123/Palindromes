package palindroms;
import java.util.Scanner;

public class Palindrom 
{

	public void czyPalindrom(String slowo)
	{
		Odwracanie odwr = new Odwracanie();
		
		int dlugoscWyrazu = slowo.length();
		int flaga = 0;

		for (int i=0,j=dlugoscWyrazu-1; i<j; i++,j--)
		{
			flaga = 0;
			char znak1 = slowo.charAt(i);
			char znak2 = slowo.charAt(j);
			
			if (znak1 != znak2)
			{
				flaga = -1 ;
				//nie palindrom
			}
			else
			{
				flaga = 1;
				//palindrom
			}
		}

	
		if (flaga == 1)
		{
			System.out.println("Jest palindrom");
		}
		else
		{
			System.out.println("Nie jest palindromem");
			odwr.odwroc(slowo);
		}
	}
}
