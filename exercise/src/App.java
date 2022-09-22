public class App {
    public static void main(String[] args) throws Exception {
        suma(10, 10, 20);
        coche miCoche = new coche();
        miCoche.aumentar();
        System.out.println(miCoche.puertas);
    }

    public static void suma(int a,int b, int c) {
        System.out.println(a + b + c);
    }
}

class coche {
    public int puertas = 0;

    public void aumentar() {
        this.puertas++;
    }
}
