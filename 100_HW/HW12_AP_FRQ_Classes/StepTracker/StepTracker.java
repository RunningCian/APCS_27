// Cian byrne
// 11/08/26


public class StepTracker {
    private int minActive;
    private int tSteps;
    private int days;
    private int activeDaysC;


    public StepTracker(int a) {
        minActive = a;
        tSteps = 0;
        days = 0;
        activeDaysC = 0;
    }






    public void addDailySteps(int b) {
        tSteps = b + tSteps;
        days = days + 1;
        if (b >= minActive) {
            activeDaysC = activeDaysC + 1;
        }
    }
    


    public int activeDays() {
        return activeDaysC;
    }


    public double averageSteps() {
        if (days == 0) {
            return 0.0;
        }
        return (double) tSteps/days;
    }
}