package org.example.smartphone.devices;

public class LightBulb  implements Switchebales{

@Override
  public void turnOn() {
    System.out.println("Light is on");
  }

  @Override
  public void turnOff() {
    System.out.println("Light is off");
  }
}
