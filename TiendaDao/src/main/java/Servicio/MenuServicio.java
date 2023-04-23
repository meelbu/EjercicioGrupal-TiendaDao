package Servicio;

import java.util.Scanner;

public class MenuServicio {

    ProductoServicio productoServicio = new ProductoServicio();
    FabricanteServicio fabricanteServicio = new FabricanteServicio();


    Scanner entrada = new Scanner(System.in);
    public void Menu() throws Exception{
     try {
         System.out.println("\n"+ "--------Menú--------"+"\n"
                 +"A) Listar el nombre de todos los productos registrados"
                 +"B) Listar los nombres y los precios de todos los productos registrados"
                 +"C) Listar aquellos productos que su precio esté entre 200 y 800"
                 +"D) Buscar y listar todas las impresoras registradas"
                 +"E) Listar el nombre y el precio del producto mas barato"
                 +"F) Listar el nombre y el precio del producto mas caro"
                 +"G) Listar el nombre y el codigo de los fabricantes registrados");

         System.out.println("Seleccione una opción");
         String respuesta = entrada.next();

         OpcionSeleccionada (respuesta);
     }catch (Exception e){
         System.out.println(e.getMessage());
         throw new Exception("Ingrese una opción válida");
     }
    }

    public void OpcionSeleccionada(String respuesta) throws Exception {
        try {
            switch (respuesta.toLowerCase()){
                case "A":
                    productoServicio.printProductos();
                    Menu();
                    break;
                case "B":

            }
        }catch (Exception e){
            throw e;
        }
    }
}
