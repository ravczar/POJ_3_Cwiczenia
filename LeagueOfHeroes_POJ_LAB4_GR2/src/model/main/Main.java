package model.main;

import model.heroes.Archer;
import model.heroes.Knight;
import model.heroes.Mage;
import model.heroes.Hero;
import model.printer.PrintItout;

public class Main {

	public static void main(String[] args) {	
		Hero mage = new Mage();
		mage.setName("Gandalf");
		Hero knight = new Knight();
		knight.setName("Aragorn");
		Hero archer = new Archer();
		archer.setName("Legolas");
		
		for (int i=0 ; i<100; i++) {
		mage.levelUp();
		knight.levelUp();
		archer.levelUp();
		
		mage.raiseAgi();
		mage.raiseDef();
		mage.raiseDex();
		mage.raiseInt();
		mage.raiseSpd();
		mage.raiseStr();
		
		knight.raiseAgi();
		knight.raiseDef();
		knight.raiseDex();
		knight.raiseInt();
		knight.raiseSpd();
		knight.raiseStr();
		
		archer.raiseAgi();
		archer.raiseDef();
		archer.raiseDex();
		archer.raiseInt();
		archer.raiseSpd();
		archer.raiseStr();
	
		}
		
		PrintItout.printoutHero(mage);
		PrintItout.printoutHero(knight);
		PrintItout.printoutHero(archer);
		
		
	}
}