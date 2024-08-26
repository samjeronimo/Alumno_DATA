import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        ArrayList alumnos = Data.ListaDeAlumnos();

        for (Object cadaObjeto : alumnos){
            System.out.println(cadaObjeto);
        }

    }
}