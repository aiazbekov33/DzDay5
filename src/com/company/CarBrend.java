package com.company;

public class CarBrend {
    String brend;
    String model;
    double volumeccm;
    int pRelease;
    String color;

    public CarBrend() {

    }
    public CarBrend( String model,String brend, double volumeccm) {
        this.brend = brend;
        this.model = model;
        this.volumeccm = volumeccm;
    }

    public CarBrend(int pRelease,double volumeccm, String model,String brend) {
        this.brend = brend;
        this.model = model;
        this.pRelease = pRelease;
        this.volumeccm = volumeccm;

    }

}










