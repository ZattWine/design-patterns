package com.norm;

import com.norm.command.*;
import com.norm.command.editor.BoldCommand;
import com.norm.command.editor.History;
import com.norm.command.editor.HtmlDocument;
import com.norm.command.editor.UndoCommand;
import com.norm.command.fx.Button;
import com.norm.template.TransferMoneyTask;

public class Main {
    public static void main(String[] args) {
        var service = new CustomerService();
        var command = new AddCustomerCommand(service);
        var button = new Button(command);
        button.click();

        // composite
        var composite = new CompositeCommand();
        composite.addCommand(new ResizeCommand());
        composite.addCommand(new BlackAndWhiteCommand());
        composite.execute();
        composite.execute();

        // Undoable command
        var history = new History();
        var document = new HtmlDocument();
        document.setContent("Hello World");
        var boldCommand = new BoldCommand(document, history);
        boldCommand.execute();
        System.out.println(document.getContent());

        var undoCommand = new UndoCommand(history);
        undoCommand.execute();
        System.out.println(document.getContent());
    }
}
