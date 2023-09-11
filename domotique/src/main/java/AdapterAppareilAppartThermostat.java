import appartement.AppareilAppartThermostat;

public class AdapterAppareilAppartThermostat implements Appareil {
    private AppareilAppartThermostat appareilThermostat;

    public AdapterAppareilAppartThermostat(AppareilAppartThermostat a){
        this.appareilThermostat = a;
    }

    @Override
    public void eteindre() {
        this.appareilThermostat.baisserTemperature();
    }

    @Override
    public void allumer() {
        this.appareilThermostat.augmenterTemperature();
    }

    public String toString(){
        return this.appareilThermostat.toString();
    }

    public AppareilAppartThermostat getAppareilHifi(){
        return this.appareilThermostat;
    }
}
