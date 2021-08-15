package com.norm.memento;

/**
 * Memento class.
 */
public class EditorState {

    /**
     * Editor content to be store in state.
     * Set final to prevent from accident change.
     */
    private final String content;

    public EditorState(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

}
