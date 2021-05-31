public class GraphicCardBuilder extends ComputerBuilder {

//    private Computer computer;
    private String name;

    public GraphicCardBuilder(Computer computer) {
        super.computer = computer;
    }

    public GraphicCardBuilder setNameForGraphicCard(String name) {

        this.name = name;
        return this;
    }

    public GraphicCardBuilder buildGraphicCard() {
        GraphicCard graphicCard = new GraphicCard(this.name);
        this.computer.setGraphicCard(graphicCard);
        return this;
    }

}
