import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListadoPersonasApp {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        // Definir lista fuera del ciclo while
        List<Persona> personas = new ArrayList<>();

        // menu
        var salir = false;

        while (!salir){
            mostrarMenu();
            try {
                salir = ejecutarOperacion(consola, personas);
            } catch (Exception e){
                System.out.println("Ocurrio un error:" + e.getMessage());
            }

            System.out.println();
        }
    }

    private static void mostrarMenu(){
        //mostrar opciones
        System.out.print("""
                **** Listado Personas App ****
                1. Agregar
                2. Listar
                3. Salir
                
                """);
        System.out.print("Proporciona una opción:");
    }

    private static Boolean ejecutarOperacion(Scanner consola, List<Persona> personas){
        var opcion =  Integer.parseInt(consola.nextLine());
        var salir = false;
        //verificación opcion seleccionada
        switch (opcion){
            case 1 -> {//agregar persona a la lista
                System.out.print("Proporciona el nombre: ");
                var nombre = consola.nextLine();
                System.out.print("Proporciona el telefono: ");
                var tel = consola.nextLine();
                System.out.print("Proporciona el email: ");
                var email = consola.nextLine();
                // Crear el objeto persona
                var persona = new Persona(nombre,tel,email);
                // Se agrega a la lista
                personas.add(persona);
                System.out.println("La lista tine: " + personas.size() + "personas");
            }//fin caso 1
            case 2 -> {//listar personas
                System.out.println("Listado de persona: ");
                //usando lambda y metodo de referencia
                //personas.forEach((persona) -> System.out.println(persona));
                //esta sintaxis me sirve para realizar una tarea a cada objeto de la lista
                personas.forEach(System.out::println);
            } //fin caso 2
            case 3 -> {//salimos del ciclo
                System.out.println("Hasta pronto...");
                salir = true;
            }
            default -> System.out.println("Opción erronea: " + opcion);
        }//fin switch
        return salir;
    }



}