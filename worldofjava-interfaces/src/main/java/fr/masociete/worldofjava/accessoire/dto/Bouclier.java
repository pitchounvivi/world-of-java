package fr.masociete.worldofjava.accessoire.dto;

public class Bouclier extends Accessoire {

	public static void main(String[] args){
		Bouclier bouclier = new Bouclier();
		System.out.println(bouclier);
	}
	
	public Bouclier() {
		this.setNom("Bouclier");
		this.setEncombrement(1);
		this.setPortee(0);
		this.setCout(200);
		this.setPointAttaque(20);
		this.setPointDefense(300);
	}

	@Override
	public String toString() {
		return getNom() + " a un cout de = " + getCout() + " pièces, a un encombrement de = " + getEncombrement() + " case(s), possède une portée de " + getPortee() + " case(s),"
				+ " a une attaque de = " + getPointAttaque()
				+ ", a une defense de = " + getPointDefense() + ".";
	}
	
}