package com.norm.exercises.strategy;

public class ChatClient {
    public void sendEncryptedMessage(String message, EncryptionAlgorithm algorithm) {
        var encryptedMessage = algorithm.encrypt(message);
        System.out.println(encryptedMessage);
    }
}
