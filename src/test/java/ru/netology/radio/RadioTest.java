package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    // Тесты на переключение громкости радио

    @Test
    public void testVolume() {
        Radio radio = new Radio();
        Assertions.assertEquals(0, radio.getCurrentVolume());
        Assertions.assertEquals(0, radio.getMintVolume());
        Assertions.assertEquals(100, radio.getMaxVolume());
        radio.setCurrentVolume(50);
        radio.increaseVolume();
        Assertions.assertEquals(51, radio.getCurrentVolume());
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        Assertions.assertEquals(100, radio.getCurrentVolume());
        radio.setCurrentVolume(101);
        Assertions.assertEquals(100, radio.getCurrentVolume());
        radio.setCurrentVolume(50);
        radio.decreaseVolume();
        Assertions.assertEquals(49, radio.getCurrentVolume());
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        Assertions.assertEquals(0, radio.getCurrentVolume());
        radio.setCurrentVolume(-1);
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    // Тесты на переключение радиостанций

    @Test
    public void testStation() {
        Radio radio = new Radio(0, 15);
        Assertions.assertEquals(0, radio.getMinStation());
        Assertions.assertEquals(15, radio.getMaxStation());
        Assertions.assertEquals(0, radio.getCurrentStation());
        radio.setCurrentStation(7);
        radio.next();
        Assertions.assertEquals(8, radio.getCurrentStation());
        radio.setCurrentStation(15);
        radio.next();
        Assertions.assertEquals(0, radio.getCurrentStation());
        radio.setCurrentStation(16);
        Assertions.assertEquals(0, radio.getCurrentStation());
        radio.setCurrentStation(7);
        radio.prev();
        Assertions.assertEquals(6, radio.getCurrentStation());
        radio.setCurrentStation(0);
        radio.prev();
        Assertions.assertEquals(15, radio.getCurrentStation());
        radio.setCurrentStation(-1);
        Assertions.assertEquals(15, radio.getCurrentStation());
    }

    @Test
    public void testQuantityStation() {
        Radio radio = new Radio(7);
        Assertions.assertEquals(0, radio.getMinStation());
        Assertions.assertEquals(6, radio.getMaxStation());
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void testStationByDefault() {
        Radio radio = new Radio();
        Assertions.assertEquals(0, radio.getMinStation());
        Assertions.assertEquals(9, radio.getMaxStation());
        Assertions.assertEquals(0, radio.getCurrentStation());
    }
}
