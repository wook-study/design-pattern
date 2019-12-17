package com.design.pattern.command;

public class NoCommand implements Command {
    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }

    @Override
    public String toString() {
        return "NoCommand{}";
    }
}
