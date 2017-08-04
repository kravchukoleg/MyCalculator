/**
 * Created by kravchuk on 29.07.2017.
 */
import javax.swing.*;
//import java.awt.FlowLayout;
import java.awt.GridLayout;

public class SimpleCalculator {

    public static void main(String[] args){

        JPanel windowsContent = new JPanel();

//        FlowLayout fl = new FlowLayout();
//        windowsContent.setLayout(fl);
        GridLayout gl = new GridLayout(4,3);
        windowsContent.setLayout(gl);

        JLabel label1 = new JLabel("Number 1:");
        JTextField field1 = new JTextField(10);

        JLabel label2 = new JLabel("Number 2:");
        JTextField field2 = new JTextField(10);

        JLabel label3 = new JLabel("Sum:");
        JTextField result = new JTextField(10);

        JButton go = new JButton("Add");

        windowsContent.add(label1);
        windowsContent.add(field1);
        windowsContent.add(label2);
        windowsContent.add(field2);
        windowsContent.add(label3);
        windowsContent.add(result);
        windowsContent.add(go);

        JFrame frame = new JFrame("My first calculator");
        frame.setContentPane(windowsContent);

        frame.setSize(400, 100);
        frame.setVisible(true);

    }


}
