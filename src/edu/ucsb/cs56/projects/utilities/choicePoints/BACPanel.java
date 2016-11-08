package edu.ucsb.cs56.projects.utilities.choicePoints;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import java.lang.*;

/** BACPanel for our SimpleGui BAC Calculator application
    @author Dominic Kirby and Hernan Duran
    @version CS56 F16
*/


public class BACPanel extends JPanel{
    
    JTextField weightField;
    JTextField hoursField;
    
    static JTextArea BACArea;
    static JScrollPane scroller;
    
    JComboBox weightUnits;
    JComboBox gender;
    JComboBox beer;
    JComboBox wine;
    JComboBox hardLiquor;
    JComboBox beerType;
    JComboBox wineType;
    JComboBox liqType;
    
    JPanel display;
    
    public BACPanel(){
	super(new BorderLayout());
	
	JPanel labelPanel = new JPanel(new GridLayout(10,1));
	JPanel fieldPanel = new JPanel(new GridLayout(10,1));
	display = new JPanel();
	
	add(labelPanel, BorderLayout.WEST);
	add(fieldPanel, BorderLayout.CENTER);
	add(display, BorderLayout.SOUTH);
	 
	//create a weight label & text field
	weightField = new JTextField();
	weightField.setColumns(10);	 
	
	JLabel weightLabel = new JLabel("Weight ",JLabel.RIGHT);
	weightLabel.setLabelFor(weightField);

	labelPanel.add(weightLabel);
	 
	JPanel weightPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
	weightPanel.add(weightField);
	fieldPanel.add(weightPanel);

	//create a lbs/kgs combo box
	String weightArray[] = {"Pounds", "Kilograms"};
	
	weightUnits = new JComboBox(weightArray);
	
	JLabel weightUnitsLabel = new JLabel("Units",JLabel.RIGHT);
	weightUnitsLabel.setLabelFor(weightUnits);
	labelPanel.add(weightUnitsLabel);
	
	JPanel weightUnitsPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
	weightUnitsPanel.add(weightUnits);
	fieldPanel.add(weightUnitsPanel);
	
	//create a hours text field and panel
	hoursField = new JTextField();
	hoursField.setColumns(10);	 
	
	JLabel hoursLabel = new JLabel("Hours Drinking",JLabel.RIGHT);
	hoursLabel.setLabelFor(hoursField);
	
	labelPanel.add(hoursLabel);
	
	JPanel hoursPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
	hoursPanel.add(hoursField);
	fieldPanel.add(hoursPanel); 
	
	//create a male/female combo box
	String genderArray[] = {"Male", "Female"};
	
	gender = new JComboBox(genderArray);
	
	JLabel genderLabel = new JLabel("Gender",JLabel.RIGHT);
	genderLabel.setLabelFor(gender);
	labelPanel.add(genderLabel);
	
	JPanel genderPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
	genderPanel.add(gender);
	fieldPanel.add(genderPanel); 
	
	//create a beer label
	String number[]  = {"0","1","2","3","4","5","6","7","8","9",
			    "10","11","12","13","14","15","16","17",
			    "18","19","20","21","22","23","24","25"};
	
	beer = new JComboBox(number);
	 
	JLabel beerLabel = new JLabel("# of Beers",JLabel.RIGHT);
	beerLabel.setLabelFor(beer);
	labelPanel.add(beerLabel);
	
	JPanel beerPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
	beerPanel.add(beer);
	fieldPanel.add(beerPanel); 

		//create a type of beer label
	String types[] = {"Coors Light", "Milwaukee's Best Ice",
			  "Keystone Ice", "Big Flats Light Beer",
			  "Natural Ice", "Natural Light",
			  "Bud Light Platinum", "Miller Lite","Other"};
	double typePercentages[] = {.042, .059, .059, .039,.059, .042,
				    .06, .042, .05};
	int amountOfBrands = 9;

	beerType = new JComboBox(types);

	JLabel beerTypeLabel = new JLabel("Brand of Beer", JLabel.RIGHT);
	beerTypeLabel.setLabelFor(beerType);
	labelPanel.add(beerTypeLabel);

	JPanel beerTypePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
	beerTypePanel.add(beerType);
	fieldPanel.add(beerTypePanel);
			  
	
	
	//create a wine label
	wine = new JComboBox(number);
	
	JLabel wineLabel = new JLabel("Glasses of Wine",JLabel.RIGHT);
	beerLabel.setLabelFor(wine);
	labelPanel.add(wineLabel);
	
	JPanel winePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
	winePanel.add(wine);
	fieldPanel.add(winePanel); 


		//create a type of wine label
	String wtypes[] = {"Moscato d'Asti", "Muscadet",
			  "Pinot Grigio", "Bordeaux",
			  "Sauvignon Blanc", "Pinot Noir",
			  "Shiraz", "Zinfandel","Other"};
	double wtypePercentages[] = {.055, .095, .14, .135, .125, .13,
				    .13, .18, .12};
	int wamountOfBrands = 9;

	wineType = new JComboBox(wtypes);

	JLabel wineTypeLabel = new JLabel("Type of Wine", JLabel.RIGHT);
	wineTypeLabel.setLabelFor(wineType);
	labelPanel.add(wineTypeLabel);

	JPanel wineTypePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
	wineTypePanel.add(wineType);
	fieldPanel.add(wineTypePanel);


	
	//create a Hard Liquor label
	hardLiquor = new JComboBox(number);
	
	JLabel hardLiquorLabel = new JLabel("Hard Liquor Shots",JLabel.RIGHT);
	beerLabel.setLabelFor(hardLiquor);
	labelPanel.add(hardLiquorLabel);
	
	JPanel liquorPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
	liquorPanel.add(hardLiquor);
	fieldPanel.add(liquorPanel);

	//create a type of liquor label
	String ltypes[] = {"Bourbon", "Brandy",
			  "Everclear", "Gin",
			  "Rum", "Sake",
			  "Tequila", "Whiskey","Other"};
	double ltypePercentages[] = {.51, .4, .8, .375, .42, .15,
				    .47, .533, .45};
	int lamountOfBrands = 9;

	liqType = new JComboBox(ltypes);

	JLabel liqTypeLabel = new JLabel("Type of Liquor", JLabel.RIGHT);
	liqTypeLabel.setLabelFor(liqType);
	labelPanel.add(liqTypeLabel);

	JPanel liqTypePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
	liqTypePanel.add(liqType);
	fieldPanel.add(liqTypePanel);
	
	BACArea = new JTextArea(10, 20);
	BACArea.setLineWrap(true);
	BACArea.setRows(15);
	
	scroller = new JScrollPane(BACArea);
	scroller.setVerticalScrollBarPolicy
	    (ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
	scroller.setHorizontalScrollBarPolicy
	    (ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
	
	display.add(scroller);
	
	JButton submit = new JButton("Calculate BAC");
	
	submit.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		    BACArea.setText(null);
		    boolean isMale;
		    String gender1 = (String) gender.getSelectedItem();
		    int hours;
		    int weight;
		    try
			{
			    hours = Integer.parseInt(hoursField.getText());
			    weight = Integer.parseInt(weightField.getText());
			}
		    catch (NumberFormatException nfe)
			{
			    hours = -1;
			    weight = -1;
			}
		    
		    boolean isKilograms = false;
		    String lbsOrKg = (String) weightUnits.getSelectedItem();
		    String bType = (String) beerType.getSelectedItem();
		    String wType = (String) wineType.getSelectedItem();
		    String lType = (String) liqType.getSelectedItem();
		    int beer1 = Integer.parseInt
			((String) beer.getSelectedItem());
		    int wine1 = Integer.parseInt
			((String) wine.getSelectedItem());
		    int hardLiquor1 = Integer.parseInt
			((String) hardLiquor.getSelectedItem());
		    
		    int index = 0;
		    for(int j = 0; j < amountOfBrands; j++)
			if(types[j].equals(bType))
			    index = j;
		    double beerAlcoholPercentage = typePercentages[index];


		    int windex = 0;
		    for(int j = 0; j < wamountOfBrands; j++)
			if(wtypes[j].equals(wType))
			    windex = j;
		    double wineAlcoholPercentage = wtypePercentages[windex];

		    int lindex = 0;
		    for(int j = 0; j < lamountOfBrands; j++)
			if(ltypes[j].equals(lType))
			    lindex = j;
		    double liqAlcoholPercentage = ltypePercentages[lindex];
		    
		    isMale = gender1.equals("Male") ? true : false ;
		    isKilograms = lbsOrKg.equals("Kilograms") ? true : false ;
		    
		    double BAC = Calc.BAC
			(isMale,
			 hours,
			 weight,
			 isKilograms,
			 beer1,
			 beerAlcoholPercentage,
			 wine1,
			 wineAlcoholPercentage,
			 hardLiquor1,
			 liqAlcoholPercentage);
		    
		    BACArea.append(BACMessage.GuiMessage(BAC) + "\n");
		}
	    });
	
	display.add(submit);	
    }
}
