import java.awt.*;
import java.awt.event.*;

class StudentForm extends Frame{
    StudentForm(){
        setTitle("Student Form");
        setSize(300, 400);
        setLayout(new FlowLayout());

        Label l1 = new Label("Name: ");
        add(l1);
        TextField tf = new TextField(20);
        add(tf);

        Label l2 = new Label("Address: ");
        add(l2);
        TextArea ta = new TextArea(3, 20);
        add(ta);

        Checkbox cb = new Checkbox("I'm a Student");
        add(cb);

        Label l3 = new Label("Choose your Dept.");
        add(l3);
        Choice c = new Choice();
        c.add("CSE");
        c.add("AI DS");
        c.add("IT");
        add(c);

        Button b = new Button("Submit");
        add(b);

        b.addActionListener(e->{
            System.out.println("Name: " + tf.getText());
            System.out.println("Address: " + ta.getText());
            System.out.println("Student: " + cb.getState());
            System.out.println("Dept.: " + c.getSelectedItem());
        });

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                dispose();
            }
        });

        setVisible(true);
    }
}

public class AWTEvent {
    public static void main(String[] args) {
        new StudentForm();
    }
}
