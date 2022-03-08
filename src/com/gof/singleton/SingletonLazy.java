package com.gof.singleton;

/**
 * Singleton "preguiçoso".
 *
 * @author RodrigoCBArj
 */
public class SingletonLazy {

    private static SingletonLazy instancia;

    private SingletonLazy() { // construtor tem que ser privado
        super();
    }

    public static SingletonLazy getInstancia() {
        if (instancia == null) instancia = new SingletonLazy();
        return instancia;
    }
}
