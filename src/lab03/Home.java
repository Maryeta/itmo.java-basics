package lab03;

import java.util.Calendar;

public class Home {
    private int floors;
    private int year;
    private String name;

    public void setInit(int floors, int year, String name) {
        this.floors = floors;
        this.year = year;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Home{" +
                "floors=" + floors +
                ", year=" + year +
                ", name='" + name + '\'' +
                '}';
    }

    public int countYear() {
        Calendar cal = Calendar.getInstance();
        return cal.get(Calendar.YEAR) - this.year;
    }
}
