package br.com.problema;
import java.util.concurrent.Semaphore;

class Escritor extends Thread {
	Leitores_Escritores leitorEscritor = new Leitores_Escritores();
    public void run() {
        while (true) {
            try {
                Thread.sleep((int) (Math.random() * 1000));
                leitorEscritor.mutex.acquire();
                // escritoresEsperando++;

                System.out.println("Algum escritor irá escrever");
                
                if(leitorEscritor.escritoresEscrevendo == 0 ){
                	leitorEscritor.escritoresEscrevendo++;
                	leitorEscritor.db.acquire();
                    Thread.sleep((int) (Math.random() * 1000));

                    leitorEscritor.number++;
                    leitorEscritor.setEspaco(leitorEscritor.number);
                    System.out.println("Escritor escreveu : " + leitorEscritor.number);


                    leitorEscritor.db.release();
                    leitorEscritor.escritoresEscrevendo--;
                    System.out.println("Escritor Terminou de escrever" );
                }
                leitorEscritor.Leia.release();
                leitorEscritor.mutex.release();

            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}