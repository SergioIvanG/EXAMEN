import java.io.*;
public class Ejercicio5{

public static void main (String [] args) throws IOException{

  BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
  int contador= 0, n;

 while (contador <3){
System.out.println("Escriba un numero menor que 10");
n = Integer.parseInt(br.readLine());
       if (n<0)
       System.out.println("Errror el numero es negativo");
 int factorial = 1;
for (int i= 1; i<=n ; i++){
  factorial= factorial * i;
  }
 System.out.println("Factorial de "+n +": "+ factorial);
 contador++;
  }
}
}
