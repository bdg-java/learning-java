package classlessons;

public class Clock {
        private int hour;
        private int minute;
        private int second;

        public Clock() {
            this.hour = 12;
            this.minute = 0;
            this.second = 0;

        }

        public Clock(int hour, int minute, int second) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }

        public Clock(int timeInSeconds) {
            hour = timeInSeconds / 3600;
            minute = (timeInSeconds - hour * 3600) / 60;
            second = (timeInSeconds - hour * 3600 - minute * 60);
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

        public void setClock(int timeinSeconds) {
            hour = timeinSeconds / 3600;
            minute = (timeinSeconds - hour * 3600) / 60;
            second = (timeinSeconds - hour * 3600 - minute * 60);
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