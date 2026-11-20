package com.demo;

public class Book {
    private String bookId;
    private String bookName;
    private int stock;

    public Book(String bookId, String bookName, int stock) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.stock = stock;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }



    public String toString() {

        return "编号：" + this.bookId + ",名称：" + this.bookName + ",库存：" + this.stock;
    }
}
