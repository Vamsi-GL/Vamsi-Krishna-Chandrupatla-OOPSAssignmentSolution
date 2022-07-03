package com.greatlearning.email.service;

import com.greatlearning.email.model.Employee;

import java.util.Random;

public class CredentialServiceImpl implements CredentialService{

    @Override
    public String generateEMailAddress(Employee emp, String department)
    {
        return (emp.getFirstName()+"."+emp.getLastName()+"@"+department).toLowerCase()+".greatlearning.com";
    }

    @Override
    public char[] generatePassword() {
        Random random = new Random();
        String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String smallLetters = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String specialCharacters = "!@#$%^&*()_-+={[}]|:;'.?/";
        String passwordRange = capitalLetters + smallLetters + numbers + specialCharacters;

        char[] password = new char[8];

        for (int i = 0; i < password.length; i++)
        {
            password[i] = passwordRange.charAt(random.nextInt(passwordRange.length()));
        }
        return password;
    }

    @Override
    public void showCredential(Employee emp,String email,char[] generatedPassword)
    {
        System.out.println("Dear " + emp.getFirstName() + " " + emp.getLastName());
        System.out.println("Your generated credentials are as follows:");
        System.out.println("Email --> " + email);
        System.out.print("Password --> ");
        System.out.print(generatedPassword);
    }

}
