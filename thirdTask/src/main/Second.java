package main;

import java.util.Objects;

public class Second {
    private String time;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Second)) return false;
        Second hour = (Second) o;
        return time == hour.time;
    }

    @Override
    public int hashCode() {
        return Objects.hash(time);
    }

    @Override
    public String toString() {
        return "time hour:" + time;
    }

    public Second(int time) {
        if (time > 59 || time < 0)
            throw  new IllegalArgumentException("second must be between 0 and 59");
        if (time < 10)
            this.time = "0" + time;
        else
            this.time = "" + time;
    }

    public String getTime() {
        return time;
    }
}
