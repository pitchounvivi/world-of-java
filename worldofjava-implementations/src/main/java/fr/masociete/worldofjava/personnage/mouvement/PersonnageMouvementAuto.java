package fr.masociete.worldofjava.personnage.mouvement;

import java.util.Random;

import fr.masociete.worldofjava.cartejeu.dto.Cellule;
import fr.masociete.worldofjava.constante.WorldOfJavaConstante;
import fr.masociete.worldofjava.dto.Personnage;
import fr.masociete.worldofjava.services.mouvement.Mouvement;
import fr.masociete.worldofjava.singleton.CarteJeuManager;

public class PersonnageMouvementAuto implements Runnable {

	private Personnage personnage;

	public PersonnageMouvementAuto(Personnage personnage) {
		this.personnage = personnage;
	}

	@Override
	public void run() {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}

		boolean loop = true;

		while (loop) {
			int orientation = calculOrientation();
			int caseHeight = calculNombreHeight();
			int caseWidth = calculNombreWidth();

			boolean loopcase = true;
			while (loopcase) {

				Cellule cellule = CarteJeuManager.getInstance().getCelluleOfPersonnage(this.personnage);
				// System.out.println("Cellule : " + cellule);

				switch (orientation) {

				case 1:
					caseHeight--;
					caseWidth--;
					if (caseHeight == 0 | caseWidth == 0) {
						loopcase = false;
					}
					droiteHaut(cellule);
					break;

				case 2:
					caseHeight--;
					caseWidth--;
					if (caseHeight == 0 | caseWidth == 0) {
						loopcase = false;
					}
					droiteBas(cellule);
					break;

				case 3:
					caseHeight--;
					caseWidth--;
					if (caseHeight == 0 | caseWidth == 0) {
						loopcase = false;
					}
					gaucheHaut(cellule);
					break;

				case 4:
					caseHeight--;
					caseWidth--;
					if (caseHeight == 0 | caseWidth == 0) {
						loopcase = false;
					}
					gaucheBas(cellule);
					break;

				case 5:
					caseHeight--;
					if (caseHeight == 0) {
						loopcase = false;
					}
					bas(cellule);
					break;

				case 6:
					caseHeight--;
					if (caseHeight == 0) {
						loopcase = false;
					}
					haut(cellule);
					break;

				case 7:
					caseWidth--;
					if (caseWidth == 0) {
						loopcase = false;
					}
					gauche(cellule);
					break;

				case 8:
					caseWidth--;
					if (caseWidth == 0) {
						loopcase = false;
					}
					droite(cellule);
					break;
				}

				try {
					final Double d = 300 + (Math.random() * (500 - 300));
					final int sleep = d.intValue();
					Thread.sleep(sleep);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

	}

	public static int calculOrientation() {

		int valeurMin = 1;
		int valeurMax = 8;

		Random r = new Random();
		int valeur = valeurMin + r.nextInt(valeurMax - valeurMin);

		return valeur;

	}

	public static int calculNombreHeight() {

		int valeurMin = 0;
		int valeurMax = WorldOfJavaConstante.MAP_HEIGHT - 1;

		Random r = new Random();
		int valeur = valeurMin + r.nextInt(valeurMax - valeurMin);

		return valeur;

	}

	public static int calculNombreWidth() {

		int valeurMin = 0;
		int valeurMax = WorldOfJavaConstante.MAP_WIDTH - 1;

		Random r = new Random();
		int valeur = valeurMin + r.nextInt(valeurMax - valeurMin);

		return valeur;

	}

	public static boolean gauche(Cellule cellule) {

		if (cellule != null) {

			final int x = cellule.getTempX();
			final int y = cellule.getTempY();

			if ((x - 1) >= 0) {

				Cellule celluleDestination = CarteJeuManager.getInstance().getCarteJeu()[y][x - 1];
				if (celluleDestination == null) {
					celluleDestination = new Cellule();
					CarteJeuManager.getInstance().getCarteJeu()[y][x - 1] = celluleDestination;
					Mouvement.mouvementCellule(cellule, celluleDestination);
					return true;
				}

				boolean isAllow = CarteJeuManager.isAllowCellule(cellule, celluleDestination);
				if (isAllow) {
					Mouvement.mouvementCellule(cellule, celluleDestination);

				}

				// celluleDestination.setPersonnage(cellule.getPersonnage());

				// cellule.setPersonnage(null);
				// cellule.setTraversable(true);
				// cellule.setTempX(-1);
				// cellule.setTempY(-1);

				// CarteJeuManager.getInstance().getGameCanvas().repaint();

				return true;
			}
		}
		return false;
	}

	public static boolean droite(Cellule cellule) {

		if (cellule != null) {

			final int x = cellule.getTempX();
			final int y = cellule.getTempY();

			if ((x + 1) < WorldOfJavaConstante.MAP_WIDTH) {

				Cellule celluleDestination = CarteJeuManager.getInstance().getCarteJeu()[y][x + 1];
				if (celluleDestination == null) {
					celluleDestination = new Cellule();
					CarteJeuManager.getInstance().getCarteJeu()[y][x + 1] = celluleDestination;
					Mouvement.mouvementCellule(cellule, celluleDestination);
					return true;
				}

				boolean isAllow = CarteJeuManager.isAllowCellule(cellule, celluleDestination);
				if (isAllow) {
					Mouvement.mouvementCellule(cellule, celluleDestination);

				}

//				}
//
//				celluleDestination.setPersonnage(cellule.getPersonnage());
//
//				cellule.setPersonnage(null);
//				cellule.setTempX(-1);
//				cellule.setTempY(-1);
//
//				CarteJeuManager.getInstance().getGameCanvas().repaint();

				return true;
			}
		}
		return false;
	}

	public static boolean bas(Cellule cellule) {
		if (cellule != null) {

			final int x = cellule.getTempX();
			final int y = cellule.getTempY();

			if ((y + 1) < WorldOfJavaConstante.MAP_HEIGHT) {

				Cellule celluleDestination = CarteJeuManager.getInstance().getCarteJeu()[y + 1][x];
				if (celluleDestination == null) {
					celluleDestination = new Cellule();
					CarteJeuManager.getInstance().getCarteJeu()[y + 1][x] = celluleDestination;
					Mouvement.mouvementCellule(cellule, celluleDestination);
					return true;
				}

				boolean isAllow = CarteJeuManager.isAllowCellule(cellule, celluleDestination);
				if (isAllow) {
					Mouvement.mouvementCellule(cellule, celluleDestination);

				}

//				
//				}
//
//				celluleDestination.setPersonnage(cellule.getPersonnage());
//
//				cellule.setPersonnage(null);
//				cellule.setTempX(-1);
//				cellule.setTempY(-1);
//
//				CarteJeuManager.getInstance().getGameCanvas().repaint();

				return true;
			}
		}
		return false;
	}

	public static boolean haut(Cellule cellule) {
		if (cellule != null) {

			final int x = cellule.getTempX();
			final int y = cellule.getTempY();

			if ((y - 1) >= 0) {

				Cellule celluleDestination = CarteJeuManager.getInstance().getCarteJeu()[y - 1][x];
				if (celluleDestination == null) {
					celluleDestination = new Cellule();
					CarteJeuManager.getInstance().getCarteJeu()[y - 1][x] = celluleDestination;
					Mouvement.mouvementCellule(cellule, celluleDestination);
					return true;
				}

				boolean isAllow = CarteJeuManager.isAllowCellule(cellule, celluleDestination);
				if (isAllow) {
					Mouvement.mouvementCellule(cellule, celluleDestination);

				}

//				}
//
//				celluleDestination.setPersonnage(cellule.getPersonnage());
//
//				cellule.setPersonnage(null);
//				cellule.setTempX(-1);
//				cellule.setTempY(-1);
//
//				CarteJeuManager.getInstance().getGameCanvas().repaint();

				return true;
			}
		}
		return false;
	}

	/***************************************************/

	public static boolean droiteHaut(Cellule cellule) {
		if (cellule != null) {

			final int x = cellule.getTempX();
			final int y = cellule.getTempY();

			if ((x + 1) < WorldOfJavaConstante.MAP_WIDTH && (y - 1) >= 0) {

				Cellule celluleDestination = CarteJeuManager.getInstance().getCarteJeu()[y - 1][x + 1];
				if (celluleDestination == null) {
					celluleDestination = new Cellule();
					CarteJeuManager.getInstance().getCarteJeu()[y - 1][x + 1] = celluleDestination;
					Mouvement.mouvementCellule(cellule, celluleDestination);
					return true;
				}

				boolean isAllow = CarteJeuManager.isAllowCellule(cellule, celluleDestination);
				if (isAllow) {
					Mouvement.mouvementCellule(cellule, celluleDestination);

				}

//				}
//
//				celluleDestination.setPersonnage(cellule.getPersonnage());
//
//				cellule.setPersonnage(null);
//				cellule.setTempX(-1);
//				cellule.setTempY(-1);
//
//				CarteJeuManager.getInstance().getGameCanvas().repaint();
//
				return true;
			}
		}
		return false;
	}

	public static boolean droiteBas(Cellule cellule) {
		if (cellule != null) {

			final int x = cellule.getTempX();
			final int y = cellule.getTempY();

			if ((x + 1) < WorldOfJavaConstante.MAP_WIDTH && (y + 1) < WorldOfJavaConstante.MAP_HEIGHT) {

				Cellule celluleDestination = CarteJeuManager.getInstance().getCarteJeu()[y + 1][x + 1];
				if (celluleDestination == null) {
					celluleDestination = new Cellule();
					CarteJeuManager.getInstance().getCarteJeu()[y + 1][x + 1] = celluleDestination;
					Mouvement.mouvementCellule(cellule, celluleDestination);
					return true;
				}

				boolean isAllow = CarteJeuManager.isAllowCellule(cellule, celluleDestination);
				if (isAllow) {
					Mouvement.mouvementCellule(cellule, celluleDestination);

				}
				
				
				
//				}
//
//				celluleDestination.setPersonnage(cellule.getPersonnage());
//
//				cellule.setPersonnage(null);
//				cellule.setTempX(-1);
//				cellule.setTempY(-1);
//
//				CarteJeuManager.getInstance().getGameCanvas().repaint();

				return true;
			}
		}
		return false;
	}

	public static boolean gaucheBas(Cellule cellule) {
		if (cellule != null) {

			final int x = cellule.getTempX();
			final int y = cellule.getTempY();

			if ((x - 1) >= 0 && (y + 1) < WorldOfJavaConstante.MAP_HEIGHT) {

				Cellule celluleDestination = CarteJeuManager.getInstance().getCarteJeu()[y + 1][x - 1];
				if (celluleDestination == null) {
					celluleDestination = new Cellule();
					CarteJeuManager.getInstance().getCarteJeu()[y + 1][x - 1] = celluleDestination;
			
					Mouvement.mouvementCellule(cellule, celluleDestination);
					return true;
				}

				boolean isAllow = CarteJeuManager.isAllowCellule(cellule, celluleDestination);
				if (isAllow) {
					Mouvement.mouvementCellule(cellule, celluleDestination);

				}
				
				
//				}
//
//				celluleDestination.setPersonnage(cellule.getPersonnage());
//
//				cellule.setPersonnage(null);
//				cellule.setTempX(-1);
//				cellule.setTempY(-1);
//
//				CarteJeuManager.getInstance().getGameCanvas().repaint();

				return true;
			}
		}
		return false;
	}

	public static boolean gaucheHaut(Cellule cellule) {
		if (cellule != null) {

			final int x = cellule.getTempX();
			final int y = cellule.getTempY();

			if ((x - 1) >= 0 && (y - 1) >= 0) {

				Cellule celluleDestination = CarteJeuManager.getInstance().getCarteJeu()[y - 1][x - 1];
				if (celluleDestination == null) {
					celluleDestination = new Cellule();
					CarteJeuManager.getInstance().getCarteJeu()[y - 1][x - 1] = celluleDestination;
					Mouvement.mouvementCellule(cellule, celluleDestination);
					return true;
				}

				boolean isAllow = CarteJeuManager.isAllowCellule(cellule, celluleDestination);
				if (isAllow) {
					Mouvement.mouvementCellule(cellule, celluleDestination);

				}
				
				
//				}
//
//				celluleDestination.setPersonnage(cellule.getPersonnage());
//
//				cellule.setPersonnage(null);
//				cellule.setTempX(-1);
//				cellule.setTempY(-1);
//
//				CarteJeuManager.getInstance().getGameCanvas().repaint();

				return true;
			}
		}
		return false;
	}

}