import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

// Custom JButton without focus highlight
class NoFocusButton extends JButton {
    public NoFocusButton(Icon icon) {
        super(icon);
        setFocusable(false);
        setFocusPainted(false);
    }

    @Override
    protected void paintBorder(Graphics g) {
        // Do nothing to remove the focus border
    }
}

public class Swing6 extends JFrame {
    private Container container;
    private JButton add, save, edit;

    public Swing6() {
        container = getContentPane();
        container.setLayout(null);

        // Use NoFocusButton instead of JButton
        add = new NoFocusButton(new ImageIcon("add_icon.png"));
        edit = new NoFocusButton(new ImageIcon("edit_icon.png"));
        save = new NoFocusButton(new ImageIcon("save_icon.png"));

        // Set button bounds
        add.setBounds(20, 20, 60, 60);
        edit.setBounds(100, 20, 24, 24);
        save.setBounds(200, 20, 30, 30);

        // ActionListener for the "add" button
        add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                System.out.println("cool");
                add.repaint();  // Refresh button appearance
                System.out.println("whatever");
            }
        });

        // Add buttons to container
        container.add(add);
        container.add(edit);
        container.add(save);

        setLocation(300, 200);
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String gg[]) {
        new Swing6();
    }
}
