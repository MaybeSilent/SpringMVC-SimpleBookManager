package dao;

import java.util.*;
import model.book;

public interface quaryBooks {
    /**
     * 查询所有书籍
     */
    List<book> findBooks() ;
    boolean insertBook(String name, String author, int price) ;
    boolean deleteBook(int id) ;
    List<book> searchBook(String word);
    boolean changeBook(int id, int price);
}
