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
}