package ejercicios.viajeMarco;
import java.util.Scanner;

public class ViajeMarco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputUsuario;

        int dia = 0;
        boolean buscandoMadre = true;
        double distanciaMarcoMadre = 350;
        final double PROBABILIDAD_LLUVIA_FUERTE = 0.1;
        final double RALENTIZACION_LLUVIA_FUERTE = 0.25;
        final double PROBABILIDAD_LLUVIA_NORMAL = 0.4;
        final double RALENTIZACION_LLUVIA_DEBIL = 0.75;
        final double PROBABILIDAD_MONO_CANSADO = 0.25;
        final double PROBABILIDAD_MONO_ESCAPADO = 0.15;
        final double RALENTIZACION_MONO = 0.1;
        final double TIEMPO_PERDIDO_MONO = 2;

        do {
            dia++;

            double horasMarco = Math.random()*2+8;
            double velocidadMarco = Math.random()*5+10;
            double avanceMarco = horasMarco * velocidadMarco;

            double probabilidadlluvia = Math.random();

            if (probabilidadlluvia <= PROBABILIDAD_LLUVIA_FUERTE) {

                System.out.println("LLUVIA FUERTE!");
                velocidadMarco = velocidadMarco * RALENTIZACION_LLUVIA_FUERTE;

            } else if (probabilidadlluvia <= PROBABILIDAD_LLUVIA_NORMAL) {

                System.out.println("LLUVIA NORMAL");
                velocidadMarco = velocidadMarco * RALENTIZACION_LLUVIA_DEBIL;

            } else {

                System.out.println("BUEN CLIMA :)");

            }

            double probabilidadMonoCansa = Math.random();

            if (probabilidadMonoCansa <= PROBABILIDAD_MONO_CANSADO) {
                velocidadMarco = velocidadMarco * RALENTIZACION_MONO;
            }

            double probabilidadMonoEscapa = Math.random();

            if (probabilidadMonoEscapa <= PROBABILIDAD_MONO_ESCAPADO) {
                horasMarco = horasMarco - TIEMPO_PERDIDO_MONO;
            }

            double avanceMadre = 80;

            distanciaMarcoMadre = distanciaMarcoMadre - avanceMarco + avanceMadre;

            if (distanciaMarcoMadre <= 0){
                buscandoMadre = !buscandoMadre;
            }

            System.out.println("Dia [" + dia + "] - Distancia [" + distanciaMarcoMadre + "]");
            if(probabilidadMonoEscapa <= PROBABILIDAD_MONO_ESCAPADO) {
                System.out.println("  Amedio se ha escapado!");
            }
            if (probabilidadMonoCansa <= PROBABILIDAD_MONO_CANSADO) {
                System.out.println("  Amedio se ha cansado!");
            }      
            System.out.println("Hoy Marco ha avanzado " + avanceMarco + " Km");
            System.out.println("  Tiempo: [" + horasMarco + "] horas - Velocidad: [" + velocidadMarco + "] Km/h");
            System.out.println((buscandoMadre ? "No ha " : "Ha " ) + "encontrado a su madre");
            inputUsuario = scanner.nextLine();


        } while (buscandoMadre);

        scanner.close();
    }
}        