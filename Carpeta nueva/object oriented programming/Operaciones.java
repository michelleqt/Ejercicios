/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

import java.util.Scanner;

/**
 *
 * @author super
 */
public class Operaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Inicializando variables
        Scanner entrada=new Scanner(System.in);
        String continuar;
        double primervalor;
        double segundovalor;
        String usuario;
        int opcion;
        OperacionesBasicas ObjOperacion=new OperacionesBasicas();
        //ingreso de datos y menu
        do{
            continuar="";
            System.out.println("Ingrese el primer valor");
            primervalor=Double.parseDouble( entrada.nextLine());
            System.out.println("Ingrese el segundo valor");
            segundovalor=Double.parseDouble( entrada.nextLine());
            System.out.println("Ingrese el usuario:");
            usuario=entrada.nextLine();
            System.out.println("");
            System.out.println("MENU DE OPCIONES");
            System.out.println("1.- Suma");
            System.out.println("2.- Resta");
            System.out.println("3.- Multiplicacion");
            System.out.println("4.- Division");
            //valida la opcion ingresada
            do{
                System.out.println("Elija una opcion:");
                opcion=entrada.nextInt();
            }while(opcion<1 ||  opcion>4);
            
            ObjOperacion.IngresarDatos(usuario, primervalor, segundovalor);
            //realiza  las operaciones
            switch(opcion){
                case 1:
                    ObjOperacion.Sumar();
                    break;
                case 2:
                    ObjOperacion.Restar();
                    break;
                case 3:
                    ObjOperacion.Multiplicar();
                    break;
                case 4:
                    ObjOperacion.Dividir();
                    break;
            }
            //presentar resultados
            System.out.println("");
            System.out.println("El resultado de la "+ObjOperacion.getOperacion()+ " es: "+ObjOperacion.getResultado());
            while(!continuar.equals("SI") && !continuar.equals("NO")){
                System.out.println("Desea realizar otra operacion: (SI/NO)");
                continuar=entrada.nextLine().toUpperCase();
            }
            
        }while(continuar.equals("SI"));
        
        System.out.println("Fin del programa...");
    }
    
}
