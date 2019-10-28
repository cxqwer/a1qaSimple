package main;

import java.util.Date;
import java.util.Objects;

public class Day {
    private Hour hours;
    private Minute minutes;
    private Second seconds;

    public Day() {
        Date date = new Date();
        hours = new Hour(date.getHours());
        minutes = new Minute(date.getMinutes());
        seconds = new Second(date.getSeconds());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Day)) return false;
        Day day = (Day) o;
        return Objects.equals(hours, day.hours) &&
                Objects.equals(minutes, day.minutes) &&
                Objects.equals(seconds, day.seconds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hours, minutes, seconds);
    }

    @Override
    public String toString() {
        return "{Day time: " + hours + ":" + minutes + ":" + seconds + "}";
    }

    public Day(int hours, int minutes, int seconds) {
        this.hours = new Hour(hours);
        this.minutes = new Minute(minutes);
        this.seconds = new Second(seconds);
    }

    public Long getTime() {
        String hour = hours.getTime();
        if (hour.charAt(0) == '0')
            hour.substring(1, hour.length());
        return Long.parseLong((hour + "" + minutes.getTime() + "" + seconds.getTime()));
    }

    public void printTime(){
        System.out.println(hours.getTime() + ":" + minutes.getTime() + ":" + seconds.getTime());
    }

    public String getTimeOfDay() {
        Long time = getTime();
        if (time > 60000 && time <= 110000) return "morning";
        if (time > 110000 && time <= 180000) return "day";
        if (time > 180000 && time <= 220000) return "evening";
        return "night";
    }
}
