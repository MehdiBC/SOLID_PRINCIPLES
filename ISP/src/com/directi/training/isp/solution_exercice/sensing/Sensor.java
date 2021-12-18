package com.directi.training.isp.solution_exercice.sensing;

import java.util.Random;

public class Sensor {
    public void register(SensingObject door) {
        while (true) {
            if (isPersonClose()) {
                door.proximityCallback();
                break;
            }
        }
    }

    private boolean isPersonClose()
    {
        return new Random().nextBoolean();
    }
}
