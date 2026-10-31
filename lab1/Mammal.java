public class Mammal extends Animal {
    private String furColor;
    private double bodyTemperature;
    private int legsCount;

    public Mammal(String name, int age, double weight,
                  String furColor, double bodyTemperature, int legsCount) {
        super(name, age, weight);
        this.furColor = furColor;
        this.bodyTemperature = bodyTemperature;
        this.legsCount = legsCount;
    }

    public void walk() {
        System.out.println(getName() + " идёт на " + legsCount + " лапах");
    }

    public void warmUp() {
        bodyTemperature += 0.5;
        System.out.println(getName() + " согрелся, температура тела: " + bodyTemperature);
    }

    public void shedFur() {
        System.out.println(getName() + " линяет, цвет шерсти: " + furColor);
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public double getBodyTemperature() {
        return bodyTemperature;
    }

    public void setBodyTemperature(double bodyTemperature) {
        this.bodyTemperature = bodyTemperature;
    }

    public int getLegsCount() {
        return legsCount;
    }

    public void setLegsCount(int legsCount) {
        this.legsCount = legsCount;
    }
}