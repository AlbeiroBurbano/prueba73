
package com.mycompany.clase7_ejemplo1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Clase7_ejemplo1 {

    public static void main(String[] args) throws IOException {
      int edad;
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Por favor ingrese su edad");
      String entrada = br.readLine();
      edad = Integer.parseInt(entrada);
      System.out.println("Gracias su edad es "+edad);
    }
}
