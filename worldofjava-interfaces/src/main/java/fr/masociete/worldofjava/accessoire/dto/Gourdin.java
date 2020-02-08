package fr.masociete.worldofjava.accessoire.dto;

public class Gourdin extends Accessoire {

	public Gourdin() {
		this.setNom("Gourdin");
		this.setEncombrement(2);
		this.setPortee(1);
		this.setCout(100);
		this.setPointAttaque(150);
		this.setPointDefense(150);
	}

	@Override
	public String toString() {
		return getNom() + " a un cout de = " + getCout() + " pi�ces, a un encombrement de = " + getEncombrement() + " case(s), poss�de une port�e de " + getPortee() + " case(s),"
				+ " a une attaque de = " + getPointAttaque()
				+ ", a une defense de = " + getPointDefense() + ".";
	}
	
	
}