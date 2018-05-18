package model.printer;

public interface ICanBeAHero {

	String getName();

	void setName(String name);
	
	void levelUp();

	int getStrength();

	int getDefence();

	int getIntelligence();

	int getDexterity();

	int getAgility();

	int getSpeed();

	int getAvailableStatsPoints();
}