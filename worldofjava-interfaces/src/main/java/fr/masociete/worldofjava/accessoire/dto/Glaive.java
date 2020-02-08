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
		return getNom() + " a un cout de = " + getCout() + " pièces, a un encombrement de = " + getEncombrement() + " case(s), possède une portée de " + getPortee() + " case(s),"
				+ " a une attaque de = " + getPointAttaque()
				+ ", a une defense de = " + getPointDefense() + ".";
	}
	
	
}
