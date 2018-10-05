package dao.db;


import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class mysqlDbUtils implements dbUtils {
    private static String jdbcDriver = "com.mysql.cj.jdbc.Driver";
    private static String jdbcUrl = "jdbc:mysql://127.0.0.1:3306/dbcourse?useSSL=false";
    private static String user = "root";
    private static String password = "root";

    //static {
    //    InputStream inputStream =
    //                ClassLoader.getSystemResourceAsStream("dao/db/mysql.properties");

    //    Properties properties = new Properties();
    //    try {
    //        properties.load(inputStream);
    //    } catch (IOException e) {
    //        e.printStackTrace();
    //    }
    //    jdbcDriver = properties.getProperty("jdbcDriver");
    //    jdbcUrl = properties.getProperty("jdbcUrl");
    //    user = properties.getProperty("user");
    //    password = properties.getProperty("password");
    //}
    /*
    mysql 8.0 连接驱动改变，与之前的连接代码不一样！！！
    https://www.cnblogs.com/alsf/p/9346921.html
     */
    public static void main(String[] args){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        // 打开链接
        System.out.println("连接数据库...");
        try {
            Connection conn = DriverManager.getConnection(jdbcUrl,user,password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public Connection getConnection() {
        try {
            Class.forName(jdbcDriver);
            return DriverManager.getConnection(jdbcUrl, user, password);
        } catch (SQLException e ) {
            e.printStackTrace();
            return null;
        } catch(ClassNotFoundException e){
            e.printStackTrace();
            return null;
        }
    }

    public void release(Connection connection, Statement statement, ResultSet resultSet) {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
