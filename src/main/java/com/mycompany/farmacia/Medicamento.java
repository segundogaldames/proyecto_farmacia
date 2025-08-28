/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.farmacia;
import java.util.Date;
/**
 *
 * @author segundo
 */
public class Medicamento {
    private String codigo;
    private String nombre;
    private String tipo;
    private int stock;
    private Date caducidad;
    
    public Medicamento(String codigo,String nombre,String tipo,int stock,Date caducidad)
    {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipo = tipo;
        this.stock = stock;
        this.caducidad = caducidad;
    }
    
    public void vender(Cliente cliente)
    {
        if(stock > 0){
            stock--; //stock = stock - 1
            cliente.realizarCompra(nombre);
            System.out.println("Venta realizada: " + nombre + " al cliente" + cliente.getNombre());
        }else{
            System.out.println("No hay stock disponible");
        }
    }
    
    //metodos getters
    public String getCodigo(){return this.codigo;}
    public String getNombre(){return this.nombre;}
    public String getTipo(){return this.tipo;}
    public int getStock(){return this.stock;}
    public Date getCaducidad(){return this.caducidad;}
}
