/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author kevin
 */
public class Farmacia implements Serializable {

    private String nombreFarmacia;
    private String direccion;
    private String tipoFarmacia;
    ArrayList<Pedido> listaPedidos = new ArrayList<>();

    public Farmacia(String nombreFarmacia, String direccion, String tipoFarmacia) {
        this.nombreFarmacia = nombreFarmacia;
        this.direccion = direccion;
        this.tipoFarmacia = tipoFarmacia;
    }

    public String getNombreFarmacia() {
        return nombreFarmacia;
    }

    public void setNombreFarmacia(String nombreFarmacia) {
        this.nombreFarmacia = nombreFarmacia;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTipoFarmacia() {
        return tipoFarmacia;
    }

    public void setTipoFarmacia(String tipoFarmacia) {
        this.tipoFarmacia = tipoFarmacia;
    }

    public ArrayList<Pedido> getListaPedidos() {
        return listaPedidos;
    }

    public void setListaPedidos(ArrayList<Pedido> listaPedidos) {
        this.listaPedidos = listaPedidos;
    }

}
