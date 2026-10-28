import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

class calculator extends JFrame  implements ActionListener{
    JTextField num1, num2, result;
    JButton add, sub, mult, div;

    calculator(){
        
        setTitle("Simple Calculator");
        setSize(500, 500);
        setLayout(new GridLayout(5, 2, 20, 20));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        num1 = new JTextField();
        num2 = new JTextField();
        result = new JTextField();
        result.setEditable(false);
        
        add = new JButton("Add");
        sub = new JButton("Subtract");
        mult = new JButton("Multiply");
        div = new JButton("Divide");

        add(new JLabel("    First Number: "));
        add(num1);

        add(new JLabel("    Second Number: "));
        add(num2);

        add(new JLabel("    Result: "));
        add(result);

        add(add);
        add(sub);
        add(mult);
        add(div);

        add.addActionListener(this);
        sub.addActionListener(this);
        mult.addActionListener(this);
        div.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        try{
            double a = Double.parseDouble(num1.getText());
            double b = Double.parseDouble(num2.getText());
            double r = 0;

            if(e.getSource() == add)
                r = a + b;

            else if(e.getSource() == sub)
                r = a - b;

            else if(e.getSource() == mult)
                r = a * b;

            else if(e.getSource() == div){
                if(b == 0){
                    result.setText("Cannot divide by zero");
                    return;
                }
                r = a / b; 
            }

        result.setText(String.format("%.3f", r));

        }catch(NumberFormatException ex){
            result.setText("Enter valid numbers");
        }
    }
    public static void main(String[] args) {
        new calculator();
    }
}