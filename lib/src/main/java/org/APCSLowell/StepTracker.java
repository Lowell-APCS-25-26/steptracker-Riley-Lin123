package org.APCSLowell;

public class StepTracker {
    private int min;
    private int day; 
    private int steps;
    private int daysTracked;
    public StepTracker(int activityThreshold) {
        min = activityThreshold;
        day = 0;
        steps = 0;
        daysTracked = 0;
    }
    public void addDailySteps(int stepCount) {
        steps += stepCount;
        daysTracked++;
        if (stepCount >= min){
            day++;
        }
    }
    public int activeDays() {
        return day;
    }
    public double averageSteps() {
        if (daysTracked == 0){
            return 0.0;
        }
        return (double) steps / daysTracked;
    }
}
