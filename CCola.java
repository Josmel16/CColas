
package Clases;

import java.util.Scanner;

public class CCola {
    
    static Scanner teclado = new Scanner(System.in);
    private int max;
    private int Frente;
    private int Final;
    Persona[] cola;
    Persona per =new Persona();
    
    public CCola(int max){
        this.max=max;
        this.Frente=0;
        this.Final=0;
        this.cola=new Persona[max+1];
        for (int i =0; i < this.max+1; i++){
            cola[i] = new Persona();
        }
            
    }
    
    public boolean IsColaLlena(){
        if(this.Final==this.max){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean IsColaVacia(){
        if(this.Frente==this.max){
            return true;
        }else{
            return false;
        }
    }
    
    public void InsertarCola() {
        if (this.IsColaLlena()) {
            System.out.println("La Cola esta Llena");
        } else {
            
            System.out.println("Ingrese el Código de la persona : ");
            String codigo = teclado.next();
            per.setCodigo(codigo);
            System.out.println("Ingrese el Nombre de la persona : ");
            String nom = teclado.next();
            per.setNombre(nom);
            System.out.println("Ingrese la tarifa de " + nom + " : ");
            double trf = teclado.nextInt();
            per.setTarifa(trf);
            System.out.println("Ingrese la Hora de  " + nom + " : ");
            int hrs = teclado.nextInt();
            per.setHoras(hrs);
            System.out.println("Se inserto a la pila en la posicion\n" + (Final + 1));
            System.out.println(per.Cadena());
            this.Final++;

        }

    }
    
    public void MostrarCola() {
        encabezado();
       
        if (this.IsColaVacia()) {
            System.out.println("La pila esta vacía");
        } else {
            for (int i = Frente; i <= this.Final; i++) {
                System.out.println(cola[i].Cadena());
            }
        }

    }
    private void encabezado(){
        System.out.println("\tListado");
        System.out.println("============================");
        System.out.println("Codigo\tNombres\ttarifa\tHora\tSueldo");
        
    }
    
    public void EliminarColas(){
        if (this.Frente==this.Final) {
            System.out.println("La cola esta vacia: ");
        } else {
            for (int i = Frente; i <= Final-1; i++) {
                cola[i]=cola[i+1];
            }
            System.out.println("Elemento eliminado...");
            Final--;
        }
    }
    
    public void VaciarCola(){
        Frente=0;
        Final=0;
        System.out.println("elementos eliminados...");
    }

    
}
