
public class fnkc {

	public static void izmeniVrednost(int broj) 
	{
		broj += 10;
		System.out.print(broj);

	}
	public static int proslediVrednost (double x) 
	{
		double m = 1.5;
		return Math.round((int)(x*m));
		
	}
	public static int [] vratiNiz(int duzina)
	{
		int []niz = new int [duzina];
		for (int i= 0; i<duzina ;i++)
		{
			niz [i]=i*i;
		}
		return niz;
	}
}
