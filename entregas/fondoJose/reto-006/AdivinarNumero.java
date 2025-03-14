import java.util.Scanner;

class AdivinarNumero {

    public static void main (String[] arg) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\n" + "Piense un numero del 1 al 99");
        int respuesta;
        
        final String PREGUNTA ="Dime (1 SI / 2 NO) si esta el numero pensado en la tarjeta ";
        int tarjeta;
        int primerNumero;
        int numeroPorAdivinar = 0;
        
        System.out.println("\n" + "TARJETA 1");
        System.out.println("+---------------+");
        System.out.println("| 1 21 41 61 81 |");
        System.out.println("| 3 23 43 63 83 |");
        System.out.println("| 5 25 45 65 85 |");
        System.out.println("| 7 27 47 67 87 |");
        System.out.println("| 9 29 49 69 89 |");
        System.out.println("|11 31 51 71 91 |");
        System.out.println("|13 33 53 73 93 |");
        System.out.println("|15 35 55 75 95 |");
        System.out.println("|17 37 57 77 97 |");
        System.out.println("|19 39 59 79 99 |");
        System.out.println("+---------------+");
        
        tarjeta = 1;
        primerNumero = 1;
        System.out.print("\n" + PREGUNTA + tarjeta + ": ");
        respuesta = scanner.nextInt();
        if (respuesta == 1){
            numeroPorAdivinar = numeroPorAdivinar + primerNumero;
        }
        
        System.out.println("\n" + "TARJETA 2");
        System.out.println("+---------------+");
        System.out.println("| 2 22 42 62 82 |");
        System.out.println("| 3 23 43 63 83 |");
        System.out.println("| 6 26 46 66 86 |");
        System.out.println("| 7 27 47 67 87 |");
        System.out.println("|10 30 50 70 90 |");
        System.out.println("|11 31 51 71 91 |");
        System.out.println("|14 34 54 74 94 |");
        System.out.println("|15 35 55 75 95 |");
        System.out.println("|18 38 58 78 98 |");
        System.out.println("|19 39 59 79 99 |");
        System.out.println("+---------------+");
        
        tarjeta = 2;
        primerNumero = 2;
        System.out.print("\n" + PREGUNTA + tarjeta + ": ");
        respuesta = scanner.nextInt();
        if (respuesta == 1){
            numeroPorAdivinar = numeroPorAdivinar + primerNumero;
        }
        
        System.out.println("\n" + "TARJETA 3");
        System.out.println("+---------------+");
        System.out.println("| 4 22 44 62 84 |");
        System.out.println("| 5 23 45 63 85 |");
        System.out.println("| 6 28 46 68 86 |");
        System.out.println("| 7 29 47 69 87 |");
        System.out.println("|12 30 52 70 92 |");
        System.out.println("|13 31 53 71 93 |");
        System.out.println("|14 36 54 76 94 |");
        System.out.println("|15 37 55 77 95 |");
        System.out.println("|20 38 60 78    |");
        System.out.println("|21 39 61 79    |");
        System.out.println("+---------------+");
        
        tarjeta = 3;
        primerNumero = 4;
        System.out.print("\n" + PREGUNTA + tarjeta + ": ");
        respuesta = scanner.nextInt();
        if (respuesta == 1){
            numeroPorAdivinar = numeroPorAdivinar + primerNumero;
        }
        
        System.out.println("\n" + "TARJETA 4");
        System.out.println("+---------------+");
        System.out.println("| 8 26 44 62 88 |");
        System.out.println("| 9 27 45 63 89 |");
        System.out.println("|10 28 46 72 90 |");
        System.out.println("|11 29 47 73 91 |");
        System.out.println("|12 30 56 74 92 |");
        System.out.println("|13 31 57 75 93 |");
        System.out.println("|14 40 58 76 94 |");
        System.out.println("|15 41 59 77 95 |");
        System.out.println("|24 42 60 78    |");
        System.out.println("|25 43 61 79    |");
        System.out.println("+---------------+");
        
        tarjeta = 4;
        primerNumero = 8;
        System.out.print("\n" + PREGUNTA + tarjeta + ": ");
        respuesta = scanner.nextInt();
        if (respuesta == 1){
            numeroPorAdivinar = numeroPorAdivinar + primerNumero;
        }
        
        System.out.println("\n" + "TARJETA 5");
        System.out.println("+---------------+");
        System.out.println("|16 26 52 62 88 |");
        System.out.println("|17 27 53 63 89 |");
        System.out.println("|18 28 54 80 90 |");
        System.out.println("|19 29 55 81 91 |");
        System.out.println("|20 30 56 82 92 |");
        System.out.println("|21 31 57 83 93 |");
        System.out.println("|22 48 58 84 94 |");
        System.out.println("|23 49 59 85 95 |");
        System.out.println("|24 50 60 86    |");
        System.out.println("|25 51 61 87    |");
        System.out.println("+---------------+");
        
        tarjeta = 5;
        primerNumero = 16;
        System.out.print("\n" + PREGUNTA + tarjeta + ": ");
        respuesta = scanner.nextInt();
        if (respuesta == 1){
            numeroPorAdivinar = numeroPorAdivinar + primerNumero;
        }
        
        System.out.println("\n" + "TARJETA 6");
        System.out.println("+------------+");
        System.out.println("|32 42 52 62 |");
        System.out.println("|33 43 53 63 |");
        System.out.println("|34 44 54 99 |");
        System.out.println("|35 45 55    |");
        System.out.println("|36 46 56    |");
        System.out.println("|37 47 57    |");
        System.out.println("|38 48 58    |");
        System.out.println("|39 49 59    |");
        System.out.println("|40 50 60    |");
        System.out.println("|41 51 61    |");
        System.out.println("+------------+");
        
        tarjeta = 6;
        primerNumero = 32;
        System.out.print("\n" + PREGUNTA + tarjeta + ": ");
        respuesta = scanner.nextInt();
        if (respuesta == 1){
            numeroPorAdivinar = numeroPorAdivinar + primerNumero;
        }
        
        System.out.println("\n" + "TARJETA 7");
        System.out.println("+------------+");
        System.out.println("|64 74 84 94 |");
        System.out.println("|65 75 85 95 |");
        System.out.println("|66 76 86 96 |");
        System.out.println("|67 77 87 97 |");
        System.out.println("|68 78 88 98 |");
        System.out.println("|69 79 89 99 |");
        System.out.println("|70 80 90    |");
        System.out.println("|71 81 91    |");
        System.out.println("|72 82 92    |");
        System.out.println("|73 83 93    |");
        System.out.println("+------------+");
        
        tarjeta = 7;
        primerNumero = 64;
        System.out.print("\n" + PREGUNTA + tarjeta + ": ");
        respuesta = scanner.nextInt();
        if (respuesta == 1){
            numeroPorAdivinar = numeroPorAdivinar + primerNumero;
        }
        
        System.out.println("\n" + "El numero pensado es: " + numeroPorAdivinar);
    }
}