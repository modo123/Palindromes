
public class Testowy 
{

	public static void main(String[] args) 
	{
		int tab[][] = new int[5][3];
		
		//System.out.println(tab[0].length);
		
		
		int tab2d[][] = new int [5][3];
		
		for(int i=0; i<tab2d.length; i++)
		{
			for(int j=0; j<tab2d[i].length;j++)
			{
				tab2d[i][j] = 1;
			}
		}
	

		for(int i=0; i<tab2d.length; i++)
		{
			for(int j=0; j<tab2d[i].length;j++)
			{
				System.out.print(tab2d[i][j]);
				if (j==tab2d[i].length-1) 
				{
					System.out.println("");
				}
			}
		}
		
	}

}
