/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sw;

import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import modelo.Producto;

/**
 *
 * @author kevin
 */
@WebService(serviceName = "WS_Operacion")
public class WS_Operacion {
    
    ArrayList<Producto> listaproductos = new ArrayList<>();
    
    @WebMethod(operationName = "buscarProducto")
    public Producto buscar() {
        
        Producto nuevo = new Producto(1, "dasd", "adsa", 1, 12);
        listaproductos.add(nuevo);
        Producto resultado = null;
        for (Producto us : listaproductos) {
            resultado = us;
        }
        
        return resultado;
        
    }
    
    public void nuvoProducto(Producto producto){
        listaproductos.add(producto);
        
    }

//     public boolean crear(int id, String nombre, String tipoMedicamento, int cantidad, double precio) {
//        Producto nuevo = new Producto(id, nombre, tipoMedicamento, cantidad, precio);
//        if (listaproductos.add(nuevo)) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    @WebMethod(operationName = "eliminarProducto")
//    public boolean eliminar(int pocision) {
//        listaproductos.remove(pocision);
//        if (listaproductos.remove(pocision) == null) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    @WebMethod(operationName = "buscarProducto")
//    public ArrayList<Producto> buscar() {
//        return listaproductos;
//
//    }
//
//    @WebMethod(operationName = "buscarProducto")
//    public ArrayList<Producto> buscar(String id) {
//
//        List<Producto> rspuesta = null;
//        for (int i = 0; i < listaproductos.size(); i++) {
//            if (listaproductos.get(i).getNombreProducto().equals(id)) {
//                rspuesta = listaproductos;
//            }
//        }
//        return (ArrayList<Producto>) rspuesta;
//
//    }
}
