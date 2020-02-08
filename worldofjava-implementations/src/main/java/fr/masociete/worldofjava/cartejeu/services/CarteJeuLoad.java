package fr.masociete.worldofjava.cartejeu.services;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Properties;

import org.json.JSONObject;

import fr.masociete.worldofjava.cartejeu.dto.Cellule;
import fr.masociete.worldofjava.singleton.CarteJeuManager;

public class CarteJeuLoad {

	public static void main(String[] args) {
		CarteJeuManager.getInstance();
		load();
	}

	public static void load() {
		Properties prop = new Properties();
		try (InputStream input = new FileInputStream("../worldofjava-datas/worldofjava.properties")) {

			// load a properties file
			prop.load(input);

		} catch (IOException ex) {
			ex.printStackTrace();
		}

		final Iterator<Object> iterator = prop.keySet().iterator();
		while (iterator.hasNext()) {
			final Object key = iterator.next();
			final Object data = prop.get(key);

			// System.out.println(key + ":" + data);

			final String[] coordonnees = ((String) key).split("_");
			final int x = Integer.parseInt(coordonnees[1]);
			final int y = Integer.parseInt(coordonnees[2]);

			final JSONObject json = CarteJeuLoadServices.getJSon((String) data);
			// System.out.println(json);

			Cellule cellule = CarteJeuLoadServices.getCellule(json);

			CarteJeuManager.getInstance().getCarteJeu()[y][x] = cellule;
			// System.out.println(CarteJeuManager.getInstance().getCarteJeu()[x][y]);
		}

	}
}
