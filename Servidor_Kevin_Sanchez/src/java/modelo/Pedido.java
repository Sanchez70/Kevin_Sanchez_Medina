/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;

/**
 *
 * @author kevin
 */
public class Pedido implements Serializable{
    
    private Producto idproducto;
    private Farmacia idfarmacia;
    private Distribuidor iddistribuidor;
    private int cantidad;
    

    public Pedido(Producto idproducto, Farmacia idfarmacia, Distribuidor iddistribuidor, int cantidad) {
        this.idproducto = idproducto;
        this.idfarmacia = idfarmacia;
        this.iddistribuidor = iddistribuidor;
        this.cantidad = cantidad;
    }

    public Producto getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(Producto idproducto) {
        this.idproducto = idproducto;
    }

    public Farmacia getIdfarmacia() {
        return idfarmacia;
    }

    public void setIdfarmacia(Farmacia idfarmacia) {
        this.idfarmacia = idfarmacia;
    }

    public Distribuidor getIddistribuidor() {
        return iddistribuidor;
    }

    public void setIddistribuidor(Distribuidor iddistribuidor) {
        this.iddistribuidor = iddistribuidor;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

   

 
    
    
}
