package com.company;

public class A07_funciones01 {

    public static void main(String[] args) {

        holaMundo();

        System.out.println("Hola Mundo");
        System.out.println("Hola Mundo");

        System.out.println("Hola Mundo");
        System.out.println("Hola Mundo");


        // holaMundo ( name:;"Daniel");


    }

    //
    //public static void holaMundo() {
        // se lo denomina función cuando no estamos hablando de objetos y de POO

        /**
         * identificador => holaMundo (debe coincidir con el definido más arriba)
         * modificador => void (indica el tipo de retorno de dato, si dijera String => devolverá un texto)
         *             => static (indica que pertenece a la classe)
         *             => public o private (indicador de visibilidad)
         */

    //}

    private static void holaMundo() {
        // se lo denomina método cuando estamos hablando de objetos y de POO

        System.out.println("Hola Mundo");
        System.out.println("Hola Mundo");
    }

    private static void holaMundo(String name) {

        System.out.println("Hola " + name);
        System.out.println(name + "Hola Mundo");
    }
}
