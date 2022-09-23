public class App {

    public static void main(String[] args) throws Exception {
        Cliente Alfred = new Cliente();
        Alfred.nombre = "Alfredo";
        Alfred.edad = 30;
        Alfred.telefono = 132512412;
        Alfred.credito = 1000;

        System.out.println(Alfred.nombre);
        System.out.println(Alfred.edad);
        System.out.println(Alfred.telefono);
        System.out.println(Alfred.credito);

        Trabajador Rose = new Trabajador();
        Rose.nombre = "Rose";
        Rose.edad = 25;
        Rose.telefono = 12412414;
        Rose.salario = 1500;

        System.out.println(Rose.nombre);
        System.out.println(Rose.edad);
        System.out.println(Rose.telefono);
        System.out.println(Rose.salario);
    }
}

class Persona {
    String nombre;
    int edad,
    telefono;
}
class Cliente extends Persona {
    double credito;
}
class Trabajador extends Persona {
    double salario;
}