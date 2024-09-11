package com.example;

import java.sql.*; 

public final class App {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:postgresql://aws-0-us-west-1.pooler.supabase.com:6543/postgres";
        String user = "postgres.oykjunaroeaqhltirgtc";
        String pass = "senha";
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
