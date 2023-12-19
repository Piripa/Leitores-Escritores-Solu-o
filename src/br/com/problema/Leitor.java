package br.com.problema;

public class Leitor extends Thread {
    public void run() {
        while (true) {
            try {
                Thread.sleep((int) (Math.random() * 100));
                Leitores_Escritores.Leia.acquire();
                Leitores_Escritores.mutex.acquire();

                System.out.println("Leitor leu : " + Leitores_Escritores.getEspaco());
                
                Leitores_Escritores.mutex.release();

            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}