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
public class LibrarianList{

    public ArrayList<Librarian> list;

    public LibrarianList() {
        list = new ArrayList<>(); //inisiasi data list
        list.add(new Librarian("Rany", "Bandung", "0821", 01));
        list.add(new Librarian("Sasa", "Banten", "0812", 02));
    }

    //Output inisiasi data list librarian
    public void librarianOutput() {
        System.out.println("--- Librarians ----");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getLibrarianId() + "\t"
                    + list.get(i).getLibrarianName() + "\t"
                    + list.get(i).getAddress() + "\t"
                    + list.get(i).getPhoneNumber());
            System.out.println("------------------------------");
        }
    }
}
