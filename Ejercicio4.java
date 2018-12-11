import java.io.*;
public class Ejercicio4{
public static void main (String [] args) throws IOException{
  
  BufferedReader br = new BufferedReader (new InputStreamReader (System.in));

double  num, cubo;
System.out.print("Ingrese un número: ");
num=Double.parseDouble(br.readLine());
while (num >= 0)  {
cubo = (num* num*num);
System.out.println("el cubo del numero es: " + cubo);
System.out.print("Ingrese un número: ");
num= Double.parseDouble(br.readLine());
}
}
}