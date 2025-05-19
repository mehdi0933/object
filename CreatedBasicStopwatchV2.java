public class CreatedBasicStopwatchV2 {
    public static void main(String[] args) throws InterruptedException {
        BasicStopwatchV2  whatch = new BasicStopwatchV2();
        whatch.seconde  = 0;
        whatch.minute   = 0;
        whatch.hours    = 0;
        whatch.isChrno  = true;

        whatch.chrono();
        whatch.displayChrono();
        whatch.cookHardBoiledEggsChrono();
        whatch.displayChronoCookHardBoiledEggs();
    }

}
