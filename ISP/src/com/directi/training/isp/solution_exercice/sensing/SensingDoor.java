package com.directi.training.isp.solution_exercice.sensing;

import com.directi.training.isp.solution_exercice.Door;

public class SensingDoor extends Door implements SensingObject
{
    public SensingDoor(Sensor sensor)
    {
        sensor.register(this);
    }

    @Override
    public void proximityCallback()
    {
        this.setOpened(true);
    }
}
