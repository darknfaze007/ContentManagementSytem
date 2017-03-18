/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contentManagementSystem.Gui;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author Kariyawasam
 */
public class UserHome extends JFrame {

    private JLabel lblHeading;
    private JLabel lblHeading1;
    private JTabbedPane tabbedPane;
    private JPanel TabPanel01;
    private JPanel HeadingPanel;
    private JPanel TabPanel02;
    private JComponent TabPanel03;
    private GuiAuthorRegistration ga;

    public UserHome() {
        super("Author Home");
        lblHeading = new JLabel("Content Management System",
                SwingConstants.CENTER);
        lblHeading1 = new JLabel("Welcome to your CMS User Headquarters");

        HeadingPanel = new JPanel(new GridLayout(2, 1));
        HeadingPanel.add(lblHeading);
        HeadingPanel.add(lblHeading1);
        add(HeadingPanel, BorderLayout.PAGE_START);

        //1st tab is for to give description of software to user
        TabPanel01 = makeText();
        //tabbedPane.setFont(new Font(null, 0, 12));
        tabbedPane = new JTabbedPane();
        tabbedPane.addTab("User Home", TabPanel01);

        //user Account Details tab
        TabPanel02 = updateAuthor();
        ga =new GuiAuthorRegistration("Author");
        ga.setSize(100, 50);
        
        tabbedPane.addTab("Personal Information",ga.getContentPane());

        tabbedPane.addTab("My Papers", TabPanel03);

        //set font sizes
        lblHeading.setFont(new Font(null, Font.BOLD, 16));
        add(tabbedPane);

        setSize(1200, 1000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);//to get center of the screen
        setVisible(true);

    }

    //description tab content
    private JPanel makeText() {
        JPanel pane = new JPanel();
        pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));

        JLabel lble = new JLabel("From here you can:");
        lble.setFont(new Font(null, Font.BOLD, 14));

        pane.add(lble);

        JLabel jta = new JLabel("<html><ul>" +
                "<li>Submit new papers and abstracts to CMS's Library by clicking on My Papers</li>" +
                "<li>Review and modify your personal information by clicking on Personal Info </li> " +
                "</ul></html>");
        pane.add(jta);
        return pane;
    }

    public static void main(String[] args) {
        UserHome nn = new UserHome();
    }

    private JPanel updateAuthor() {
        JPanel updateAtuthr = new JPanel(new GridLayout(6, 1, 5, 5));
        
        JLabel lblAuthorName;
        JLabel lblAffaliation;
        JLabel lblAffaliationAddress;
        JLabel lblEmail;
        JLabel lblUserName;
        JLabel lblPassword;
        JTextField txtAuthorName;
        JTextField txtAffaliation;
        JTextField txtAffaliationAddress;
        JTextField txtEmail;
        JTextField txtUserName;
        JPasswordField txtPassword;
        JPanel buttonArea;
        JButton btnSubmit;
        JButton btnCancel;

        return updateAtuthr;
    }
}
