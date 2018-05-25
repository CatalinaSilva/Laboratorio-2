import java.util.ArrayList;
import java.util.Scanner;


public class Preguntas {

    Preguntas preguntas = new Preguntas();
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> pregunta = new ArrayList<String>();


    System.out.println("Escriba la pregunta; ");
    String seleccion = scanner.nextLine();

    pregunta.add(seleccion);
}
