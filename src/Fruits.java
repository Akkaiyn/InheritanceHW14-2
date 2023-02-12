public class Fruits {
    private String color;
    private String location;
    private String levelOfPleasantSmell;
    private String levelOfPleasantTaste;
    private int averageWeight;

    public Fruits() {
    }

    public Fruits(String color, String location, String levelOfPleasantSmell, String levelOfPleasantTaste, int averageWeight) {
        this.color = color;
        this.location = location;
        this.levelOfPleasantSmell = levelOfPleasantSmell;
        this.levelOfPleasantTaste = levelOfPleasantTaste;
        this.averageWeight = averageWeight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLevelOfPleasantSmell() {
        return levelOfPleasantSmell;
    }

    public void setLevelOfPleasantSmell(String levelOfPleasantSmell) {
        this.levelOfPleasantSmell = levelOfPleasantSmell;
    }

    public String getLevelOfPleasantTaste() {
        return levelOfPleasantTaste;
    }

    public void setLevelOfPleasantTaste(String levelOfPleasantTaste) {
        this.levelOfPleasantTaste = levelOfPleasantTaste;
    }

    public int getAverageWeight() {
        return averageWeight;
    }

    public void setAverageWeight(int averageWeight) {
        this.averageWeight = averageWeight;
    }

    @Override
    public String toString() {
        return "Fruits{" +
                "color='" + color + '\'' +
                ", location='" + location + '\'' +
                ", levelOfPleasantSmell='" + levelOfPleasantSmell + '\'' +
                ", levelOfPleasantTaste='" + levelOfPleasantTaste + '\'' +
                ", averageWeight=" + averageWeight +
                '}';
    }
}
