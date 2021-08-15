package com.norm.exercises.template;

public class ChatWindow extends Window{
    @Override
    protected void onClosed() {
        System.out.println("Window is closed.");
    }

    @Override
    protected void onClosing() {
        System.out.println("Window is closing...");
    }
}
