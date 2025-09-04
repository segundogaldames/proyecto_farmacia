/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.farmacia;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author segundo
 */
public class Farmacia
{
    public void menu()
    {
        Scanner sc = new Scanner(System.in);
        Inventario inventario = new Inventario();
        Medicamento medicamento = null;
        Cliente cliente = null;
        Proveedor proveedor = null;
        
        int opcion;
        do{
            System.out.println("-----Menú de Opciones-----");
            System.out.println("1. Registrar Medicamento");
            System.out.println("2. Registrar Cliente");
            System.out.println("3. Registrar Proveedor");
            System.out.println("4. Vender Medicamento");
            System.out.println("5. Devolver Medicamento");
            System.out.println("6. Generar Informe de Venta");
            System.out.println("7. Salir");
        
        
            System.out.println("Ingrese una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch(opcion){
                case 1:
                    System.out.println("Ingrese el código del medicamento: ");
                    String codigo = sc.nextLine();
                    System.out.println("Ingrese el nombre del medicamento:");
                    String nombre = sc.nextLine();
                    System.out.println("Ingrese el tipo de medicamento");
                    String tipo = sc.nextLine();
                    System.out.println("Ingrese el stock inicial: ");
                    int stock = sc.nextInt();
                    sc.nextLine();
                    medicamento = new Medicamento(codigo,nombre,tipo,stock,new Date());
                    inventario.registrarMedicamento(medicamento);
                    System.out.println("Se ha ingresado el medicamento código " + medicamento.getCodigo() + " con el nombre " + medicamento.getNombre());
                    break;
                case 2:
                    System.out.println("Ingrese el RUT del cliente: ");
                    String rut = sc.nextLine();
                    System.out.println("Ingrese el nombre del cliente: ");
                    String nomCliente = sc.nextLine();
                    cliente = new Cliente(rut,nomCliente);
                    inventario.registrarCliente(cliente);
                    System.out.println("El cliente se ha registrado correctamente");
                    break;
                case 3:
                    System.out.println("Ingrese el código del proveedor: ");
                    String codProveedor = sc.nextLine();
                    System.out.println("Ingrese el nombre del proveedor: ");
                    String nomProveedor = sc.nextLine();
                    proveedor = new Proveedor(codProveedor,nomProveedor);
                    inventario.registrarProveedor(proveedor);
                    System.out.println("El proveedor se ha registrado correctamente");
                    break;
                case 4: 
                   if(medicamento != null && cliente != null){
                       medicamento.vender(cliente);
                       inventario.registrarCliente(cliente);
                   }else{
                       System.out.println("Debe registrar al cliente primero");
                   }
                   break;
                case 5:
                    if(cliente != null){
                        cliente.devolverMedicamento();
                    }else{
                        System.out.println("No hay cliente registrado");
                    }
                    break;
                case 6:
                    inventario.informeVenta();
                    break;
                case 7:
                    System.out.println("Saliendo del sistema");
                    break;
                default:
                    System.out.println("Ingrese una opción válida");
            }
        }while(opcion != 7);
    }

    public static void main(String[] args) {
       Farmacia farmacia = new Farmacia();
       farmacia.menu();
    }
}
