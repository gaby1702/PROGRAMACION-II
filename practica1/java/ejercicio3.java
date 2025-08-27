class Estadisticas {
    private double[] datos;

    public Estadisticas(double[] datos) {
        this.datos = datos;
    }

    public double promedio() {
        double suma = 0;
        for (int i = 0; i < datos.length; i++) {
            suma += datos[i];
        }
        return suma / datos.length;
    }

    public double desviacion() {
        double prom = promedio();
        double suma = 0;
        for (int i = 0; i < datos.length; i++) {
            suma += Math.pow(datos[i] - prom, 2);
        }
        return Math.sqrt(suma / (datos.length - 1));
    }
}

public class Test {
    public static void main(String[] args) {
        // Versión básica con datos fijos
        double[] valores = {1.9, 2.5, 3.7, 2, 1, 6, 3, 4, 5, 2};

        Estadisticas est = new Estadisticas(valores);

        System.out.println("El promedio es " + est.promedio());
        System.out.println("La desviacion estandar es " + est.desviacion());
    }
}