import java.util.Objects;

public class Computer {

    protected Processor processor;
    protected Ram ram;
    protected GraphicCard graphicCard;
    protected String company;
    protected String model ;

    public Processor getProcessor() {
        return processor;
    }

    public String getBattery() {
        throw new RuntimeException("Exception from class Computer");
    }

    public Computer setBattery(String battery) {
        throw new RuntimeException("Exception from class Computer");
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public GraphicCard getGraphicCard() {
        return graphicCard;
    }

    public void setGraphicCard(GraphicCard graphicCard) {
        this.graphicCard = graphicCard;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Computer)) return false;
        Computer computer = (Computer) o;
        return Objects.equals(processor, computer.processor) &&
                Objects.equals(ram, computer.ram) &&
                Objects.equals(graphicCard, computer.graphicCard) &&
                Objects.equals(company, computer.company) &&
                Objects.equals(model, computer.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(processor, ram, graphicCard, company, model);
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor=" + processor +
                ", ram=" + ram +
                ", graphicCard=" + graphicCard +
                ", company='" + company + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
