public class WaterBottle {

    private int volume;

    public WaterBottle(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public int setVolume(int newVolume) {
        this.volume = newVolume;
        return this.volume;
    }

    public void addDrink() {
        this.setVolume(this.volume - 10);
    }

    public void emptyBottle() {
        this.setVolume(0);
    }

    public void fillBottle() {
        this.setVolume(100);
    }
}
