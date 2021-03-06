package com.segurosx.models;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
    
    private String nombre;
    private List<Seguro> seguros;
    private String id;

    public Cliente(String nombre)   {

        this.nombre = nombre;
        this.seguros = new ArrayList<Seguro>();
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public void setCompraSeguro(Seguro seguro) {

        this.seguros.add( seguro );
    }

    public void getListaSeguroCliente()    {

        System.out.println("Nombre: " + this.nombre );
        for (Seguro seguro : seguros )  {

            System.out.println( "Seguro: " + seguro.getDetalleSeguro());
        }
        
    }
}