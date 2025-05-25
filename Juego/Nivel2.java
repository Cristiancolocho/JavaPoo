package Juego;

import java.util.Scanner;

public class Nivel2 {
    
    public int puntaje;
    private String respuesta;
    private final String[] animales;
    private final Scanner ent;

    public Nivel2() {
        puntaje = 0;
        ent = new Scanner(System.in);
        animales = new String[4];
        animales[0] = "pez";
        animales[1] = "pajaro";
        animales[2] = "tortuga";
        animales[3] = "raton";
    }

    private void puntajePez() {
        if (respuesta.equals(animales[0])) {
            System.out.println("¡Correcto! Haz ganado 20 puntos");
            puntaje += 20;
        } else {
            System.out.println(" ¡Incorrecto! La respuesta es: " + animales[0]);
            System.out.println("Has perdido 10 puntos");
            puntaje -= 10;
        }
    }

    private void puntajePajaro() {
        if (respuesta.equals(animales[1])) {
            System.out.println("¡Correcto! Haz ganado 20 puntos");
            puntaje += 20;
        } else {
            System.out.println(" ¡Incorrecto! La respuesta es: " + animales[1]);
            System.out.println("Has perdido 10 puntos");
            puntaje -= 10;
        }
    }

    private void puntajeTortuga() {
        if (respuesta.equals(animales[2])) {
            System.out.println("¡Correcto! Haz ganado 20 puntos");
            puntaje += 20;
        } else {
            System.out.println(" ¡Incorrecto! La respuesta es: " + animales[2]);
            System.out.println("Has perdido 10 puntos");
            puntaje -= 10;
        }
    }

    private void puntajeRaton() {
        if (respuesta.equals(animales[3])) {
            System.out.println("¡Correcto! Haz ganado 20 puntos");
            puntaje += 20;
        } else {
            System.out.println(" ¡Incorrecto! La respuesta es: " + animales[3]);
            System.out.println("Has perdido 10 puntos");
            puntaje -= 10;
        }
    }

    public void imprimePreguntas() {
        System.out.println("¿Es un animal que vive en el agua y tiene aletas?");
        respuesta = ent.nextLine();
        puntajePez();

        System.out.println("¿Es un animal que vuela y tiene plumas?");
        respuesta = ent.nextLine();
        puntajePajaro();

        System.out.println("¿Es un animal lento y tiene caparazón?");
        respuesta = ent.nextLine();
        puntajeTortuga();

        System.out.println("¿Es un animal que vive en casa y come queso?");
        respuesta = ent.nextLine();
        puntajeRaton();
    }

}
