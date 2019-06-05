package classlessons;

public class Clock {
    private int hour;
    private int minute;
    private int second;

    public Clock() {
        hour = 12;
        minute = 0;
        second = 0;

    }

    public Clock(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public Clock(int TimeInSeconds) {
        hour = hour / TimeInSeconds;
        minute = (TimeInSeconds - hour * 3600) / 60;
        second = (TimeInSeconds - hour * 3600 - minute * 60);
    }

    public int getHour() {
        return this.hour;
    }

    public int getMinute() {
        return this.minute;
    }

    public int getSecond() {
        return this.second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setClock(int TimeinSeconds) {
        hour = hour / TimeinSeconds;
        minute = (TimeinSeconds - hour * 3600) / 60;
        second = (TimeinSeconds - hour * 3600 - minute * 60);
    }

    public Clock tick() {
        second = this.second + 1;
        if (this.second == 60) {
            this.minute = this.minute + 1;
            this.second = 0;
            if (this.minute == 60) {
                this.hour = this.hour + 1;
                this.minute = 0;
                if (this.hour == 24) {
                    this.hour = 0;
                }
            }
        }
        return this;
    }

    public void addClock(Clock clock) {
        hour = this.hour + clock.hour;
        minute = this.minute + clock.minute;
        second = this.second + clock.second;
    }

    public Clock tickDown() {
        second = this.second - 1;
        return this;
    }

    public Clock subtractClock(Clock clock) {
        hour = this.hour - clock.hour;
        minute = this.minute - clock.minute;
        second = this.second - clock.second;
        return this;
    }

}
