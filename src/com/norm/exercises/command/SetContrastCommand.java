package com.norm.exercises.command;

public class SetContrastCommand extends BaseUndoableCommand{
    private final float previousContrast;
    private final float contrast;

    public SetContrastCommand(float contrast, VideoEditor videoEditor, History history) {
        super(videoEditor, history);

        previousContrast = videoEditor.getContrast();
        this.contrast = contrast;
    }


    @Override
    protected void doExecute() {
        videoEditor.setContrast(contrast);
    }

    @Override
    public void undo() {
        videoEditor.setContrast(previousContrast);
    }
}
