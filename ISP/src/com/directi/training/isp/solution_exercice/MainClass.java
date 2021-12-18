package com.directi.training.isp.solution_exercice;

import com.directi.training.isp.solution_exercice.sensing.SensingDoor;
import com.directi.training.isp.solution_exercice.sensing.Sensor;
import com.directi.training.isp.solution_exercice.timed.TimedDoor;
import com.directi.training.isp.solution_exercice.timed.Timer;

public class MainClass {
    public static void main(String[] args) {
        // sensing
        Sensor sensor = new Sensor();
        SensingDoor sensingDoor = new SensingDoor(sensor);
        sensingDoor.proximityCallback();

        // timed
        Timer timer = new Timer();
        TimedDoor timedDoor = new TimedDoor(timer);
        timedDoor.timeOutCallback();
    }
}
