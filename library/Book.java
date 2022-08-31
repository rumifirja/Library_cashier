/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

/**
 *
 * @author user
 */
public class Book {
    private String bookName;
    private int bookStock;
    private int bookPrice;
    private int bookId;
    
    public Book(String bookName, int bookStock, int bookPrice, int bookId){
        this.bookName=bookName;
        this.bookStock=bookStock;
        this.bookPrice=bookPrice;
        this.bookId=bookId;
    }
    
    //implementasi enkapsulasi, mengakses data private
    public String getBookName(){
        return bookName;
    }
    
    public void setBookName(String bookName){
        this.bookName=bookName;
    }
    
    public int getBookStock(){
        return bookStock;
    }
    
    public void setBookStock(int bookStock){
        this.bookStock=bookStock;
    }
    
    public int getBookPrice(){
        return bookPrice;
    }
    
    public void setBookPrice(int bookPrice){
        this.bookPrice=bookPrice;
    }
    
    public int getBookId(){
        return bookId;
    }
    
    public void setBookId(int bookId){
        this.bookId=bookId;
    }
}
