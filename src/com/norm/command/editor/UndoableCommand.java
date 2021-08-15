package com.norm.command.editor;

public interface UndoableCommand extends Command{
    void unexecute();
}
