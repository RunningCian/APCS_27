// Cian Byrne
// 11/08/26


import java.util.*;

public class RunningAverage{
    /** The number of ratings included in the running average. */
    private int count;

    /** The average of the ratings that have been entered. */
    private double average;

    // There are no other instance variables.

    /** Creates a RunningAverage object.
    * Postcondition: count is initialized to 0 and average is
    * initialized to 0.0.
    */
    public RunningAverage(){
        count = 0;
        average = 0.0;
    }

    /** Updates the running average to reflect the entry of a new
    * rating, as described in part (a).
    */
    public void updateAverage(double newVal){
       double total = (count * average);
        total = total + newVal;
        count = count + 1;
        average = (total/count);
    }


    /** Processes num new ratings by considering them for inclusion
    * in the running average and updating the running average as
    * necessary. Returns an integer that represents the number of
    * invalid ratings, as described in part (b).
    * Precondition: num > 0
    */
    public int processNewRatings(int num){
    int invalidCount = 0;
    int i = 0;
        while (i < num) {
            double rating = getNewRating();
            if (rating >= 0) {
                updateAverage(rating);
            } else {
                invalidCount = invalidCount + 1;
            }
            i = i + 1;
        }
        return invalidCount;
    }

    /** Returns a single numeric rating. */
    public double getNewRating(){
        /* implementation not shown */
        return 0.0;
    }
}
