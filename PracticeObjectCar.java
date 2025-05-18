public class PracticeObjectCar {

    String serialNumero;
    String brand;
    String model;
    String color;

    double price;
    double odometre;

    boolean isEngineStarted;

    public PracticeObjectCar(String serialNumero, String brand, String model, String color, double price, int odometre){
        this.serialNumero = serialNumero;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
        this.odometre = odometre;
        this.isEngineStarted = false;

        this.displayInformation();
    }

    public double run(double distance, boolean isEngineStarted){
        if(isEngineStarted){
           System.out.println("la voiture roule une distance de " + distance + " kms.");
           odometre += distance;
           return distance;
        }
        else {
           System.out.println("La voiture a parcouru " + odometre +" kms.");
           return odometre;
       }

    }

    public void displayInformation(){
        System.out.println("Serial numero" + serialNumero + "| Model " + model + " | Color " + color + " | Price " + price + " | Odometre " + odometre);
    }

    public void started(boolean isEngineStarted){
        if(isEngineStarted){
            System.out.println("le moteur tourne");
        }else{
            System.out.println("le moteur ne tourne pas");

        }
    }

}
