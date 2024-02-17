package SpeedRacing;

public class Car implements  Comparable{
    private String model;
    private double fuelAmount;
    private final double costPerKilometer;

    public double getDistanceTraveled() {
        return distanceTraveled;
    }

    private double distanceTraveled = 0d;

    public Car(String model, double fuelAmount, double costPerKilometer) {
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.costPerKilometer = costPerKilometer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getFuelAmount() {
        return fuelAmount;
    }

    public void setFuelAmount(double fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public boolean canDrive(double distance){
        if(fuelAmount-(distance*costPerKilometer)>=0){
            fuelAmount-=(distance*costPerKilometer);
            distanceTraveled+=distance;
            return true;
        }
        return false;
    }

    @Override
    public int compareTo(Object o) {
        if(this.equals(o)){
            return 0;
        }else {
            return this.getModel().compareTo(((Car) o).getModel());
        }
    }

    @Override
    public String toString() {
        return String.format("%s %.2f %.0f", this.getModel(), this.getFuelAmount(), this.getDistanceTraveled());
    }
}
