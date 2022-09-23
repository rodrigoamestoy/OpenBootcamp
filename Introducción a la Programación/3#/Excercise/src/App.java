public class App {

    public static void main(String[] args) throws Exception {
        Persona Alfred = new Persona();
        Alfred.setEdad(21);
        Alfred.setNombre("Alfredo");
        Alfred.setTelefono(12355213);

        System.out.println(Alfred.getEdad());
        System.out.println(Alfred.getNombre());
        System.out.println(Alfred.getTelefono());
    }



}

class Persona {
    private int edad;
    private String nombre;
    private int telefono;

    public void setEdad(int edad) {
        this.edad = 21;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getTelefono() {
        return this.telefono;
    }
}