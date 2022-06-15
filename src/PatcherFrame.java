import javax.annotation.processing.SupportedOptions;
import javax.sound.midi.SysexMessage;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class PatcherFrame extends JFrame implements ActionListener {
    public JButton button = new JButton();
    public JButton button2 = new JButton();
    public JTextField userText = new JTextField(20);


    PatcherFrame() {
        //buttons

        button.setBounds(100,50,150,50);
        button.addActionListener(this);
        button.setFocusable(false);


        button.setText("Patch Screen Size");
        button.setFont(new Font("Trebuchet",Font.BOLD,10));
        button.setBackground(Color.lightGray);
        this.add(button);

        //Second button
        button2.setBounds(100,120,150,50);
        button2.setFocusable(false);
        button2.setText("Patch old files");
        button2.setBackground(Color.lightGray);
        button2.addActionListener(this);
        this.add(button2);

        //separation label
        JLabel SeparationLabel = new JLabel("SeparationLabel");
        SeparationLabel.setBounds(280,20,240,25);
        SeparationLabel.setText("Enter a File Path if you get a error");
        SeparationLabel.setFont(new Font("Trebuchet",Font.BOLD,15));
        //cords & etc
        SeparationLabel.setVisible(true);
        SeparationLabel.setHorizontalAlignment(JLabel.CENTER);
        SeparationLabel.setVerticalAlignment(JLabel.BOTTOM);




        //Title label
        JLabel label = new JLabel();
        label.setText("This is a all use Patcher it patches easy things in most old video games");
        label.setFont(new Font("Trebuchet",Font.BOLD,15));
        //cords & etc
        label.setVisible(true);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.TOP);
        //input
        userText.setBounds(280,50,150,35);
        userText.setVisible(true);
        this.add(userText);


        //frame etc
        this.add(SeparationLabel);
        this.add(label);
        this.setSize(800,800);
        this.setVisible(true);
        this.setTitle("random all use Patcher");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            String Path = userText.getText();
            PatchingMethods editfile = new PatchingMethods(Path,"2","w");
            editfile.CheckForFileType(Path);

            System.out.println(editfile);
        } else if (e.getSource()==button2) {
            System.out.println("dejan");
        }

    }




}
