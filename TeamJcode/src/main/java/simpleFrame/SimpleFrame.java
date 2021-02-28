package simpleFrame;
import java.awt.*;
import java.awt.event.*;
/** 
 * @comment this is the start of our GUI Search engine. 
 * @comment please note any changes you would like to make to this.
 * @author Alex Crawford
 *  */
public class SimpleFrame extends Frame {
//	implements ActionListener, WindowListener{
	private Label searchBarLbl;
	private TextField searchBar;
	private Button searchBut;
	SimpleFrame(){
		
		setTitle("Team Jcode - Proj 3");
		setLayout(new FlowLayout());
		setVisible(true); //set GUI visibility

		//search bar
		add(new Label("Enter Address: ", Label.RIGHT));
		searchBarLbl = new Label("Search Bar");
		searchBar = new TextField("       Search here     ", 0);
		searchBar.setEditable(false);
		add(searchBar);
		//Search Btn Settings
		Button searchBut = new Button("Search the Web");
		add(searchBut);
		searchBut.setLabel("click here to search");
		searchBut.getLabel();
		Button b2 = new Button("null text");
		add(b2);//create
		

		
		addWindowListener( new WindowAdapter()
		{ //Interface close out
			public void windowClosing ( WindowEvent we )
			{ System.exit( 0 );}
		});
	}
	
public static void main(String args[]) 
	{
		SimpleFrame frame = new SimpleFrame();
	}
}

