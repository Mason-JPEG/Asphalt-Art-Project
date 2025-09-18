import org.code.neighborhood.*;

public class PolePainter extends PainterPlus { 

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

  public void paintPole() {
    while(canMove ("south")) {
      paint("black");
      move();
    }
  }
}