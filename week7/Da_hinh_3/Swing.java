import javax.swing.*;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.List;
import java.util.Random;

public class Swing implements KeyListener {
    private List<Shape> shapes;
    private Random random;
    JFrame frame = new JFrame();

    public Swing() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setVisible(true);
    }

   

    private void generateRandomShape() {
        int x = random.nextInt(frame.getWidth());
        int y = random.nextInt(frame.getHeight());
        int width = random.nextInt(50) + 20;
        int height = random.nextInt(50) + 20;

        if (random.nextBoolean()) {
            shapes.add(new Rectangle(x, y, width, height));
        } else {
            shapes.add(new Circle(x, y, width / 2));
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }
    
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            generateRandomShape();
            repaint();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Swing::new);
    }
}
