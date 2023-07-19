package paquete03;

import java.sql.SQLException;
import paquete01.Enlace;
import paquete02.Ciudad;

public class Principal {

    public static void main(String[] args) throws SQLException {
        Enlace c = new Enlace();
        Ciudad ciudad = new Ciudad("Cuenca", 100123);
        c.insertarCiudad(ciudad);
        c.obtenerDataCiudad();

        for (int i = 0; i < c.obtenerLista().size(); i++) {
            System.out.printf("%s", c.obtenerLista().get(i));
        }
        
    }
    
}
