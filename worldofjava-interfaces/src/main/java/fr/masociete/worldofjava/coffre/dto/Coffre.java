package fr.masociete.worldofjava.coffre.dto;

import fr.masociete.worldofjava.dto.Monde;

public class Coffre extends Monde {

	private String nom;
	private int piecesOr;
	private String image;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getPiecesOr() {
		return piecesOr;
	}

	public void setPiecesOr(int piecesOr) {
		this.piecesOr = piecesOr;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "Coffre [nom=" + nom + ", piecesOr=" + piecesOr + ", image=" + image + "]";
	}

}
