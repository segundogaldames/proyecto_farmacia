/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.farmacia;

/**
 *
 * @author segundo
 */
public class Cliente {
    private String rut;
    private String nombre;
    private String medicamentoAdquirido;
    
    public Cliente(String rut,String nombre)
    {
        this.rut = rut;
        this.nombre = nombre;
        this.medicamentoAdquirido = "Ninguno";
    }
    
    public void realizarCompra(String medicamento)
    {
        this.medicamentoAdquirido = medicamento;
    }
    
    public void devolverMedicamento()
    {
        System.out.println("El cliente " + this.nombre + " devolvió "+ this.medicamentoAdquirido);
        this.medicamentoAdquirido = "Ninguno";
    }
    
    //metodos getters
    public String getRut(){return this.rut;}
    public String getNombre(){return this.nombre;}
    public String getMedicamentoAdquirido(){return this.medicamentoAdquirido;}
}
