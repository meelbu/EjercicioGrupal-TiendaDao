package Persistencia;

import Entidad.Fabricante;

import java.util.ArrayList;
import java.util.List;

public class FabricanteDao extends Dao {

    public List<Fabricante> ObtenerFabricante() throws Exception {
        try{
            String sql = "SELECT * FROM fabricante";

            querySql(sql);

            List<Fabricante> fabricantes = new ArrayList<>();
            Fabricante fabricante;

            while (resultSet.next()) {
                fabricante = new Fabricante();
                fabricante.setCodigo(resultSet.getInt(1));
                fabricante.setNombre(resultSet.getString(2));

                fabricantes.add(fabricante);
            }
            return fabricantes;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("Error al obtener fabricante. ");
        } finally {
            desconectarBD();
        }
    }



}
