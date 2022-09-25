package cl.duoc.lavadoautos.ejecutable;

/*
Autor: Ignacio Leon Morales
Fecha: 09/09/2022

*/

import cl.duoc.lavadoautos.dominio.Cliente;
import cl.duoc.lavadoautos.dominio.Lavado;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //INSTANCIANDO
        Scanner sc = new Scanner(System.in);
        Cliente cliente = new Cliente();
        Lavado lavado = new Lavado();

        //INICIALIZACION DE VARIABLES
        int opc = 0;
        int precioAuto = 10000;
        int precioMoto = 5000;
        int precioEncerado = 4000;
        int total = 0;
        int descuento = 0;
                
        
        String nombreCliente = "";
        String rutCliente = "";
        int edadCliente = 0;
        String celularCliente = "";
        String direccionCliente = "";
        
        String fechaOrden = "";
        String tipoCliente = "";
        String enceradoOrden = "";
        boolean encerado = true;
        String tipoLavado = "";
        

        //MENU
        while (true) {
            System.out.println("--Menu--");
            System.out.println("--------");
            System.out.println("1. Crear orden de lavado");
            System.out.println("2. Mostrar informacion de la orden");
            System.out.println("3. Realizar descuento a un cliente");
            System.out.println("4. Salir");
            System.out.println("--------");
            System.out.println("Ingrese una opcion: ");
            opc = sc.nextInt();
            if (opc == 1) {
                
                //Pidiendo los datos del cliente
                System.out.println("----Ingrese los datos del cliente----");
                System.out.println("Ingrese el nombre del cliente : ");
                nombreCliente = sc.next();
                while(nombreCliente.length() > 30){
                    System.out.println("Debe ingresar un nombre de menos de 30 caracteres");
                    System.out.println("Ingrese el nombre del cliente : ");
                    nombreCliente = sc.next();
                    
                }
                System.out.println("Ingrese el rut del cliente: ");
                rutCliente = sc.next();
                System.out.println("Ingrese la edad del cliente: ");
                edadCliente = sc.nextInt();
                sc.nextLine();
                System.out.println("Ingrese el celular del cliente: ");
                celularCliente = sc.next();
                sc.nextLine();
                System.out.println("Ingrese la direccion del cliente: ");
                direccionCliente = sc.next();
                sc.nextLine();
                
                //Seteando el cliente: 
                cliente.setNombre(nombreCliente);
                cliente.setRut(rutCliente);
                cliente.setEdad(edadCliente);
                cliente.setCelular(celularCliente);
                cliente.setDireccion(direccionCliente);
                
                //Pidiendo los datos de la orden de lavado:
                System.out.println("----Ingrese los datos de la orden de lavado ----");
                //Ingreso fecha
                System.out.println("Ingrese la fecha de hoy: ");
                fechaOrden = sc.next();
                //Ingreso tipo de cliente
                do{
                   System.out.println("Ingrese el tipo de cliente (Antiguo / Nuevo) : ");
                   tipoCliente = sc.next();
                }while(!tipoCliente.equalsIgnoreCase("Antiguo") && !tipoCliente.equalsIgnoreCase("Nuevo"));
                
                //Ingreso encerado
                System.out.println("Realiza encerado? (Si / No)");
                enceradoOrden = sc.next();
                if(enceradoOrden.equalsIgnoreCase("Si")){
                    encerado = true;
                } else {
                    encerado = false;
                    System.out.println("No aplica encerado");
                }
                
                
                //Tipo de lavado
                do{
                    System.out.println("Ingrese tipo de lavado a realizar: (Auto / Moto), debe ingresar un dato correcto.");
                    tipoLavado = sc.next();
                    
                }while(!tipoLavado.equalsIgnoreCase("Auto") && !tipoLavado.equalsIgnoreCase("Moto"));
                
                //Calculo del total
                if(tipoLavado.equalsIgnoreCase("Auto")){
                    total = total + precioAuto;
                }
                if(tipoLavado.equalsIgnoreCase("Moto")){
                    total = total + precioMoto;
                }
                if(encerado){
                    total = total + precioEncerado;
                }
                
                //Seteo de Orden de lavado
                lavado.setFecha(fechaOrden);
                lavado.setTipoCliente(tipoCliente);
                lavado.setTipoLavado(tipoLavado);
                lavado.setEncerado(encerado);
                lavado.setTotal(total);
                lavado.setCliente(cliente);

            }

            if (opc == 2) {
                System.out.println("Mostrando informacion del lavado");
                lavado.mostrarLavado();
            }

            if (opc == 3) {
                System.out.println("Aplicar un descuento a un cliente");
                System.out.println("El total sin descuento es: "+lavado.getTotal());
                System.out.println("Ingrese el porcentaje de descuento, no debe superar el 40%");
                descuento = sc.nextInt();
                System.out.println("El descuento a aplicar es de: %"+descuento);
                if(descuento <= 40){
                    System.out.println("El nuevo total es: "+lavado.aplicarDescuento(descuento));
                } else {
                    System.out.println("descuento no aplicado");
                }
 
            }

            if (opc == 4) {
                System.out.println("Saliendo, gracias por utilizar el sistema!");
                break;
            }

        }

    }
}


