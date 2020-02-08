package fr.masociete.worldofjava.potion.dto;

public class PotionSoinAvancee extends Potion {

	public static void main(String[] args) {
		PotionSoinAvancee potionSoinAvancee = new PotionSoinAvancee();
		System.out.println(potionSoinAvancee);
	}

	public PotionSoinAvancee() {
		this.setNom("Potion Soin Avancee");
		this.setCout(10);
		this.setPointVie(70);
		this.setPointAttaque(30);
		this.setPointDefense(0);
		this.setImage("potion2.png");
	}

	@Override
	public String toString() {
		return getNom() + " a un cout de = " + getCout() + ", des points de vie a = " + getPointVie()
				+ ", a une attaque de = " + getPointAttaque() + ", a une defense de = " + getPointDefense() + ".";
	}

}