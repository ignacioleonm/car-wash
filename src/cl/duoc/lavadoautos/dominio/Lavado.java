package cl.duoc.lavadoautos.dominio;

/*
Autor: Ignacio Leon Morales
Fecha: 09/09/2022

*/


public class Lavado {
    //ATRIBUTOS
    private String fecha;
    private String tipoCliente; //antiguo/nuevo
    private boolean encerado;
    private int total;
    private Cliente cliente;
    private String tipoLavado;
    
    //CONSTRUCTORES
    //Constructor vacio
    public Lavado() {
        cliente = new Cliente(); //Colaboracion
    }
    
    //Constructor por parametros
    public Lavado(String fecha, String tipoCliente, boolean encerado, int total, Cliente cliente, String tipoLavado) {
        this.fecha = fecha;
        this.tipoCliente = tipoCliente;
        this.encerado = encerado;
        this.total = total;
        this.cliente = cliente;
        this.tipoLavado = tipoLavado;  
    }
    
    //GETTERS & SETTERS
    public String getFecha(){
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public boolean isEncerado() {
        return encerado;
    }

    public void setEncerado(boolean encerado) {
        this.encerado = encerado;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getTipoLavado() {
        return tipoLavado;
    }

    //GETTERS & SETTERS
    public void setTipoLavado(String tipoLavado) {
        this.tipoLavado = tipoLavado;
    }

    //METODOS CUSTOMER
    //Metodo mostrarLavado()
    public void mostrarLavado() {
        System.out.println("Informacion del lavado: ");
        System.out.println("Fecha: "+this.fecha);
        System.out.println("Tipo de lavado: "+this.tipoLavado);
        System.out.println("Tipo cliente: "+this.tipoCliente);
        if(this.encerado){
            System.out.println("Encerado: Si realiza encerado");
        } else {
            System.out.println("Encerado: No realiza encerado");
        }
        System.out.println("El total a pagar es: "+this.total);
        this.cliente.mostrarCliente();
    }
    
    //Metodo aplicarDescuento()
    public int aplicarDescuento(int descuento){
        if(this.tipoCliente.equalsIgnoreCase("Nuevo") && this.encerado){
            this.total = this.total - (this.total * descuento / 100);
        }
       return this.total;
    }
    
    
    
    
}
