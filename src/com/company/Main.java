package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);   доп ДЗ
//        System.out.print("Введите имя: ");
//        String name = in.nextLine();
//        System.out.println("Приветствую вас " + name);



        String str1 = new String();
        System.out.println("Легковые автомобили:");
        CarBrend carBrend1 = new CarBrend();
        carBrend1.brend = "Alfa Romeo.";
        carBrend1.model = "GT.";
        carBrend1.volumeccm = (2.0);
        carBrend1.pRelease = (2004);
        carBrend1.color = "Green";
        System.out.println(" Марка Авто: " + carBrend1.brend + " модель: " + carBrend1.model +
                " Объем дв.: " + carBrend1.volumeccm + " Год выпуска: " + carBrend1.pRelease + "г."+"Цвет: " +carBrend1.color);

        CarBrend carBrend2 = new CarBrend("740i.", "BMW. ", 4.4);
        System.out.println("Марка Авто: " + carBrend2.brend + " модель: " + carBrend2.model +
                " Объем дв.: " + carBrend2.volumeccm);


        CarBrend carBrend3 = new CarBrend(2008, 3.2, "IS sportcross", "Lexus");
        System.out.println(" Марка Авто: " + carBrend3.brend + " модель: " + carBrend3.model +
                " Объем дв.: " + carBrend3.volumeccm + " Год выпуска: " + carBrend3.pRelease + "г.");

        String str = new String();
        System.out.println("Грузовые транспорты:");

        Truck truck1 = new Truck();
        truck1.setBrend("Daimler-Benz");
        truck1.model = "D208";
        truck1.setpRelease(1991);
        truck1.setVolumeccm(4);
        System.out.println(" Марка Авто: " + truck1.getBrend() + " модель: " + truck1.model +
                " Объем дв.: " + truck1.getVolumeccm() + " Год выпуска: " + truck1.getpRelease()+ "г.");





    }




}
