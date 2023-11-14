package ejercicios.viajeMarco;
import java.util.Scanner;

public class ViajeMarcoExt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputUsuario;

        int dia = 0;
        boolean buscandoMadre = true;
        double distanciaMarcoMadre = 350;
        final double PROBABILIDAD_LLUVIA_FUERTE = 0.1;
        final double RALENTIZACION_LLUVIA_FUERTE = 0.25;
        final double RALENTIZACION_LLUVIA_FUERTE_MADRE = 0.5;
        final double PROBABILIDAD_LLUVIA_NORMAL = 0.4;
        final double RALENTIZACION_LLUVIA_DEBIL = 0.75;
        final double RALENTIZACION_LLUVIA_DEBIL_MADRE = 0.75;
        final double PROBABILIDAD_MONO_CANSADO = 0.25;
        final double PROBABILIDAD_MONO_ESCAPADO = 0.15;
        final double RALENTIZACION_MONO = 0.1;
        final double TIEMPO_PERDIDO_MONO = 2;
        final double PROBABILIDAD_PERSONA_AVISA_MARCO = 0.5;

        do {
            dia++;

            double horasMarco = Math.random()*2+8;
            double velocidadMarco = Math.random()*5+10;

            double probabilidadlluvia = Math.random();

            if (distanciaMarcoMadre <= 50) {

            } else if (probabilidadlluvia <= PROBABILIDAD_LLUVIA_FUERTE) {
                velocidadMarco = velocidadMarco * RALENTIZACION_LLUVIA_FUERTE;

            } else if (probabilidadlluvia <= PROBABILIDAD_LLUVIA_NORMAL) {
                velocidadMarco = velocidadMarco * RALENTIZACION_LLUVIA_DEBIL;

            } else {
            }

            double probabilidadMonoCansa = Math.random();

            if (distanciaMarcoMadre <= 50) {

            } else if (probabilidadMonoCansa <= PROBABILIDAD_MONO_CANSADO) {
                velocidadMarco = velocidadMarco * RALENTIZACION_MONO;
            }

            double probabilidadMonoEscapa = Math.random();

            if (distanciaMarcoMadre <= 50) {

            } else if (probabilidadMonoEscapa <= PROBABILIDAD_MONO_ESCAPADO) {
                horasMarco = horasMarco - TIEMPO_PERDIDO_MONO;
            }

            double avanceMarco = horasMarco * velocidadMarco;
            double personaAvisaMarco = 0;

            if (distanciaMarcoMadre <= 50) {
                avanceMarco = avanceMarco + 25;
                personaAvisaMarco = Math.random();
            }

            double horasMadre = Math.random()*3+6;
            double velocidadMadre = Math.random()*3+6;

            double probabilidadlluviaMadre = Math.random();

            if (probabilidadlluviaMadre <= PROBABILIDAD_LLUVIA_FUERTE) {
                velocidadMadre = velocidadMadre * RALENTIZACION_LLUVIA_FUERTE_MADRE;

            } else if (probabilidadlluviaMadre <= PROBABILIDAD_LLUVIA_NORMAL) {
                velocidadMadre = velocidadMadre * RALENTIZACION_LLUVIA_DEBIL_MADRE;

            } else {
            }

            double avanceMadre = horasMadre * velocidadMadre;

            distanciaMarcoMadre = distanciaMarcoMadre - avanceMarco + avanceMadre;

            if (distanciaMarcoMadre <= 0){
                buscandoMadre = !buscandoMadre;
            }


            System.out.println("Dia [" + dia + "] - Distancia [" + distanciaMarcoMadre + "]");
            System.out.println();
            if (probabilidadlluvia <= PROBABILIDAD_LLUVIA_FUERTE) {
                System.out.println ("A Marco le ha llovido fuerte!");
            } else if (probabilidadlluvia <= PROBABILIDAD_LLUVIA_NORMAL) {
                System.out.println("A Marco le ha llovido debil");
            } else {
                System.out.println("A Marco le ha hecho buen clima :)");
            }
            if(probabilidadMonoEscapa <= PROBABILIDAD_MONO_ESCAPADO) {
                System.out.println("  Amedio se ha escapado!");
            }
            if (probabilidadMonoCansa <= PROBABILIDAD_MONO_CANSADO) {
                System.out.println("  Amedio se ha cansado!");
            }
            if (personaAvisaMarco >= PROBABILIDAD_PERSONA_AVISA_MARCO) {
                System.out.println("  Una simpatica senora avisa a Marco que ha visto a su madre asi que empieza a correr a tope");
            }
            System.out.println("Hoy Marco ha avanzado " + avanceMarco + " Km");
            System.out.println("  Tiempo de Marco: [" + horasMarco + "] horas - Velocidad: [" + velocidadMarco + "] Km/h");          
            if (probabilidadlluviaMadre <= PROBABILIDAD_LLUVIA_FUERTE) {
                System.out.println("A la madre de Marco le ha llovido fuerte!");
            } else if (probabilidadlluviaMadre <= PROBABILIDAD_LLUVIA_NORMAL) {
                System.out.println("A la madre de Marco le ha llovido debil");
            } else {
                System.out.println("A la madre de Marco le ha hecho buen clima :)");
            }
            System.out.println("Hoy la madre de Marco ha avanzado " + avanceMadre + " Km");
            System.out.println("  Tiempo de Madre: [" + horasMadre + "] horas - Velocidad: [" + velocidadMadre + "] Km/h");
            System.out.println((buscandoMadre ? "No ha " : "Ha " ) + "encontrado a su madre");
            inputUsuario = scanner.nextLine();

        } while (buscandoMadre);

        scanner.close();
    }
}
