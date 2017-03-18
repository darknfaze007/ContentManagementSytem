/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contentManagementSystem.Gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Kariyawasam
 */
public class GuiReviwer extends JFrame {

    private JLabel lblReviwerId;
    private JLabel lblReviwerIdDisplay;
    private JLabel lblReviwerName;
    private JLabel lblAffaliation;
    private JLabel lblAffaliationAddress;
    private JLabel lblEmail;
    private JLabel lblUserName;
    private JLabel lblPassword;
    private JTextField txtReviwerName;
    private JTextField txtAffaliation;
    private JTextField txtAffaliationAddress;
    private JTextField txtEmail;
    private JTextField txtUserName;
    private JPasswordField txtPassword;
    private JPanel area;
    private JPanel buttonArea;
    private JButton btnSubmit;
    private JButton btnCancel;

    public GuiReviwer() {
        super("Reviwer Registration");

        //JPanels 
        area = new JPanel(new GridLayout(7, 1, 5, 5));
        buttonArea = new JPanel();

        //lables for text boxes
        lblReviwerId = new JLabel("Reviwer Id");
        lblReviwerIdDisplay = new JLabel();
        lblReviwerName = new JLabel("Reviwer Name");
        lblAffaliation = new JLabel("Affalition Name");
        lblAffaliationAddress = new JLabel("Affalition Address");
        lblEmail = new JLabel("Email");
        lblUserName = new JLabel("User Name");
        lblPassword = new JLabel("Password");

        //text boxes
        txtReviwerName = new JTextField(HEIGHT);
        txtAffaliation = new JTextField();
        txtAffaliationAddress = new JTextField();
        txtEmail = new JTextField();
        txtUserName = new JTextField();
        txtPassword = new JPasswordField();

        //butoons
        btnSubmit = new JButton("Submit");
        btnCancel = new JButton("Cancel");

        //add component to Jpanel
        area.add(lblReviwerId);
        area.add(lblReviwerIdDisplay);
        area.add(lblReviwerName);
        area.add(txtReviwerName);
        area.add(lblAffaliation);
        area.add(txtAffaliation);
        area.add(lblAffaliationAddress);
        area.add(txtAffaliationAddress);
        area.add(lblEmail);
        area.add(txtEmail);
        area.add(lblUserName);
        area.add(txtUserName);
        area.add(lblPassword);
        area.add(txtPassword);

        buttonArea.add(btnSubmit);
        buttonArea.add(btnCancel);

        //add Jpanels
        area.setBorder(BorderFactory.createTitledBorder("Reviwer Details"));

        add(area, BorderLayout.CENTER);
        add(buttonArea, BorderLayout.PAGE_END);

            // setLayout(new GridLayout(2,1));
        setSize(500, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

    }

    public static void main(String[] args) {
        GuiReviwer NN = new GuiReviwer();
        NN.setVisible(true);
    }

}
