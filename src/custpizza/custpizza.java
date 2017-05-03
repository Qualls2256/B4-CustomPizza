package custpizza;

import java.awt.CheckboxGroup;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class custpizza extends javax.swing.JFrame {
	private static final long serialVersionUID = 1L;
	// field instance or class variables

	JPanel size = new JPanel();
	JPanel crust = new JPanel();
	JPanel topp = new JPanel();

	ButtonGroup sizegroup = new ButtonGroup();
	JRadioButton small = new JRadioButton("small $5.00");
	JRadioButton med = new JRadioButton("medium $6.00");
	JRadioButton large = new JRadioButton("large $7.00");

	ButtonGroup crustgroup = new ButtonGroup();
	JRadioButton thin = new JRadioButton("thin crust +$0.00");
	JRadioButton thick = new JRadioButton("thick crust +$1.00");

	JCheckBox cheese = new JCheckBox("extra cheese");
	JCheckBox olives = new JCheckBox("olives");
	JCheckBox mushrooms = new JCheckBox("mushrooms");
	JCheckBox onions = new JCheckBox("onions");
	JCheckBox peppers = new JCheckBox("peppers");
	JCheckBox tomatoes = new JCheckBox("tomatoes");

	ButtonGroup where = new ButtonGroup();
	JRadioButton in = new JRadioButton("eat in");
	JRadioButton out = new JRadioButton("to go");
	JButton build = new JButton("Confirm Pizza");
	JButton Exit = new JButton("EXIT");
	///////////////////
	///////////////////

	String psize;
	String pcrust;
	String pwhere;
	JCheckBox[] topping = new JCheckBox[6];
	float Price = 0;
	ArrayList<String> tp = new ArrayList<>(); 
	int ic =0;
	int tpsize = 0;

	
	
	
	JFrame exit = new JFrame("Alert");
	JButton exit2 = new JButton("EXIT");
	JButton cancel = new JButton("CANCEL");
	///////////////////
	///////////////////

	// construct

	public custpizza() {
		setTitle("Build Custom Pizza");
		setResizable(false);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				exitform(e);
			}
		});

		setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		 // gives spacing left right top
												// bottom

		size.setLayout(new GridBagLayout());
		size.setBorder(BorderFactory.createTitledBorder("SIZE"));
		sizegroup.add(small);
		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.anchor = GridBagConstraints.WEST;
		size.add(small, gbc);
		small.setSelected(true);
		small.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent sizee) {
				sizeaction(sizee);
			}
		});
		sizegroup.add(med);
		gbc.gridy = 1;
		gbc.anchor = GridBagConstraints.WEST;
		size.add(med, gbc);
		med.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent sizee) {
				sizeaction(sizee);
			}
		});
		sizegroup.add(large);
		gbc.gridy = 2;
		gbc.anchor = GridBagConstraints.WEST;
		size.add(large, gbc);

		large.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent sizee) {
				sizeaction(sizee);
			}
		});
		
		//////////////////////SIZE
		crust.setLayout(new GridBagLayout());
		crust.setBorder(BorderFactory.createTitledBorder("CRUST"));
		crustgroup.add(thin);
		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.anchor = GridBagConstraints.WEST;
		crust.add(thin, gbc);
		thin.setSelected(true);
		thin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent sizee) {
				sizeaction(sizee);
			}
		});
		crustgroup.add(thick);
		gbc.gridy = 1;
		gbc.anchor = GridBagConstraints.WEST;
		crust.add(thick, gbc);
		thick.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent cruste) {
				crustaction(cruste);
			}

		});
		
		////////////////////CRUST
		topp.setLayout(new GridBagLayout());
		topp.setBorder(BorderFactory.createTitledBorder("TOPPINGS (+$0.50 ea)"));
		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.anchor = GridBagConstraints.WEST;
		topp.add(cheese, gbc);
		cheese.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent toppe) {
				toppaction(toppe);
			}
		});
		gbc.gridy = 1;
		gbc.anchor = GridBagConstraints.WEST;
		topp.add(olives, gbc);
		olives.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent toppe) {
				toppaction(toppe);
			}
		});
		gbc.gridy = 2;
		gbc.anchor = GridBagConstraints.WEST;
		topp.add(onions, gbc);
		onions.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent toppe) {
				toppaction(toppe);
			}
		});
		gbc.gridx=1;
		gbc.gridy = 0;
		gbc.anchor = GridBagConstraints.WEST;
		topp.add(peppers, gbc);
		peppers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent toppe) {
				toppaction(toppe);
			}
		});
		gbc.gridy = 1;
		gbc.anchor = GridBagConstraints.WEST;
		topp.add(mushrooms, gbc);
		mushrooms.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent toppe) {
				toppaction(toppe);
			}
		});
		gbc.gridy = 2;
		gbc.anchor = GridBagConstraints.WEST;
		topp.add(tomatoes, gbc);
		tomatoes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent toppe) {
				toppaction(toppe);
			}
		});
		
		//////////////////TOPP
		

		where.add(in);
		gbc = new GridBagConstraints();
		gbc.gridx = 1;
		gbc.gridy = 1;
		gbc.anchor = GridBagConstraints.WEST;
		in.setSelected(true);
		in.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent wheree) {
				whereaction(wheree);
			}

		});	
		where.add(out);
		getContentPane().add(in,gbc);
		gbc.gridx = 2;
		getContentPane().add(out,gbc);
		out.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent wheree) {
				whereaction(wheree);
			}

		});
		
		gbc.insets = new Insets(5, 5, 5, 5);
		gbc.gridx=0;
		gbc.gridy=0;
		getContentPane().add(size,gbc);
		gbc.gridx=0;
		gbc.gridy=1;
		getContentPane().add(crust,gbc);
		gbc.gridy=0;
		gbc.gridx=1;
		gbc.gridwidth=(2);
		getContentPane().add(topp,gbc);
		gbc = new GridBagConstraints();
		gbc.insets = new Insets(5, 5, 5, 5);
		gbc.gridy=2;
		gbc.gridx=1;
		getContentPane().add(build,gbc);
		build.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent makee) {
				makeaction(makee);
			}

		});
		gbc.gridx=2;
		getContentPane().add(Exit,gbc);
		Exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exitforme(e);
			}

		});
			
		// pack();
		setSize(800, 500);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize(); //// CENTER
		setBounds((int) (0.5 * (screenSize.width - getWidth())), (int) (0.5 * (screenSize.height - getHeight())),
				getWidth(), getHeight()); ///// CENTER
		
		setDefaultLookAndFeelDecorated(true);
		
		
		psize = small.getText();
		pcrust = thin.getText();
		pwhere = in.getText();
		
		topping[0]=cheese;
		topping[1]=olives;
		topping[2]=onions;
		topping[3]=peppers;
		topping[4]=mushrooms;
		topping[5]=tomatoes;
	}

	private void sizeaction(ActionEvent sizee) {
		psize = sizee.getActionCommand();
	}
	// stub
	private void crustaction(ActionEvent cruste) {
		pcrust = cruste.getActionCommand();
		
	}
	private void toppaction(ActionEvent toppe) {
		if (tp.contains(toppe.getActionCommand())){
		tp.remove(toppe.getActionCommand());
			
		}
		else{
		tp.add(toppe.getActionCommand());
			
		}
		
	}
	public void exitform(WindowEvent e) {
		///
		///
		/// are you sure do you want to save
		/*
		exit.setLayout(new GridBagLayout());
		GridBagConstraints gbc2 = new GridBagConstraints();
		gbc2.gridx=1;
		gbc2.gridy=1;
		exit.add(exit,gbc2);
		gbc2.gridx=0;
		exit.add(cancel,gbc2);
		System.out.println("e");
		
		exit.setSize(800, 500);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize(); //// CENTER
		exit.setBounds((int) (0.5 * (screenSize.width - getWidth())), (int) (0.5 * (screenSize.height - getHeight())),
				getWidth(), getHeight()); ///// CENTER
		exit.setVisible(true);
		*/
		///
	}
	public void exitforme(ActionEvent e) {
		System.exit(0);
	}
	
	
	private void whereaction(ActionEvent wheree) {
		pwhere = wheree.getActionCommand();
	}

	private void makeaction(ActionEvent makee) {
		float price = 0;
		float tpprice = 0;
		if (psize.equals(small.getText())){
			price = price + 5;
		}else if(psize.equals(med.getText())){
			price = price + 6;
		}else if(psize.equals(large.getText())){
			price = price + 7;
		}
		if(pcrust.equals(thick.getText())){
			price = price + 1;
		}
		if(true){
			//String asdf = new String();
			//asdf = Integer.toString(tp.size());
			//System.out.println(asdf);
			tpprice += (tp.size() * .5);
			System.out.println(tpprice);
		}
		price = price + tpprice;
		
		
		
		JOptionPane.showMessageDialog(null,pwhere+"\n"+psize+"\n"+pcrust+"\n"+tp+"( +$0.50 ea)" + "\n" + price + "0");
		
	}

	public static void main(String[] args) {

		new custpizza().setVisible(true);

	}

}// end custpizza
