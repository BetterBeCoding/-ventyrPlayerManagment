import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.awt.event.ActionEvent;

import java.awt.Insets;
import javax.swing.UIManager;

public class Playermanager {
	
	public JFrame 
	frame;

	public JTextPane 
	txtInventory;
	public static ProfilInstance pi = new ProfilInstance();
	static boolean reload = false;
	//Textfeld Variablen (als Arrays angelegt)
	public JTextField[] txtSkill = new JTextField[18]; //skillfelder variablen
	public JTextField[] txtskillFw = new JTextField[18]; //skillFertigkeitswurf variablen
	public JTextField[] txtWeapon = new JTextField[4]; //Waffenslots variablen
	public JTextField[] txtWeaponFw = new JTextField[4]; //waffenFertigkeitswurf variablen
	public JTextField[] txtWeapondamage = new JTextField[4]; //Waffenschaden variablen
	public JTextField[] txtArmor = new JTextField[4]; //Rüstungsslots varaiblen
	public JTextField[] txtArmorpoint = new JTextField[4]; //Rüstungswerte variablen
	public JTextField[] txtSpecialskill = new JTextField[5]; //Spezialskills variablen
	public JTextField[] txtSuffer = new JTextField[3]; //Leiden variablen
	public JTextField[] txtDefensepoint = new JTextField[8]; //variablen verteidigungs punkte
	public JTextField[] txtLifepoints = new JTextField[8]; //Lebenspunkte variablen
	//Textfeld Variablen (als Variablen angelegt)
	public JTextField txtAttention, txtStrength, txtKnowledge, txtMagic, txtInitiative, txtMovement; //Attribute variablen
	public JTextField txtAge, txtName, txtFolk, txtJob, txtGold, txtSilver, txtCopper, txtSkillpoints; //Charackter information Variablen
	public JTextField txtWounded1, txtWounded3, txtWounded2, txtWounded4, txtWounded5, txtWounded6, txtWounded7, txtDeadlywounded;	//Verwundet Variablen
	public int[] seitlicherVersatz = {0,74,120,168,216,264,312,360,408};// Versatzwerte für die Rüstungspunkte und Lebenspunkte
																		//TODO:Verwundet noch als Array anlegen!(Darstellung beachten -1 element weniger)
																		//TODO:-Später noch erweitern auf Verwundet
																		//TODO:werte automatisiert anpassen
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Playermanager window = new Playermanager();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		//probe kann später gelöscht werden, nur zu überprüfung ob alle werte übergebn werden.
		//ProfilInstance pi = new ProfilInstance();
		//pi.instance();
		//System.out.println( pi.strSkill1 +" " + pi.skillFw1);
		
		
		while (reload == true) {
			pi.instance();
			
			
		}
		
	}

	/**
	 * Create the application.
	 */
	public Playermanager() {
		initialize();
		skillFields();
		background();
		weapon();
		armor();
		specialSkill();
		suffer();
		inventory();
		attributes();
		character();
		buttons();
		
		
		
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1380, 957);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
	}
	public void skillFields() {
		for(int i = 1; i<=18;i++) {
			txtSkill[i-1] = new JTextField();
			txtSkill[i-1].setBounds(50, 220 + ((i-1) * 36), 250, 27); //jeder durchlauf +35
			txtSkill[i-1].setFont(new Font("Ubuntu", Font.BOLD, 14));
			txtSkill[i-1].setHorizontalAlignment(SwingConstants.CENTER);
			txtSkill[i-1].setText("test");
			frame.getContentPane().add(txtSkill[i-1]);
			txtSkill[i-1].setColumns(10);
		}

		for(int i = 1; i<=18;i++) {
			txtskillFw[i-1] = new JTextField();
			txtskillFw[i-1].setFont(new Font("Ubuntu", Font.BOLD, 17));
			txtskillFw[i-1].setHorizontalAlignment(SwingConstants.CENTER);
			txtskillFw[i-1].setText("99");
			txtskillFw[i-1].setBounds(313, 220 + ((i-1) * 36), 30, 25);
			frame.getContentPane().add(txtskillFw[i-1]);
			txtskillFw[i-1].setColumns(10);
		}

		
		txtSkillpoints = new JTextField();
		txtSkillpoints.setText("99");
		txtSkillpoints.setHorizontalAlignment(SwingConstants.CENTER);
		txtSkillpoints.setFont(new Font("Ubuntu", Font.BOLD, 17));
		txtSkillpoints.setColumns(10);
		txtSkillpoints.setBounds(246, 879, 30, 25);
		frame.getContentPane().add(txtSkillpoints);
		
		
		
	}
	public void weapon() {
		for(int i = 1; i<=4;i++) {
			txtWeapon[i-1] = new JTextField();
			txtWeapon[i-1].setFont(new Font("Ubuntu", Font.BOLD, 14));
			txtWeapon[i-1].setHorizontalAlignment(SwingConstants.CENTER);
			txtWeapon[i-1].setText("test");
			txtWeapon[i-1].setBounds(380, 290 + ((i-1) * 35), 185, 30);
			frame.getContentPane().add(txtWeapon[i-1]);
			txtWeapon[i-1].setColumns(10);
		}
		for(int i = 1; i<=4;i++) {
			txtWeapondamage[i-1] = new JTextField();
			txtWeapondamage[i-1].setText("999");
			txtWeapondamage[i-1].setHorizontalAlignment(SwingConstants.CENTER);
			txtWeapondamage[i-1].setFont(new Font("Ubuntu", Font.BOLD, 14));
			txtWeapondamage[i-1].setColumns(10);
			txtWeapondamage[i-1].setBounds(585, 290 + ((i-1) * 35), 42, 27);
			frame.getContentPane().add(txtWeapondamage[i-1]);
		}
		for(int i = 1; i<=4;i++) {
			txtWeaponFw[i-1] = new JTextField();
			txtWeaponFw[i-1].setAlignmentY(0.0f);
			txtWeaponFw[i-1].setAlignmentX(0.0f);
			txtWeaponFw[i-1].setText("99");
			txtWeaponFw[i-1].setHorizontalAlignment(SwingConstants.CENTER);
			txtWeaponFw[i-1].setFont(new Font("Ubuntu", Font.BOLD, 17));
			txtWeaponFw[i-1].setColumns(10);
			txtWeaponFw[i-1].setBounds(641, 292 + ((i-1) * 35), 30, 25);
			frame.getContentPane().add(txtWeaponFw[i-1]);
		}

	}
	public void armor() {

		for(int i = 1; i<=4;i++) {
			txtArmor[i-1] = new JTextField();
			txtArmor[i-1].setText("test");
			txtArmor[i-1].setHorizontalAlignment(SwingConstants.CENTER);
			txtArmor[i-1].setFont(new Font("Ubuntu", Font.BOLD, 14));
			txtArmor[i-1].setBounds(380, 485 + ((i-1) * 35), 226, 27);
			frame.getContentPane().add(txtArmor[i-1]);
			txtArmor[i-1].setColumns(10);
		}

		for(int i = 1; i<=4;i++) {
			txtArmorpoint[i-1] = new JTextField();
			txtArmorpoint[i-1].setText("999");
			txtArmorpoint[i-1].setHorizontalAlignment(SwingConstants.CENTER);
			txtArmorpoint[i-1].setFont(new Font("Ubuntu", Font.BOLD, 14));
			txtArmorpoint[i-1].setColumns(10);
			txtArmorpoint[i-1].setBounds(625, 485 + ((i-1) * 35), 42, 27);
			frame.getContentPane().add(txtArmorpoint[i-1]);
		}

		for(int i = 1; i<=8;i++) {
			txtDefensepoint[i-1] = new JTextField();
			txtDefensepoint[i-1].setText("999");
			txtDefensepoint[i-1].setHorizontalAlignment(SwingConstants.CENTER);
			txtDefensepoint[i-1].setFont(new Font("Ubuntu", Font.BOLD, 14));
			txtDefensepoint[i-1].setColumns(10);
			txtDefensepoint[i-1].setBounds(393 + seitlicherVersatz[i-1], 664 , 42, 27);
			frame.getContentPane().add(txtDefensepoint[i-1]);
		}

	}
	public void specialSkill() {
		for(int i = 1; i<=5;i++) {
			txtSpecialskill[i-1] = new JTextField();
			txtSpecialskill[i-1].setText("test");
			txtSpecialskill[i-1].setHorizontalAlignment(SwingConstants.CENTER);
			txtSpecialskill[i-1].setFont(new Font("Ubuntu", Font.BOLD, 14));
			txtSpecialskill[i-1].setColumns(8);
			txtSpecialskill[i-1].setBounds(708, 290  + ((i-1) * 35), 279, 30);
			frame.getContentPane().add(txtSpecialskill[i-1]);
		}

	}
	public void suffer() {
		for(int i = 1; i<=3;i++) {
			txtSuffer[i-1] = new JTextField();
			txtSuffer[i-1].setText("test");
			txtSuffer[i-1].setHorizontalAlignment(SwingConstants.CENTER);
			txtSuffer[i-1].setFont(new Font("Ubuntu", Font.BOLD, 14));
			txtSuffer[i-1].setColumns(10);
			txtSuffer[i-1].setBounds(708, 522 + ((i-1) * 35), 279, 30);
			frame.getContentPane().add(txtSuffer[i-1]);
		}
	}
	public void inventory() {
		txtInventory = new JTextPane();
		txtInventory.setFont(new Font("Ubuntu", Font.BOLD, 14));
		txtInventory.setBackground(Color.LIGHT_GRAY);
		txtInventory.setBounds(1031, 473 , 302, 415);
		frame.getContentPane().add(txtInventory);
	}
	public void attributes() {
		txtAttention = new JTextField();
		txtAttention.setText("999");
		txtAttention.setHorizontalAlignment(SwingConstants.CENTER);
		txtAttention.setFont(new Font("Ubuntu", Font.BOLD, 14));
		txtAttention.setColumns(10);
		txtAttention.setBounds(400, 195, 42, 27);
		frame.getContentPane().add(txtAttention);
		
		txtStrength = new JTextField();
		txtStrength.setText("999");
		txtStrength.setHorizontalAlignment(SwingConstants.CENTER);
		txtStrength.setFont(new Font("Ubuntu", Font.BOLD, 14));
		txtStrength.setColumns(10);
		txtStrength.setBounds(491, 197, 42, 27);
		frame.getContentPane().add(txtStrength);
		
		txtKnowledge = new JTextField();
		txtKnowledge.setText("999");
		txtKnowledge.setHorizontalAlignment(SwingConstants.CENTER);
		txtKnowledge.setFont(new Font("Ubuntu", Font.BOLD, 14));
		txtKnowledge.setColumns(10);
		txtKnowledge.setBounds(592, 197, 42, 27);
		frame.getContentPane().add(txtKnowledge);
		
		txtMagic = new JTextField();
		txtMagic.setText("999");
		txtMagic.setHorizontalAlignment(SwingConstants.CENTER);
		txtMagic.setFont(new Font("Ubuntu", Font.BOLD, 14));
		txtMagic.setColumns(10);
		txtMagic.setBounds(693, 195, 42, 27);
		frame.getContentPane().add(txtMagic);
		
		txtInitiative = new JTextField();
		txtInitiative.setText("999");
		txtInitiative.setHorizontalAlignment(SwingConstants.CENTER);
		txtInitiative.setFont(new Font("Ubuntu", Font.BOLD, 14));
		txtInitiative.setColumns(10);
		txtInitiative.setBounds(796, 195, 42, 27);
		frame.getContentPane().add(txtInitiative);
		
		txtMovement = new JTextField();
		txtMovement.setText("999");
		txtMovement.setHorizontalAlignment(SwingConstants.CENTER);
		txtMovement.setFont(new Font("Ubuntu", Font.BOLD, 14));
		txtMovement.setColumns(10);
		txtMovement.setBounds(897, 196, 42, 27);
		frame.getContentPane().add(txtMovement);

		for(int i = 1; i<=8;i++) {
			txtLifepoints[i-1] = new JTextField();
			txtLifepoints[i-1].setText("999");
			txtLifepoints[i-1].setHorizontalAlignment(SwingConstants.CENTER);
			txtLifepoints[i-1].setFont(new Font("Ubuntu", Font.BOLD, 14));
			txtLifepoints[i-1].setColumns(10);
			txtLifepoints[i-1].setBounds(393 + seitlicherVersatz[i-1], 760, 42, 27);
			frame.getContentPane().add(txtLifepoints[i-1]);
		}
		
		txtWounded1 = new JTextField();
		txtWounded1.setText("999");
		txtWounded1.setHorizontalAlignment(SwingConstants.CENTER);
		txtWounded1.setFont(new Font("Ubuntu", Font.BOLD, 12));
		txtWounded1.setColumns(10);
		txtWounded1.setBounds(469, 825, 30, 25);
		frame.getContentPane().add(txtWounded1);
		
		txtWounded2 = new JTextField();
		txtWounded2.setText("999");
		txtWounded2.setHorizontalAlignment(SwingConstants.CENTER);
		txtWounded2.setFont(new Font("Ubuntu", Font.BOLD, 12));
		txtWounded2.setColumns(10);
		txtWounded2.setBounds(566, 825, 30, 25);
		frame.getContentPane().add(txtWounded2);
		
		txtWounded3 = new JTextField();
		txtWounded3.setText("999");
		txtWounded3.setHorizontalAlignment(SwingConstants.CENTER);
		txtWounded3.setFont(new Font("Ubuntu", Font.BOLD, 12));
		txtWounded3.setColumns(10);
		txtWounded3.setBounds(517, 825, 30, 25);
		frame.getContentPane().add(txtWounded3);
		
		txtWounded4 = new JTextField();
		txtWounded4.setText("999");
		txtWounded4.setHorizontalAlignment(SwingConstants.CENTER);
		txtWounded4.setFont(new Font("Ubuntu", Font.BOLD, 12));
		txtWounded4.setColumns(10);
		txtWounded4.setBounds(614, 827, 30, 25);
		frame.getContentPane().add(txtWounded4);
		
		txtWounded5 = new JTextField();
		txtWounded5.setText("999");
		txtWounded5.setHorizontalAlignment(SwingConstants.CENTER);
		txtWounded5.setFont(new Font("Ubuntu", Font.BOLD, 12));
		txtWounded5.setColumns(10);
		txtWounded5.setBounds(665, 827, 30, 25);
		frame.getContentPane().add(txtWounded5);
		
		txtWounded6 = new JTextField();
		txtWounded6.setText("999");
		txtWounded6.setHorizontalAlignment(SwingConstants.CENTER);
		txtWounded6.setFont(new Font("Ubuntu", Font.BOLD, 12));
		txtWounded6.setColumns(10);
		txtWounded6.setBounds(713, 828, 30, 25);
		frame.getContentPane().add(txtWounded6);
		
		txtWounded7 = new JTextField();
		txtWounded7.setText("999");
		txtWounded7.setHorizontalAlignment(SwingConstants.CENTER);
		txtWounded7.setFont(new Font("Ubuntu", Font.BOLD, 12));
		txtWounded7.setColumns(10);
		txtWounded7.setBounds(762, 828, 30, 25);
		frame.getContentPane().add(txtWounded7);
		
		txtDeadlywounded = new JTextField();
		txtDeadlywounded.setText("999");
		txtDeadlywounded.setHorizontalAlignment(SwingConstants.CENTER);
		txtDeadlywounded.setFont(new Font("Ubuntu", Font.BOLD, 12));
		txtDeadlywounded.setColumns(10);
		txtDeadlywounded.setBounds(614, 881, 30, 25);
		frame.getContentPane().add(txtDeadlywounded);
	}
	public void character(){
		txtAge = new JTextField();
		txtAge.setText("999");
		txtAge.setHorizontalAlignment(SwingConstants.CENTER);
		txtAge.setFont(new Font("Ubuntu", Font.BOLD, 14));
		txtAge.setColumns(10);
		txtAge.setBounds(961, 99, 42, 27);
		frame.getContentPane().add(txtAge);
		
		txtName = new JTextField();
		txtName.setText("test");
		txtName.setHorizontalAlignment(SwingConstants.CENTER);
		txtName.setFont(new Font("Ubuntu", Font.BOLD, 14));
		txtName.setColumns(10);
		txtName.setBounds(464, 56, 461, 27);
		frame.getContentPane().add(txtName);
		
		txtFolk = new JTextField();
		txtFolk.setText("test");
		txtFolk.setHorizontalAlignment(SwingConstants.CENTER);
		txtFolk.setFont(new Font("Ubuntu", Font.BOLD, 14));
		txtFolk.setColumns(10);
		txtFolk.setBounds(427, 102, 148, 27);
		frame.getContentPane().add(txtFolk);
		
		txtJob = new JTextField();
		txtJob.setText("test");
		txtJob.setHorizontalAlignment(SwingConstants.CENTER);
		txtJob.setFont(new Font("Ubuntu", Font.BOLD, 14));
		txtJob.setColumns(10);
		txtJob.setBounds(696, 102, 175, 27);
		frame.getContentPane().add(txtJob);
		
		txtGold = new JTextField();
		txtGold.setText("999");
		txtGold.setHorizontalAlignment(SwingConstants.CENTER);
		txtGold.setFont(new Font("Ubuntu", Font.BOLD, 14));
		txtGold.setColumns(10);
		txtGold.setBounds(883, 675, 104, 27);
		frame.getContentPane().add(txtGold);
		
		txtSilver = new JTextField();
		txtSilver.setText("999");
		txtSilver.setHorizontalAlignment(SwingConstants.CENTER);
		txtSilver.setFont(new Font("Ubuntu", Font.BOLD, 14));
		txtSilver.setColumns(10);
		txtSilver.setBounds(883, 760, 103, 27);
		frame.getContentPane().add(txtSilver);
		
		txtCopper = new JTextField();
		txtCopper.setText("999");
		txtCopper.setHorizontalAlignment(SwingConstants.CENTER);
		txtCopper.setFont(new Font("Ubuntu", Font.BOLD, 14));
		txtCopper.setColumns(10);
		txtCopper.setBounds(883, 851, 106, 27);
		frame.getContentPane().add(txtCopper);
	}	
	public void buttons() {
		
		JButton btnSave = new JButton("Speichern");
		btnSave.setBorder(UIManager.getBorder("CheckBox.border"));
		btnSave.setMargin(new Insets(2, 34, 2, 14));
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				if (event.getSource() == btnSave) {
					
					try{
					reload = true;
					File profile = new File("Playerstats.csv");
					profile.delete();
					FileOutputStream fos = new FileOutputStream(profile, true);
					PrintWriter pw = new PrintWriter(fos);
					
					pw.println(pi.strSkill[0] + "," + pi.skillFw[0]);
					pw.flush();
					pw.close();
					
					profile.createNewFile();
					System.out.println(profile.exists());
					}
						catch (IOException e){
							e.printStackTrace();
						}
					}
			
			
			
			}
		});
		btnSave.setIcon(new ImageIcon(Playermanager.class.getResource("/bilder/savebtn.png")));
		btnSave.setFont(new Font("Ubuntu", Font.BOLD, 14));
		btnSave.setBounds(20, 11, 135, 47);
		frame.getContentPane().add(btnSave);
		
		
		
		
		
		
	}
	public void background() {
		JLabel lblCharakterbogen = new JLabel("");
		lblCharakterbogen.setFocusable(false);
		lblCharakterbogen.setBounds(0, 0, 1376, 937);
		lblCharakterbogen.setIcon(new ImageIcon(Playermanager.class.getResource("/bilder/charakter bogen.png")));
		frame.getContentPane().add(lblCharakterbogen);
	}
}
