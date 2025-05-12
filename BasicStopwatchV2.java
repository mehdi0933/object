public class BasicStopwatchV2{

    int secoond;
    int minute;
    int hours;
    boolean isChrno;

    public void chrono() throws InterruptedException  {

        while (isChrno) {

            Thread.sleep(1000);
            secoond++;


            if (secoond >= 59) {

                secoond = 0;
                minute++;

            }

            if (minute >= 60) {

                minute = 0;
                secoond++;

            }

            if (hours >= 24) {
                hours = 0;
            }

            String displayHours = hours < 10 ? "0" + hours : "" + hours;
            String displayMinute = minute < 10 ? "0" + minute : "" + minute;
            String displaySecoond = secoond < 10 ? "0" + secoond : "" + secoond;

            System.out.println(displayHours + ":" + displayMinute + ":" + displaySecoond);

            // System.out.printf("%02d:%02d:%02d%n", hours , minute, secoond);


        }
    }
}

