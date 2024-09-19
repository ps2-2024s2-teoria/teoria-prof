package com.example;

import java.sql.*;
import java.util.*;
import java.util.Scanner;

public class ContaDao {
    private Connection conexao;
    public ContaDao() throws SQLException {
        String url = "jdbc:postgresql://aws-0-sa-east-1.pooler.supabase.com:6543/postgres";
        String user = "postgres.ixluvvwlwreawdwdbldk";
        String pass = "Eq5qgqw3)qww294e"; 
        conexao = DriverManager.getConnection(url, user, pass);        
    }
    public Conta obter(long n) throws SQLException {
        String sql = "SELECT * FROM contas WHERE nro_conta=?";
        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setLong(1, n);
        ResultSet rs = stm.executeQuery();
        Conta conta = null;
        if (rs.next()) {
            double saldo = rs.getDouble("saldo");
            conta = new Conta(n, saldo);
        }
        return conta;
    }
    public void apagar(Conta conta) throws SQLException {
        String sql = "DELETE FROM contas WHERE nro_conta=?";
        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setLong(1, conta.getNumero());
        stm.executeUpdate();
    }
    public void inserir(Conta conta) throws SQLException {
        String sql = "INSERT INTO contas VALUES (?, ?)";
        PreparedStatement sentenca = conexao.prepareStatement(sql);

        sentenca.setLong(1, conta.getNumero());
        sentenca.setDouble(2, conta.getSaldo());

        sentenca.executeUpdate();

    }
    public List<Conta> obterTodas() throws SQLException {
        String sql = "SELECT * FROM contas";
        PreparedStatement stm = conexao.prepareStatement(sql);
        ResultSet rs = stm.executeQuery();
        List<Conta> contas = new ArrayList<>();
        while (rs.next()) {
            long numero = rs.getLong("nro_conta");
            double saldo = rs.getDouble("saldo");
            Conta conta = new Conta(numero, saldo);
            contas.add(conta);
        }   
        return contas;     
    }

}
