/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class BookList {

    public ArrayList<Book> list;

    public BookList() {
        list = new ArrayList<>(); //inisiasi data list (memberi nilai pada array dengan tipe class Book)
        list.add(new Book("Buku Non Fiksi", 80, 50000, 01));
        list.add(new Book("Novel Remaja", 90, 50000, 02));
    }
    
    //method output book list
    public void bookOutput() {
        System.out.println("--- Book List ---");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getBookId() + "\t"
                    + list.get(i).getBookName() + "\t\t"
                    + list.get(i).getBookPrice() + "\t"
                    + list.get(i).getBookStock());
            System.out.println("-------------------------------------");
        }
    }
    
    //mencari data book berdasarkan id
    public Book findBook(int id){
        for(int i = 0; i < list.size(); i++){ // size untuk menampilan semua jumlah index
            if(list.get(i).getBookId()==id){
                return list.get(i);
            }
        }
        return null;
    }
    
    //pengurangan stock book
    public void stockReducing(int id){
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getBookId()==id){
                int currentStock = list.get(i).getBookStock();
                list.get(i).setBookStock(currentStock-1);
            }
        }
    }
    
    public void stockReturn(int id){
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getBookId()==id){
                int currentStock = list.get(i).getBookStock();
                list.get(i).setBookStock(currentStock+1);
            }
        }
    }
}

//overloading parameter berbeda 