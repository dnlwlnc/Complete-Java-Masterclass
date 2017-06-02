package com.udemy.section8.Encapsulation.Challenge;

/**
 * Created by welencd on 2017-06-02.
 */
public class Printer {
    private int tonerLevel;
    private int totalPagesPrinted;
    private boolean isDuplex;

    public Printer(int tonerLevel, int totalPagesPrinted, boolean isDuplex) {
        if(tonerLevel >= 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        }
        this.totalPagesPrinted = totalPagesPrinted;
        this.isDuplex = isDuplex;
    }

    public void tonerRefill(){
        this.tonerLevel = 100;
    }

    public void printPage(int pages, boolean isDuplex){
        if (isDuplex == true && isDuplex() == false) {
            System.out.println("You cannot print in duplex mode");
        }else{
            if (pages > getTonerLevel()) {
                System.out.println("You cannot print so many pages. Please refill the toner.");
            }else{
                setTotalPagesPrinted(pages);
                setTonerLevel(pages);
                System.out.println(pages + " printed. Toner left " + getTonerLevel());
            }
        }
    }


    // GETTERS

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getTotalPagesPrinted() {
        return totalPagesPrinted;
    }

    public boolean isDuplex() {
        return isDuplex;
    }

    // SETTERS


    public void setTonerLevel(int tonerLevel) {
        this.tonerLevel -= tonerLevel;
    }

    public void setTotalPagesPrinted(int totalPagesPrinted) {
        this.totalPagesPrinted += totalPagesPrinted;
    }
}
