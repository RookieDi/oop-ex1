package buttons;
import javax.swing.JButton;
import java.awt.Color;

public class DeleteTaskButtonCustomizer {
    public static void customizeButton(JButton deleteTask) {
        deleteTask.setBackground(Color.RED);
        deleteTask.setForeground(Color.WHITE);
    }
}