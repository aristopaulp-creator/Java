import javax.swing.*;

class menu{
    public static void main(String[] args){
        JFrame menuFrame = new JFrame("MENU");

        JMenuBar menuBar = new JMenuBar();

        JMenu menu = new JMenu("File");
        
        JMenuItem newItem = new JMenuItem("New");
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem saveItem = new JMenuItem("Save");
        JMenuItem saveasItem = new JMenuItem("Save as...");

        menu.add(newItem);
        menu.add(openItem);
        menu.add(saveItem);
        menu.add(saveasItem);

        menuBar.add(menu);

        JPanel panel = new JPanel();

        JLabel label = new JLabel("Hello");

        JTextField text = new JTextField("Welcome");

        JComboBox<String> cmb = new JComboBox<>();

        cmb.addItem("India");
        cmb.addItem("UK");
        cmb.addItem("US");

        panel.add(text);
        panel.add(cmb);
        panel.add(label);

        menuFrame.setJMenuBar(menuBar);
        menuFrame.add(panel);
        menuFrame.setSize(400,200);
        menuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menuFrame.setVisible(true);

    } 
}