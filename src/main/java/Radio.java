public class Radio {
    int currentStation;
    int currentVolume;

    //station
    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void nextStation() {
        if (currentStation == 9) {
            this.currentStation = 0;
            return;
        }
        this.currentStation++;
    }

    public void prevStation() {
        if (currentStation == 0) {
            this.currentStation = 9;
            return;
        }
        this.currentStation--;
    }

    //volume
    public int getCurrentVolume() {
        return currentVolume;
    }


    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > 10) {
            currentVolume = 10;
        }
        if (currentVolume < 0) {
            currentVolume = 0;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            this.currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            this.currentVolume--;
        }
    }


}
