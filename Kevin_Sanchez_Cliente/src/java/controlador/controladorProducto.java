/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import sw.WSOperacion;
import sw.WSOperacion_Service;
import vistas.vistaBusqueda;
import vistas.vistaProducto;

/**
 *
 * @author kevin
 */
public class controladorProducto {
    
     WSOperacion_Service servicio = new WSOperacion_Service();
    WSOperacion cliete = servicio.getWSOperacionPort();
    vistaProducto vista;

    public controladorProducto(vistaProducto vista) {
        this.vista = vista;
    }
     public void controlador(){
         
     }
    
     public void registrar(){
         
     }
    
}
