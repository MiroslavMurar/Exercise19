public class RamBuilder extends ComputerBuilder {

//    private Computer computer;
    private String name;
    private String model;
    private String manufacturer;

    public RamBuilder(Computer computer) {
        super.computer = computer;
    }

    public RamBuilder setNameForRam(String name) {
        this.name = name;
        return this;
    }

    public RamBuilder setNameForModel(String name) {
        this.model = name;
        return this;
    }

    public RamBuilder setNameForManufacturer(String name) {
        this.manufacturer = name;
        return this;
    }

    public RamBuilder buildRam() {
        Ram ram = new Ram(this.name, this.model, this.manufacturer);
        this.computer.setRam(ram);
        return this;
    }
}
