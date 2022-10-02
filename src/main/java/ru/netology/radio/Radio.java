package ru.netology.radio;

public class Radio {

    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume;
    private int minStation = 0;
    private int maxStation;
    private int currentStation;

    public Radio(int minStation, int maxStation) {
        this.minStation = minStation;
        this.maxStation = maxStation;
        this.currentStation = minStation;
    }

    public Radio(int quantity) {
        this.minStation = 0;
        this.maxStation = minStation + quantity - 1;
        this.currentStation = minStation;
    }

    public Radio() {
        this.minStation = 0;
        this.maxStation = 9;
        this.currentStation = minStation;
    }

    public int getMintVolume() {
        return minVolume;
    }
    public int getMaxVolume() {
        return maxVolume;
    }
    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getMinStation() {
        return minStation;
    }
    public int getMaxStation() {
        return maxStation;
    }
    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > maxVolume) {
            return;
        }

        if (newCurrentVolume < minVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > maxStation) {
            return;
        }

        if (newCurrentStation < minStation) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }

    public void next() {
        if (currentStation < maxStation) {
            currentStation = currentStation + 1;
        } else {
            currentStation = minStation;
        }
    }

    public void prev() {
        if (currentStation > minStation) {
            currentStation = currentStation - 1;
        } else {
            currentStation = maxStation;
        }
    }
}
