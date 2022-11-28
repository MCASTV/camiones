/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, HTML, CSS, JS
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <stdio.h>

int main()
{
   int suma=0;
   int resta=0;
   int dinero=0;
   int gasto=0;
   int contador=0;
   printf("Dame tu dinero?");
   scanf("%d",&dinero);
   printf("Cuanto gastas en camiones");
    scanf("%d",&gasto);
   
   for(int i=1;i<=dinero;i++){
       suma=suma+1;
   }
   for(int i=1;i<=gasto;i++){
       
       resta= resta+1;
   }
   contador=suma-resta;
   printf("Tu Dinero para la semana %d  \n",suma);
   printf("Lo que gastas en el camion %d\n",resta);
   printf("El resultado es %d\n",contador);
}
