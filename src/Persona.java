public class Persona {
    private int id;
    private String nombre;
    private String telefono;
    private String email;
    private static int numeroPersonas = 0;

    //Constructor vacio
    public Persona(){
        //se incrementa primero el valor de la variable y se asigna
        this.id = ++Persona.numeroPersonas;
    }
    //Constructor con argumentos
    public Persona(String nombre, String telefono, String email ){
        //llamo constructor vacío para incrementar id
        this();
        //se inicializa la variables
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }

}
