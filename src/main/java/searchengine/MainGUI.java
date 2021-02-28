package searchengine;

import java.awt.*;
import java.awt.event.*;

/** 
 * @comment this is the start of our GUI Search engine. 
 * @comment please note any changes you would like to make to this.
 * @author Alex Crawford
 *  */
public class MainGUI extends Frame implements ActionListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public Label searchBarLbl;
	private TextField searchBar;
	public Button searchBut;
	MainGUI(){
	
		setTitle("Main GUI - Proj 3");
		setLayout(new FlowLayout());
		setVisible(true); //set GUI visibility

		//search bar
		add(new Label("Enter Address: ", Label.RIGHT));
		searchBarLbl = new Label("Main Search Bar");
		searchBar = new TextField("", 15); //enter input
		searchBar.setEditable(true); // do you want user input
		add(searchBar);
		add(searchBarLbl);
		
		//Search Btn Settings
		Button searchBut = new Button("Search the Web");
		add(searchBut);
		searchBut.setLabel("click here to search");
		searchBut.getLabel();
		Button b2 = new Button("Add Files... ");

		b2.addActionListener((ActionEvent e) -> {  new Maintenance(); }); 
		add(b2);
		b2.getActionListeners();
		
		//LIST OF CHECK BOX GROUP 
	       final Label label = new Label();          
	       label.setAlignment(Label.RIGHT);  
	       label.setSize(400,100); 
	       label.setVisible(true);
		CheckboxGroup check = new CheckboxGroup();
		Checkbox checkBox1 = new Checkbox("All of the Search Terms", check, true); //check box ONE
		checkBox1.setBounds(100,1150,50,50);
		add(checkBox1);//BELOW ALL OF SEARCH TERMS
		checkBox1.addItemListener(new ItemListener() { // LISTENER FOR WHEN CHECKED
			public void itemStateChanged(ItemEvent e) {
				label.setText("All of the Search Terms: Checked");
			}
		});//BELOW ANY OF SEARCH TERMS
		Checkbox checkBox2 = new Checkbox("Any of the Search Terms", check, true); //check box TWO
		checkBox2.setBounds(100,1150,50,50);
		add(checkBox2);
		checkBox2.addItemListener(new ItemListener() {// LISTENER FOR WHEN CHECKED
			public void itemStateChanged(ItemEvent e) {
				label.setText("Any of the Search Terms: Checked");
			}
		});//BELOW EXACT PHRASE
		Checkbox checkBox3 = new Checkbox("Exact phrase", check, true); //check box THREE
		checkBox3.setBounds(100,1150,50,50);
		add(checkBox3);
		checkBox3.addItemListener(new ItemListener() {// LISTENER FOR WHEN CHECKED
			public void itemStateChanged(ItemEvent e) {
				label.setText("Exact Phrase: Checked");
			}
		});
		setVisible(true);
		
		addWindowListener( new WindowAdapter()
		{ //Interface close out
			public void windowClosing ( WindowEvent we )
			{ System.exit( 0 );}
		});
	}

public static void main(String[] Args) 
	{
		MainGUI frame = new MainGUI();
	}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}
}

