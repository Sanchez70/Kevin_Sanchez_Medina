/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import sw.*;
import vistas.vistaBusqueda;

/**
 *
 * @author kevin
 */
public class controladorBuqueda {

    WSOperacion_Service servicio = new WSOperacion_Service();
    WSOperacion cliete = servicio.getWSOperacionPort();
    vistaBusqueda vista;

    public controladorBuqueda(vistaBusqueda vista) {
        this.vista = vista;
        vista.setVisible(true);
    }

    public void controlador() {
        buscador();

    }

    public void buscador() {

        ArrayList<Producto> lista = new ArrayList<>();
        DefaultTableModel mTabla;
        mTabla = (DefaultTableModel) vista.getTableProductos().getModel();
        mTabla.setNumRows(0);

        lista.add(cliete.buscarProducto());
        lista.stream().forEach(tipos -> {
            String[] filanueva = {String.valueOf(tipos.getIdProducto()), String.valueOf(tipos.getCantidad()), String.valueOf(tipos.getPrecio())};
            mTabla.addRow(filanueva);
        });
        vista.getTableProductos().setModel(mTabla);
    }
    
    public void limpiarAdministrador() {
        DefaultTableModel tb = (DefaultTableModel) vista.getTableProductos().getModel();
        int a = vista.getTableProductos().getRowCount() - 1;
        for (int i = a; i >= 0; i--) {
            tb.removeRow(tb.getRowCount() - 1);
        }
    }
    
    

}
