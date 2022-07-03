package com.greatlearning.email.main;

import com.greatlearning.email.model.Employee;
import com.greatlearning.email.service.CredentialService;
import com.greatlearning.email.service.CredentialServiceImpl;

import java.util.Scanner;

public class EmailApp {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        CredentialService service = new CredentialServiceImpl();
        String generatedEmail;
        char[] generatedPassword;

        System.out.println("Enter the first name");
        String firstName = sc.next();
        System.out.println("Enter the last name");
        String lastName = sc.next();
        Employee employee = new Employee(firstName,lastName);

        String department = "";

        System.out.println("Please enter the department from the following:");
        System.out.println("1. Technical");
        System.out.println("2. Admin");
        System.out.println("3. Human Resource");
        System.out.println("4. Legal");
        int option = sc.nextInt();
        switch (option) {
            case 0 -> {
                System.out.println("Please enter the details again!!");
                System.exit(0);
            }
            case 1 -> {
                department = "tech";
                generatedEmail = service.generateEMailAddress(employee, department);
                generatedPassword = service.generatePassword();
                service.showCredential(employee, generatedEmail, generatedPassword);
            }
            case 2 -> {
                department = "admin";
                generatedEmail = service.generateEMailAddress(employee, department);
                generatedPassword = service.generatePassword();
                service.showCredential(employee, generatedEmail, generatedPassword);
            }
            case 3 -> {
                department = "hr";
                generatedEmail = service.generateEMailAddress(employee, department);
                generatedPassword = service.generatePassword();
                service.showCredential(employee, generatedEmail, generatedPassword);
            }
            case 4 -> {
                department = "legal";
                generatedEmail = service.generateEMailAddress(employee, department);
                generatedPassword = service.generatePassword();
                service.showCredential(employee, generatedEmail, generatedPassword);
            }
        }
    }
}