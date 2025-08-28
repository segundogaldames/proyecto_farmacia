/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.farmacia;

import java.util.Date;

/**
 *
 * @author segundo
 */
public class Farmacia
{

    public static void main(String[] args) {
        Medicamento medicamento = new Medicamento("MED001","Paracetamol","Analgesico",10,new Date());
        Cliente cliente = new Cliente("20.123.567-3","Juan Perez");
        Proveedor proveedor = new Proveedor("Prov0001", "laboratorio Chile");
        Inventario inventario = new Inventario();
        
        proveedor.suministrar("Paracetamol");
        inventario.registrarProveedor(proveedor);
        
        medicamento.vender(cliente);
        inventario.registrarMedicamento(medicamento);
        inventario.registrarCliente(cliente);
        
        inventario.informeVenta();
        
        cliente.devolverMedicamento();
    }
}
