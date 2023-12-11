import java.util.ArrayList;
import java.util.List;

public class ShapeUtil {
    // private List<GeometricObject> shapes;

    // public ShapeUtil() {
    //     shapes = new ArrayList<>();
    // }

    // public void addGeometricObject(GeometricObject geometricObject) {
    //     shapes.add(geometricObject);
    // }

    // public List<GeometricObject> getList() {
    //     return shapes;
    // }

    // public String printInfo(List<GeometricObject> shapes) {
    //     String s = "Circle:" + "\n";
    //     for(GeometricObject shape : shapes) {
    //         if (shape instanceof Circle) {
    //            s = s + shape.getInfo() + "\n";
    //         }
    //     }
    //     s += "Triangle:" + "\n";
    //     for(GeometricObject shape : shapes) {
    //         if (shape instanceof Triangle) {
    //             s = s + shape.getInfo() + "\n";
    //         }
    //     }
    //     return s;
    // }
    /**
     * Print all shapes.
     */
    public String printInfo(List<GeometricObject> shapes) {
        String res = "Circle:";
        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) instanceof Circle) {
                res = res + "\n" + shapes.get(i).getInfo();
            }
        } 
        String res2 = "Triangle:";
        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) instanceof Triangle) {
                res2 = res2 + "\n" + shapes.get(i).getInfo();
            }
        } 
        return res + "\n" + res2;
    }
}
