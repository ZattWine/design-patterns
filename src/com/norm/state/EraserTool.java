package com.norm.state;

/**
 * ConcreteState class.
 */
public class EraserTool implements Tool{
    @Override
    public void mouseDown() {
        System.out.println("Eraser icon.");
    }

    @Override
    public void mouseUp() {
        System.out.println("Erase something.");
    }
}
