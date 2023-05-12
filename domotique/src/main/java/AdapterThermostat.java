import thermos.Thermostat;

import java.awt.*;

public class AdapterThermostat implements Appareil{

    private Thermostat thermostat;

    public AdapterThermostat(Thermostat t) {
        this.thermostat = t;
    }


    public void eteindre(){
        this.thermostat.baisserTemperature();
    }

    public void allumer(){
        this.thermostat.monterTemperature();
    }


}