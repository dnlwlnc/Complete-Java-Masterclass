package com.udemy.section8.Composition;

/**
 * Created by welencd on 2017-06-01.
 */
public class PC {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp(){
        //getTheCase().pressPowerButton();
        theCase.pressPowerButton();
        drawLogo();
    }

    public void drawLogo(){
        //getMonitor().drawPixelAt(1200,50, "blue");
        monitor.drawPixelAt(1200,50, "blue");
    }




    private Case getTheCase() {
        return theCase;
    }

    private Monitor getMonitor() {
        return monitor;
    }

    private Motherboard getMotherboard() {
        return motherboard;
    }
}
