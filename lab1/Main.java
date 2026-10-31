public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Мурка", 3, 4.2, "рыжий", 38.5, 4, "Британская", true, 9);

        cat.eat(0.3);
        cat.sleep();
        cat.makeSound();

        cat.walk();
        cat.warmUp();
        cat.shedFur();

        cat.purr();
        cat.catchMouse();
        cat.loseLife();

        cat.setIndoor(false);
        cat.catchMouse();
        System.out.println("Порода: " + cat.getBreed() + ", возраст: " + cat.getAge());

        Animal animal = cat;
        animal.makeSound();

        Animal animal1 = new Animal("Мурзик", 5, 6.5);
        Cat cat1 = (Cat) animal1;
        cat1.purr();
        }

}