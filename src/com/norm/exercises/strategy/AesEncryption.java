package com.norm.exercises.strategy;

public class AesEncryption implements EncryptionAlgorithm{
    @Override
    public String encrypt(String message) {
        System.out.println("Encrypt the message with AES algorithm");
        return "encrypted message text";
    }
}
