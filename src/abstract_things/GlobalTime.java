package abstract_things;

public class GlobalTime {
    private GlobalTime() {
        currentYear = 2019;
    }
    private int currentYear;

    private static GlobalTime instance = null;

    public static GlobalTime getInstance() {
        if (instance == null) {
            instance = new GlobalTime();
        }
        return instance;
    }


    public int getCurrentYear() {
        return currentYear;
    }

    public void passOneYear() {
        currentYear++;
    }

}
