package paquete02;

public class Auto {

    private String placa;
    private double valorMatricula;

    public void establecerPlaca(String p) {
        placa = p;
    }

    public void establecerValorMatricula(double p) {
        valorMatricula = p;
    }

    public String obtenerPlaca() {
        return placa;
    }

    public double obtenerValorMatricula() {
        return valorMatricula;
    }

}
