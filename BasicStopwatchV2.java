public class BasicStopwatchV2{

    int seconde;
    int minute;
    int hours;
    boolean isChrno;

    public void chrono() throws InterruptedException  {

        while (isChrno) {

            Thread.sleep(1000);
            seconde++;


            if (seconde >= 59) {

                seconde = 0;
                minute++;

            }

            if (minute >= 60) {

                minute = 0;
                seconde++;

            }

            if (hours >= 24) {
                hours = 0;
            }
        }
        
    }

    public void displayChrono(){
        String displayHours   = this.hours < 10 ? "0" + this.hours : "" + this.hours;
        String displayMinute  = this.minute < 10 ? "0" + this.minute : "" + this.minute;
        String displaySecoond = this.seconde < 10 ? "0" + this.seconde : "" + this.seconde;

        System.out.println(displayHours + ":" + displayMinute + ":" + displaySecoond);

        // System.out.printf("%02d:%02d:%02d%n", hours , minute, seconde);
    }

    public void cookHardBoiledEggsChrono() throws InterruptedException  {

        while (isChrno) {

            Thread.sleep(1000);
            seconde++;


            if (seconde >= 59) {

                seconde = 0;
                minute++;

            }

            if (minute >= 60) {

                minute = 0;
                seconde++;

            }

            if (hours >= 24) {
                hours = 0;
            }
        }

    }

    public void displayChronoCookHardBoiledEggs(){
        String displayHours   = this.hours < 10 ? "0" + this.hours : "" + this.hours;
        String displayMinute  = this.minute < 10 ? "0" + this.minute : "" + this.minute;
        String displaySecoond = this.seconde < 10 ? "0" + this.seconde : "" + this.seconde;

        System.out.println("Œufs Durs : " displayHours + ":" + displayMinute + ":" + displaySecoond);

        // System.out.printf("%02d:%02d:%02d%n", hours , minute, seconde);
    }
}

