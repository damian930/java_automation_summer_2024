import java.util.Objects;

public class WaterBottleCorrect {
    private String brand;
    private int volume;
    private final String measurementSystem;

    WaterBottleCorrect(String brand, int volume, String measurementSystem) {
        this.brand = brand;
        this.volume = volume;
        this.measurementSystem = measurementSystem;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        WaterBottleCorrect that = (WaterBottleCorrect) obj;
        return volume == that.volume &&
                brand.equals(that.brand) &&
                measurementSystem.equals(that.measurementSystem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, volume, measurementSystem);
    }

    @Override
    public String toString() {
        return '(' + brand + ", " + volume + ", " + measurementSystem + ')';
    }

    public String getBrand() {
        return this.brand;
    }

    public int getVolume() {
        return volume;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getMeasurementSystem() {
        return this.measurementSystem;
    }
}
