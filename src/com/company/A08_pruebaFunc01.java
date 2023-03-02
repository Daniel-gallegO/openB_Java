package com.company;

public class A08_pruebaFunc01 {

    public static void main(String[] args) {

        // MODIFICADORES

        // las funciones tienen un modificador al comienzo (public o private)
        // y ese modificador indica la visibilidad o el ámbito de esa función

        // PRIVATE significa que la función sólo es accesible desde la clase que la contiene
        // y no será accesible desde fuera de la clase

        // PUBLIC significa que la función sólo es accesible desde la clase que la contiene
        // y también desde fuera de dicha clase

        // PROTECTED significa que la función sólo es accesible desde la clase que la contiene
        // y desde clases hijas de la clase que la contiene, ó que estén en el mismo pakage

        // PROTECTED es más orientado a POO para cuando tenemos latencia en las clases hijas

        // si no incluímos el MODIFICADOR, la función adquiere la característica de PROTECTED



        A08_funcAmbitoRet.holaMundo2();

        A08_funcAmbitoRet.holaMundo3();

        A08_funcAmbitoRet.holaMundo4();



    }

    // RETORNO DE DATOS

    // VOID es cuando no retorna nada

    public static void main(String[] args) {


    }

    // cuando queremos que la función retorne un resultado (de lo que hará la función),
    // debemos especificar el tipo de variable que será el resultado (lo debemos escribir con inicial mayúscula):
    // String, Int, etc.


    private static int sum(int num1, int num2) {
        return num1 + num2;

    }
}


