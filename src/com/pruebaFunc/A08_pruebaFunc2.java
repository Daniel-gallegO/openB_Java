package com.pruebaFunc;

import com.company.A08_funcAmbitoRet;

public class A08_pruebaFunc2 {

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


        A08_funcAmbitoRet.holaMundo2();

        // A08_funcAmbitoRet.holaMundo3();

        // A08_funcAmbitoRet.holaMundo4();
    }
}
