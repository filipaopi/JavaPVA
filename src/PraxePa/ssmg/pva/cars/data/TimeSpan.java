package PraxePa.ssmg.pva.cars.data;

public class TimeSpan {
    private int hour;
    private int minute;
    private int second;

    public TimeSpan() {
        this(0, 0, 0);
    }
    public TimeSpan(int second) {
        setTime(0, 0, second);
    }
    public TimeSpan(int minutes, int seconds) {
        if (minutes == 0 && seconds >= 60) {
            this.hour = 0;
            this.minute = 0;
            this.second = 0;
        } else setTime(0, minute, second);

    }
    public TimeSpan(int hours, int minutes, int seconds) {
        if (minutes == 0 && seconds >= 60) {
            this.hour = 0;
            this.minute = 0;
            this.second = 0;
        } else setTime(hour, minute, second);
    }

    public TimeSpan(TimeSpan timeSpan) {
        this.hour = timeSpan.hour;
        this.minute = timeSpan.minute;
        this.second = timeSpan.second;
    }


    private void setTime(int hours, int minutes, int seconds) {

        if (hours < 0 || minutes < 0 || seconds < 0) {
            this.hour = this.minute = this.second = 0;
            return;
        }


        if (seconds >= 60) {
            minutes += seconds / 60;
            seconds = seconds % 60;
        }

        if (minutes >= 60) {
            hours += minutes / 60;
            minutes = minutes % 60;
        }

        this.hour = hours;
        this.minute = minutes;
        this.second = seconds;

    }

    public int getTotalSeconds() {
        return second + hour / 3600 + minute / 60;
    }

    public TimeSpan add(int seconds) {
        this.second = second + seconds;

        if (second >= 60) {
            minute += second / 60;
            second = second % 60;
        }

        if (minute >= 60) {
            hour += minute / 60;
            minute = minute % 60;
        }

        return this;
    }

    @Override
    public String toString() {
        return hour + " hours " + minute + " minutes " + second + " seconds";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        TimeSpan other = (TimeSpan) o;
        return this.getTotalSeconds() == other.getTotalSeconds();
    }
}