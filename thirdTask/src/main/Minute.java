package main;

import java.util.Objects;

public class Minute {
    private String time;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Minute)) return false;
        Minute hour = (Minute) o;
        return time == hour.time;
    }

    @Override
    public int hashCode() {
        return Objects.hash(time);
    }

    @Override
    public String toString() {
        return "time minute:" + time;
    }

    public Minute(int time) {
        if (time > 59 || time < 0)
            throw new IllegalArgumentException("minute must be between 0 and 59");
        if (time < 10)
            this.time = "0" + time;
        else
            this.time = "" + time;
    }

    public String getTime() {
        return time;
    }
}
