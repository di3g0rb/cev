package br.poo.java;

public class Conta {
    private int numero;
    private Pessoa correntista;
    private double saldo;

    /* Construtor padrão */
    public Conta(){
    };
    
    /* Construtor com parâmetros */
    public Conta(int numero, Pessoa correntista, double saldo) {
        this.numero = numero;
        this.correntista = correntista;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Pessoa getCorrentista() {
        return correntista;
    }

    public void setCorrentista(Pessoa correntista) {
        this.correntista = correntista;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
    
}
