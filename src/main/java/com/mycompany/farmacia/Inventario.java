/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.farmacia;

/**
 *
 * @author segundo
 */
public class Inventario {
    private String medicamentoActual;
    private String clienteActual;
    private String proveedorActual;
    private String registroVentas = "";
    
    public void registrarMedicamento(Medicamento medicamento)
    {
        this.medicamentoActual = medicamento.getNombre();
    }
    
    public void registrarCliente(Cliente cliente)
    {
        this.clienteActual = cliente.getNombre();
        registroVentas += "Cliente: " + cliente.getNombre() + 
                          " compro: " + cliente.getMedicamentoAdquirido() + "\n";
    }
    
    public void registrarProveedor(Proveedor proveedor)
    {
        this.proveedorActual = proveedor.getNombre();
    }
    
    public void informeVenta()
    {
        System.out.println("*********Informe de Ventas*********");
        System.out.println(registroVentas);
    }
}
