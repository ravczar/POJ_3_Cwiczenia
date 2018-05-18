package model.printer;

public class PrintItout {

	public static void printoutHero(ICanBeAHero hero) {
		System.out.println("------------------------------------------------------------------------------------------------------------");
		System.out.println(
							hero.getName() + "\t|"
				+ "str: " + hero.getStrength() + "\t|"
				+ "def: " + hero.getDefence() + "\t|"
				+ "int: " + hero.getIntelligence() + "\t|"
				+ "agi: " + hero.getAgility() + "\t|"
				+ "dex: " +	hero.getDexterity() + "\t|"
				+ "spd: " + hero.getSpeed() 
				);
		System.out.println("------------------------------------------------------------------------------------------------------------");
	}
	
	
}
