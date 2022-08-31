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
public class Student extends Person {

    private Boolean status;
    
    public Student(String studentName, String address, String phoneNumber, Boolean status, int studentId) {
        super.name = studentName;
        super.address = address;
        super.phoneNumber=phoneNumber;
        this.status = status;
        super.iD = studentId;
    }

    //implementasi enkapsulasi, mengakses data private
    public int getStudentId() {
        return super.iD;
    }

    public void setStudentId(int studentId) {
        super.iD = studentId;
    }

    public String getStudentName() {
        return super.name;

    }

    public void setStudentName(String studentName) {
        super.name = studentName;
    }

    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address){
        super.address=address;
    }
    
    public String getPhoneNumber(){
        return phoneNumber;
    }
    
    public void setPhoneNumber(String phoneNumber){
        super.phoneNumber=phoneNumber;
    }
    
    public Boolean getStatus(){
        return status;
    }
    
    public void setStatus(Boolean status){
        this.status=status;
    }
}
