package br.com.problema;
import java.util.concurrent.Semaphore;
public class Leitores_Escritores {


    static Semaphore mutex = new Semaphore(1); 
    static Semaphore db = new Semaphore(1);
  
    // static int escritoresEsperando = 0;
    static int escritoresEscrevendo = 0;
    static int leitoresEsperando = 0;
    static int number = 0;
    public static int espaco_compartilhado = 0;
    static int rc = 0;

    public static int getEspaco(){
        return espaco_compartilhado;
    }
    public static void setEspaco(int NovoValor){
        espaco_compartilhado = NovoValor;
    }
	public static void setMutex(Semaphore mutex) {
		Leitores_Escritores.mutex = mutex;
	}
	public static Semaphore getDb() {
		return db;
	}
	public static void setDb(Semaphore db) {
		Leitores_Escritores.db = db;
	}
	public static Semaphore getLeia() {
		return Leia;
	}
	public static void setLeia(Semaphore leia) {
		Leia = leia;
	}
	public static int getEscritoresEscrevendo() {
		return escritoresEscrevendo;
	}
	public static void setEscritoresEscrevendo(int escritoresEscrevendo) {
		Leitores_Escritores.escritoresEscrevendo = escritoresEscrevendo;
	}
	public static int getLeitoresEsperando() {
		return leitoresEsperando;
	}
	public static void setLeitoresEsperando(int leitoresEsperando) {
		Leitores_Escritores.leitoresEsperando = leitoresEsperando;
	}
	public static int getNumber() {
		return number;
	}
	public static void setNumber(int number) {
		Leitores_Escritores.number = number;
	}
	public static int getEspaco_compartilhado() {
		return espaco_compartilhado;
	}
	public static void setEspaco_compartilhado(int espaco_compartilhado) {
		Leitores_Escritores.espaco_compartilhado = espaco_compartilhado;
	}
	public static int getRc() {
		return rc;
	}
	public static void setRc(int rc) {
		Leitores_Escritores.rc = rc;
	}
	static Semaphore Leia = new Semaphore(1);
	
	public static Semaphore getMutex() {
			return mutex;
		}
    
}