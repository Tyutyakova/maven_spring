package org.example.smartphone.controls;

import org.example.smartphone.devices.Kittle;
import org.example.smartphone.devices.LightBulb;
import org.example.smartphone.devices.Switchebales;

public class Switch {

  private Switchebales switchebales;

  public Switch(Switchebales switchebales) {
    this.switchebales = switchebales;
  }
  public void switchTurnOn() {
    switchebales.turnOn();
  }
  public void switchTurnOff() {
    switchebales.turnOff();
  }

}
