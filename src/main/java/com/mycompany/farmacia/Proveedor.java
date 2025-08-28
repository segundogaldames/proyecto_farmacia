/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.farmacia;

/**
 *
 * @author segundo
 */
public class Proveedor {
    private String codigo;
    private String nombre;
    private String medicamentoProvisto;
    
    public Proveedor(String codigo, String nombre)
    {
        this.codigo = codigo;
        this.nombre = nombre;
        this.medicamentoProvisto = "Ninguno";
    }
    
    public void suministrar(String medicamento)
    {
        this.medicamentoProvisto = medicamento;
        System.out.println("Proveedor "+ this.nombre + " suministró " + medicamento);
    }
    
    //getters
    public String getCodigo(){return this.codigo;}
    public String getNombre(){return this.nombre;}
    public String getmedicamentoProvisto(){return this.medicamentoProvisto;}
}
