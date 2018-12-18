package extra;

import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class House {
	static Robot rob = new Robot();

	public static void main(String[] args) {
		rob.penUp();
		rob.miniaturize();
		rob.setSpeed(10000);
		rob.moveTo(30, 500);
		drawHouses("small", "blue");
		drawHouses("medium","green");
		drawHouses("large","red");
		drawHouses("small","yellow");
		drawHouses("medium","orange");
		drawHouses("large","black");
		drawHouses("small","green");
		drawHouses("medium","orange");
		drawHouses("large","purple");
		drawHouses("small","blue");

	}

	public static void drawHouses(String height, String color) {
		int h = 0;
		
		if (height.equalsIgnoreCase("small")) {
			h = 60;
		} else if (height.equalsIgnoreCase("medium")) {
			h = 120;
		} else if (height.equalsIgnoreCase("large")) {
			h = 250;
		}

		rob.penDown();
		rob.setPenWidth(7);
		if(color.equalsIgnoreCase("blue")) {
			rob.setPenColor(Color.blue);
		}else if(color.equalsIgnoreCase("red")) {
			rob.setPenColor(Color.red);
		}else if(color.equalsIgnoreCase("orange")) {
			rob.setPenColor(Color.orange);
		}else if(color.equalsIgnoreCase("green")) {
			rob.setPenColor(Color.green);
		}else if (color.equalsIgnoreCase("yellow")) {
			rob.setPenColor(Color.yellow);
		}
		rob.move(h);
		if(h==250) {
			drawFlatRoof();
		}else if (h==120) {
			drawPointyRoof();
		}else if (h==60) {
			drawPointyRoof();
		}
		rob.move(h);
		rob.penUp();
		rob.move(8);
		rob.penDown();
		rob.turn(270);
		rob.setPenColor(19, 38, 0);
		rob.move(20);
		rob.turn(270);
		rob.penUp();
		rob.move(8);

	}

	public static void drawFlatRoof() {
		rob.turn(90);
		rob.move(30);
		rob.turn(90);
	
	}

	public static void drawPointyRoof() {
		rob.miniaturize();
		rob.penDown();
		rob.turn(35);
		rob.move(40);
		rob.turn(125);
		rob.move(40);
		}
}
