package VehicleCatalogue;

public class Vehicle {
    private String typeOfVehicle;
    private String modelOfVehicle;
    private String colorOfVehicle;
    private int horsepowerOfVehicle;

    public Vehicle(String typeOfVehicle, String modelOfVehicle, String colorOfVehicle, int horsepowerOfVehicle) {
        typeOfVehicle=String.valueOf(typeOfVehicle.toUpperCase().charAt(0))+typeOfVehicle.substring(1);
        this.typeOfVehicle = typeOfVehicle;
        this.modelOfVehicle = modelOfVehicle;
        this.colorOfVehicle = colorOfVehicle;
        this.horsepowerOfVehicle = horsepowerOfVehicle;
    }

    public String getTypeOfVehicle() {
        return typeOfVehicle;
    }

    public void setTypeOfVehicle(String typeOfVehicle) {
        this.typeOfVehicle = typeOfVehicle;
    }

    public String getModelOfVehicle() {
        return modelOfVehicle;
    }

    public void setModelOfVehicle(String modelOfVehicle) {
        this.modelOfVehicle = modelOfVehicle;
    }

    public String getColorOfVehicle() {
        return colorOfVehicle;
    }

    public void setColorOfVehicle(String colorOfVehicle) {
        this.colorOfVehicle = colorOfVehicle;
    }

    public int getHorsepowerOfVehicle() {
        return horsepowerOfVehicle;
    }

    public void setHorsepowerOfVehicle(int horsepowerOfVehicle) {
        this.horsepowerOfVehicle = horsepowerOfVehicle;
    }
    public String getInfo(){
        return  String.format("Type: %s%nModel: %s%nColor: %s%nHorsepower: %d",
                typeOfVehicle, modelOfVehicle, colorOfVehicle, horsepowerOfVehicle);

    }

}
