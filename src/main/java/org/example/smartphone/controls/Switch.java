package org.example.smartphone.controls;

import org.example.smartphone.devices.Kittle;
import org.example.smartphone.devices.LightBulb;

public class Switch {

  private LightBulb bulb;
  private Kittle kittle;

  public Switch(LightBulb bulb) {
    this.bulb = bulb;
  }

  public Switch(Kittle kittle) {
    this.kittle = kittle;
  }

  public void switchTurnOn() {
        kittle.turnOn();
  }
  public void switchTurnOff() {
    bulb.turnOff();
  }

}
