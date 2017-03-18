/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contentManagementSystem.Gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author Kariyawasam
 */
public class UploadPaper extends JFrame{

    private JLabel lblHeading;
    private JLabel lblTaskHeading;
    private JLabel lblTitle;
    private JLabel lblAuthorsName;
    private JLabel lblUploadPapers;
    private JTextField txtPapaerTittle;
    private JTextArea txtAuthors;
    private JButton addAuthor;
    private JPanel panelTitle;
    private JPanel controlArea;
    
    
    public UploadPaper()  {
        super("Upload Papers");
        
        lblHeading = new JLabel("Content Management System",
                SwingConstants.CENTER);
        lblTaskHeading = new JLabel("Upload Papers to CMS");
        
        panelTitle = new JPanel();
        panelTitle.setLayout(new GridLayout(2, 1));
        panelTitle.add(lblHeading);
        panelTitle.add(lblTaskHeading);
        
        add(panelTitle,BorderLayout.PAGE_START);
     
        controlArea = new jpa
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);//to get center of the screen
        
    }
    public static void main(String []args){
        UploadPaper nn = new UploadPaper();
        nn.setVisible(true);
        nn.setSize(500, 330);
    }
}
