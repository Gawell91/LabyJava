//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//



public class Animal {
    private String species;
    private boolean canFly;
    private int legs;
    private boolean isAlive;
    private double weight;

    public Animal(String species, boolean canFly, int legs, boolean isAlive, double weight) {
        this.species = species;
        this.canFly = canFly;
        this.legs = legs;
        this.isAlive = isAlive;
        this.weight = weight;
    }

    public void Feed() {
        if (!this.isAlive) {
            System.out.println("Nie mozesz nakarmic martwego zwierzaka, halo policja!!");
        } else {
            ++this.weight;
            System.out.println(this.species + " nakarmiony, teraz wazy " + this.weight + "kg");
        }
    }

    public void GoForWalk() {
        if (!this.isAlive) {
            System.out.println("Nie mozesz wyprowadzic martwego zwierzaka, halo policja!!");
        } else {
            --this.weight;
            if (this.weight <= 0.0D) {
                this.isAlive = false;
                System.out.println(this.species + " umarl");
            }

        }
    }
}
