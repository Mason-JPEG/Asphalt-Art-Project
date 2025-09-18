import org.code.neighborhood.*;

public class PainterPlus extends Painter{ 

public void turnRight() { 
  turnLeft();
  turnLeft();
  turnLeft();
} 
  public void turnAround() {
    turnLeft();
    turnLeft();
  }
 public void takeAllPaint(){
   while (isOnBucket()){
     takePaint();
   }
 }

  public void moveFast(){
    while (canMove()){
      move();
    }
    
  }

public void paintToEmpty(){
  while (isOnBucket()){
    takeAllPaint();
    paint("white");
    turnRight();
  }
}

  public void paintDonut(){
    while (isOnBucket()){
      takeAllPaint();
      move();
      turnRight();
      paint("white");
      move();
      paint("white");
      move();
      turnRight();
      paint("white");
      move();
      paint("white");
      move();
      paint("white");
      turnRight();
      move();
      paint("white");
      move();
      paint("white");
      turnRight();
      move();
      paint("white");
    }
  }
}