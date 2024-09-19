package com.example;

import java.sql.*; 
import java.util.*;

public final class App {
    public static void main(String[] args) throws SQLException {
        //ler();
        //inserir();
        //alterar();
        apagar();
    }

    public static void apagar() throws SQLException {
        String url = "jdbc:postgresql://aws-0-sa-east-1.pooler.supabase.com:6543/postgres";
        String user = "postgres.ixluvvwlwreawdwdbldk";
        String pass = "Eq5qgqw3)qww294e"; 
        Connection c = DriverManager.getConnection(url, user, pass);
        String sql = "DELETE FROM contas WHERE nro_conta=?";
        PreparedStatement stm = c.prepareStatement(sql);

        Scanner sc = new Scanner(System.in);
        System.out.print("Número da conta a ser apagada: ");
        long numero = Long.parseLong(sc.nextLine());
        
        stm.setLong(1, numero);

        int n = stm.executeUpdate();
        System.out.println(n + " registro(s) apagado(s)");

        c.close();
    }

    public static void alterar() throws SQLException {
        String url = "jdbc:postgresql://aws-0-sa-east-1.pooler.supabase.com:6543/postgres";
        String user = "postgres.ixluvvwlwreawdwdbldk";
        String pass = "Eq5qgqw3)qww294e"; 
        Connection c = DriverManager.getConnection(url, user, pass);
        String sql = "UPDATE contas SET saldo=? WHERE nro_conta=?";
        PreparedStatement stm = c.prepareStatement(sql);

        Scanner sc = new Scanner(System.in);
        System.out.print("Número da conta a ser alterada: ");
        long numero = Long.parseLong(sc.nextLine());
        System.out.print("Novo saldo da conta (em R$): ");
        double saldo = Double.parseDouble(sc.nextLine());
        
        stm.setDouble(1, saldo);
        stm.setLong(2, numero);

        int n = stm.executeUpdate();
        System.out.println(n + " registro(s) alterado(s)");

        c.close();
    }

    public static void inserir() throws SQLException {
        String url = "jdbc:postgresql://aws-0-sa-east-1.pooler.supabase.com:6543/postgres";
        String user = "postgres.ixluvvwlwreawdwdbldk";
        String pass = "Eq5qgqw3)qww294e"; 
        Connection c = DriverManager.getConnection(url, user, pass);
        String sql = "INSERT INTO contas VALUES (?, ?)";
        PreparedStatement sentenca = c.prepareStatement(sql);

        Scanner sc = new Scanner(System.in);
        System.out.print("Número da conta: ");
        long numero = Long.parseLong(sc.nextLine());
        System.out.print("Saldo da conta (em R$): ");
        double saldo = Double.parseDouble(sc.nextLine());

        sentenca.setLong(1, numero);
        sentenca.setDouble(2, saldo);

        int n = sentenca.executeUpdate();
        System.out.println(n + " registro(s) inserido(s)");

        c.close();
    }

    public static void ler() throws SQLException {
        String url = "jdbc:postgresql://aws-0-sa-east-1.pooler.supabase.com:6543/postgres";
        String user = "postgres.ixluvvwlwreawdwdbldk";
        String pass = "Eq5qgqw3)qww294e"; 
        Connection c = DriverManager.getConnection(url, user, pass);
        System.out.println("Conexão bem-sucedida!"); 
        String sql = "SELECT * FROM contas";
        PreparedStatement stm = c.prepareStatement(sql);
        ResultSet rs = stm.executeQuery();
        while (rs.next()) {
            System.out.print(rs.getLong("nro_conta") + " - ");
            System.out.println(rs.getDouble("saldo"));
        }
        c.close();
    }
}
