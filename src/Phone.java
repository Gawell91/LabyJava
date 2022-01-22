//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//


public class Phone extends Device {
    final Double screenSize;
    String os;
    String colour;
    private final Integer ramSize;
    public Phone(String producer, String model, Integer yearOfProduction, Double screenSize, Integer ramSize){
        super(producer, model, yearOfProduction, "white");

     this.screenSize = screenSize;
     this.ramSize = ramSize;


    }

    public Phone(String producer, String model, int yearOfProduction, Double screenSize, int ramSize, String os, int colour) {
        super(producer, model, yearOfProduction, "white");
        this.screenSize = screenSize;
        this.ramSize = ramSize;
        this.os = os;
    }

    public String getRamSize() {
        return this.ramSize + "GB";
        Override
                public String toString() {
            return "Phone" +
                   "producer= " + producer + '\'' +
                    "model= " + model + '\'' +
                    "yearOfProduction= " + yearOfProduction + '\'' +
                    "screenSize= " + screenSize + '\'' +
                    "os= " + os + '\'' +
                    "colour= " + colour + '\'' +
                    '}';
        }
    }
}
