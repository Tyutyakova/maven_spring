package org.example;

import org.example.smartphone.controls.Switch;
import org.example.smartphone.devices.Kittle;
import org.example.smartphone.devices.LightBulb;

public class Main {
  public static void main(String[] args) {
    LightBulb bulb = new LightBulb();
    Kittle kitle = new Kittle();

    Switch switchBulb = new Switch(bulb);
    switchBulb.switchTurnOff();

    Switch switchKit = new Switch(kitle);
    switchKit.switchTurnOff();




  }
}