/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progweb;

/**
 *
 * @author Andrés Felipe
 */
public class Seno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
double angulo = Math.toRadians(60),
                calcularPorSerie = serieTaylor(angulo),
                calcularPorMath = Math.sin(angulo);

        System.out.println("Serie: " + calcularPorSerie);
        System.out.println("Sen: " + calcularPorMath);
    }

    static double serieTaylor(double x) {
        double sumando, sumatoria = 0, precision = 0.0001d;

        // limite superior, iteracion de la sumatoria
        int n = 0; 

        do {
            sumando = Math.pow(-1, n) / factorial((2 * n)+1) * Math.pow(x, ((2 * n)+1));
            sumatoria = sumatoria + sumando;
            n = n + 1;
        } while (Math.abs(sumando) > precision);

        return sumatoria;
    }

    static double factorial(int numero) {
        double factorial = 1.0d;

        while (numero != 0) {
            factorial *= numero--;
        }

        return factorial;
    }
}
