package searchengine;
import java.awt.event.*;
import java.awt.*;

public class Maintenance extends Frame implements ActionListener {
	private Label maintenenceLabel;
	private Button removeFiles;
	private Button addFile;
	Maintenance(){
		setTitle("Maintenance");
		//TODOSet String Search Engine - Index Maintenance	
		
		setLayout(new FlowLayout());
		setVisible(true); //set GUI visibility

		//TODOinclude string show number of files indexed
		//TODOsearch engine version string
		
		Button addFile = new Button("Add File...");
		add(addFile);
		Button rebuild = new Button("Rebuild Out-of-Date");
		add(rebuild);
		Button removeSelected = new Button("Remove Selected Files");
		add(removeSelected);
		
		addWindowListener( new WindowAdapter()
		{ //Interface close out
			public void windowClosing ( WindowEvent we )
			{ System.exit( 0 );}
		});
	}
//Search Engine - Index Maintanence
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
