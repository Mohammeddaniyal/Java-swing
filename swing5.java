import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class swing5 extends JFrame
{
private Container container;
private JButton add,save,edit;
swing5()
{
container=getContentPane();
container.setLayout(null);
add=new JButton(new ImageIcon("add_icon.png"));
add.setFocusable(false);
add.setFocusPainted(false);
edit=new JButton(new ImageIcon("edit_icon.png"));
save=new JButton(new ImageIcon("save_icon.png"));
edit.requestFocus();
add.setBounds(20,20,60,60);
edit.setBounds(100,20,24,24);
add.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent ev)
{
System.out.println("cool");
edit.requestFocus();
System.out.println("whatever");
}
});
save.setBounds(200,20,30,30);
container.add(add);
container.add(edit);
container.add(save);
setLocation(300,200);
setSize(400,400);
setVisible(true);
}
}
class swing5psp
{
public static void main(String gg[])
{
swing5 s=new swing5();
}
}