package com.example;

public class Conta {
    private long numero;
    private double saldo;
    public Conta() {}
    public Conta(long n, double s) {
        numero = n;
        saldo = s;
    }
    public long getNumero() { return numero; }
    public void setSaldo(double s) {
        saldo = s;
    }
    public double getSaldo() { return saldo; }
}
