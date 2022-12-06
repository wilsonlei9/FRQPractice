public class StepTracker {
    int minimum;
    int steps;
    int active;
    int days;
    int totalSteps;

    public StepTracker(int minimum)
    {
        this.minimum = minimum;
        days = 0;
    }

    public int addDailySteps(int amount)
    {
        steps += amount;
        if (steps < minimum)
        {
            System.out.println("This is too few steps for the day to be considered active.");
            days++;
            totalSteps += steps;
            steps = 0;
        }
        if(steps >= minimum)
        {
            System.out.println("This represents an active day");
            active++;
            days++;
            totalSteps += steps;
            steps = 0;
        }
        return 0;
    }

    public int activeDays()
    {
        return active;
    }

    public int averageSteps()
    {
        if (days == 0)
        {
            return 0;
        }
        else {
            return totalSteps/days;
        }
    }




}
