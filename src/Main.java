import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.print("Hello and welcome!");
        //System.out.println("Película Star Wars");

        //Declaración de variables

        int fechaDeLanzamiento = 1977;
        double evaluacion = 8.6;
        boolean incluidoEnElPlanBasico = true;
        String nombre = "Star Wars, una nueva esperanza";
        String sinopsis = """
                Luke Skywalker joins forces with a Jedi Knight,
                 a cocky pilot, a Wookiee and two droids to save the galaxy
                  from the Empire's world-destroying battle station,
                   while also attempting to rescue Princess Leia from the mysterious
                    Darth Vader.
                """ ;

        double mediaEvaluacionStarWars = 0;

        System.out.println("Película: " + nombre);
        System.out.println("Sinopsis: " + sinopsis);
        System.out.println("año: " + fechaDeLanzamiento);
        System.out.println("Puntuación: " + evaluacion);
        System.out.println(incluidoEnElPlanBasico);

        double mediaEvaluacion = (4.5 + 4.8 + 3) / 3;
        System.out.println("Puntuación media: " + mediaEvaluacion);

        if (fechaDeLanzamiento > 2023) {
            System.out.println("Película popular en el momento");
        } else {
            System.out.println("Película retro");
        }

        for (int i = 0; i < 3; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingresa la nota que le darías a la película: ");
            double notaStarWars = teclado.nextDouble();
            mediaEvaluacionStarWars = mediaEvaluacionStarWars + notaStarWars;
        }

        System.out.println("La media de la película es: " + mediaEvaluacionStarWars/3);

    }
}

