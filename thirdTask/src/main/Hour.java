package main;

import java.util.Objects;

public class Hour {
    private String time;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Hour)) return false;
        Hour hour = (Hour) o;
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

    public Hour(int time) {
        if (time > 24 || time < 0)
            throw new IllegalArgumentException("hour must be between 0 and 24");
        if (time < 10)
            this.time = "0" + time;
        else this.time = "" + time;
    }

    public String getTime() {
        return time;
    }
}
