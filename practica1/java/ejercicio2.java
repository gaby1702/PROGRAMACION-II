class EcuacionCuadratica {
    private double a, b, c;

    public EcuacionCuadratica(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminante() {
        return (b * b) - (4 * a * c);
    }

    public double getRaiz1() {
        if (getDiscriminante() >= 0) {
            return (-b + Math.sqrt(getDiscriminante())) / (2 * a);
        } else {
            return 0;
        }
    }

    public double getRaiz2() {
        if (getDiscriminante() >= 0) {
            return (-b - Math.sqrt(getDiscriminante())) / (2 * a);
        } else {
            return 0;
        }
    }
}

public class Test {
    public static void main(String[] args) {
        // Ejemplo fijo, sin Scanner (versión básica)
        EcuacionCuadratica eq = new EcuacionCuadratica(1, 3, 1);

        double d = eq.getDiscriminante();

        if (d > 0) {
            System.out.println("La ecuacion tiene dos raices " + eq.getRaiz1() + " y " + eq.getRaiz2());
        } else if (d == 0) {
            System.out.println("La ecuacion tiene una raiz " + eq.getRaiz1());
        } else {
            System.out.println("La ecuacion no tiene raices reales.");
        }
    }
}
