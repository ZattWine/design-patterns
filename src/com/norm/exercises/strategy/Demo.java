package com.norm.exercises.strategy;

public class Demo {
    public static void main(String[] args) {
        var chatClient = new ChatClient();
        chatClient.sendEncryptedMessage("Hello", new AesEncryption());
        chatClient.sendEncryptedMessage("World", new DesEncryption());
    }
}
