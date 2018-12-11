import java.io.*;
public class Ejercicio1{
public static void main (String [] args) throws IOException {
   BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
System.out.print("introduzca una nota entre 6 y 10: ");
int nota= Integer.parseInt(br.readLine());
if (nota< 6  || nota>5){
if (nota<6)
System.out.println("la nota ingresada es incorrecta");
 
  System.out.print("introduzca una nota entre 6 y 10: ");
  nota= Integer.parseInt(br.readLine());
  System.out.println("la nota es: ");
  if (nota==6)
   System.out.println("Seis");
  if (nota==7)
  System.out.println("siete");
  else if (nota==8)
  System.out.println("ocho");
  else if (nota==9)
  System.out.println("nueve");
  else if (nota==10)
  System.out.println("Diez");
 
   
  }
  }
  }
  
  


