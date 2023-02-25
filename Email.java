// package me.mosalam;

import java.util.Scanner;

public class Email {
    private String first_Name;
    private String last_Name;
    private String password;
    private String department;
    private String email;
    private int box_Capacity = 500;
    private int password_Length = 10;
    private String alternate_Email;
    private String comapany_Suffix = "anycompany.com";


    // constructor to receive first_Name and last_Name
    public Email(String first_Name, String last_Name) {
        this.first_Name = first_Name;
        this.last_Name = last_Name;

        // Call a method asking for Department - return department
        this.department = setDepartment();

        // Call a method that returns random password
        this.password = randomPassword(password_Length);
        System.out.println("Your password is " + this.password);

        // Combine elements to generate email
        email = first_Name.toLowerCase() + "." + last_Name.toLowerCase() + "@" + this.department.toLowerCase() + "." + this.comapany_Suffix ;
    }

    // Ask for department
    private String setDepartment() {
        System.out.println("New worker: " + this.first_Name + "\nDepartment codes: \n1 for sales\n2 for development\n3 for accounting\n0 for None\nEnter the department: ");
        Scanner in = new Scanner(System.in);
        int departmentChoice = in.nextInt();
        if (departmentChoice == 1) { return "Sales"; }
        else if (departmentChoice == 2) { return "Development";}
        else if (departmentChoice == 3) {return "Accounting";}
        else { return ""; }
    }
    // Generate  a random password
    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()_-+=";
        char[] password = new char[length];
        for (int i =0; i<length; i++) {
           int rand = (int) (Math.random() * passwordSet.length());
           password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }
    // Set the mailbox capacity
    public void setbox_Capacity(int capacity) {
        this.box_Capacity = capacity;
    }

    // Set the alternate email
    public void setalternate_Email(String altEmail) {
        this.alternate_Email = altEmail;
    }

    // Change the password
    public void changePassword(String password) {
        this.password = password;
    }

    public int getbox_Capacity() {
        return box_Capacity;
    }

    public String getalternate_Email() {
        return alternate_Email;
    }

    public String getPassword() {
        return password;
    }

    public String showInfo() {
        return "DISPLAY NAME: " + this.first_Name + " " + this.last_Name +
                "\nCOMPANY EMAIL: " + this.email +
                "\nMAILBOX CAPACITY: " + this.box_Capacity + "mb";
    }
}