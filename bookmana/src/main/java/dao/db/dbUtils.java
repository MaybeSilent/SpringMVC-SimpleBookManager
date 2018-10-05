package dao.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public interface dbUtils {
    /**
     *数据库接口，数据库连接类所要实现的连接和释放方法
     */
    Connection getConnection();
    void release(Connection connection, Statement statement, ResultSet resultSet);
}
