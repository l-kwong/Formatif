/*
* Author : laurenkwong
* Date : 11-Dec-2020
* Description : Ce méthode permettant de calculer et d’afficher la somme des éléments d’un
tableau d’entiers qui est rempli de 10 éléments générés au hasard.
*/
public class Exercice1
	{

		public static void main(String[] args)
			{
				int []myTab=new int[10];
				for(int i=0; i<10; i++)
				{
					myTab[i]=(int)(Math.random()*(i+1));
				}
				for (int i : myTab) 
				{
					System.out.println(i);
				}
					
				int somme=0;
				for(int numero:myTab)
					somme=somme+numero;
				System.out.println("Somme égale " + somme);  
					
			}

	}