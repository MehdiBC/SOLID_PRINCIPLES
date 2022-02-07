package com.directi.training.isp.solution_exercice.timed;

import com.directi.training.isp.solution_exercice.Door;

public class TimedDoor extends Door implements TimedObject
{
    private static final int TIME_OUT = 100;

    public TimedDoor(Timer timer)
    {
        timer.register(TIME_OUT, this);
    }

    @Override
    public void close()
    {
        this.setOpened(false);
    }

    @Override
    public void timeOutCallback()
    {
        setLocked(true);
    }
}
