package Servicio;

import Entidad.Fabricante;
import Entidad.Producto;
import Persistencia.FabricanteDao;
import Persistencia.ProductoDao;

import java.util.List;

public class ProductoServicio {
    private final ProductoDao productoDao;

    public ProductoServicio() {
        productoDao = new ProductoDao();
    }


    public void printProductos() throws Exception {
        try {
            List<Producto> productos = productoDao.obtenerProductosNombrePrecio();
            if (productos.isEmpty()){
                throw  new Exception("No existen registros");
            }else {
                System.out.println("LIST PRODUCTOS");
                System.out.printf("%-10s%-15s%-15s%-20s\n","CODIGO","NOMBRE","PRECIO",
                        "FABRICANTE");
                for (Producto producto : productos) {
                    System.out.printf("%-10s%-15s%-15s%-20s\n",
                            producto.getCodigo(), producto.getNombre(), producto.getPrecio(), producto.getFabricante());
                }
            }

        } catch (Exception e) {
            throw e;
        }
    }

}
