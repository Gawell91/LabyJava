//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//



public class Phone {
    final String producer;
    final String model;
    final int yearOfProduction;
    final int ram;
    final String ramText;
    int totalStorage;

    public Phone(String producer, String model, int yearOfProduction, int ram, int totalStorage) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.ram = ram;
        this.totalStorage = totalStorage;
        this.ramText = ram + "gb";
    }

    public String toString() {
        return "Phone{producer='" + this.producer + '\'' + ", model='" + this.model + '\'' + ", yearOfProduction=" + this.yearOfProduction + ", ramText='" + this.ramText + '\'' + ", totalStorage=" + this.totalStorage + '}';
    }
}
