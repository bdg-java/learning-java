package ahakobyan.ClassLessons;

public class Clock {

    private int second;
    private int minute;
    private int hour;

    public Clock() {
        this.second = 0;
        this.minute = 0;
        this.hour = 12;
    }

    public Clock(int second, int minute, int hour) {
        this.second = second;
        this.minute = minute;
        this.hour = hour;
    }

    public Clock(int TimeinSeconds) {
        hour = hour / TimeinSeconds;
        minute = (TimeinSeconds - hour*3600) / 60;
        second = (TimeinSeconds - hour*3600 - minute*60);
    }

    public int getHour() {
        return this.hour;
    }

    public int getSecond() {
        return this.second;
    }

    public int getMinute() {
        return minute;
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
        minute = (TimeinSeconds - hour*3600) / 60;
        second = (TimeinSeconds - hour*3600 - minute*60);
    }

    public Clock tick() {
        second = this.second + 1;
        return this;
    }

    public void addClock(Clock clock) {
        hour = this.hour + clock.hour;
        minute = this.minute + clock.minute;
        second = this.second + clock.second;
    }

    public Clock tickdown() {
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
