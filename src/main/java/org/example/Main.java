package org.example;

import org.apache.commons.lang3.StringUtils;
import org.example.smartphone.controls.Switch;
import org.example.smartphone.devices.Kittle;
import org.example.smartphone.devices.LightBulb;

import java.util.SplittableRandom;

public class Main {
  public static void main(String[] args) {
    LightBulb bulb = new LightBulb();
    Kittle kitle = new Kittle();

    Switch switchBulb = new Switch(bulb);
    switchBulb.switchTurnOff();

    Switch switchKit = new Switch(kitle);
    switchKit.switchTurnOff();

    System.out.println(getPad("A",3));
    }

  public static String getPad(String substr, int count) {
    return StringUtils.repeat(substr, count);
  }




  }
