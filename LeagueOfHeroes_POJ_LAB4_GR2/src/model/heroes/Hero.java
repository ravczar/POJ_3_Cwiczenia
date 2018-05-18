package model.heroes;

import model.printer.ICanBeAHero;

public abstract class Hero implements ICanBeAHero{
	
	protected String name;
	protected int strength;
	protected int defence;
	protected int intelligence;
	protected int dexterity;
	protected int agility;
	protected int speed;
	protected int availableStatsPoints;
	
	public int getAvailableStatsPoints() {
		return availableStatsPoints;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStrength() {
		return strength;
	}

	public int getDefence() {
		return defence;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public int getDexterity() {
		return dexterity;
	}

	public int getAgility() {
		return agility;
	}

	public int getSpeed() {
		return speed;
	}
	
	
	public void levelUp() {
		availableStatsPoints += 10;
	}
	
/// Skoro zastosowaliœmy metody abstrakcyjne w naszych metodach podstawowych klasy basowej to musimy je jescze tutaj zaznaczyæ
	protected abstract void modifyStrength();
	protected abstract void modifyDefence();
	protected abstract void modifyIntelligence();
	protected abstract void modifyDexterity();
	protected abstract void modifyAgility();
	protected abstract void modifySpeed();
	
	// Podnosimy statystyki - metody
	public void raiseStr() {
		if(availableStatsPoints <= 0) return;
		modifyStrength();
		availableStatsPoints--;
	}
	
	public void raiseDef() {
		if(availableStatsPoints <= 0) return;
		modifyDefence();
		availableStatsPoints--;
	}
	
	public void raiseInt() {
		if(availableStatsPoints <= 0) return;
		modifyIntelligence();
		availableStatsPoints--;
	}
	
	public void raiseDex() {
		if(availableStatsPoints <= 0) return;
		modifyDexterity();
		availableStatsPoints--;
	}
	
	public void raiseAgi() {
		if(availableStatsPoints <= 0) return;
		modifyAgility();
		availableStatsPoints--;
	}
	
	public void raiseSpd() {
		if(availableStatsPoints <= 0) return;
		modifySpeed();
		availableStatsPoints--;
	}
	
}
