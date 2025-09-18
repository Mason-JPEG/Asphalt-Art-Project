import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {
    
BackgroundPainter Mason = new BackgroundPainter();
    ArmenianFlag bobbie = new ArmenianFlag();
    PolePainter Diwan = new PolePainter();

    Mason.paintBackground("white");
    
    bobbie.turnRight();
    bobbie.move();
    bobbie.move();
    bobbie.move();
    bobbie.move();
    bobbie.move();
    bobbie.move();
    bobbie.turnLeft();

    bobbie.oneRedStripe();
    bobbie.turnRight();
    bobbie.paint("red");
    bobbie.move();
    bobbie.turnRight();

    bobbie.twoRedStripe();
    bobbie.turnLeft();
    bobbie.paint("red");
    bobbie.move();
    bobbie.turnLeft();

    bobbie.threeRedStripe();
    bobbie.turnRight();
    bobbie.paint("red");
    bobbie.move();
    bobbie.turnRight();
    
    bobbie.fourRedStripe();
    bobbie.turnLeft();
    bobbie.paint("red");
    bobbie.move();
    bobbie.turnLeft();

    bobbie.fiveRedStripe();
    bobbie.turnRight();
    bobbie.paint("red");
    bobbie.move();
    bobbie.turnRight();

    bobbie.oneBlueStripe();
    bobbie.turnLeft();
    bobbie.paint("blue");
    bobbie.move();
    bobbie.turnLeft();

    bobbie.twoBlueStripe();
    bobbie.turnRight();
    bobbie.paint("blue");
    bobbie.move();
    bobbie.turnRight();

    bobbie.threeBlueStripe();
    bobbie.turnLeft();
    bobbie.paint("blue");
    bobbie.move();
    bobbie.turnLeft();

    bobbie.fourBlueStripe();
    bobbie.turnRight();
    bobbie.paint("blue");
    bobbie.move();
    bobbie.turnRight();

    bobbie.fiveBlueStripe();
    bobbie.turnLeft();
    bobbie.paint("blue");
    bobbie.move();
    bobbie.turnLeft();

    bobbie.oneOrangeStripe();
    bobbie.turnRight();
    bobbie.paint("orange");
    bobbie.move();
    bobbie.turnRight();

    bobbie.twoOrangeStripe();
    bobbie.turnLeft();
    bobbie.paint("orange");
    bobbie.move();
    bobbie.turnLeft();

    bobbie.threeOrangeStripe();
    bobbie.turnRight();
    bobbie.paint("orange");
    bobbie.move();
    bobbie.turnRight();

    bobbie.fourOrangeStripe();
    bobbie.turnLeft();
    bobbie.paint("orange");
    bobbie.move();
    bobbie.turnLeft();

    bobbie.fiveOrangeStripe();
    bobbie.turnRight();
    bobbie.paint("orange");
    bobbie.move();
    bobbie.turnRight();

    Diwan.turnRight();
    Diwan.move();
    Diwan.move();
    Diwan.move();

    Diwan.paintBall();
    Diwan.move();
    Diwan.move();
    Diwan.move();
    Diwan.move();
    Diwan.move();
    Diwan.move();
    Diwan.move();
    Diwan.move();
    Diwan.move();
    Diwan.move();
    Diwan.move();
    Diwan.move();
    Diwan.move();
    Diwan.move();
    Diwan.move();
    Diwan.move();
    
    Diwan.paintPole();
    
    
    
  }
}