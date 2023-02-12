public class Apple extends Fruits{
    public Apple() {
    }

    public Apple(String color, String location, String levelOfPleasantSmell, String levelOfPleasantTaste, int averageWeight) {
        super(color, location, levelOfPleasantSmell, levelOfPleasantTaste, averageWeight);
    }

    Vitamine vitamine = new Vitamine("B-6");
}
