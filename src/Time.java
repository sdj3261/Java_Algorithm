public class Time {
    private int hour;
    private int minute;
    private float second;

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour < 0 || hour > 23)
            return;
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute < 0 || minute > 53)
            return;
        this.minute = minute;
    }

    public float getSecond() {
        return second;
    }

    public void setSecond(float second) {
        if (second < 0 || second > 53)
            return;
        this.second = second;
    }
}

class Card {
    String kind;
    int number;
    static int width = 100;
    static int height = 250;

    void method()
    {
        int lv = 0;
    }
}