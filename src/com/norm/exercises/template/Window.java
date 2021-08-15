package com.norm.exercises.template;

public abstract class Window {

    public void close() {
        onClosing();
        System.out.println("Removing the window from the screen.");
        onClosed();
    }

    protected abstract void onClosed();
    protected abstract void onClosing();
}
