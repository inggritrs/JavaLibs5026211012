import javax.swing.JOptionPane;

	public class JavaLibs5026211012 {
	public static void main(String[] Args) {

	String Name, WordProgramming, RoleModel;
	int BirthYear, Age, YearProgramming, TotalKnow;
	double Likeable, Effort, Enjoyable, AveLove, Last;

	JOptionPane.showMessageDialog(null,"Hello, World!");
	JOptionPane.showMessageDialog(null,"Let's see how fun is programming!");

	Name = JOptionPane.showInputDialog(null,"What is your name?");
	Age = Integer.parseInt(JOptionPane.showInputDialog(null,"How old are you?"));
	BirthYear = 2022-Age;
        JOptionPane.showMessageDialog(null,"Well, you were born in " + BirthYear + " ,right?");

	WordProgramming = JOptionPane.showInputDialog(null,"Give me a word describes programming :");
        JOptionPane.showMessageDialog(null,"Bill Gates was saying " + WordProgramming + " too. Is this a sign?");
        
	YearProgramming = Integer.parseInt(JOptionPane.showInputDialog(null,"In waht year do you exactly know what is programming :"));
        TotalKnow = 2022-YearProgramming;
        JOptionPane.showMessageDialog(null,TotalKnow +" year, wow!");
        
        JOptionPane.showMessageDialog(null,"It's starting to get boring. Should we play a game?");
        JOptionPane.showMessageDialog(null,"Cool!");
        
        JOptionPane.showMessageDialog(null,"In this game i know how much u love coding. Let's get started!");
        Likeable = Double.parseDouble(JOptionPane.showInputDialog(null,"In scale 1-5, how fun is programming for you?"));
        Effort = Double.parseDouble(JOptionPane.showInputDialog(null,"In scale 1-5, how many hours do you spend on coding in a day?"));
        Enjoyable = Double.parseDouble(JOptionPane.showInputDialog(null,"In scale 1-5, how enjoyable is coding for you?"));
        JOptionPane.showMessageDialog(null,"From your Answers, i'll guess how much do you love coding in scale 1-5");
	AveLove = (Effort+Enjoyable+Likeable)/3;
        JOptionPane.showMessageDialog(null,"It's "+AveLove + "I know that you really love programming:D");
        
        JOptionPane.showMessageDialog(null,"Two last questions.");
        RoleModel = JOptionPane.showInputDialog(null,"Who is your role model in programming?");
        JOptionPane.showMessageDialog(null,"Great, " +RoleModel+ " is my role model too!");
        Last = Double.parseDouble(JOptionPane.showInputDialog(null,"In scale 1-5, how enjoyable this app for you?"));
        JOptionPane.showMessageDialog(null,"Cool! It's really nice to play with you " + Name + "! ");
	}
}