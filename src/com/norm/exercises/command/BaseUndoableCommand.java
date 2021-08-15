package com.norm.exercises.command;

public abstract class BaseUndoableCommand implements UndoableCommand {

    VideoEditor videoEditor;
    History history;

    public BaseUndoableCommand(VideoEditor videoEditor, History history) {
        this.videoEditor = videoEditor;
        this.history = history;
    }

    @Override
    public void execute() {
        // another application of the template method pattern.
        // template for executing commands.
        doExecute();

        history.push(this);
    }

    protected abstract void doExecute();
}
