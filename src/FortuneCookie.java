import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class FortuneCookie implements ActionListener {
	JFrame frame;
	JPanel panel;
	JButton button;
	public static void main(String[] args) {
	FortuneCookie cookie= new FortuneCookie();
	cookie.showButton();
	
	}
	public void showButton() {
	     System.out.println("Button clicked");
	     frame = new JFrame();
	     frame.setSize(500,500);
	     frame.setVisible(true);
	     
	     button = new JButton();
	     frame.add(button);
	     button.addActionListener(this);
	     frame.pack();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null,"Woohoo!");
			int rand = new Random().nextInt(5);
			if(rand==0) {
			JOptionPane.showMessageDialog(null,"Take the chance while you still have the choice.");
			}else if(rand == 1) {
			JOptionPane.showMessageDialog(null,"You are talented in many ways.");
			}else if(rand == 2) {
			JOptionPane.showMessageDialog(null,"You have a deep appreciation of the arts and music.");
			}else if(rand == 3) {
			JOptionPane.showMessageDialog(null,"You're true love will show himself to you under the moonlight.");
			}else if(rand == 4) {
			JOptionPane.showMessageDialog(null, "Don't just spend time, invest it.");
			}
		
	}
}
