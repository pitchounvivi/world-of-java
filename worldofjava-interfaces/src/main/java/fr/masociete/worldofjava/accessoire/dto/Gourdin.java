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
		return getNom() + " a un cout de = " + getCout() + " pièces, a un encombrement de = " + getEncombrement() + " case(s), possède une portée de " + getPortee() + " case(s),"
				+ " a une attaque de = " + getPointAttaque()
				+ ", a une defense de = " + getPointDefense() + ".";
	}
	
	
}