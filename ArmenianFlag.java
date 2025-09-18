import org.code.neighborhood.*;

public class ArmenianFlag extends PainterPlus { 


  // Paints the First Red Stripe of the flag
  
public void oneRedStripe() {
  while(canMove ("east")) {
    paint("red");
    move();
  }
}

    // Paints the Second Red Stripe of the flag

  public void twoRedStripe() {
  while(canMove ("west")) {
    paint("red");
    move();
  }
}

    // Paints the Third Red Stripe of the flag

  public void threeRedStripe() {
  while(canMove ("east")) {
    paint("red");
    move();
  }
}

    // Paints the Fourth Red Stripe of the flag

    public void fourRedStripe() {
  while(canMove ("west")) {
    paint("red");
    move();
  }
}

    // Paints the Fifth Red Stripe of the flag

    public void fiveRedStripe() {
  while(canMove ("east")) {
    paint("red");
    move();
  }
}
  public void oneBlueStripe() {
  while(canMove ("west")) {
    paint("blue");
    move();
  }
}
  public void twoBlueStripe() {
  while(canMove ("east")) {
    paint("blue");
    move();
  }
}
  public void threeBlueStripe() {
  while(canMove ("west")) {
    paint("blue");
    move();
  }
}
    public void fourBlueStripe() {
  while(canMove ("east")) {
    paint("blue");
    move();
  }
}
 public void fiveBlueStripe() {
  while(canMove ("west")) {
    paint("blue");
    move();
  }
}
  public void oneOrangeStripe() {
  while(canMove ("east")) {
    paint("orange");
    move();
  }
}
   public void twoOrangeStripe() {
  while(canMove ("west")) {
    paint("orange");
    move();
  }
}
  public void threeOrangeStripe() {
  while(canMove ("east")) {
    paint("orange");
    move();
  }
}
     public void fourOrangeStripe() {
  while(canMove ("west")) {
    paint("orange");
    move();
  }
}
    public void fiveOrangeStripe() {
  while(canMove ("east")) {
    paint("orange");
    move();
  }
}
}