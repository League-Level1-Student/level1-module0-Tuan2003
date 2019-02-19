import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class SensitiveKeyBoard implements KeyListener {
	
public static void main(String[] args) {
SensitiveKeyBoard sk = new SensitiveKeyBoard();

	sk.keyListener();
	
}
public void keyListener() {
	
	JFrame frame = new JFrame();
	frame.addKeyListener(this);
	frame.setVisible(true);
	
}
@Override
public void keyPressed(KeyEvent arg0) {
	// TODO Auto-generated method stub
	System.out.println("ouch !!");
}
@Override
public void keyReleased(KeyEvent arg0) {
	// TODO Auto-generated method stub
	
}
@Override
public void keyTyped(KeyEvent arg0) {
	// TODO Auto-generated method stub
	
}
}
