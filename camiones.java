/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

import java.util.Scanner;
public class camiones
{
  public static void main (String[]args)
  {
    Scanner leer = new Scanner (System.in);
    //Variables
    double suma = 0;
    double resta = 0;
    double dinero = 0;
    double gasto = 0;
    double contador = 0;
	double ln;
	double ma;
	double mi;
	double ju;
	double vi;
	double sa;
	double dom;
	double semana;
	//Iniciar en cero
	  ln=0;
	  ma=0;
	  mi=0;
	  ju=0;
	  vi=0;
	  sa=0;
	  dom=0;
	  semana=0;
	//Bienvenida
	System.out.println ("--Bienvenido--");
	System.out.println("Ten en cuenta que cada camion cuesta $10");
	System.out.println ("Este un programa para calcular cuanto gastas en camiones de tu presupuesto ");
	System.out.println ("Dinos lo siguiente: ");
       	System.out.printf ("Dame tu dinero? ");
      	dinero = leer.nextDouble ();
	System.out.println ("Cuanto gastas el dia lunes? ");
	ln= leer.nextDouble();
	System.out.println ("Cuanto gastas el dia martes? ");
	ma= leer.nextDouble();
	System.out.println ("Cuanto gastas el dia miercoles? ");
	mi= leer.nextDouble();
	System.out.println ("Cuanto gastas el dia jueves? ");
	ju= leer.nextDouble();
	System.out.println ("Cuanto gastas el dia viernes? ");
	vi= leer.nextDouble();
	System.out.println ("Cuanto gastas el dia sabado? ");
	sa= leer.nextDouble();
	System.out.println ("Cuanto gastas el dia domingo? ");
	dom= leer.nextDouble();
	semana=ln+ma+mi+ju+vi+sa+dom;

     
      System.out.printf ("Cuanto gastas en la semana en cosas? ");
      gasto = leer.nextDouble();
	
	//Ciclo
    for (int i = 1; i <= dinero; i++)
      {
	suma = suma + 1;
      }
    for (int i = 1; i <= gasto; i++)
      {

	resta = resta + 1;
      }
    //Valores
    contador = suma - semana - gasto;
	//Salida
    System.out.println ("Tu dinero es " + suma);
    System.out.println ("Tu gastos en camiones " + semana);
    System.out.println ("Tu gastos en la semana " + gasto);
    System.out.println ("Tu total " + contador);
	//Autor
    System.out.println("Autor");
    System.out.println("@mcastv.dev - instagram");
    System.out.println("@MCASTV - Github");
  }				//Fin static
}				//fin 
