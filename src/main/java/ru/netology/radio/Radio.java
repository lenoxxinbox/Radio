package ru.netology.radio;

public class Radio {

    // Переключение громкости радио

    public int minVolume = 0;
    public int maxVolume = 100;
    public int currentVolume;

    public int setCurrentVolume(int currentVolume) {
        return currentVolume;
    }

    public int setIncreaseCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < maxVolume) {
            currentVolume = newCurrentVolume + 1;
        } else {
            currentVolume = maxVolume;
        }
        return currentVolume;
    }

    public int setDecreaseCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > minVolume) {
            currentVolume = newCurrentVolume - 1;
        } else {
            currentVolume = minVolume;
        }
        return currentVolume;
    }


    // Переключение радиостанций

    private int minStation;
    private int maxStation;
    private int currentStation;

    public Radio(int minStation, int maxStation) {
        this.minStation = minStation;
        this.maxStation = maxStation;
        this.currentStation = minStation;
    }

    public Radio(int quantity) {
        maxStation = minStation + quantity - 1;
    }

    public Radio() {
        minStation = 0;
        maxStation = 9;
        currentStation = minStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int setToMaxSwitchableStation() {
        return maxStation;
    }

    public int setToMinSwitchableStation() {
        return minStation;
    }


    public int setToNextStation(int switchableStation) {
        if (switchableStation < maxStation) {
            currentStation = switchableStation + 1;
        } else {
            return minStation;
        }
        return currentStation;

    }

    public int setToPrevStation(int switchableStation) {
        if (switchableStation > minStation) {
            currentStation = switchableStation - 1;
        } else {
            return maxStation;
        }
        return currentStation;
    }
}
