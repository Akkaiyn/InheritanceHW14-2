public class Main {
    public static void main(String[] args) {
        Orange orange = new Orange("Orange", "China", "low", "middle", 100);

        Apple apple = new Apple("Red", "Central Asia", "middle", "high", 50);

        Banana banana = new Banana("Yellow", "Africa", "low", "high", 150);

        Fruits [] fruits = {orange,apple,banana};
        for (Fruits fr: fruits){
            System.out.println(fr.toString());
        }
        String[] vit = {orange.vitamine.getName(), apple.vitamine.getName(), banana.vitamine.getName()};
        for (String v : vit){
            System.out.println(v.toString());
        }
    }
}