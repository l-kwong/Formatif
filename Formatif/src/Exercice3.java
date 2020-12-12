/*
* Author : laurenkwong
* Date : 11-Dec-2020
* Description : Ce méthode qui reçoit en paramètre un tableau d’entiers et qui retourne le
même tableau amputé du plus petit nombre de cet élément.
*/
public class Exercice3
	{

		public static void main(String[] args)
			{
				int [] monTab = {3,5,1,8,99,234};
				int a = MethodesTableaux.plusPetitIndex(monTab);
				System.out.println(a);
				System.out.println(monTab);
			}
		
		static int []shiftGauche(int [] a)
			{
				int temp=a[0];
				for (int i = 1; i < a.length; i++)
				{
					a[i-1]=a[i];
				}
				a[a.length-1]=temp;
				return a;
			}

			

	}