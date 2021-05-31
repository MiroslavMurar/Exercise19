public class ComputerBuilder {

    protected static Computer computer = new Computer();
    protected String company;
    protected String model;


    public ProcessorBuilder processorBuilder() {
        return new ProcessorBuilder(computer);
    }

    public RamBuilder ramBuilder() {
        return new RamBuilder(computer);
    }

    public GraphicCardBuilder graphicCardBuilder() {
        return new GraphicCardBuilder(computer);
    }

    public ComputerBuilder setCompany(String name) {
        this.company = name;
        return this;
    }

    public ComputerBuilder setModel(String name) {
        this.model = name;
        return this;
    }

    public ComputerBuilder setBattery(String name) {
        computer.setBattery(name);
        return this;
    }

    public Computer build() {
        computer.setModel(this.model);
        computer.setCompany(this.company);
        return computer;
    }
}
