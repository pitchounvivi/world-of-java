package fr.masociete.worldofjava.dto;

import fr.masociete.worldofjava.accessoire.dto.Accessoire;
import fr.masociete.worldofjava.potion.dto.Potion;

public class Personnage extends Monde {

	private String nom;
	private String image;
	private String nomPersonnage;
	private String sexe;
	private int competencePersonnage;
	private int pointDeVie;
	private int attaque;
	private int defense;

	private Accessoire accessoirePrincipal;
	private Accessoire accessoireSecondaire;
	private Potion potion;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getNomPersonnage() {
		return nomPersonnage;
	}

	public void setNomPersonnage(String nomPersonnage) {
		this.nomPersonnage = nomPersonnage;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public int getCompetencePersonnage() {
		return competencePersonnage;
	}

	public void setCompetencePersonnage(int competencePersonnage) {
		this.competencePersonnage = competencePersonnage;
	}

	public int getPointDeVie() {
		return pointDeVie;
	}

	public void setPointDeVie(int pointDeVie) {
		this.pointDeVie = pointDeVie;
	}

	public int getAttaque() {
		return attaque;
	}

	public void setAttaque(int attaque) {
		this.attaque = attaque;
	}

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}

	public Accessoire getAccessoirePrincipal() {
		return accessoirePrincipal;
	}

	public void setAccessoirePrincipal(Accessoire accessoirePrincipal) {
		this.accessoirePrincipal = accessoirePrincipal;
	}

	public Accessoire getAccessoireSecondaire() {
		return accessoireSecondaire;
	}

	public void setAccessoireSecondaire(Accessoire accessoireSecondaire) {
		this.accessoireSecondaire = accessoireSecondaire;
	}

	public Potion getPotion() {
		return potion;
	}

	public void setPotion(Potion potion) {
		this.potion = potion;
	}

	@Override
	public String toString() {
		return "Personnage [nom=" + nom + ", image=" + image + ", nomPersonnage=" + nomPersonnage + ", sexe=" + sexe
				+ ", competencePersonnage=" + competencePersonnage + ", pointDeVie=" + pointDeVie + ", attaque="
				+ attaque + ", defense=" + defense + ", accessoirePrincipal=" + accessoirePrincipal
				+ ", accessoireSecondaire=" + accessoireSecondaire + ", potion=" + potion + "]";
	}

}
