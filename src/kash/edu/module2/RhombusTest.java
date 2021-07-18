package kash.edu.module2;
import org.junit.Test;
import static org.junit.Assert.*;

/*
  @author   Alona Kashpruk
  @project   vsem
  @class  RhombusTest
  @version  1.0.0 
  @since 18.07.2021 - 17.02
*/

public class RhombusTest {

    Rhombus rhombus = new Rhombus(3, 30);

    @Test // OR @org.junit.Test
    public void getPerimeter() {
        assertEquals(12.0, rhombus.getPerimeter(), 0.01);
    }

    @Test
    public void getArea() {
        assertEquals(4.5, rhombus.getArea(), 0.01);
    }

    @Test
    public void getHeight() {
        assertEquals(1.5, rhombus.getHeight(), 0.01);
    }

    @Test
    public void getInradius() {
        assertEquals(0.75, rhombus.getInradius(), 0.01);
    }

    @Test
    public void getDiagonal() {
        assertEquals(5.99, rhombus.getDiagonal(), 0.01);
    }
}