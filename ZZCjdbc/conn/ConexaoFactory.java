package br.com.abc.javacore.ZZCjdbc.conn;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.*;

public class ConexaoFactory {
    //java.sql = connection, Statement, ResultSet
    //DriverManager
    public static Connection getConexao() {

        String url = "jdbc:mysql://localhost:3306/agencia?useSSL=false";
        String user = "root";
        String passworld = "root";
        try {
            //           Class.forName("com.mysql.jdbc.Driver");//depois do java 3 não precisa mais dessa linha e da
            // classnotfoundException, mas para certificação precisa
            return DriverManager.getConnection(url, user, passworld);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;

    }

    public static JdbcRowSet getRowSetConnection() {

        String url = "jdbc:mysql://localhost:3306/agencia?useSSL=false&relaxAutoCommit=true";
        String user = "root";
        String passworld = "root";
        try {
            JdbcRowSet jdbcRowSet = RowSetProvider.newFactory().createJdbcRowSet();
            jdbcRowSet.setUrl(url);
            jdbcRowSet.setUsername(user);
            jdbcRowSet.setPassword(passworld);

            return jdbcRowSet;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;

    }

    public static CachedRowSet getRowSetConnectionCached() {

        String url = "jdbc:mysql://localhost:3306/agencia?useSSL=false";
        String user = "root";
        String passworld = "root";
        try {
            CachedRowSet cacheRowSet = RowSetProvider.newFactory().createCachedRowSet();
            cacheRowSet.setUrl(url);
            cacheRowSet.setUsername(user);
            cacheRowSet.setPassword(passworld);

            return cacheRowSet;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;

    }

    public static void close(Connection connection) {
        try {
            if (connection != null)
                connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void close(ResultSet jrs) {
        try {
            if (jrs != null)
                jrs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void close(Connection connection, Statement stat) {
        close(connection);
        try {
            if (stat != null)
                stat.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void close(Connection connection, Statement stat, ResultSet rs) {
        close(connection, null);
        try {
            if (rs != null)
                rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
