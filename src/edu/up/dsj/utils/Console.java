package edu.up.dsj.utils;

import java.util.Scanner;

public class Console {
	
	public static Scanner sc = new Scanner(System.in);

	public static int lerInteiro(String msg) {

		int valor = 0;
		boolean valorLido = false;

		do {
			try {
				System.out.print(msg);
				valor = Integer.parseInt(sc.next());
				valorLido = true;
			} catch (NumberFormatException e) {
				System.out.println("\nApenas números!\n");
			}
		} while (!valorLido);

		return valor;
	}

	public static double lerDouble(String msg) {

		double valor = 0;
		boolean valorLido = false;

		do {
			try {
				System.out.print(msg);
				valor = Double.parseDouble(sc.next());
				valorLido = true;
			} catch (NumberFormatException e) {
				System.out.println("\nApenas números\n");
			}
		} while (!valorLido);

		return valor;

	}
	
	public static String lerString(String msg) {

		System.out.print(msg);
		
		int			tCh;
		 String			tLinha = "";
		 boolean		tFim = false;
		 
		 while (!tFim)
		 {
			  try
			  {
				   tCh = System.in.read();
				   if (tCh < 0 || (char) tCh == '\n')
						tFim = true;
				   else
						if ((char) tCh != '\r')
							 tLinha = tLinha + (char) tCh;
			  }
			  catch (java.io.IOException tExcept)
			  {
				   tLinha = null;
				   tFim = true;
			  }
		 }
		 return tLinha;
	}
	
	public static float lerFloat(String msg) {

		float valor = 0;
		boolean valorLido = false;

		do {
			try {
				System.out.print(msg);
				valor = Float.parseFloat(sc.next());
				valorLido = true;
			} catch (NumberFormatException e) {
				System.out.println("\nApenas números\n");
			}
		} while (!valorLido);

		return valor;
	}
}