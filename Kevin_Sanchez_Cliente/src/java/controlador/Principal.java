/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import vistas.vistaBusqueda;

/**
 *
 * @author kevin
 */
public class Principal {
    public static void main(String[] args) {
       vistaBusqueda vista = new vistaBusqueda();
       controladorBuqueda controlador=new controladorBuqueda(vista);
       controlador.controlador();
    }
}
