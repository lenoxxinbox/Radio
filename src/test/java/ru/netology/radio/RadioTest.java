package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    // Тесты на переключение громкости радио

    @Test
    public void testVolume() {
        Radio radio = new Radio();
        Assertions.assertEquals(50, radio.setCurrentVolume(50));
        Assertions.assertEquals(51, radio.setIncreaseCurrentVolume(50));
        Assertions.assertEquals(49, radio.setDecreaseCurrentVolume(50));
        Assertions.assertEquals(100, radio.setIncreaseCurrentVolume(100));
        Assertions.assertEquals(0, radio.setDecreaseCurrentVolume(0));
    }

    // Тесты на переключение радиостанций

    @Test
    public void testStation() {
        Radio radio = new Radio(0, 9);
        Assertions.assertEquals(0, radio.setToMinSwitchableStation());
        Assertions.assertEquals(9, radio.setToMaxSwitchableStation());
        Assertions.assertEquals(0, radio.getCurrentStation());
        Assertions.assertEquals(5, radio.setToNextStation(4));
        Assertions.assertEquals(4, radio.setToPrevStation(5));
        Assertions.assertEquals(0, radio.setToNextStation(9));
        Assertions.assertEquals(9, radio.setToPrevStation(0));
    }

    @Test
    public void testQuantityStation() {
        Radio radio = new Radio(7);
        Assertions.assertEquals(0, radio.setToMinSwitchableStation());
        Assertions.assertEquals(6, radio.setToMaxSwitchableStation());
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void testStationByDefault() {
        Radio radio = new Radio();
        Assertions.assertEquals(0, radio.setToMinSwitchableStation());
        Assertions.assertEquals(9, radio.setToMaxSwitchableStation());
        Assertions.assertEquals(0, radio.getCurrentStation());
    }
}
