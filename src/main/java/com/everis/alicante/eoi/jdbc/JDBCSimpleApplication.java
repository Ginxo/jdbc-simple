package com.everis.alicante.eoi.jdbc;

public class JDBCSimpleApplication {

    public static void main(String... args) throws Exception {
        MySQLAccess mySQLAccess = new MySQLAccess();
        mySQLAccess.readDataBase();

    }
}
