import org.code.neighborhood.Painter;

public class YoshiPainter extends PainterPlus {

  public YoshiPainter(){
    super();
  }

  public void paintHead(String color){
    /*
    * Paints Yoshi's Head       
    */
  move();
  
  move();
  paint("red");
  
  move();
  paint(color);

  move();
  paint("green");

  move();
  paint(color);

  turnRight();
  move();
  paint(color);

  turnLeft();
  move();
  paint(color);
  move();
  paint(color);
  turnLeft();
  turnLeft();
  move();
  move();
  move();
  paint(color);
  move();
  paint("black");
  move();
  paint(color);
  move();
  paint("red");
  turnLeft();
  move();
  turnLeft();
  move();
  paint("white");
  move();
  paint("white");
  move();
  paint(color);
  move();
  paint(color);
  move();
  paint(color);
  move();
  paint(color);
  turnRight();
  move();
  paint(color);
  turnRight();
  move();
  paint(color);
  move();
  paint(color);
  move();
  paint(color);
  move();
  paint("white");
  move();
  paint("white");
  move();
  paint("red");
}

  public void paintBody(String color){

     /*
    * Paints Yoshi's Body       
    */
  turnLeft();
  move();
  turnLeft();
  move();
  
  paint("red");
  move();
  paint("silver");
  move();
  paint("white");
  move();
  paint("white");
  move();
  paint("white");

  turnRight();
  move();
  turnRight();

  paint(color);
  move();
  paint("silver");
  move();
  paint("silver");
  move();
  paint("green");
  move();
  paint("green");
  move();
  paint("red");
  move();
  paint("green");

  turnLeft();
  move();
  turnLeft();
  move();
  paint("green");
  move();
  paint(color);
  move();
  paint("green");
  move();
  paint("silver");
  move();
  paint("silver");
  move();
  paint("green");
  move();
  paint("green");

  turnRight();
  move();
  turnRight();
  move();
  paint("red");
  move();
  paint("red");
  move();
  move();
  paint("red");
  move();
  paint("red");
  
  }
}