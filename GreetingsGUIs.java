package ac.tut.ui;

import java.awt.BorderLayout;
import java.awt.*;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.GridLayout;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class GreetingsGUIs extends JFrame {

    // panels
    private JPanel namePnl;
    private JPanel surnamePnl;
    private JPanel nameAndSurnamePnl;
    private JPanel btnPnl;
    private JPanel mainPnl;
    private JPanel headingPnl;
    private JPanel greetingAreaPn1;

    //labels
    private JLabel nameLbl;
    private JLabel surnameLbl;
    private JLabel headingLbl;

    //textField
    private JTextField nameTxtFld;
    private JTextField surnameTxtFld;

    //textarea
    private JTextArea greetingsTxtArea;

    //buttons
    private JButton exitBtn;
    private JButton clearBtn;
    private JButton saveBtn;
    
    public GreetingsGUIs() {
        
        setLayout(new BorderLayout());
        setTitle("Greetings");
        setSize(500, 400);
        setBackground(Color.yellow);

        //create panels
        namePnl = new JPanel(new FlowLayout());
        surnamePnl = new JPanel(new FlowLayout());
        nameAndSurnamePnl = new JPanel(new GridLayout(2, 1));
        
        greetingAreaPn1 = new JPanel(new FlowLayout());
        btnPnl = new JPanel(new FlowLayout());
        
        headingPnl = new JPanel(new FlowLayout(FlowLayout.CENTER));
        headingPnl.setBorder(new BevelBorder(BevelBorder.RAISED));
        
        mainPnl = new JPanel(new BorderLayout());

        //create labels
        nameLbl = new JLabel("Name: ");
        surnameLbl = new JLabel("Surname: ");
        headingLbl = new JLabel("Greetings By Kabelo");

        //create textfields
        nameTxtFld = new JTextField(20);
        surnameTxtFld = new JTextField(20);

        //create textarea
        greetingsTxtArea = new JTextArea(20, 30);
        greetingsTxtArea.setEditable(false);
        greetingsTxtArea.setText("Hello [name]  [surname]");
        greetingsTxtArea.setBorder(new TitledBorder(new LineBorder(Color.yellow)));

        //create button
        exitBtn = new JButton("Exit");
        clearBtn = new JButton("Clear");
        saveBtn = new JButton("Save");

        //add name label textfield to the name panel
        namePnl.add(nameLbl);
        namePnl.add(nameTxtFld);

        //add surnmane label and textfield to the name panel
        surnamePnl.add(surnameLbl);
        surnamePnl.add(surnameTxtFld);

        //add the name and surname to the collective nameandsurnamepanel
        nameAndSurnamePnl.add(namePnl);
        nameAndSurnamePnl.add(surnamePnl);

        //add greeting textarea to its panel
        greetingAreaPn1.add(greetingsTxtArea);

        //add butons to their panel
        btnPnl.add(exitBtn);
        btnPnl.add(clearBtn);
        btnPnl.add(saveBtn);

        //add all panels to the main panel
        mainPnl.add(nameAndSurnamePnl, BorderLayout.NORTH);
        mainPnl.add(greetingAreaPn1, BorderLayout.CENTER);
        mainPnl.add(btnPnl, BorderLayout.SOUTH);
        
        //add heading label to its panel
        headingPnl.add(headingLbl);

        //add the main panel to the frame's panel
        add(headingPnl, BorderLayout.NORTH);
        add(mainPnl, BorderLayout.CENTER);
        
        setVisible(true);
        

        
    }
    
}
