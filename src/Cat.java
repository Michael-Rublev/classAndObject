public class Cat {
    double weight;
    String name;
    int age;
    String color;

    public Cat() {
        this(3000, "Barsik", 1, "Red",);
    }

    //Method class (old practics)
    void meow() {
        System.out.println("Meow");
    }

    void pee() {
        weight -= 20;
    }

    void eat() {
        //to the active weight adds a value of 50
        this.weight += 50;
    }

    //Normal method
    public Cat(double weight, String name, int age, String color) {
        this.weight = weight;
        this.name = name;
        this.age = age;
        this.color = color;
        System.out.println("New Cat created");

    }
}
