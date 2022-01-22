public class Device {

    private final String producer;
    public final String model;
    public final int yearOfProduction;
    public final String colour;

    public Device(String producer, String model, Integer yearOfProduction, String colour) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.colour = colour;

    }

    public String getProducer() {
        return producer;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public String getColour() {
        return colour;
    }
}
