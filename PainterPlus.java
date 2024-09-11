import org.code.neighborhood.*;

public class PainterPlus extends Painter {

  // Turns the Painter to the right
  public void turnRight() {
    turnLeft();
    turnLeft();
    turnLeft();
  }

  // Takes all of the paint from a paint bucket
  public void takeAllPaint() {
    while (isOnBucket()) {
      takePaint();
    }
  }
  
}