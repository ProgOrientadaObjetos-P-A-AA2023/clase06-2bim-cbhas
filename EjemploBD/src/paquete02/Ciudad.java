package paquete02;

public class Ciudad {

    private String nombre;
    private int poblacion;

    public Ciudad(String n, int p) {
        nombre = n;
        poblacion = p;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerPoblacion(int p) {
        poblacion = p;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public int obtenerPoblacion() {
        return poblacion;
    }

    @Override
    public String toString() {
        String data = String.format("Nombre: %s\n"
                + " Población: %d\n",
                obtenerNombre(), obtenerPoblacion());
        
        return data;
    }

}
