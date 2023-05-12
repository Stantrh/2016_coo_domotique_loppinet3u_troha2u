import thermos.Thermostat;

public class Main {

	public static void main(String args[])
	{
		Telecommande t=new Telecommande();
		
		
		Lampe l1=new Lampe("Lampe1");
		Hifi h1 =new Hifi();
		Cheminee ch1 = new Cheminee();
		AdapterCheminee ac1 = new AdapterCheminee(ch1);
		Thermostat t1 = new Thermostat();
		AdapterThermostat at1 = new AdapterThermostat(t1);
		t.ajouterAppareil(l1);
		t.ajouterAppareil(h1);
		t.ajouterAppareil(ac1);
		t.ajouterAppareil(at1);
		
		TelecommandeGraphique tg=new TelecommandeGraphique(t);
		

		
	}
	
}
