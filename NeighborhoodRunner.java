import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {

  BackgroundPainter bp = new BackgroundPainter();

  bp.setPaint(1000);
  
  bp.paintBackground("black", 8);
  
  YoshiPainter myYoshiPainter = new YoshiPainter();
  myYoshiPainter.setPaint(1000);

  myYoshiPainter.paintHead("lime");

  myYoshiPainter.paintBody("lime");

    
  }
}