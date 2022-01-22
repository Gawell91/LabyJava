package com.company;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Car {
    private final String producer;
    public final String model;
    public final int yearOfProduction;
    public String colour;
    public Double engineVolume;

    public Car(String producer, String model, int yearOfProduction, String colour, Double engineVolume) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.colour = colour;
        this.engineVolume = engineVolume;
        super(producer, model, yearOfProduction, colour);
        this.engineVolume = 1.9;
    }
    @Override
    public void turnOn(){
        System.out.println("przekrecam kluczyk");
        System.out.println("silnik opalił");
    }

    @Override
    public boolean isTurnedOn() {
        return false;
    }

    public String toString()
    {
                return "Producer: " + this.producer + ", model: " + this.model + "yearOfProduction: " + this.yearOfProduction + "colour" + this.colour + "engineVolume" + this.engineVolume;
    }
    public void sale(Human seller, Human bayer, Double price) {
        if(buyer.cash, price); {
            System.out.println("Sorry, nie sprzedam.");
        } else if (seller.car != this){
            System.out.println("Sorry, nie masz samochodu");
        }else {
            seller.cash += price;
            buyer.cash -= price;
            seller.car = null;
            buyer.car = this;
            System.out.println("Udało się sprzedać za " +price+ "pln");
        }
    }
}
