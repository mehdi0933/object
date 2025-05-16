public class PracticeObjectCar {

    String serialNumero;
    String brand;
    String model;
    String color;

    double price;
    double odometre;

    boolean isEngineStarted;

    public PracticeObjectCar(String serialNumero, String brand, String model, String color, double price, double odometre){
        this.serialNumero = serialNumero;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
        this.odometre = 0;
        this.isEngineStarted = false;

        this.displayInformation();
    }

    public double run(double distance){
        System.out.println("la voiture roule pendans " +distance+ " kms.");
        odometre += distance;
        return distance;
    }

    public void displayInformation(){
        System.out.println("serialNumero" + serialNumero + "| model " + model + " | color " + color + " | price " + price + " | odometre " + odometre);
    }

    public void started(boolean isEngineStarted){
        if(isEngineStarted == false){
            System.out.println("le moteur ne tourne pas");
        }
        if(isEngineStarted == true){
            System.out.println("le moteur tourne");
        }
    }

}
