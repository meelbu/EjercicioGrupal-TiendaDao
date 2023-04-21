package Persistencia;

import Entidad.Fabricante;
import Entidad.Producto;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductoDao extends Dao {

    public List<Producto> obtenerProductosNombrePrecio() throws Exception {
        try{
            String sql = "SELECT P.nombre, P.precio FROM producto P JOIN fabricante F " + "ON P.codigo_fabricante = F.codigo;";

            querySql(sql);

            List<Producto> productos = new ArrayList<>();
            Producto producto;
            Fabricante fabricante;

            while(resultSet.next()) {
                producto = new Producto();
                fabricante = new Fabricante();

                producto.setNombre(resultSet.getString(1));
                producto.setPrecio(resultSet.getDouble(2));

                producto.setFabricante(fabricante);

                productos.add(producto);
            }

            return productos;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new Exception("Error al obtener producto");
        } finally {
            desconectarBD();
        }
    }

    public List<Producto> obtenerProductosPreciosEntre200y800() throws Exception {
        try{
            String sql = "SELECT * FROM producto P JOIN fabricante F " + "ON P.codigo_fabricante = F.codigo WHERE precio >= 200 AND precio <= 800;";

            querySql(sql);

            List<Producto> productos = new ArrayList<>();
            Producto producto;
            Fabricante fabricante;

            while(resultSet.next()) {
                producto = new Producto();
                fabricante = new Fabricante();

                producto.setCodigo(resultSet.getInt(1));
                producto.setNombre(resultSet.getString(2));
                producto.setPrecio(resultSet.getInt(3));

                fabricante.setCodigo(resultSet.getInt(1));
                fabricante.setNombre(resultSet.getString(2));
                producto.setFabricante(fabricante);

                productos.add(producto);
            }

            return productos;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new Exception("Error al obtener producto");
        } finally {
            desconectarBD();
        }
    }

    public List<Producto> obtenerImpresoras() throws Exception {
        try{
            String sql = "SELECT * FROM producto INNER JOIN fabricante " + "ON producto.codigo_fabricante = fabricante.codigo WHERE producto.nombre LIKE 'Impresora%'";

            querySql(sql);

            List<Producto> productos = new ArrayList<>();
            Producto producto;
            Fabricante fabricante;

            while(resultSet.next()) {
                producto = new Producto();
                fabricante = new Fabricante();

                producto.setCodigo(resultSet.getInt(1));
                producto.setNombre(resultSet.getString(2));
                producto.setPrecio(resultSet.getInt(3));

                fabricante.setCodigo(resultSet.getInt(1));
                fabricante.setNombre(resultSet.getString(2));
                producto.setFabricante(fabricante);

                productos.add(producto);
            }

            return productos;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new Exception("Error al obtener impresora");
        } finally {
            desconectarBD();
        }
    }

    public List<Producto> obtenerProductosMasCaro() throws Exception {
        try{
            String sql = "SELECT producto.nombre, producto.precio FROM producto INNER JOIN fabricante " +
                    "ON fabricante.codigo = producto.codigo_fabricante "  +
                    "WHERE producto.precio = (SELECT max(producto.precio) FROM producto); ";

            querySql(sql);

            List<Producto> productos = new ArrayList<>();
            Producto producto;
            Fabricante fabricante;

            while(resultSet.next()) {
                producto = new Producto();
                fabricante = new Fabricante();

                producto.setNombre(resultSet.getString(1));
                producto.setPrecio(resultSet.getInt(2));

                producto.setFabricante(fabricante);

                productos.add(producto);
            }

            return productos;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new Exception("Error al obtener producto mas caro");
        } finally {
            desconectarBD();
        }
    }

    public List<Producto> obtenerProductosMasBarato() throws Exception {
        try{
            String sql = "SELECT producto.nombre, producto.precio FROM producto INNER JOIN fabricante " +
                    "ON fabricante.codigo = producto.codigo_fabricante "  +
                    "WHERE producto.precio = (SELECT min(producto.precio) FROM producto); ";

            querySql(sql);

            List<Producto> productos = new ArrayList<>();
            Producto producto;
            Fabricante fabricante;

            while(resultSet.next()) {
                producto = new Producto();
                fabricante = new Fabricante();

                producto.setNombre(resultSet.getString(1));
                producto.setPrecio(resultSet.getInt(2));

                producto.setFabricante(fabricante);

                productos.add(producto);
            }

            return productos;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new Exception("Error al obtener producto mas barato");
        } finally {
            desconectarBD();
        }
    }





}
