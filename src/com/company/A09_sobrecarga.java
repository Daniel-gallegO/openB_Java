package com.company;

public abstract class A09_sobrecarga {

    public static void main(String[] args) {

        // FUNCIONES SOBRECARGADAS

        // cuando dos funciones (método función) tienen igual nombre (tienen duplicada la signatura, o sea su identificador
        // (con los argumentos/parámetros) y los modificadores, y lo que está dentro de las llaves (la implementación o
        // cuerpo de la función)) y no nos dá ningún error porque los parametros son distintos, y eso se considera como que está
        // sobrecargada o que tiene sobrecarga


        holaMundo();
        holaMundonuevo();
        String name = "Alan";
        holaMundonuevo(name);
        String surname = "Smith";
        holaMundonuevo(surname);


        // FUNCIONES DUPLICADAS

        // es cuando dos funciones tienen igual nombre (signatura), o sea el identificador con los parámetros y los modificadores
        // son los mismos

        private static void holaMundo () {
            System.out.println("hola mundo desde un método");
        }

        // private static void holaMundo() {
        //    System.out.println("hola mundo desde un método");
        // }
    }

    private static void holaMundonuevo() {
        System.out.println("hola mundo desde un método");
    }

    private static void holaMundonuevo (String name){
        System.out.println("hola " + name);
    }

    private static void holaMundonuevo (String name, String surname){
        System.out.println("hola " + name + surname);
    }

}