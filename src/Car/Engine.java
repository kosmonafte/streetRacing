package Car;

public class Engine {

    private String name;
    private int power;
    private int wear;

    public Engine() {
        this.name = "21114";
        this.power = 90;
        this.wear = 0;
    }

    public Engine(String name, int power, int wear) {
        this.name = name;
        this.power = power;
        this.wear = wear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getWear() {
        return wear;
    }

    public void setWear(int wear) {
        this.wear = wear;
    }

    public int racePower() {
        if (wear < 1) {
            return this.power;
        } else {
            return this.power / this.wear;
        }
    }
}
