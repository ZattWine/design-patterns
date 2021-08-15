package com.norm.exercises.command;

public class SetTextCommand extends BaseUndoableCommand {
    private String text;

    public SetTextCommand(String text, VideoEditor videoEditor, History history) {
        super(videoEditor, history);

        this.text = text;
    }

    @Override
    protected void doExecute() {
        videoEditor.removeText();
    }

    @Override
    public void undo() {
        videoEditor.setText(text);
    }
}
