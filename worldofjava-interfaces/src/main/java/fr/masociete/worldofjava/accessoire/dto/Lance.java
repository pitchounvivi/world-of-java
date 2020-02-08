package fr.masociete.worldofjava.accessoire.dto;

public class Lance extends Accessoire {

	public Lance() {
		this.setNom("Lance");
		this.setEncombrement(1);
		this.setPortee(5);
		this.setCout(150);
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