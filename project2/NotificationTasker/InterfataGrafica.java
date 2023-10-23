import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import buttons.*;

public class InterfataGrafica {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Notification-Tasker");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 500);

        // Main panel with GridBagLayout
        JPanel panel = new JPanel(new GridBagLayout());
        frame.add(panel);
        panel.setBackground(Color.lightGray);
        // Create GridBagConstraints for button placement
        GridBagConstraints buttonConstraints = new GridBagConstraints();
        buttonConstraints.insets = new Insets(5, 5, 5, 5);





        // Lista de task-uri
        final DefaultListModel<Task> taskListModel = new DefaultListModel<>();
        final JList<Task> taskList = new JList<>(taskListModel);
        JScrollPane taskJScrollPane = new JScrollPane(taskList);

        // Add task list with GridBagConstraints
        buttonConstraints.gridx = 0;
        buttonConstraints.gridy = 0;
        buttonConstraints.gridwidth = 2;
        buttonConstraints.fill = GridBagConstraints.BOTH;
        buttonConstraints.weightx = 1.0;
        buttonConstraints.weighty = 1.0;
        panel.add(taskJScrollPane, buttonConstraints);

        JTextField descriereTask = new JTextField(20);
        descriereTask.setBackground(Color.cyan);

        // Add text field with GridBagConstraints
        buttonConstraints.gridx = 0;
        buttonConstraints.gridy = 1;
        buttonConstraints.gridwidth = 2;
        buttonConstraints.fill = GridBagConstraints.HORIZONTAL;
        buttonConstraints.weightx = 1.0;
        buttonConstraints.weighty = 0.0;
        panel.add(descriereTask, buttonConstraints);


        JLabel introduct=new JLabel("Introduceti taskul aici");
        buttonConstraints.gridx=1;
        buttonConstraints.gridy=1;

        introduct.setBorder(BorderFactory.createLineBorder(Color.black));


        panel.add(introduct,buttonConstraints);



        JButton addTask=new JButton("Add a task");
        buttonConstraints.gridx=0;
        buttonConstraints.gridy=2;
        buttonConstraints.gridwidth=1;
        panel.add(addTask,buttonConstraints);

        AddTaskButtonCustomizer.customizeButton(addTask);







addTask.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String descriere = descriereTask.getText();
                if (!descriere.isEmpty()) {
                    Task task = new Task(descriere);
                    taskListModel.addElement(task);
                    descriereTask.setText("");
                    task.finalization();


 JButton statusB = new JButton("Toggle Status");
        buttonConstraints.gridx = 0;
        buttonConstraints.gridy = 3;
        buttonConstraints.gridwidth = 2;

        panel.add(statusB, buttonConstraints);






       JButton deleteTask=new JButton("Delete task");
        buttonConstraints.gridx = 1;
        buttonConstraints.gridy=2;
        buttonConstraints.gridwidth=0;
                            //pachet buttons

                DeleteTaskButtonCustomizer.customizeButton(deleteTask);
                StatusButtonCustomizer.customizeButton(statusB);

        panel.add(deleteTask,buttonConstraints);

        panel.revalidate();

        deleteTask.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
                int selectedIndex = taskList.getSelectedIndex();
                if (selectedIndex >= 0) {
                    int confirm = JOptionPane.showConfirmDialog(frame, "Are you sure you want to delete this task?", "Confirm:", JOptionPane.YES_NO_OPTION);
                    if (confirm == JOptionPane.YES_OPTION) {
                        taskListModel.remove(selectedIndex);
                        deleteTask.setVisible(false);
                        statusB.setVisible(false);
                    }
                }
            }
        });


        // Status button

        statusB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = taskList.getSelectedIndex();
                if (selectedIndex >= 0) {
                    Task selectedTask = taskList.getModel().getElementAt(selectedIndex);
                   selectedTask.toggleStatus();
                   taskList.repaint();
                   int confirm= JOptionPane.showConfirmDialog(frame,"This task will be deleted",null, JOptionPane.YES_NO_CANCEL_OPTION);
                   if(confirm==JOptionPane.YES_OPTION){
                    deleteTask.setVisible(false);
                    taskListModel.remove(selectedIndex);
                    statusB.setVisible(false);

                   }

                }
            }
        });


                }
            }
        });



        frame.setVisible(true);
    }
}
