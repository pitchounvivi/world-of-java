package fr.masociete.worldofjava.accessoire.dto;

public class Pioche extends Accessoire {

	public static void main(String[] args){
		Pioche pioche = new Pioche();
		System.out.println(pioche);
	}
	
	
	public Pioche() {
		this.setNom("Pioche");
		this.setEncombrement(1);
		this.setPortee(1);
		this.setCout(20);
		this.setPointAttaque(20);
		this.setPointDefense(150);
	}

	
	
	@Override
	public String toString() {
		return getNom() + " a un cout de = " + getCout() + " pièces, a un encombrement de = " + getEncombrement() + " case(s), possède une portée de " + getPortee() + " case(s),"
				+ " a une attaque de = " + getPointAttaque()
				+ ", a une defense de = " + getPointDefense() + ".";
	}
	
	
}
