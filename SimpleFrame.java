package simpleFrame;
import java.awt.*;
import java.awt.event.*;

public class SimpleFrame extends Frame {
//	implements ActionListener, WindowListener{
	private Label searchBarLbl;
	private TextField searchBar;
	private Button btnColor;
	//SimpleFrame(){
		
		setTitle("Team Jcode - Proj 3");
		setLayout(new FlowLayout());
		setVisible(true); //set GUI visibility
		//Color Settings
		Button btnColor = new Button("red");
		add(btnColor);
		btnColor.setLabel("red button color");
		btnColor.getLabel();
		//search bar
		add(new Label("Enter Address: ", Label.RIGHT));
		searchBarLbl = new Label("Search Bar");
		searchBar = new TextField("       Search here     ", 0);
		searchBar.setEditable(false);
		add(searchBar);
		Button b1 = new Button("ENTER");
		add(b1);//create
		//end of search bar options
		
		Button b2 = new Button("null text");
		add(b2);//create
		

		
		addWindowListener( new WindowAdapter()
		{ //Interface close out
			public void windowClosing ( WindowEvent we )
			{ System.exit( 0 );}
		}
		);
	}
	
public static void main(String args[]) {
SimpleFrame frame = new SimpleFrame();
}
}

