import org.junit.Test;
public class CircleandCylinderTest {
    @Test
    public void TestString (){
        Circle newCircle = new Circle(2, "red");
        Cylinder newCylinder = new Cylinder(2, 3, "red");
        System.out.println(newCircle.getArea());
        System.out.println(newCylinder.getVolume());
        System.out.println(newCircle.toString());
        System.out.println(newCylinder.toString());
    }
}
