/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */


import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
                quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // This will make sure the program exits when you close the window

		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select Copy Image Address
        String imageURL = "https://image.freepik.com/free-icon/apple-logo_318-40184.jpg"; 
		// 2. create a variable of type "Component" that will hold your image
Component comp = createImage(imageURL);
		// 3. use the "createImage()" method below to initialize your Component
		// 4. add the image to the quiz window
quizWindow.add(comp);
		// 5. call the pack() method on the quiz window
quizWindow.pack();
		// 6. ask a question that relates to the image
String answer = JOptionPane.showInputDialog(null, "What company logo is this?");
		// 7. print "CORRECT" if the user gave the right answer
if(answer.equalsIgnoreCase("apple")) {
System.out.println("Correct");
}else {
		// 8. print "INCORRECT" if the answer is wrong
	System.out.println("Incorrect !");
}
		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
quizWindow.remove(comp);
		// 10. find another image and create it (might take more than one line of code)
String image1 = "https://instagram-brand.com/wp-content/uploads/2016/11/app-icon2.png"; 
		// 11. add the second image to the quiz window
Component comp1 = createImage(image1);
quizWindow.add(comp1);
		// 12. pack the quiz window
quizWindow.pack();
		// 13. ask another question
String answer1 = JOptionPane.showInputDialog("What logo is this? "); 
if(answer1.equalsIgnoreCase("instagram")) {
	System.out.println("Correct !");
}else {
	System.out.println("Incorrect !");
}
		// 14+ check answer, say if correct or incorrect, etc.

	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}





