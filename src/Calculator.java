/**
 * Created by kravchuk on 04.08.2017.
 */
import javax.swing.*;
import java.awt.*;

public class Calculator {

    JPanel windowContent;
    JTextField displayField;
    JButton button0;
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    JButton button6;
    JButton button7;
    JButton button8;
    JButton button9;
    JButton buttonPoint;
    JButton buttonEqual;
    JButton buttonAdd;
    JButton buttonSub;
    JButton buttonDiv;
    JButton buttonPow;
    JPanel p1;
    JPanel p2;

    Calculator(){

        windowContent = new JPanel();

        BorderLayout bl = new BorderLayout();
        windowContent.setLayout(bl);

        displayField = new JTextField(30);
        windowContent.add("North", displayField);

        button0 = new JButton("0");
        button1 = new JButton("1");
        button2 = new JButton("2");
        button3 = new JButton("3");
        button4 = new JButton("4");
        button5 = new JButton("5");
        button6 = new JButton("6");
        button7 = new JButton("7");
        button8 = new JButton("8");
        button9 = new JButton("9");
        buttonPoint = new JButton(".");
        buttonEqual = new JButton("=");
        buttonAdd = new JButton("+");
        buttonSub = new JButton("-");
        buttonDiv = new JButton("/");
        buttonPow = new JButton("*");

        p1 = new JPanel();
        GridLayout gl = new GridLayout(4,3);
        p1.setLayout(gl);

        p1.add(button0);
        p1.add(button1);
        p1.add(button2);
        p1.add(button3);
        p1.add(button4);
        p1.add(button5);
        p1.add(button6);
        p1.add(button7);
        p1.add(button8);
        p1.add(button9);
        p1.add(buttonPoint);
        p1.add(buttonEqual);

        p2 = new JPanel();
        GridLayout gl1 = new GridLayout(4,1);
        p2.setLayout(gl1);

        p2.add(buttonAdd);
        p2.add(buttonSub);
        p2.add(buttonPow);
        p2.add(buttonDiv);

        windowContent.add("Center",p1);
        windowContent.add("West",p2);

        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(windowContent);

        frame.pack();

        frame.setVisible(true);

    }

    public static void main(String[] args){
        Calculator calc = new Calculator();
    }
}


