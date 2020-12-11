/*
* Author : laurenkwong
* Date : 11-Dec-2020
* Description : Ce méthode permettant de compter et d’afficher le nombre de chiffres pairs
contenus dans un tableau d’entiers.
*/
public class Exercice2
	{

		public static void main(String[] args)
			{
				int [] monTab = {2,5,7,3,6,8,1};
				System.out.println(isPair(monTab));
			
			}
		
		static boolean isPair(int[] monTab)
		{
				if(monTab/2==0)
					return true;
				else
					return false;

			}

	}
