package com.example.task_01.models;
import org.springframework.cglib.core.Local;

import java.time.LocalTime;

public class Greeting {

    private String name;
    private String timeOfDay;

    public Greeting()
    {

    }

    public Greeting(String name, String timeOfDay)
    {
        this.name = name;
        this.timeOfDay = timeOfDay;
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getTimeOfDay()
    {
        return this.timeOfDay;
    }

   public void setTimeOfDay(String timeOfDay)
   {
       this.timeOfDay = timeOfDay;
   }
}
