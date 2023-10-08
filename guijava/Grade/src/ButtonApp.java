import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class ButtonApp<size> {
    private JFrame frame;
    private JPanel panel;
    private List<Color> backgroundColors;
    private int currentColorIndex;


    public ButtonApp() {
        frame = new JFrame("Magia Stelelor");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());


        panel = new JPanel();
        frame.add(panel, BorderLayout.CENTER);

        JButton middleButton = new RoundButton("Middle Button");

        middleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            
                middleButton.setForeground(Color.GREEN);
             middleButton.setBackground(Color.RED);
                JOptionPane.showMessageDialog(null, "No ce ai facut","Sarakule",JOptionPane.ERROR_MESSAGE);
                frame.setSize(1000, 600);
            middleButton.setBackground(Color.MAGENTA);



            }
        });

        JButton colorButton = new JButton("Infatisare extraterestra");
        backgroundColors = new ArrayList<>();
        backgroundColors.add(Color.RED);
        backgroundColors.add(Color.BLUE);
        backgroundColors.add(Color.GREEN);
        backgroundColors.add(Color.YELLOW);
        backgroundColors.add(Color.ORANGE);
        backgroundColors.add(Color.BLACK);
        backgroundColors.add(Color.GRAY);
        currentColorIndex = 0;

        colorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(backgroundColors.get(currentColorIndex));
                currentColorIndex = (currentColorIndex + 1) % backgroundColors.size();
            }
        });

        JButton closeButton = new JButton("Close");
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0); 
            }
        });

        panel.add(middleButton,BorderLayout.NORTH);
        frame.add(colorButton, BorderLayout.NORTH);
        frame.add(closeButton, BorderLayout.SOUTH);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ButtonApp();
            }
        });
    }
}
  class RoundButton extends JButton {
        public RoundButton(String label) {
            super(label);
            setContentAreaFilled(false);
            setFocusPainted(false);
            setPreferredSize(new Dimension(115, 115));
        }

        @Override
        protected void paintComponent(Graphics g) {
            if (getModel().isArmed()) {
                g.setColor(null);
            } else {
                g.setColor(getBackground());
            }

            int width = getWidth() - 1;
            int height = getHeight() - 1;
            g.fillOval(0, 0, width, height);

            super.paintComponent(g);
        }

        @Override
        protected void paintBorder(Graphics g) {
            g.setColor(getForeground());
            g.drawOval(0, 0, getWidth() - 1, getHeight() - 1);
        }
    }

