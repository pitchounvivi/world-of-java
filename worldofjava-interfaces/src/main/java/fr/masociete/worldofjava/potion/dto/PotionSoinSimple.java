package fr.masociete.worldofjava.potion.dto;

public class PotionSoinSimple extends Potion {

	public static void main(String[] args){
		PotionSoinSimple potionSoinSimple = new PotionSoinSimple();
		System.out.println(potionSoinSimple);
	}
	
	
	public PotionSoinSimple() {
		this.setNom("Potion Soin Simple");
		this.setCout(10);
		this.setPointVie(50);
		this.setPointAttaque(20);
		this.setPointDefense(0);
		this.setImage("potion1.png");
	}


	@Override
	public String toString() {
		return getNom() + " a un cout de = " + getCout() + ", des points de vie a = " + getPointVie() + ", a une attaque de = " + getPointAttaque()
		+ ", a une defense de = " + getPointDefense() + ".";
	}

	
}


