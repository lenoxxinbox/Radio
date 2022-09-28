package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    // Проверки переключения громкости

    @Test
    public void shouldIncreaseCurrentVolumeAverage() {
        Radio radio = new Radio();
        radio.setIncreaseCurrentVolume(5);

        int expectedVolume = 6;
        int actualVolume = radio.getCurrentVolume();

        Assertions.assertEquals(expectedVolume, actualVolume);
    }

    @Test
    public void shouldIncreaseCurrentVolumeAbove() {
        Radio radio = new Radio();
        radio.setIncreaseCurrentVolume(10);

        int expectedVolume = 10;
        int actualVolume = radio.getCurrentVolume();

        Assertions.assertEquals(expectedVolume, actualVolume);
    }

    @Test
    public void shouldCurrentMaxVolume() {
        Radio radio = new Radio();
        radio.setToMaxVolume();

        int expectedVolume = 10;
        int actualVolume = radio.getCurrentVolume();

        Assertions.assertEquals(expectedVolume, actualVolume);
    }

    @Test
    public void shouldDecreaseCurrentVolumeAverage() {
        Radio radio = new Radio();
        radio.setDecreaseCurrentVolume(5);

        int expectedVolume = 4;
        int actualVolume = radio.getCurrentVolume();

        Assertions.assertEquals(expectedVolume, actualVolume);
    }

    @Test
    public void shouldDecreaseCurrentVolumeBelow() {
        Radio radio = new Radio();
        radio.setDecreaseCurrentVolume(-1);

        int expectedVolume = 0;
        int actualVolume = radio.getCurrentVolume();

        Assertions.assertEquals(expectedVolume, actualVolume);
    }

    @Test
    public void shouldCurrentMinVolume() {
        Radio radio = new Radio();
        radio.setToMinVolume();

        int expectedVolume = 0;
        int actualVolume = radio.getCurrentVolume();

        Assertions.assertEquals(expectedVolume, actualVolume);
    }

    // Проверки переключения станций

    @Test
    public void shouldToNextStationAverage() {
        Radio station = new Radio();
        station.setToNextStation(4);

        int expectedStation = 5;
        int actualStation = station.getCurrentStation();

        Assertions.assertEquals(expectedStation, actualStation);
    }

    @Test
    public void shouldToNextStationAbove() {
        Radio station = new Radio();
        station.setToNextStation(9);

        int expectedStation = 0;
        int actualStation = station.getCurrentStation();

        Assertions.assertEquals(expectedStation, actualStation);
    }

    @Test
    public void shouldToPrevStationAverage() {
        Radio station = new Radio();
        station.setToPrevStation(4);

        int expectedStation = 3;
        int actualStation = station.getCurrentStation();

        Assertions.assertEquals(expectedStation, actualStation);
    }

    @Test
    public void shouldToPrevStationBelow() {
        Radio station = new Radio();
        station.setToPrevStation(0);

        int expectedStation = 9;
        int actualStation = station.getCurrentStation();

        Assertions.assertEquals(expectedStation, actualStation);
    }
}
