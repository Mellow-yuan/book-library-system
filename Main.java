package com.demo;

/*
第2题 图书借阅管理系统

设计一个图书借阅管理系统，包含图书类、图书馆类和测试类，实现图书的添加、借阅、归还及信息查询功能。
要求：
        (1) Book类

• 包含属性：图书编号（bookId）、图书名称（bookName）、库存数量（stock）。

        • 提供带参构造方法（初始化所有属性）和getter、setter方法。

        • 重写toString方法，输出图书信息，示例 “编号:101,名称:计算机技术,库存:10”；

        (2) Library类

• 包含属性：图书馆名称（libName）、图书列表（ArrayList books）。

        • 提供构造方法初始化图书馆名称和空图书列表。

        • 成员方法：
添加图书：addBook(Book book)
借阅图书：borrowBook(String bookId)
归还图书：returnBook(String bookId)
打印图书馆名称及所有图书的详细信息：showAllBooks()

(3) TestLibrary类
在main方法中创建Library对象和3本以上Book对象，测试添加、借阅、归还及显示所有图书的功能*/

//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main {
    public static void main(String[] args) {
        //TIP 当文本光标位于高亮显示的文本处时按 <shortcut actionId="ShowIntentionActions"/>
        // 查看 IntelliJ IDEA 建议如何修正。
        Library lib=new Library("太原理工大学图书馆");
        Book b1=new Book("101", "Java编程基础", 10);
        Book b2 = new Book("102", "数据结构与算法", 6);
        Book b3 = new Book("103", "计算机网络", 8);
        Book b4 = new Book("104", "操作系统原理", 5);
        lib.addBook(b1);
        lib.addBook(b2);
        lib.addBook(b3);
        lib.addBook(b4);

        lib.showAllBooks();

        lib.borrowBook("101");
        lib.borrowBook("101");
        lib.borrowBook("999");

        lib.showAllBooks();

        lib.returnBook("101");
        lib.returnBook("102");

        lib.showAllBooks();
        }
    }
