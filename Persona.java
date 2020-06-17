
package Clases;

public class Persona {
    private String codigo,nombre;
    private int horas;
    private double tarifa;
    
    public Persona(){
        
    }
    
     public void registrar(String cod,String nom ,int hrs,double trf){
        this.codigo=cod;
        this.nombre=nom;
        this.tarifa=trf;
        this.horas=hrs;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }
    
     public double hallarSueldo(){
        double sueldo;
        sueldo=(tarifa*horas);
        return sueldo;
    }
     
     public void mostrarSueldo(){
        System.out.println("Promedio: "+hallarSueldo());
    }
    
    public String Cadena(){
        return("Codigo"+codigo+"\t"+"Nombre"+nombre+"\t"+"Tarifa"+tarifa+"\t"+"Horas"+horas+"\t"+"Sueldo"+ hallarSueldo());
    }
}
