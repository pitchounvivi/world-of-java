package fr.masociete.worldofjava.dto;

public abstract class Objet extends Monde {

	private String nom;
	private int cout;
	private int pointAttaque;
	private int pointDefense;
	private String image;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	

	public int getPointAttaque() {
		return pointAttaque;
	}

	public void setPointAttaque(int pointAttaque) {
		this.pointAttaque = pointAttaque;
	}

	public int getPointDefense() {
		return pointDefense;
	}

	public void setPointDefense(int pointDefense) {
		this.pointDefense = pointDefense;
	}

	public int getCout() {
		return cout;
	}

	public void setCout(int cout) {
		this.cout = cout;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	
	
}
