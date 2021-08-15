package com.norm.exercises.strategy;

public class DesEncryption implements EncryptionAlgorithm{
    @Override
    public String encrypt(String message) {
        System.out.println("Encrypt the message with DES algorithm");
        return "encrypted message text";
    }
}
