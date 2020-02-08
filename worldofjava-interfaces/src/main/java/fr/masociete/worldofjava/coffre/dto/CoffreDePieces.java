package fr.masociete.worldofjava.coffre.dto;

public class CoffreDePieces extends Coffre {

	public static void main(String[] args) {
		CoffreDePieces coffre = new CoffreDePieces(2000);
		System.out.println(coffre);
	}

	public CoffreDePieces(int nombrePiece) {
		this.setNom("Coffre de Pieces d'Or");
		this.setPiecesOr(nombrePiece);
		this.setImage("coffreDePieces.png");
	}

}