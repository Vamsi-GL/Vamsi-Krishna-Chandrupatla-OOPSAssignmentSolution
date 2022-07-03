package com.greatlearning.email.service;

import com.greatlearning.email.model.Employee;

public interface CredentialService {
    String generateEMailAddress(Employee emp,String department);
    char[] generatePassword();
    void showCredential(Employee emp,String email,char[] generatedPassword);
}
