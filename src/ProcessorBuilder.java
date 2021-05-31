public class ProcessorBuilder extends ComputerBuilder {

//    private Computer computer;
    private String name;
    private String model;
    private String manufacturer;

    public ProcessorBuilder(Computer computer) {
        super.computer = computer;
    }

    public ProcessorBuilder setNameForProcessor(String name) {

        this.name = name;
        return this;
    }

    public ProcessorBuilder setNameForModel(String name) {

        this.model = name;
        return this;
    }

    public ProcessorBuilder setNameForManufacturer(String name) {

        this.manufacturer = name;
        return this;
    }

    public ProcessorBuilder buildProcessor() {
        Processor processor = new Processor(this.name, this.model, this.manufacturer);
        computer.setProcessor(processor);
        return this;
    }

}
