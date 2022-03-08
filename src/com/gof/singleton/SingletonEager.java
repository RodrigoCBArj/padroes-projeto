package com.gof.singleton;

/**
 * Singleton "apressado".
 *
 * @author RodrigoCBArj
 */
public class SingletonEager {

    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager() { // construtor tem que ser privado
        super();
    }

    public static SingletonEager getInstancia() {
        return instancia;
    }
}
