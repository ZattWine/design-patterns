package com.norm.exercises.command;

public interface UndoableCommand extends Command {
    void undo();
}
