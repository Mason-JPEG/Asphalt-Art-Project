import org.code.neighborhood.*;

public class PolePainter extends PainterPlus { 
  
/* Creates the Pole of the flag */
  
  public void paintBall() {
    paint("black");
    move();
    turnLeft();
    move();
    paint("black");
    move();
    turnLeft();
    move();
    paint("black");
    move();
    turnLeft();
    move();
    paint("black");
    turnLeft();
    move();
    move();
    move();
    paint("black");
  }
  
//Allows painter to move South while painiting black.
  public void paintPole() {
    while(canMove ("south")) {
      paint("black");
      move();
    }
  }
}