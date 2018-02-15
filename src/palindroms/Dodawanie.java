package palindroms;

public class Dodawanie 
{

	public void dodaj(int first, int second )
	{
		Palindrom pal = new Palindrom();
		
		int wynik;
		wynik = first + second;
		System.out.println("Wynik dodawania : " + wynik);
		String wynikString = Integer.toString(wynik);
		pal.czyPalindrom(wynikString);
		
	}
}
