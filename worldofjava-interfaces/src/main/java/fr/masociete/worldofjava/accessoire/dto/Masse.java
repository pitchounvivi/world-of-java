package fr.masociete.worldofjava.accessoire.dto;

public class Masse extends Accessoire {

	public Masse() {
		this.setNom("Masse");
		this.setEncombrement(2);
		this.setPortee(2);
		this.setCout(100);
		this.setPointAttaque(200);
		this.setPointDefense(50);
	}

	@Override
	public String toString() {
		return getNom() + " a un cout de = " + getCout() + " pièces, a un encombrement de = " + getEncombrement() + " case(s), possède une portée de " + getPortee() + " case(s),"
				+ " a une attaque de = " + getPointAttaque()
				+ ", a une defense de = " + getPointDefense() + ".";
	}
	
	
}