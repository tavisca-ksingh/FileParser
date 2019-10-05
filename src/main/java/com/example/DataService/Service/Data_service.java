package com.example.DataService.Service;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "data_service")
public class Data_service implements Serializable {

   @Id
   private int id;

   private String f_Name;
    private String l_name;
    private Double phone;
    private String Address;
    private String Salary;
    private String Designation;

    public Data_service(){

    }
    public Data_service(int id, String f_Name, String l_name, Double phone, String address, String salary, String designation) {
        this.id = id;
        this.f_Name = f_Name;
        this.l_name = l_name;
        this.phone = phone;
        Address = address;
        Salary = salary;
        Designation = designation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getF_Name() {
        return f_Name;
    }

    public void setF_Name(String f_Name) {
        this.f_Name = f_Name;
    }

    public String getL_name() {
        return l_name;
    }

    public void setL_name(String l_name) {
        this.l_name = l_name;
    }

    public Double getPhone() {
        return phone;
    }

    public void setPhone(Double phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getSalary() {
        return Salary;
    }

    public void setSalary(String salary) {
        Salary = salary;
    }

    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String designation) {
        Designation = designation;
    }

    @Override
    public String toString() {
        return "Data_service{" +
                "id=" + id +
                ", f_Name='" + f_Name + '\'' +
                ", lname='" + l_name + '\'' +
                ", phone=" + phone +
                ", Address='" + Address + '\'' +
                ", Salary='" + Salary + '\'' +
                ", Designation='" + Designation + '\'' +
                '}';
    }
}
