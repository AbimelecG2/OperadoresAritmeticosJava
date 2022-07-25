/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadoresaritmeticos;
import java.util.Scanner; 
/**
 *
 * @author USER
 */
public class Operadoresaritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner input =new Scanner(System.in);
        int numero1;
        int numero2;
        int resta, suma, division, multiplicacion;
        int opcion;
        
            System.out.println("-------MENU------");
            System.out.println("1 Suma");
            System.out.println("2 Resta");
            System.out.println("3 Multiplicacion");
            System.out.println("4 Division");
            System.out.print("INGRESE LA OPCION A ELEGIR: ");
            opcion=input.nextInt();
            
        System.out.println("Ingrese el primer numero");
        numero1=input.nextInt();
        System.out.println("Ingrese el segundo numero");
        numero2=input.nextInt();
        
        
            
            switch(opcion){
                case 1:
                    suma=numero1+numero2;
                    System.out.println("\nLa respuesta de la suma es "+ suma);
                    break;
                case 2:
                    resta=numero1-numero2;
                    System.out.println("\nLa resta de la resta es "+ resta);
                    break;
                case 3:
                    multiplicacion=numero1*numero2;
                    System.out.println("\nLa respuesta de la multiplicacion es "+ multiplicacion);
                    break;
                case 4:
                    division=numero1/numero2;
                    System.out.println("\nLa respuesta de la division es "+ division);
                    break;
            
            }
        }
    }

