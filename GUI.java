import javax.swing.*;
public class GUI{
    public static void main(String[]args){
        JFrame frame=new JFrame("First GUI");
        frame.setSize(300,350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
        JTextField textField=new JTextField();
        textField.setBounds(20,20,150,25);
        JButton button=new JButton("Click Me");
        button.setBounds(180,20,90,25);
        JLabel label=new JLabel("hello !");
        label.setBounds(20,60,250,25);
        frame.add(textField);
        frame.add(button);
        frame.add(label);
        button.addActionListener(e -> {
    String name = textField.getText();
    label.setText("Hello, " + name + "!");
});

    }

}