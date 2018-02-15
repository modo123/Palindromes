package palindroms;

public class Odwracanie 
{
	
	public void odwroc(String slowo)
	{
		Dodawanie dodawanie = new Dodawanie();
		
		int pierwszyInt= Integer.parseInt(slowo);
		char charTab[] = slowo.toCharArray();
		int dlugosc = charTab.length;
		char revTab[] = new char[dlugosc];
		
		for (int i=0,j=dlugosc-1; i<dlugosc; i++,j--)
		{
			revTab[i] = charTab[j];
		}
		
		String str = new String(revTab);
		int drugiInt = Integer.parseInt(str);
		System.out.println("Liczba odwrócona : " + drugiInt);
		dodawanie.dodaj(pierwszyInt, drugiInt);
		
	}
}
