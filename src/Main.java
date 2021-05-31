public class Main {

    public static void main(String[] args) {

//        ComputerBuilder cb = new ComputerBuilder();
//
//        Computer computer = cb.ramBuilder()
//                                    .setNameForManufacturer("Ram Manufacturer")
//                                    .setNameForRam("Ram Name")
//                                    .setNameForModel("Ram Model")
//                                    .buildRam()
//                                .processorBuilder()
//                                    .setNameForProcessor("Processor Name")
//                                    .setNameForModel("Processor Model")
//                                    .setNameForManufacturer("Processor Manufacturer")
//                                    .buildProcessor()
//                                .graphicCardBuilder()
//                                    .setNameForGraphicCard("GraphicCard Name")
//                                    .buildGraphicCard()
//                                .setCompany("Company")
//                                .setModel("Model")
//                               .build();
//
//
//        System.out.println(computer.getRam().getName());
//        System.out.println(computer.getProcessor().getName());
//        System.out.println(computer.getGraphicCard().getName());
//        System.out.println(computer);

        LaptopBuilder lb = new LaptopBuilder();
        Computer laptop = lb
                        .ramBuilder()
                            .setNameForManufacturer("Laptop RAM Manufacturer")
                            .setNameForModel("Laptop RAM Model")
                            .setNameForRam("Laptom RAM Name")
                            .buildRam()
                        .processorBuilder()
                            .setNameForProcessor("Laptop Processor Name")
                            .setNameForModel("Laptop Processor Model")
                            .setNameForManufacturer("Laptop Processor Manufacturer")
                            .buildProcessor()
                        .graphicCardBuilder()
                            .setNameForGraphicCard("Laptop GraphicCard Name")
                            .buildGraphicCard()
                        .setBattery("Laptop Battery")
                        .build();
//                        .setBattery("Laptop Battery");

//        if (laptop instanceof Computer) {
//            System.out.println("I am Computes.class");
//        }
//        if (laptop instanceof Laptop) {
//            System.out.println("I am Laptop.class");
//        }

        System.out.println(laptop.getRam().getName());
        System.out.println(laptop.getProcessor().getName());
        System.out.println(laptop.getGraphicCard().getName());
        System.out.println(laptop.getBattery());



    }
}
