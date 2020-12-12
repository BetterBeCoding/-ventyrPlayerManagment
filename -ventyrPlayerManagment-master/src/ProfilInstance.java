import javax.swing.*;
import java.awt.*;

public class ProfilInstance extends Playermanager{
	
	public String[] strSkill = new String[18];
	String[] strSkillfw = new String[18];//skillFertigkeitswurf variablen
	String[] strWeapon = new String[4];//Waffenslots variablen
	String[] strWeaponfw = new String[4];//waffenFertigkeitswurf variablen
	String[] strWeapondamage = new String[4];//Waffenschaden variablen
	String[] strArmor = new String[4];	//R�stungsslots varaiblen
	String[] strArmorpoint = new String[4];//R�stungswerte variablen
	String[] strSpecialskill = new String[5];//Spezialskills variablen
	String[] strSuffer = new String[3];//Attribute variablen
	String[] strDefensepoint = new String[8] ;//Charackter information Variablen
	String[] strLifepoints = new String[8]; //Lebenspunkte variablen
	String[] strWounded = new String[7];//Verwundet Variablen im Array
	String strDeadlywounded;//T�dlich Verwundet Variablen
	String  strAge, strName, strFolk, strJob, strGold, strSilver, strCopper, strSkillpoints;//variablen verteidigungs punkte
	String strAttention, strStrength, strKnowledge, strMagic, strInitiative, strMovement;//Leiden variablen
	
	//Int Variablen
	public int[] skill = new int[18];
	int[] skillFw = new int[18];//skillFertigkeitswurf variablen
	int[] weapon = new int[4];//Waffenslots variablen
	int[] weaponFw = new int[4]; //waffenFertigkeitswurf variablen
	int[] weaponDamage = new int[4];//Waffenschaden variablen
	int[] armor = new int[4]; //R�stungsslots varaiblen
	int[] armorPoint = new int[4];//R�stungswerte variablen
	int[] specialSkill = new int[5];//Spezialskills variablen
	int[] suffer = new int[3];//Leiden variablen
	int[] defensePoint = new int[8];//variablen verteidigungs punkte
	int[] lifePoints = new int[8];//Lebenspunkte variablen
	int attention, strength, knowledge, magic, initiative, movement;//Attribute variablen
	int age, name, folk, job, gold, silver, copper, skillpoints;//Charackter information Variablen
	int[] wounded = new int[7]; //Verwundet Variablen Array
	int		deadlyWounded;//T�dlich Verwundet Variable


	

	public void instance() {
		
		getSkill();
		getSkillfw();
		getWeapon();
		getWeaponfw();
		getWeapondamage();
		getArmor();
		getArmorpoint();
		getSpecialskill();
		getAttribute();
		getSuffer();
		getCharcterinfo();
		getDefensepoint();
		getLifepoints();
		getWounded();
		
	}
	
	public void getSkill() {
		for(int i = 1; i<=18;i++) {
			strSkill[i-1] = txtSkill[i-1].getText();
		}
	}

	public void getSkillfw() {
		for(int i = 1; i<=18;i++) {
			strSkillfw[i-1] = txtskillFw[i-1].getText();
			skillFw[i-1]=Integer.parseInt(strSkillfw[i-1]);
		}
	}
	
	public void getWeapon() {
		for(int i = 1; i<=4;i++) {
			strWeapon[i-1] = txtWeapon[i-1].getText();
		}
	}
	
	public void getWeaponfw() {
		for(int i = 1; i<=4;i++) {
			strWeaponfw[i-1] = txtWeaponFw[i-1].getText();
			weaponFw[i-1] = Integer.parseInt(strWeaponfw[i - 1]);
		}
	}

	public void getWeapondamage() {
		for(int i = 1; i<=4;i++) {
			strWeapondamage[i-1] = txtWeapondamage[i-1].getText();
			weaponDamage[i-1]=Integer.parseInt(strWeapondamage[i-1]);
		}
	}

	public void getArmor() {

		for(int i = 1; i<=4;i++) {
			strArmor[i-1] = txtArmor[i-1].getText();
		}
	}
	
	public void getArmorpoint() {
		for(int i = 1; i<=4;i++) {
			strArmorpoint[i-1] = txtArmorpoint[i-1].getText();
			armorPoint[i-1]=Integer.parseInt(strArmorpoint[i-1]);
		}
	}

	public void getSpecialskill() {
		for(int i = 1; i<=4;i++) {
			strSpecialskill[i-1] = txtSpecialskill[i-1].getText();
		}
	}

	public void getAttribute() {
		
		strAttention = txtAttention.getText();
		attention =Integer.parseInt(strAttention);

		strStrength = txtStrength.getText();
		strength=Integer.parseInt(strStrength);
		
		strKnowledge = txtKnowledge.getText();
		knowledge=Integer.parseInt(strKnowledge);
		
		strMagic = txtMagic.getText();
		magic=Integer.parseInt(strMagic);
		
		strInitiative = txtInitiative.getText();
		initiative=Integer.parseInt(strInitiative);
		
		strMovement = txtMovement.getText();
		movement=Integer.parseInt(strMovement);
		
	}

	public void getSuffer() {
		for(int i = 1; i<=3;i++) {
			strSpecialskill[i-1] = txtSpecialskill[i-1].getText();
			strSuffer[i-1] = txtSuffer[i-1].getText();
		}
	}

	public void getCharcterinfo() {
		
		strName = txtName.getText();
		
		strFolk = txtFolk.getText();
		
		strJob = txtJob.getText();
		
		strAge = txtAge.getText();
		age = Integer.parseInt(strAge);
		
		strGold = txtGold.getText();
		gold = Integer.parseInt(strGold);
		
		strSilver = txtSilver.getText();
		silver = Integer.parseInt(strSilver);
		
		strCopper = txtCopper.getText();
		copper = Integer.parseInt(strCopper);
		
		strSkillpoints = txtSkillpoints.getText();
		skillpoints = Integer.parseInt(strSkillpoints);
		
		}

	public void getDefensepoint() {
		for(int i = 1; i<=4;i++) {
			strDefensepoint[i-1] = txtDefensepoint[i-1].getText();
			defensePoint[i-1] = Integer.parseInt(strDefensepoint[i-1]);
		}
	}

	public void getLifepoints() {
		for(int i = 1; i<=8;i++) {
			strLifepoints[i-1] = txtLifepoints[i-1].getText();
			lifePoints[i-1] = Integer.parseInt(strLifepoints[i-1]);
		}
	}

	public void getWounded() {		//Habe erstmal Deadlywounded inkludiert gelassen,sehe erstmal nicht viel Sinn darin daf�r noch eine Extra Funktion zu schreiben.Ist nat�rlich aber einfach m�glich.
		for(int i = 1; i<=7;i++) {
			strWounded[i-1] = txtWounded[i-1].getText();
			wounded[i-1] = Integer.parseInt(strWounded[i-1]);
		}

		//TODO: getDeadlyWounded funktion erzeugen! <<<Siehe oberes Kommentar bei getWounded()
		//TODO: getDeadlyWounded Textfeld anpassen
		strDeadlywounded = txtDeadlywounded.getText();
		deadlyWounded = Integer.parseInt(strDeadlywounded);
	}
	
	
	
	
	
}
