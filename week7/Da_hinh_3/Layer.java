import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;
import java.awt.Graphics;

public class Layer extends JPanel {
    private List<Shape> shapes = new ArrayList<Shape>();

    int index = 0;

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    /**
     * Javadoc.
     */
    public void removeCircles() {
        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) instanceof Circle) {
                shapes.remove(i);
                i--;
            }
        }
    }

    /**
     * Javadoc.
     */
    public String getInfo() {
        String res = "Layer of crazy shapes:";
        for (int i = 0; i < shapes.size(); i++) {
            res = res + "\n" + shapes.get(i).toString();
        }
        return res;
    }

    /**
     * Javadoc.
     */
    public void removeDuplicates() {
        for (int i = 0; i < shapes.size(); i++) {
            Shape currrent = shapes.get(i);
            for (int j = 0; j < shapes.size(); j++) {
                if (shapes.get(j).equals(currrent)) {
                    shapes.remove(j);
                }
            }
            shapes.add(i, currrent);
        }
    }

    @Override
    public void paintComponent(Graphics g) {

    }
}
