
package Clases;

import java.util.Scanner;

public class AplicaCola {
    
    static CCola cola;
    static Scanner teclado=new Scanner(System.in);
    
    public static void main(String[] args) {
        MenuCola();
    }
    
    static void CrearCola(){
        int tam;
        System.out.println("Ingrese tamaño de la cola: ");
        tam=teclado.nextInt();
        cola=new CCola(tam);
        System.out.println("Cola Creada...");
    }
    
    public static void MenuCola(){
        int opcion;
        do {            
            System.out.println("\n===============");
            System.out.println(" Menu de opciones ");
            System.out.println("=================");
            System.out.println("[1] Crear cola");
            System.out.println("=================");
            System.out.println("[2] Ingresar datos");
            System.out.println("=================");
            System.out.println("[3] Mostar datos");
            System.out.println("=================");
            System.out.println("[4] Elimanr datos");
            System.out.println("=================");
            System.out.println("[5] Vaciar cola");
            System.out.println("=================");
            System.out.println("[0] Salir");
            System.out.println("=================");
            
            System.out.println("Ingrese una alternativa: ");
            opcion=teclado.nextInt();
            System.out.println();
            
            switch(opcion){
                case 1:
                    CrearCola();
                    break;
                    case 2:
                        cola.InsertarCola();
                    break;
                    case 3:
                        cola.MostrarCola();
                    break;
                    case 4:
                        cola.EliminarColas();
                    break;
                    case 5:
                        cola.VaciarCola();
                    break;
                    case 0:
                        System.exit(0);
                    break;
                    
                    default:
                        System.out.println("Ingrese una opcion Correrta...");
                        break;
            }
        } while (true);
    }
}
