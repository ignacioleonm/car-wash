package cl.duoc.lavadoautos.dominio;

/*
Autor: Ignacio Leon Morales
Fecha: 09/09/2022

*/

public class Cliente {

    //ATRIBUTOS
    private String nombre;
    private String rut;
    private int edad;
    private String celular;
    private String direccion;

    //CONSTRUCTORES
    //Constructor vacìo
    public Cliente() {
    }

    //Constructor por paramtetros
    public Cliente(String nombre, String rut, int edad, String celular, String direccion) {
        this.nombre = nombre;
        this.rut = rut;
        this.edad = edad;
        this.celular = celular;
        this.direccion = direccion;
    }

    //GETTERS & SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(nombre.length() <= 30){
            this.nombre = nombre;
        } else {
            System.out.println("El largo del nombre debe ser igual o menor a 30");
        }
        
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    //METODOS CUSTOMER
    //Metodo mostrarCliente()
    public void mostrarCliente() {
        System.out.println("Datos del cliente: ");
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Rut: "+this.rut);
        System.out.println("Edad: "+this.edad);
        System.out.println("Celular: "+this.celular);
        System.out.println("Direccion: "+this.direccion);
        
    }

}
