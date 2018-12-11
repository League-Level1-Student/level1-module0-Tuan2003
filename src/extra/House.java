package extra;

import org.jointheleague.graphical.robot.Robot;

public class House {
public static void main(String[] args) {
Robot rob = new Robot();
rob.penUp();
rob.miniaturize();
rob.setSpeed(10000);
rob.turn(270);
rob.move(425);
rob.turn(90);
rob.setPenWidth(5);
rob.setPenColor(255, 192, 203);
rob.penDown();
rob.move(100);
rob.turn(45);
rob.move(40);
rob.turn(90);
rob.move(40);
}
}
