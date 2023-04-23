package Servicio;

import Persistencia.FabricanteDao;
import Entidad.Fabricante;

import java.util.List;

public class FabricanteServicio {

    private final FabricanteDao fabricanteDao;

    public FabricanteServicio() {
        fabricanteDao = new FabricanteDao();
    }


    public void printFabricantes() throws Exception {
        try {
            List<Fabricante> fabricantes = fabricanteDao.ObtenerFabricante();
            if (fabricantes.isEmpty()){
                throw  new Exception("No existen registros");
            }else {
                System.out.println("LIST FABRICANTES");
                System.out.printf("%-10s%-15s%\n","CODIGO","NOMBRE");
                for (Fabricante fabricante : fabricantes) {
                    System.out.printf("%-10s%-15s%\n",
                            fabricante.getCodigo(), fabricante.getNombre());
                }
            }

        } catch (Exception e) {
            throw e;
        }
    }

}
