import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * Application to allow patients to sign up for a doctors appointment.
 * @author Bradley Prokop
 */
public class AppDriver extends JFrame implements ActionListener{
	
	JLabel openingScreen;
	JLabel logoOpeningScreen;
	JLabel appointmentScreenTitle;
	JLabel avaliableTimes;
	JLabel contactDescription;
	JLabel enterYourName;
	JLabel enterYourAge;
	JLabel enterYourGender;
	JLabel enterYourPhoneNumber;
	JLabel selectYourDoc;
	JLabel notesForVisit;
	JLabel logoSecondPage;
	JLabel reciptTitle;
	JLabel patientInfo;
	JLabel thankYouNote;
	JLabel enterDate;
	
	JButton initiateNewAppointment;
	JButton homePage;
	JButton confirmAppointment;
	
	JTextField enteredPatientName;
	JTextField enteredPatientAge;
	JTextField enteredPatientGender;
	JTextField enteredPatientPhoneNumber;
	JTextArea enteredNotesForVisit;
	JTextField enteredDateForAppointment;
	
	JRadioButton doctorOne;
	JRadioButton doctorTwo;
	JRadioButton doctorThree;
	JRadioButton doctorFour;
	JRadioButton randomDoctor;
	
	ButtonGroup doctors;

	public static void main(String[] args) {
		new AppDriver();
	}
	
	public AppDriver() {
		//GUI setup 
		this.setTitle("Medical Appointment Maker");
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
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==initiateNewAppointment){
			hideFirstPage();
			showSecondPage();
		}
		if(e.getSource()==homePage) {
			showFirstPage();
			hideSecondPage();
		}
		if(e.getSource()==confirmAppointment) {
			showRecipt();
		}
	 
	}//end method
	
	/**
	 * The purpose of this method is to display all components of the first screen.
	 */
	public void showFirstPage() {
		//Labels 
		//Opening screen label 
		openingScreen = new JLabel("Advocate Appointments");
		openingScreen.setBounds(200, 5, 700, 80);//(x, y, width, height)
		openingScreen.setVisible(true);
		openingScreen.setFont(new Font("Arial", Font.BOLD, 50));
		this.add(openingScreen);
		
		//IMAGES 
		//Logos & images
		logoOpeningScreen = new JLabel(new ImageIcon("logo.png"));
		logoOpeningScreen.setToolTipText("Advocate Medical Logo");
		logoOpeningScreen.setVisible(true);
		logoOpeningScreen.setBounds(325, 160, 320, 175);
		this.add(logoOpeningScreen);
		
		//BUTTONS 
		//button to start the scheduling
		initiateNewAppointment = new JButton("Schedule an Appointment Today!");
		initiateNewAppointment.setBounds(200, 420, 550, 100);//(x, y, width, height)
		initiateNewAppointment.setFont(new Font("Arial", Font.BOLD, 30));
		initiateNewAppointment.setVisible(true);
		initiateNewAppointment.setEnabled(true);
		this.add(initiateNewAppointment);
		initiateNewAppointment.addActionListener(this);
	}
	
	/**
	 * The purpose of this method is to hide and disable all components of the first screen.
	 */
	public void hideFirstPage(){
		//Labels
		openingScreen.setVisible(false);
		//Images
		logoOpeningScreen.setVisible(false);
		//Button
		initiateNewAppointment.setVisible(false);
		initiateNewAppointment.setEnabled(false);
	}
	
	/**
	 * The goal of this method is to display and enable all components for the second page
	 */
	public void showSecondPage() {
		
		//LABELS
		
		//Title label second screen
		appointmentScreenTitle = new JLabel("Schedule an Appointment!");
		appointmentScreenTitle.setBounds(200, 5, 700, 80);//(x, y, width, height)
		appointmentScreenTitle.setVisible(true);
		appointmentScreenTitle.setFont(new Font("Arial", Font.BOLD, 45));
		this.add(appointmentScreenTitle);
		//Contact label
		contactDescription = new JLabel("Contact info");
		contactDescription.setBounds(130, 170, 175, 50);//(x, y, width, height)
		contactDescription.setVisible(true);
		contactDescription.setFont(new Font("Arial", Font.BOLD, 30));
		this.add(contactDescription);
		//Enter name label 
		enterYourName = new JLabel("Enter first & last name:");
		enterYourName.setBounds(50, 250, 161, 25);//(x, y, width, height)
		enterYourName.setVisible(true);
		enterYourName.setFont(new Font("Arial", Font.BOLD, 15));
		this.add(enterYourName);
		//Enter age label 
		enterYourAge = new JLabel("Enter your age: ");
		enterYourAge.setBounds(50, 300, 161, 25);//(x, y, width, height)
		enterYourAge.setVisible(true);
		enterYourAge.setFont(new Font("Arial", Font.BOLD, 15));
		this.add(enterYourAge);
		//Enter gender label 
		enterYourGender = new JLabel("Enter your gender: ");
		enterYourGender.setBounds(50, 350, 161, 25);//(x, y, width, height)
		enterYourGender.setVisible(true);
		enterYourGender.setFont(new Font("Arial", Font.BOLD, 15));
		this.add(enterYourGender);
		//Enter phone number label 
		enterYourPhoneNumber = new JLabel("Enter your phone number: ");
		enterYourPhoneNumber.setBounds(50, 400, 189, 25);//(x, y, width, height)
		enterYourPhoneNumber.setVisible(true);
		enterYourPhoneNumber.setFont(new Font("Arial", Font.BOLD, 15));
		this.add(enterYourPhoneNumber);
		//Select doctor
		selectYourDoc = new JLabel("Select Your Preffered Doctor:");
		selectYourDoc.setBounds(630, 130, 300, 50);//(x, y, width, height)
		selectYourDoc.setVisible(true);
		selectYourDoc.setFont(new Font("Arial", Font.BOLD, 20));
		this.add(selectYourDoc);
		//Notes for visit label
		notesForVisit = new JLabel("Notes for Appointment:");
		notesForVisit.setBounds(760, 205, 250, 50);//(x, y, width, height)
		notesForVisit.setVisible(true);
		notesForVisit.setFont(new Font("Arial", Font.BOLD, 14));
		this.add(notesForVisit);
		//Date for visit label
		enterDate = new JLabel("Date for appointment:");
		enterDate.setBounds(760, 350, 300, 50);//(x, y, width, height)
		enterDate.setVisible(true);
		enterDate.setFont(new Font("Arial", Font.BOLD, 14));
		this.add(enterDate);
		
		//Text fields
		//Enter name text field
		enteredPatientName = new JTextField();
		enteredPatientName.setBounds(265, 250, 200, 25);
		enteredPatientName.setVisible(true);
		this.add(enteredPatientName);
		//Enter age text field
		enteredPatientAge = new JTextField();
		enteredPatientAge.setBounds(265, 300, 200, 25);
		enteredPatientAge.setVisible(true);
		this.add(enteredPatientAge);
		//Enter gender text field
		enteredPatientGender = new JTextField();
		enteredPatientGender.setBounds(265, 350, 200, 25);
		enteredPatientGender.setVisible(true);
		this.add(enteredPatientGender);
		//Enter phone number text field
		enteredPatientPhoneNumber = new JTextField();
		enteredPatientPhoneNumber.setBounds(265, 400, 200, 25);
		enteredPatientPhoneNumber.setVisible(true);
		this.add(enteredPatientPhoneNumber);
		//Enter notes for visit
		enteredNotesForVisit = new JTextArea();
		enteredNotesForVisit.setBounds(760, 250, 200, 75);
		enteredNotesForVisit.setVisible(true);
		this.add(enteredNotesForVisit);
		//Enter date for visit
		enteredDateForAppointment = new JTextField();
		enteredDateForAppointment.setBounds(760, 400, 150, 25);
		enteredDateForAppointment.setVisible(true);
		this.add(enteredDateForAppointment);
		
		//RadioButtons & ButtonGroup 
		
		//doctorOne
		doctorOne = new JRadioButton("Ryan G. Allen");
		doctorOne.setBounds(600, 200, 100, 25);
		doctorOne.setVisible(true);
		doctorOne.setEnabled(true);
		doctorOne.addActionListener(this);
		this.add(doctorOne);
		//doctor two 
		doctorTwo = new JRadioButton("Chris T. Jefferson");
		doctorTwo.setBounds(600, 250, 130, 25);
		doctorTwo.setVisible(true);
		doctorOne.setEnabled(true);
		doctorTwo.addActionListener(this);
		this.add(doctorTwo);
		//doctor three
		doctorThree = new JRadioButton("John V. Smith");
		doctorThree.setBounds(600, 300, 110, 25);
		doctorThree.setVisible(true);
		doctorOne.setEnabled(true);
		doctorThree.addActionListener(this);
		this.add(doctorThree);
		//Gail
		doctorFour = new JRadioButton("Gail L. Prokop");
		doctorFour.setBounds(600, 350, 110, 25);
		doctorFour.setVisible(true);
		doctorOne.setEnabled(true);
		doctorFour.addActionListener(this);
		this.add(doctorFour);
		//Random
		randomDoctor = new JRadioButton("No prefrence");
		randomDoctor.setBounds(600, 400, 110, 25);
		randomDoctor.setVisible(true);
		doctorOne.setEnabled(true);
		randomDoctor.addActionListener(this);
		this.add(randomDoctor);
		//Add buttons to the button group
		doctors = new ButtonGroup();
		doctors.add(doctorOne);
		doctors.add(doctorTwo);
		doctors.add(doctorThree);
		doctors.add(doctorFour);
		doctors.add(randomDoctor);
		
		//BUTTONS
		
		//Back Button  
		homePage = new JButton("Back");
		homePage.setBounds(340, 470, 100, 50);//(x, y, width, height)
		homePage.setFont(new Font("Arial", Font.BOLD, 25));
		homePage.setVisible(true);
		homePage.setEnabled(true);
		this.add(homePage);
		homePage.addActionListener(this);
		//CONFIRM APPOINTMENT BUTTON
		confirmAppointment = new JButton("Confirm Appointment");
		confirmAppointment.setBounds(450, 470, 155, 50);//(x, y, width, height)
		confirmAppointment.setFont(new Font("Arial", Font.BOLD, 12));
		confirmAppointment.setVisible(true);
		confirmAppointment.setEnabled(true);
		confirmAppointment.addActionListener(this);
		this.add(confirmAppointment);
		
		//Images
		logoSecondPage = new JLabel(new ImageIcon("logo2.png"));
		logoSecondPage.setToolTipText("Advocate Medical Logo");
		logoSecondPage.setVisible(true);
		logoSecondPage.setBounds(1, 0, 120, 120);//440 to have the picture on the bottom corner
		this.add(logoSecondPage);
	}
	
	/**
	 * The goal of this method is to hide and disable all components for the second page
	 */
	public void hideSecondPage() {
		//Labels
		appointmentScreenTitle.setVisible(false);
		contactDescription.setVisible(false);
		enterYourName.setVisible(false);
		enterYourAge.setVisible(false);
		enterYourGender.setVisible(false);
		enterYourPhoneNumber.setVisible(false);
		selectYourDoc.setVisible(false);
		notesForVisit.setVisible(false);
		enterDate.setVisible(false);
		
		//Text fields
		enteredPatientName.setVisible(false);
		enteredPatientAge.setVisible(false);
		enteredPatientGender.setVisible(false);
		enteredPatientPhoneNumber.setVisible(false);
		enteredNotesForVisit.setVisible(false);
		enteredDateForAppointment.setVisible(false);
		
		//Buttons
		homePage.setVisible(false);
		confirmAppointment.setVisible(false);
		
		//Radio Buttons
		doctorOne.setVisible(false);
		doctorOne.setEnabled(false);
		doctorTwo.setVisible(false);
		doctorTwo.setEnabled(false);
		doctorThree.setVisible(false);
		doctorThree.setEnabled(false);
		doctorFour.setVisible(false);
		doctorFour.setEnabled(false);
		doctorFour.setVisible(false);
		doctorFour.setEnabled(false);
		randomDoctor.setVisible(false);
		
		//Images
		logoSecondPage.setVisible(false);
	}

	/**
	 * Shows a receipt with all the info 
	 */
	public void showRecipt() {
		//Hide the first page
		hideSecondPage();
		
		//Bring in the data from the components
		String name = enteredPatientName.getText();
		int age = Integer.parseInt(enteredPatientAge.getText());
		String gender = enteredPatientGender.getText();
		String phoneNum = enteredPatientPhoneNumber.getText();
		String noteFromPatient = enteredNotesForVisit.getText();
		String dateOfAppt = enteredDateForAppointment.getText();
		
		//Create the patient object
		Patient pat = new Patient(name, age, gender, phoneNum, dateOfAppt);
		
		if(doctors.getSelection()==randomDoctor.getModel()||doctors.getSelection()==null) {
			Random r = new Random();
			int docNumber = r.nextInt(4);

			switch(docNumber) {
			case 0:
				//Patient & appointment info label
				patientInfo = new JLabel(pat.toString()+"<html><br/><br/>Appointment Notes: <html>"+noteFromPatient+"<html><br/><br/>Doctor for Appointment:		<html>"+doctorOne.getText());
				patientInfo.setBounds(200, 100, 500, 300);//(x, y, width, height)
				patientInfo.setFont(new Font("Arial", Font.PLAIN, 20));
				this.add(patientInfo);
				break;
			case 1:
				//Patient & appointment info label
				patientInfo = new JLabel(pat.toString()+"<html><br/><br/>Appointment Notes: <html>"+noteFromPatient+"<html><br/><br/>Doctor for Appointment:		<html>"+doctorTwo.getText());
				patientInfo.setBounds(200, 100, 500, 300);//(x, y, width, height)
				patientInfo.setFont(new Font("Arial", Font.PLAIN, 20));
				this.add(patientInfo);
				break;
			case 2:
				//Patient & appointment info label
				patientInfo = new JLabel(pat.toString()+"<html><br/><br/>Appointment Notes: <html>"+noteFromPatient+"<html><br/><br/>Doctor for Appointment:		<html>"+doctorThree.getText());
				patientInfo.setBounds(200, 100, 500, 300);//(x, y, width, height)
				patientInfo.setFont(new Font("Arial", Font.PLAIN, 20));
				this.add(patientInfo);
				break;
			default:
				//Patient & appointment info label
				patientInfo = new JLabel(pat.toString()+"<html><br/><br/>Appointment Notes: <html>"+noteFromPatient+"<html><br/><br/>Doctor for Appointment:		<html>"+doctorFour.getText());
				patientInfo.setBounds(200, 100, 400, 300);//(x, y, width, height)
				patientInfo.setFont(new Font("Arial", Font.PLAIN, 20));
				this.add(patientInfo);
				break;
			}		
		}else {
			JRadioButton selected = new JRadioButton();
			for(int i=0; i<doctors.getButtonCount();i++) {
				if(doctors.getSelection()==doctorOne.getModel()) {
					selected = doctorOne;
				}else if(doctors.getSelection()==doctorTwo.getModel()) {
					selected = doctorTwo;
				}else if(doctors.getSelection()==doctorThree.getModel()) {
					selected = doctorThree;
				}else {
					selected = doctorFour;
				}
			}
			patientInfo = new JLabel(pat.toString()+"<html><br/><br/>Appointment Notes: <html>"+noteFromPatient+"<html><br/><br/>Doctor for Appointment:		<html>"+selected.getText());
			patientInfo.setBounds(200, 150, 400, 350);//(x, y, width, height)
			patientInfo.setFont(new Font("Arial", Font.PLAIN, 20));
			this.add(patientInfo);
		}
		
		//Top label
		reciptTitle = new JLabel("Appointment Information");
		reciptTitle.setBounds(200, 5, 700, 80);//(x, y, width, height)
		reciptTitle.setFont(new Font("Arial", Font.BOLD, 50));
		this.add(reciptTitle);
		
		//Top label
		thankYouNote = new JLabel("Thank you for booking your appointment, see you soon!");
		thankYouNote.setBounds(200, 410, 550, 80);//(x, y, width, height)
		thankYouNote.setFont(new Font("Arial", Font.BOLD, 18));
		this.add(thankYouNote);
		
		//Image of logo
		logoSecondPage = new JLabel(new ImageIcon("logo2.png"));
		logoSecondPage.setToolTipText("Advocate Medical Logo");
		logoSecondPage.setVisible(true);
		logoSecondPage.setBounds(1, 0, 120, 120);//440 to have the picture on the bottom corner
		this.add(logoSecondPage);
	}
}