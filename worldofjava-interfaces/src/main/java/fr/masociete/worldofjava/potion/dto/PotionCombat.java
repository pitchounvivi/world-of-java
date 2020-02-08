package fr.masociete.worldofjava.potion.dto;

public class PotionCombat extends Potion {

	public static void main(String[] args) {
		PotionCombat potionCombat = new PotionCombat();
		System.out.println(potionCombat);
	}

	public PotionCombat() {
		this.setNom("Potion de combat");
		this.setCout(10);
		this.setPointVie(10);
		this.setPointAttaque(60);
		this.setPointDefense(10);
		this.setImage("potion3.png");
	}

	@Override
	public String toString() {
		return getNom() + " a un cout de = " + getCout() + ", des points de vie a = " + getPointVie()
				+ ", a une attaque de = " + getPointAttaque() + ", a une defense de = " + getPointDefense() + ".";
	}

}