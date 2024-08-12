public class Lamp implements Operable{

    private String name;
    private boolean isTurnedOn;

    public Lamp(String name, boolean isTurnedOn) {
        this.name = name;
        this.isTurnedOn = isTurnedOn;
    }

    @Override
    public void turnOn() {
        isTurnedOn = true;
    }

    @Override
    public void turnOff() {
        isTurnedOn = false;
    }

    public String getName() {
        return name;
    }

    public boolean isTurnedOn() {
        return isTurnedOn;
    }

}
