package fr.masociete.worldofjava.accessoire.dto;

public class Glaive extends Accessoire {

	public Glaive() {
		this.setNom("Glaive");
		this.setEncombrement(1);
		this.setPortee(1);
		this.setCout(100);
		this.setPointAttaque(150);
		this.setPointDefense(20);
	}

	@Override
	public String toString() {
		return getNom() + " a un cout de = " + getCout() + " pi�ces, a un encombrement de = " + getEncombrement() + " case(s), poss�de une port�e de " + getPortee() + " case(s),"
				+ " a une attaque de = " + getPointAttaque()
				+ ", a une defense de = " + getPointDefense() + ".";
	}
	
	
}
