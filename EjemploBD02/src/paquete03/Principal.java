package paquete03;

import java.sql.SQLException;
import paquete01.Enlace;
import paquete02.Auto;

public class Principal {

    public static void main(String[] args) throws SQLException {
        Enlace c = new Enlace();
        Auto a = new Auto();
        a.establecerPlaca("LBNS0001");
        a.establecerValorMatricula(200.2);

        c.insertarAuto(a);

        for (int i = 0; i < c.obtenerDataAuto().size(); i++) {
            System.out.printf("%s\n", c.obtenerDataAuto().get(i));
        }
    }
}
