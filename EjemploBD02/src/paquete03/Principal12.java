package paquete03;

import paquete01.Enlace;
import paquete02.Auto;

public class Principal12 {

    public static void main(String[] args) {

        Auto a = new Auto();
        Enlace c = new Enlace();

        String[][] autos = {{"LBC0001", "230.2"},
        {"LBC0002", "330.2"},
        {"LBC0003", "430.2"},
        {"LBC0004", "530.1"},
        {"LBC0005", "130.2"},};

        // 1. guardar en la tabla autos de la base de datos
        for (int i = 0; i < autos.length; i++) {
            a.establecerPlaca(autos[i][0]);
            a.establecerValorMatricula(Double.parseDouble(autos[i][1]));

            c.insertarAuto(a);
        }

        // 2. presentar todos los registros de la tabla autos de la base de 
        // datos
        for (int i = 0; i < c.obtenerDataAuto().size(); i++) {
            System.out.printf("Placa: %s\n Valor: %.2f\n\n", 
                    c.obtenerDataAuto().get(i).obtenerPlaca(), 
                    c.obtenerDataAuto().get(i).obtenerValorMatricula());
        }

    }

}
