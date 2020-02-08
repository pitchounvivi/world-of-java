package fr.masociete.worldofjava.coffre.dto;

public class CoffreAccessoire extends Coffre {

	public static void main(String[] args) {
		CoffreAccessoire coffre = new CoffreAccessoire();
		System.out.println(coffre);
	}

	public CoffreAccessoire() {
		this.setNom("Coffre d'accessoires");
		this.setPiecesOr(0);
		this.setImage("coffreAccessoire.png");
	}

}