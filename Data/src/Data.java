import java.util.ArrayList;
import java.util.List;

public class Data {
    public static ArrayList ListaDeAlumnos(){

        ArrayList<Alumno> alumnos = new ArrayList<>();
        alumnos.add(new Alumno("Jose", "Orellana", 18));
        alumnos.add(new Alumno("Pablo", "Giron",17));
        alumnos.add(new Alumno("Danna", "Mijangos", 19));
        alumnos.add(new Alumno("Santiago", "pocon", 16));
        alumnos.add(new Alumno("Ana", "López", 20));

        return alumnos;
    }


}
