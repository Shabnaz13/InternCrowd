import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class resumebuilder extends JFrame implements ActionListener {
    private JTextField nameField, contactField, degreeField, universityField, graduationYearField;
    private JTextArea summaryArea, jobDescriptionArea;
    private JButton generateButton;

    public resumebuilder() {
        setTitle("Resume Builder");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(8, 2, 10, 10));

        mainPanel.add(new JLabel("Full Name:"));
        nameField = new JTextField();
        mainPanel.add(nameField);

        mainPanel.add(new JLabel("Contact Information:"));
        contactField = new JTextField();
        mainPanel.add(contactField);

        mainPanel.add(new JLabel("Professional Summary:"));
        summaryArea = new JTextArea(4, 20);
        mainPanel.add(new JScrollPane(summaryArea));

        mainPanel.add(new JLabel("Education:"));
        mainPanel.add(new JLabel()); // Empty label for spacing

        mainPanel.add(new JLabel("Degree:"));
        degreeField = new JTextField();
        mainPanel.add(degreeField);

        mainPanel.add(new JLabel("University:"));
        universityField = new JTextField();
        mainPanel.add(universityField);

        mainPanel.add(new JLabel("Graduation Year:"));
        graduationYearField = new JTextField();
        mainPanel.add(graduationYearField);

        mainPanel.add(new JLabel("Work Experience:"));
        mainPanel.add(new JLabel()); // Empty label for spacing

        mainPanel.add(new JLabel("Job Description:"));
        jobDescriptionArea = new JTextArea(4, 20);
        mainPanel.add(new JScrollPane(jobDescriptionArea));

        generateButton = new JButton("Generate Resume");
        generateButton.addActionListener(this);
        mainPanel.add(new JLabel()); // Empty label for spacing
        mainPanel.add(generateButton);

        add(mainPanel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == generateButton) {
            generateResume();
        }
    }

    private void generateResume() {
        String fullName = nameField.getText();
        String contactInfo = contactField.getText();
        String summary = summaryArea.getText();
        String degree = degreeField.getText();
        String university = universityField.getText();
        String graduationYear = graduationYearField.getText();
        String jobDescription = jobDescriptionArea.getText();

        // TODO: Generate and display the resume

        JOptionPane.showMessageDialog(this, "Resume generated:\n" +
                "Name: " + fullName + "\n" +
                "Contact: " + contactInfo + "\n" +
                "Summary: " + summary + "\n" +
                "Degree: " + degree + "\n" +
                "University: " + university + "\n" +
                "Graduation Year: " + graduationYear + "\n" +
                "Job Description: " + jobDescription);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            resumebuilder resumeBuilder = new resumebuilder();
            resumeBuilder.setVisible(true);
        });
    }
}
    

