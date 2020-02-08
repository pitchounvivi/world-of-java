package fr.masociete.worldofjava.accessoire.dto;

public class EpeeDeuxMain extends Accessoire {

	public static void main(String[] args){
		EpeeDeuxMain epeeDeuxMain = new EpeeDeuxMain();
		System.out.println(epeeDeuxMain);
	}
	
	
	public EpeeDeuxMain() {
		this.setNom("Ep�e � deux mains");
		this.setEncombrement(2);
		this.setPortee(1);
		this.setCout(300);
		this.setPointAttaque(300);
		this.setPointDefense(80);
	}

	@Override
	public String toString() {
		return getNom() + " a un cout de = " + getCout() + " pi�ces, a un encombrement de = " + getEncombrement() + " case(s), poss�de une port�e de " + getPortee() + " case(s),"
				+ " a une attaque de = " + getPointAttaque()
				+ ", a une defense de = " + getPointDefense() + ".";
	}
	
}
