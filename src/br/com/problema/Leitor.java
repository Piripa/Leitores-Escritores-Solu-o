package br.com.problema;

import java.util.concurrent.Semaphore;

public class Leitor extends Thread {
	Leitores_Escritores leitorEscritor = new Leitores_Escritores();
    public void run() {
        while (true) {
            try {
                Thread.sleep((int) (Math.random() * 100));
                leitorEscritor.Leia.acquire();
                leitorEscritor.mutex.acquire();

                System.out.println("Leitor leu : " + leitorEscritor.getEspaco());
                
                leitorEscritor.mutex.release();

            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}