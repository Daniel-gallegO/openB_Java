package com.company;

public class A04_varsYtipos {

    public static void main(String[] args) {


        /*
        1- se especifica el tipo de dato
        2- se especifica el identificador de la variable
        3- con el operador de asignación "=" se le asigna un valor o un texto dependiendo del "tipo" de dato (ver 1)
        4- después de asignar el valor dependiendo del tipo de dato se puede o no agregar la inicial del tipo de dato
        (esto es a manera de aclarar qué tipo de dato es, para una futura revisión del código)

        tipo identificador = 30;
         */

        /*
        otra manera de asignarlo sería

        1- declararlo + ";"
        2- inicializarlo con "=" + ";"


        tipo identificador;
        identificador = 30;
         */

        // TIPOS PRIMITIVOS
        // (empiezan en minúscula)
        // (no pueden ser nulos)

        // enteros

        byte number1 = 1; // 1 byte
        short number2 = 2; // 2 byte
        int number3 = 3; // 4 byte
        long number4 = 4; // 8 byte

        // punto flotante

        float decimal1 = 4.5f;
        double decimal2 = 9.99d;

        // caracter

        char caracter = 'b';

        // buleanos

        boolean verdadeo = true;
        boolean falso = false;


        // TIPO CLASE
        // (empiezan en mayúsculas)
        // (puede ser nulo)

        // cadena de texto

        String nombre = "Facundo";
        String apellido = "Lopez";


        // TIPO ENVOLTORIO
        // (son los TIPOS PRIMITIVOS, pero empezando con mayúsculas)
        // (los envuelven y pueden ser nulos)

        Integer numero0 = null;
        Long numero2 = 0;








    }
}
