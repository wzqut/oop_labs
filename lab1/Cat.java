public class Cat extends Mammal {
    private String breed;
    private boolean indoor;
    private int livesLeft;

    public Cat(String name, int age, double weight,
               String furColor, double bodyTemperature, int legsCount,
               String breed, boolean indoor, int livesLeft) {
        super(name, age, weight, furColor, bodyTemperature, legsCount);
        this.breed = breed;
        this.indoor = indoor;
        this.livesLeft = livesLeft;
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " говорит: Мяу!");
    }

    public void purr() {
        System.out.println(getName() + " мурлычет");
    }

    public void catchMouse() {
        if (indoor) {
            System.out.println(getName() + " домашняя кошка, мышей не ловит");
        } else {
            System.out.println(getName() + " поймала мышь!");
        }
    }

    public void loseLife() {
        if (livesLeft > 0) {
            livesLeft--;
            System.out.println(getName() + " потеряла одну жизнь, осталось: " + livesLeft);
        } else {
            System.out.println("У " + getName() + " не осталось жизней");
        }
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public boolean isIndoor() {
        return indoor;
    }

    public void setIndoor(boolean indoor) {
        this.indoor = indoor;
    }

    public int getLivesLeft() {
        return livesLeft;
    }

    public void setLivesLeft(int livesLeft) {
        this.livesLeft = livesLeft;
    }
}