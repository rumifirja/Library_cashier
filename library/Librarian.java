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
public class Librarian extends Person {

    //enkapsulasi 
    
    public Librarian(String librarianName, String address, String phoneNumber, int librarianId) {
        super.name = librarianName;
        super.address = address;
        super.phoneNumber = phoneNumber;
        super.iD = librarianId;
    }

    //enkapsulasi, mengakses data private
    public String getLibrarianName() {
        return super.name;
    }

    public void setLibrarianName(String librarianName) {
       super.name = librarianName; //inheritance
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        super.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        super.phoneNumber = phoneNumber;
    }

    public int getLibrarianId() {
        return super.iD;
    }

    public void setLibrarianId(int librarianId) {
        super.iD = librarianId;
    }
}
