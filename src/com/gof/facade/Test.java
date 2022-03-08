package com.gof.facade;

public class Test {

    public static void main(String[] args) {

        // Testes relacionados ao Design Pattern Facade

        Facade facade = new Facade();
        facade.migrarCliente("Rodrigo", "99888-777");

        facade.migrarCliente("José", "66555-444");
    }
}
