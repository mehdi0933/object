public class CarImprovement {
    public static void main(String[] args) {

        PracticeObjectCar car1 = new PracticeObjectCar("AZ345FB", "porsche", "carrera GT", " jaune", 1000000, 250000 );
        car1.isEngineStarted = true;
        car1.run(1000);
        car1.run(2);
        car1.isStarted();
        car1.isEngineStarted = false;
        car1.run(200);
        car1.displayInformation();
    }
}
