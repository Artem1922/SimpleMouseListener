import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class  SimpleMouseListener implements MouseListener {

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println(e.getX() + " " + e.getY());
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}

public class Main {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setSize(300,400);
        jf.setVisible(true);
        SimpleMouseListener mouseListener = new  SimpleMouseListener();
        jf.addMouseListener(mouseListener);
    }
}
