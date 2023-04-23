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

    public void NombrePrecio() throws Exception {
        try {
            List<Producto> productos = productoDao.obtenerProductosNombrePrecio();
            if (productos.isEmpty()){
                throw  new Exception("No existen registros");
            }else {
                System.out.println("LIST PRODUCTOS");
                System.out.printf("%-10s%-15s%-15s%-20s\n","NOMBRE","PRECIO");
                for (Producto producto : productos) {
                    System.out.printf("%-10s%-15s%-15s%-20s\n",
                            producto.getNombre(), producto.getPrecio());
                }
            }

        } catch (Exception e) {
            throw e;
        }

    }
    public void PrecioEntre200y800() throws Exception {
        try {
            List<Producto> productos = productoDao.obtenerProductosPreciosEntre200y800();
            if (productos.isEmpty()){
                throw  new Exception("No existen registros");
            }else {
                System.out.println("LIST PRODUCTOS CON PRECIO ENTRE 200 Y 800");
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
    public void ImpresorasRegistradas() throws Exception {
        try {
            List<Producto> productos = productoDao.obtenerImpresoras();
            if (productos.isEmpty()){
                throw  new Exception("No existen registros");
            }else {
                System.out.println("LIST DE IMPRESORAS");
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
    public void ProductoMasBarato() throws Exception {
        try {
            List<Producto> productos = productoDao.obtenerProductosMasBarato();
            if (productos.isEmpty()){
                throw  new Exception("No existen registros");
            }else {
                System.out.println("LIST PRODUCTOS MENOR PRECIO");
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
    public void ProductoMasCaro() throws Exception {
        try {
            List<Producto> productos = productoDao.obtenerProductosMasBarato();
            if (productos.isEmpty()){
                throw  new Exception("No existen registros");
            }else {
                System.out.println("LIST PRODUCTOS MAYOR PRECIO");
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

    public void printProductosNombres() throws Exception {
        try {
            List<Producto> productos = productoDao.obtenerProductosNombrePrecio();
            if (productos.isEmpty()){
                throw  new Exception("No existen registros");
            }else {
                System.out.println("LIST DE NOMBRE DE LOS PRODUCTOS");
                System.out.printf("%-10s%-15s%-15s%-20s\n","NOMBRE");
                for (Producto producto : productos) {
                    System.out.printf("%-10s%-15s%-15s%-20s\n",
                            producto.getNombre());
                }
            }

        } catch (Exception e) {
            throw e;
        }
    }

}
