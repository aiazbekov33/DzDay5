package com.company;

public class Truck {
    private String brend;
    String model;
    double volumeccm;
    private int pRelease;

    public String getBrend() {
        return brend;
    }

    public void setBrend(String brend) {
        this.brend = brend;
    }

    public int getpRelease() {
        return pRelease;
    }

    public void setpRelease(int pRelease) {
        if (pRelease <=1985){
            System.out.println("Данная модель грузовика выпущен не ранее 1985 года");
        }else {
        this.pRelease = pRelease;
    }
}}
