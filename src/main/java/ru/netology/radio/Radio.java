package ru.netology.radio;

public class Radio {

    // Переключение громкости радио

    public int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setToMaxVolume() {
        currentVolume = 10;
    }

    public void setToMinVolume() {
        currentVolume = 0;
    }

    public void setIncreaseCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 10) {
            currentVolume = newCurrentVolume + 1;
        } else {
            setToMaxVolume();
        }

    }

    public void setDecreaseCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 0) {
            currentVolume = newCurrentVolume - 1;
        } else {
            setToMinVolume();
        }

    }


    // Переключение радиостанций

    public int currentStation;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setToMaxSwitchableStation() {
        currentStation = 9;
    }

    public void setToMinSwitchableStation() {
        currentStation = 0;
    }


    public void setToNextStation(int switchableStation) {
        if (switchableStation < 9) {
            currentStation = switchableStation + 1;
        } else {
            setToMinSwitchableStation();
        }

    }

    public void setToPrevStation(int switchableStation) {
        if (switchableStation > 0) {
            currentStation = switchableStation - 1;
        } else {
            setToMaxSwitchableStation();
        }
    }
}
