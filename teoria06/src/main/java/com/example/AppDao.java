package com.example;

import java.sql.*; 
import java.util.*;

public final class AppDao {
    public static void main(String[] args) throws SQLException {
        ler();
        //inserir();
        //alterar();
        //apagar();
    }

    public static void apagar() throws SQLException {

        Scanner sc = new Scanner(System.in);
        System.out.print("Número da conta a ser apagada: ");
        long numero = Long.parseLong(sc.nextLine());

        ContaDao dao = new ContaDao();
        Conta conta = dao.obter(numero);
        if (conta != null) {
            dao.apagar(conta);
        }
    }

    public static void alterar() throws SQLException {

        Scanner sc = new Scanner(System.in);
        System.out.print("Número da conta a ser alterada: ");
        long numero = Long.parseLong(sc.nextLine());
        System.out.print("Novo saldo da conta (em R$): ");
        double novoSaldo = Double.parseDouble(sc.nextLine());
        
        ContaDao dao = new ContaDao();
        Conta conta = dao.obter(numero);
        if (conta != null) {
            conta.setSaldo(novoSaldo);
        }

    }

    public static void inserir() throws SQLException {
    
        Scanner sc = new Scanner(System.in);
        System.out.print("Número da conta: ");
        long numero = Long.parseLong(sc.nextLine());
        System.out.print("Saldo da conta (em R$): ");
        double saldo = Double.parseDouble(sc.nextLine());

        Conta conta = new Conta(numero, saldo);

        ContaDao dao = new ContaDao();
        dao.inserir(conta);

    }

    public static void ler() throws SQLException {
        ContaDao dao = new ContaDao();
        List<Conta> contas = dao.obterTodas();
        for (Conta conta: contas) {
            System.out.println(conta.getNumero() + " tem saldo de R$ " + conta.getSaldo());
        }
    }
}
