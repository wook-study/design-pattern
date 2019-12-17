package com.design.pattern.command;

import com.design.pattern.model.CeilingFan;

public class CeilingFanOffCommand implements Command {

    private CeilingFan ceilingFan;
    private int prevSpeed;

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.off();
        System.out.println(ceilingFan.getLocation() + " ceilingFan, speed " + ceilingFan.getSpeed());
    }

    @Override
    public void undo() {
        switch (prevSpeed) {
            case CeilingFan.HIGH:
                ceilingFan.high();
                break;
            case CeilingFan.MEDIUM:
                ceilingFan.medium();
                break;
            case CeilingFan.LOW:
                ceilingFan.low();
                break;
            case CeilingFan.OFF:
                ceilingFan.off();
                break;
        }
        System.out.println(ceilingFan.getLocation() + " ceilingFan, speed " + ceilingFan.getSpeed());
    }

    @Override
    public String toString() {
        return "CeilingFanOffCommand{" +
                "ceilingFan=" + ceilingFan +
                ", prevSpeed=" + prevSpeed +
                '}';
    }
}