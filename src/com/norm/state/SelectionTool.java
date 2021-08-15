package com.norm.state;

/**
 * ConcreteState class.
 */
public class SelectionTool implements Tool {
    @Override
    public void mouseDown() {
        System.out.println("Selection icon.");
    }

    @Override
    public void mouseUp() {
        System.out.println("Draw a dash rectangle.");
    }
}
