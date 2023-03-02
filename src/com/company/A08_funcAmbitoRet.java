package com.company;

public class A08_funcAmbitoRet {
    public static void main(String[] args) {

        // las funciones tienen un modificador al comienzo (public o private)
        // y ese modificador indica la visibilidad o el ámbito de esa función

        // PRIVATE significa que la función sólo es accesible desde la clase que la contiene
        // y no será accesible desde fuera de la clase

        // PUBLIC significa que la función sólo es accesible desde la clase que la contiene
        // y también desde fuera de dicha clase

        // PROTECTED significa que la función sólo es accesible desde la clase que la contiene
        // y desde clases hijas de la clase que la contiene, ó que estén en el mismo pakage

        // si no incluímos el MODIFICADOR, la función adquiere la característica de PROTECTED


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

    public static void holaMundo2() {

        System.out.println("soy una función pública");
        System.out.println("hola mundo público");
        System.out.println("hola mundo");
    }

    protected static void holaMundo3() {

        System.out.println("soy una función protegida");
        System.out.println("hola mundo protegido");
        System.out.println("hola mundo");
    }

    static void holaMundo4() {

        System.out.println("soy una función sin modificador y también soy protegida");
        System.out.println("hola mundo protegido");
        System.out.println("hola mundo sin modificador");
    }


    private static void holaMundo(String name) { // el texto se pasó por parámetro
        // parámetro es lo que se recibe

        System.out.println("hola " + name);

    }

    private static String devolverHolaMundo(String name) {

        return "Devolver texto";


    }
}




