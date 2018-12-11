import java.io.*;
public class Ejercicio3{
public static void main (String [] args) throws IOException{
  
  BufferedReader br = new BufferedReader (new InputStreamReader (System.in));

double num, contador = 0, suma = 0;
System.out.print("Ingrese un número: ");
num=Integer.parseInt(br.readLine());
while (num >= 0)  {
suma= suma + num;
System.out.print("Ingrese un número: ");
num= Integer.parseInt(br.readLine());
contador++;
}
double media= (suma/contador);
System.out.println("La media es: "+ media);
}
}

