public class LaptopBuilder extends ComputerBuilder {

//    private Laptop laptop;
    private String battery;

    public LaptopBuilder() {
        computer = new Laptop();
    }

    @Override
    public LaptopBuilder setBattery(String name) {
        this.battery = name;
        return this;
    }


    @Override
    public Computer build() {
//        laptop.setBattery(this.battery);
//        laptop.setModel(this.model);
//        laptop.setCompany(this.company);
//        return laptop;

        computer.setBattery(this.battery);
        computer.setModel(this.model);
        computer.setCompany(this.company);
        return computer;

    }
}
