package fr.masociete.worldofjava.joueur.dto;

//	create table joueur(
//	id bigint,
//	idPersonnage bigint,
//	nom varchar(100),
//	prenom varchar(50), 
//	pseudo varchar(30),
//	competence numeric(10,0)
//	);

public class Joueur {

	private Long id;
	private Long idPersonnage;
	private String nom;
	private String prenom;
	private String pseudo;
	private int competence;
	private String personnage;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIdPersonnage() {
		return idPersonnage;
	}

	public void setIdPersonnage(Long idPersonnage) {
		this.idPersonnage = idPersonnage;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public int getCompetence() {
		return competence;
	}

	public void setCompetence(int competence) {
		this.competence = competence;
	}

	public String getPersonnage() {
		return personnage;
	}

	public void setPersonnage(String personnage) {
		this.personnage = personnage;
	}

}
