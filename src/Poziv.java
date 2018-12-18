
public class Poziv {

	public static void main(String[] args) 
	{
		/*int broj = 6;
		fnkc.izmeniVrednost(broj);
		double t = 3.4;
		int p = fnkc.proslediVrednost(t);
		System.out.print(p);*/
		int []nasNiz= new int [10];
		for (int i=0;i<nasNiz.length;i++)
		{
			nasNiz [i] = i;
		}
		nasNiz = fnkc.vratiNiz(nasNiz.length);
	}
	
}
