package br.com.problema;

import java.math.*;
import java.util.concurrent.Semaphore;

class main {
    public static void main(String[] args) {
        Escritor escritor = new Escritor();
        Escritor escritor2 = new Escritor();

        Leitor leitor1 = new Leitor();
        Leitor leitor2 = new Leitor();

        escritor.start();
        leitor1.start();
        leitor2.start();
        escritor2.start();

    }

}
