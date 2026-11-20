package com.demo;

import java.util.ArrayList;

/*(2) Library类

• 包含属性：图书馆名称（libName）、图书列表（ArrayList books）。

        • 提供构造方法初始化图书馆名称和空图书列表。

        • 成员方法：
添加图书：addBook(Book book)
借阅图书：borrowBook(String bookId)
归还图书：returnBook(String bookId)
打印图书馆名称及所有图书的详细信息：showAllBooks()*/
public class Library {
    private String libName;
    private Book[] books;
    private int count;


    public Library(String libName) {
    this.libName=libName;
    books=new Book[100];
    count=0;
}
//添加图书
    public void addBook(Book book){
        if(count>=books.length){
            System.out.println("图书库已满，无法添加");
        }
        else{
            books[count]=book;
            count++;
            System.out.println("图书添加成功:"+book);
        }
    }
    //借阅图书
    public void borrowBook(String bookId){
        for (int i = 0; i < count; i++) {
            Book b=books[i];
            if(b.getBookId().equals(bookId)){
                if(b.getStock()>0){
                    b.setStock(b.getStock()-1);
                    System.out.println("借阅成功"+b);
                }else{
                    System.out.println("借阅失败，库存不足");
                }
                return;
            }
            System.out.println("没有找到该编号的图书");
        }
    }
    //归还图书
    public void returnBook(String bookId){
        for (int i = 0; i < count; i++) {
            Book b=books[i];
            if(b.getBookId().equals(bookId)){
                b.setBookId(b.getBookId()+1);
                System.out.println("归还成功");
            }
        }
        System.out.println("没有找到该编号的图书");
    }
    //打印所有图书信息
    public void showAllBooks(){
        System.out.println("\n======="+libName+"图书列表！");
        if(count==0){
            System.out.println("暂无图书");
            return;
        }
        for (int i = 0; i < count; i++) {
            System.out.println(books[i]);
        }

    }

}