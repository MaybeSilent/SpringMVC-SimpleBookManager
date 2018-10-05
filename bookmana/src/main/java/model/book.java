package model;

public class book {
    private String name;
    private String author;
    private int price;
    private int id;

    public book(){
        this.name = "";
        this.author = "";
        this.price = 0;
        this.id = 0;
    }

    public book(String name , String author , int price , int id){
        this.name = name;
        this.author = author;
        this.price = price;
        this.id = id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }
}
