package com.company;


public class A07_funciones02 {

    public static void main(String[] args) {

        // una función es una agrupación de sentencias que pueden ser reutilizadas desde cualquier punto de nuestra
        // aplicación

        holaMundo();
        holaMundo();

        holaMundo("Alan");  // argumento son los valores que se envían y que están inculídos entre los paréntesis
        // argumento lo que se envía

        holaMundo("Pedro");
        String hola = "devovlverHolaMundo";
        System.out.println(hola);


    }

    private static void holaMundo() {

        System.out.println("hola mundo desde un método");
        System.out.println("hola mundo");
        System.out.println("hola mundo");
    }

    private static void holaMundo(String name) { // el texto se pasó por parámetro
        // parámetro es lo que se recibe

        System.out.println("hola " + name);

    }

    private static String devolverHolaMundo(String name) {

        return "Devolver texto";


    }
}


