package com.acme;

import org.acme.LibA;

public class Main {

    public static void main(String[] args) {
        System.out.println("other-module: " + new LibA().getHello(args.length == 1 ? args[0] : "World"));
    }

}