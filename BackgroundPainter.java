import org.code.neighborhood.*;

/*
 * PackgroundPainter is a PainterPlus that paints
 * murals in The Neighborhood
 */
public class BackgroundPainter extends PainterPlus {

  /*
   * Paints first row of The Neighborhood with the color
   * where size is the size of the grid
   */
  public void paintBackground(String color, int size) {
  paint(color);
  move();
  paint(color);
  move();
  move();
  move();
  move();
  move();
  paint(color);
  move();
  paint(color);

 /*
   * Paints second row of The Neighborhood with the color
   * where size is the size of the grid
   */
  turnRight();
  move();
  turnRight();
  move();
  move();
  move();
  move();
  move();
  move();
  move();
  paint(color);

   /*
   * Paints third row of The Neighborhood with the color
   * where size is the size of the grid
   */
  turnLeft();
  move();
  paint(color);
  turnLeft();
  move();
  paint(color);
  turnLeft();
  turnLeft();
  move();
  turnLeft();
    /*
    * Paints fourth row of The Neighborhood with the color
    * where size is the size of the grid
    */
  move();
  paint(color);
    /*
    * Paints fifth row of The Neighborhood with the color
    * where size is the size of the grid
    */
  move();
  paint(color);
  turnLeft();
  move();
  paint(color);
  move();
  move();
  move();
  move();
  move();
  move();
  paint(color);
    /*
    * Paints sixth row of The Neighborhood with the color
    * where size is the size of the grid
    */
  turnRight();
  move();
  paint(color);
    /*
    * Paints seventh row of The Neighborhood with the color
    * where size is the size of the grid
    */
  move();
  turnRight();
  move();
  move();
  move();
  move();
  move();
  move();
  move();
  paint(color);
  paint(color);
    /*
    * Paints eighth row of The Neighborhood with the color
    * where size is the size of the grid
    */
  turnLeft();
  move();
  paint(color);
  turnLeft();
  move();
  paint(color);
  move();
  move();
  move();
  paint(color);
  move();
  move();
  move();
  paint(color);
  
  }
  }