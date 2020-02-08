package fr.masociete.worldofjava.database.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fr.masociete.worldofjava.joueur.dto.Joueur;

/***
 * 
 * @author eric
 *
 */
public class JoueurServices {

	/***
	 * 
	 * @param requeteSql
	 * @return
	 */
	public static List<Joueur> getListJoueurs(String requeteSql) {
		List<Joueur> listJoueurs = new ArrayList<Joueur>();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName("org.postgresql.Driver");
			conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/eric", "eric", "eric");

			stmt = conn.createStatement();
			rs = stmt.executeQuery(requeteSql);
			while (rs.next()) {
				final Long id = rs.getLong("id");
				final Long idPersonnage = rs.getLong("idPersonnage");
				final String nom = rs.getString("nom");
				final String prenom = rs.getString("prenom");
				final String pseudo = rs.getString("pseudo");
				final int competence = rs.getInt("competence");
				final String personnage = rs.getString("personnage");
				final Joueur joueur = new Joueur();
				joueur.setId(id);
				joueur.setIdPersonnage(idPersonnage);
				joueur.setNom(nom);
				joueur.setPrenom(prenom);
				joueur.setPseudo(pseudo);
				joueur.setCompetence(competence);
				joueur.setPersonnage(personnage);
				listJoueurs.add(joueur);
				//System.out.println("joueur : " + joueur);
			}
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				rs = null;
			}

			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				stmt = null;
			}

			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				conn = null;
			}
		} // end try
		return listJoueurs;
	}

	/***
	 * 
	 * @param joueur
	 * @return
	 */
	public static boolean addJoueur(Joueur joueur) {
		boolean result = false;
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			Class.forName("org.postgresql.Driver");
			conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/eric", "eric", "eric");
			pstmt = conn
					.prepareStatement("INSERT INTO JOUEUR(idpersonnage,nom,prenom,pseudo,competence,personnage)values(?,?,?,?,?,?)");
			pstmt.setLong(1, joueur.getIdPersonnage());
			pstmt.setString(2, joueur.getNom());
			pstmt.setString(3, joueur.getPrenom());
			pstmt.setString(4, joueur.getPseudo());
			pstmt.setInt(5, joueur.getCompetence());
			pstmt.setString(6, joueur.getPersonnage());

			result = pstmt.execute();
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {

			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				pstmt = null;
			}

			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				conn = null;
			}
		} // end try
		return result;
	}

	/***
	 * 
	 * @param joueur
	 * @return
	 */
	public static boolean updateJoueur(Joueur joueur) {
		boolean result = false;
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			Class.forName("org.postgresql.Driver");
			conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/eric", "eric", "eric");
			pstmt = conn.prepareStatement(
					"UPDATE JOUEUR set idpersonnage=?,nom=?,prenom=?,pseudo=?,competence=?,personnage=? WHERE id=?");
			pstmt.setLong(1, joueur.getIdPersonnage());
			pstmt.setString(2, joueur.getNom());
			pstmt.setString(3, joueur.getPrenom());
			pstmt.setString(4, joueur.getPseudo());
			pstmt.setInt(5, joueur.getCompetence());
			pstmt.setString(6, joueur.getPersonnage());
			pstmt.setLong(7, joueur.getId());

			result = pstmt.execute();
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {

			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				pstmt = null;
			}

			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				conn = null;
			}
		} // end try
		return result;
	}
}
