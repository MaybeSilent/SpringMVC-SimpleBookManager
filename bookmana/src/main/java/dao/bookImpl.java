package dao;

import dao.db.dbUtils;
import dao.db.mysqlDbUtils;
import model.book;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class bookImpl implements quaryBooks {

    private dbUtils db ;


    public bookImpl(){
        this.db = new mysqlDbUtils();
    }

    public List<book> findBooks() {
        String sql = "SELECT * FROM book";
        return quarySql(sql);
    }

    public boolean insertBook(String name , String author , int price) {
        String value = "(null,\"" + name + "\"," + String.valueOf(price) + ",\"" + author + "\")";
        String sql = "INSERT INTO book (id,name,price,author) VALUES" + value;
        return executeSql(sql);
    }

    public boolean deleteBook(int id) {
        String sql = "DELETE FROM book WHERE id = " + String.valueOf(id);
        return executeSql(sql);
    }

    public List<book> searchBook(String word) {
        String sql = "SELECT * FROM book WHERE name LIKE \"%"+ word + "%\"";
        return quarySql(sql);
    }

    public boolean changeBook(int id, int price) {
        //UPDATE 表名称 SET 列名称 = 新值 WHERE 列名称 = 某值
        String sql = "UPDATE book SET price = " + String.valueOf(price) + " WHERE id = " + String.valueOf(id);
        return executeSql(sql);
    }

    private boolean executeSql(String sql){
        try {
            Connection connection = db.getConnection();
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.execute();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    private List<book> quarySql(String sql){
        try {
            Connection connection = db.getConnection();
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            List<book> bookList = new ArrayList<book>();
            while(rs.next()){
                bookList.add( new book(rs.getString("name"),
                        rs.getString("author"),
                        rs.getInt("price"),
                        rs.getInt("id")) );
            }
            return bookList;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }


}
