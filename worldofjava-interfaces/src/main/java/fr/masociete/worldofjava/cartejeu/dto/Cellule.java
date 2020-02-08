package fr.masociete.worldofjava.cartejeu.dto;

import fr.masociete.worldofjava.accessoire.dto.Accessoire;
import fr.masociete.worldofjava.coffre.dto.Coffre;
import fr.masociete.worldofjava.dto.Personnage;
import fr.masociete.worldofjava.potion.dto.Potion;

public class Cellule {

	private int tempX = 0;
	private int tempY = 0;

	private Personnage personnage;

	private Tuile tuile;

	private Accessoire accessoire;

	private Potion potion;

	private Coffre coffre;

	private boolean isTraversable = true;

	public int getTempX() {
		return tempX;
	}

	public void setTempX(int tempX) {
		this.tempX = tempX;
	}

	public int getTempY() {
		return tempY;
	}

	public void setTempY(int tempY) {
		this.tempY = tempY;
	}

	public Personnage getPersonnage() {
		return personnage;
	}

	public void setPersonnage(Personnage personnage) {
		this.personnage = personnage;
	}

	public Tuile getTuile() {
		return tuile;
	}

	public void setTuile(Tuile tuile) {
		this.tuile = tuile;
	}

	public Accessoire getAccessoire() {
		return accessoire;
	}

	public void setAccessoire(Accessoire accessoire) {
		this.accessoire = accessoire;
	}

	public Potion getPotion() {
		return potion;
	}

	public void setPotion(Potion potion) {
		this.potion = potion;
	}

	public boolean isTraversable() {
		return isTraversable;
	}

	public void setTraversable(boolean isTraversable) {
		this.isTraversable = isTraversable;
	}

	public Coffre getCoffre() {
		return coffre;
	}

	public void setCoffre(Coffre coffre) {
		this.coffre = coffre;
	}

	@Override
	public String toString() {
		return "Cellule [tempX=" + tempX + ", tempY=" + tempY + ", personnage=" + personnage + ", tuile=" + tuile
				+ ", accessoire=" + accessoire + ", potion=" + potion + ", coffre=" + coffre + ", isTraversable="
				+ isTraversable + "]";
	}

}
