package fr.masociete.worldofjava.accessoire.dto;

public class BaguetteMagique extends Accessoire {

	public static void main(String[] args){
		BaguetteMagique baguetteMagique = new BaguetteMagique();
		System.out.println(baguetteMagique);
	}
	
	public BaguetteMagique() {
		this.setNom("Baguette magique");
		this.setEncombrement(1);
		this.setPortee(4);
		this.setCout(300);
		this.setPointAttaque(200);
		this.setPointDefense(100);
	}

	@Override
	public String toString() {
		return getNom() + " a un cout de = " + getCout() + " pi�ces, a un encombrement de = " + getEncombrement() + " case(s), poss�de une port�e de " + getPortee() + " case(s),"
				+ " a une attaque de = " + getPointAttaque()
				+ ", a une defense de = " + getPointDefense() + ".";
	}
}
