import java.awt.*;
import javax.swing.*;
import java.util.*;
class swing1 extends JFrame
{
private JLabel rollNumberLabel;
private JTextField rollNumberTextField;
private JLabel nameLabel;
private JTextField nameTextField;
private JLabel genderLabel;
private ButtonGroup genderGroup;
private JRadioButton maleRadioButton;
private JRadioButton femaleRadioButton;
private JCheckBox isIndianCheckBox;
private JLabel cityLabel;
private JComboBox cityComboBox;
private JLabel hobbiesLabel;
private JList hobbiesList;
private JButton saveButton;
private JButton cancelButton;
private Container container;
swing1()
{
rollNumberLabel=new JLabel("Roll Number");
rollNumberTextField=new JTextField(20);
nameLabel=new JLabel("Name");
nameTextField=new JTextField(50);
maleRadioButton=new JRadioButton("Male");
femaleRadioButton=new JRadioButton("Female");
genderGroup=new ButtonGroup();
genderGroup.add(maleRadioButton);
genderGroup.add(femaleRadioButton);
genderLabel=new JLabel("Gender");

cityLabel=new JLabel("City");
cityComboBox=new JComboBox();
cityComboBox.addItem("Ujjain");
cityComboBox.addItem("Indore");
cityComboBox.addItem("Dewas");
cityComboBox.addItem("Mumbai");
isIndianCheckBox=new JCheckBox("IsIndian");
Vector hobbies=new Vector();
hobbies.addElement("Swimming");
hobbies.addElement("Reading");
hobbies.addElement("Cricket");
hobbies.addElement("Origami");
hobbiesLabel=new JLabel("Hobbies");
hobbiesList=new JList(hobbies);
saveButton=new JButton("Save");
cancelButton=new JButton("Cancel");

container=getContentPane();
container.setLayout(new FlowLayout());
container.add(rollNumberLabel);
container.add(rollNumberTextField);
container.add(nameLabel);
container.add(nameTextField);
container.add(genderLabel);
container.add(maleRadioButton);
container.add(femaleRadioButton);
container.add(isIndianCheckBox);
container.add(cityLabel);
container.add(cityComboBox);
container.add(hobbiesLabel);
container.add(hobbiesList);
container.add(saveButton);
container.add(cancelButton);
setLocation(100,100);
setSize(600,600);
setVisible(true);
setDefaultCloseOperation(EXIT_ON_CLOSE);
}
}
class swing1psp
{
public static void main(String gg[])
{
swing1 s=new swing1();
}
}