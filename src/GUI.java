

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GUI extends JFrame implements ActionListener {
	
	JLabel appointmentScreenTitle;
	JLabel editAppt;
	JLabel change;
	JLabel apptSearchLabel;
	JLabel enterDoctersName;
	JLabel filterLabel;
	JLabel logoOpeningScreen;
	JLabel searchResultsLabel;
	
	JRadioButton date;
	JRadioButton time;
	JRadioButton transfer;
	JRadioButton cancel;
	
	ButtonGroup options;
	
	JTextField enteredDoctorsName;
	JTextField enteredFilter;
	JTextField searchResults;
	JTextArea results;
	
	JButton saveChanges;
	JButton confirm;
	
	public static void main(String[] args) {
		new GUI();
	}
	
	public GUI() {
		//GUI setup 
		this.setTitle("Manage Medical Appointment");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1000, 600);
		this.setLayout(null);
		this.setResizable(false);
		
		//Show the opening page
		showFirstPage();
			
		//Background
		this.getContentPane().setBackground(Color.LIGHT_GRAY);
		this.setVisible(true);//keep last line
	}
	
	public void showFirstPage(){
		
		//top label 
		appointmentScreenTitle = new JLabel("Manage Appointment");
		appointmentScreenTitle.setBounds(290, 5, 700, 80);//(x, y, width, height)
		appointmentScreenTitle.setVisible(true);
		appointmentScreenTitle.setFont(new Font("Arial", Font.BOLD, 45));
		this.add(appointmentScreenTitle);
		
		//edit appt label 
		editAppt = new JLabel("Edit Appointment");
		editAppt.setBounds(150, 130, 250, 50);//(x, y, width, height)
		editAppt.setVisible(true);
		editAppt.setFont(new Font("Arial", Font.BOLD, 25));
		this.add(editAppt);
		
		//what would you like to edit label
		change = new JLabel("What would you like to change:");
		change.setBounds(65, 200, 250, 25);//(x, y, width, height)
		change.setVisible(true);
		change.setFont(new Font("Arial", Font.BOLD, 15));
		this.add(change);
		
		//warning label
		change = new JLabel("*select an appointment to edit before you click confim*");
		change.setBounds(65, 400, 450, 25);//(x, y, width, height)
		change.setVisible(true);
		change.setFont(new Font("Arial", Font.BOLD, 15));
		this.add(change);
		
		//edit appt label
		apptSearchLabel = new JLabel("Appointment Search");
		apptSearchLabel.setBounds(600, 130, 250, 50);//(x, y, width, height)
		apptSearchLabel.setVisible(true);
		apptSearchLabel.setFont(new Font("Arial", Font.BOLD, 25));
		this.add(apptSearchLabel);
		
		//doctors name logo
		enterDoctersName = new JLabel("Doctor's name:");
		enterDoctersName.setBounds(580, 220, 250, 25);//(x, y, width, height)
		enterDoctersName.setVisible(true);
		enterDoctersName.setFont(new Font("Arial", Font.BOLD, 15));
		this.add(enterDoctersName);
		
		//filter logo
		filterLabel = new JLabel("Filter by:");
		filterLabel.setBounds(580, 290, 250, 25);//(x, y, width, height)
		filterLabel.setVisible(true);
		filterLabel.setFont(new Font("Arial", Font.BOLD, 15));
		this.add(filterLabel);
		
		searchResultsLabel = new JLabel("Search Results:");
		searchResultsLabel.setBounds(775, 200, 200, 25);//(x, y, width, height)
		searchResultsLabel.setVisible(true);
		searchResultsLabel.setFont(new Font("Arial", Font.BOLD, 18));
		this.add(searchResultsLabel);
		
		//JRadio buttons
		date = new JRadioButton("Date");
		date.setBounds(80, 245, 75, 25);
		date.setVisible(true);
		date.setEnabled(true);
//		doctorTwo.addActionListener(this);
		this.add(date);
		
		time = new JRadioButton("Time");
		time.setBounds(170, 245, 75, 25);
		time.setVisible(true);
		time.setEnabled(true);
//		doctorTwo.addActionListener(this);
		this.add(time);
		
		transfer = new JRadioButton("Transfer Patient");
		transfer.setBounds(80, 295, 130, 25);
		transfer.setVisible(true);
		transfer.setEnabled(true);
//		doctorTwo.addActionListener(this);
		this.add(transfer);
		
		cancel = new JRadioButton("Cancel appointment");
		cancel.setBounds(80, 345, 140, 25);
		cancel.setVisible(true);
		cancel.setEnabled(true);
//		doctorTwo.addActionListener(this);
		this.add(cancel);
		
		options = new ButtonGroup();
		options.add(date);
		options.add(time);
		options.add(transfer);
		options.add(cancel);
		
		//JButtons
		saveChanges = new JButton("Back");
		saveChanges.setBounds(360, 470, 100, 50);//(x, y, width, height)
		saveChanges.setFont(new Font("Arial", Font.BOLD, 25));
		this.add(saveChanges);
		
		confirm = new JButton("Confirm");
		confirm.setBounds(510, 470, 100, 50);//(x, y, width, height)
		confirm.setFont(new Font("Arial", Font.BOLD, 15));
		this.add(confirm);
		
		//textfields
		enteredDoctorsName = new JTextField();
		enteredDoctorsName.setBounds(580, 250, 150, 25);
		enteredDoctorsName.setVisible(true);
		this.add(enteredDoctorsName);
		
		//filter
		enteredFilter = new JTextField();
		enteredFilter.setBounds(580, 320, 150, 25);
		enteredFilter.setVisible(true);
		this.add(enteredFilter);
		
		//JTextArea
		results = new JTextArea();
		results.setBounds(775, 240, 150, 175);
		results.setVisible(true);
		this.add(results);
		
		//Images
		logoOpeningScreen = new JLabel(new ImageIcon("logo2.png"));
		logoOpeningScreen.setToolTipText("Advocate Medical Logo");
		logoOpeningScreen.setVisible(true);
		logoOpeningScreen.setBounds(870, 2, 120, 120);
		this.add(logoOpeningScreen);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
