public class Excercise {
    
    public static void main (String[]args) {
        int numerolf = -4;
        int numeroWhile = 0;
        int numeroFor = 0;
        String estacion = "PRIMAVERA";
        check(numerolf);
        whileFunction(numeroWhile);
        doFunction(numeroWhile);
        forFunction(numeroFor);
        estacion(estacion);
    }

    public static void check(int numero) {
        if (numero > 0) {
            System.out.println("Es Positivo");
        } else if (numero == 0) {
            System.out.println("Es 0");
        } else {
            System.out.println("Es negativo");
        }
    }

    public static void whileFunction(int numero) {
        while (numero < 3) {
            numero++;
            System.out.println(numero);
        }
    }

    public static void doFunction(int numero) {
        do {
            numero++;
            System.out.println(numero);
        } while (numero < 3);
    }

    public static void forFunction(int numero) {
        for (; numero <= 3; numero++) {
            System.out.println(numero);
        }
    }

    public static void estacion(String Estacion) {
        switch(Estacion) {
        case "VERANO": 
        System.out.println("Es Verano");
        break;
        case "OTOÑO":
        System.out.println("Es Otoño");
        break;
        case "INVIERNO":
        System.out.println("Es Invierno");
        break;
        case "PRIMAVERA":
        System.out.println("Es Primavera");
        break;
        }
    }

}
