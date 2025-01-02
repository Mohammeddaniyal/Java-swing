import java.awt.*;
import javax.swing.*;
import java.util.*;
class swing2 extends JFrame
{
private JLabel headingLabel;
private JLabel rollNumberLabel;
private JTextField rollNumberTextField;
private JLabel nameLabel;
private JTextField nameTextField;
private JLabel genderLabel;
private ButtonGroup genderGroup;
private JRadioButton maleRadioButton;
private JRadioButton femaleRadioButton;
private JLabel isIndianLabel;
private JCheckBox isIndianCheckBox;
private JLabel cityLabel;
private JComboBox cityComboBox;
private JLabel hobbiesLabel;
private JList hobbiesList;
private JButton saveButton;
private JButton cancelButton;
private Container container;
swing2()
{
headingLabel=new JLabel("Student (Add Module)");
JPanel headingPanel=new JPanel();
headingPanel.setLayout(new GridLayout(1,3));
headingPanel.add(new JLabel("	"));
headingPanel.add(headingLabel);
headingPanel.add(new JLabel("	"));

rollNumberLabel=new JLabel("Roll Number");
rollNumberTextField=new JTextField(20);
nameLabel=new JLabel("Name");
nameTextField=new JTextField(50);
cityLabel=new JLabel("City");
cityComboBox=new JComboBox();
cityComboBox.addItem("Ujjain");
cityComboBox.addItem("Indore");
cityComboBox.addItem("Dewas");
cityComboBox.addItem("Mumbai");
isIndianLabel=new JLabel("Indian");
isIndianCheckBox=new JCheckBox("");
Vector hobbies=new Vector();
hobbies.addElement("Swimming");
hobbies.addElement("Reading");
hobbies.addElement("Cricket");
hobbies.addElement("Origami");
hobbiesLabel=new JLabel("Hobbies");
hobbiesList=new JList(hobbies);


maleRadioButton=new JRadioButton("Male");
femaleRadioButton=new JRadioButton("Female");
genderGroup=new ButtonGroup();
genderGroup.add(maleRadioButton);
genderGroup.add(femaleRadioButton);
genderLabel=new JLabel("Gender");

JPanel genderPanel=new JPanel();
genderPanel.setLayout(new GridLayout(1,2));
genderPanel.add(maleRadioButton);
genderPanel.add(femaleRadioButton);

JPanel inputPanel=new JPanel();
inputPanel.setLayout(new GridLayout(6,2));
inputPanel.add(rollNumberLabel);
inputPanel.add(rollNumberTextField);
inputPanel.add(nameLabel);
inputPanel.add(nameTextField);
inputPanel.add(cityLabel);
inputPanel.add(cityComboBox);
inputPanel.add(hobbiesLabel);
inputPanel.add(hobbiesList);
inputPanel.add(genderLabel);
inputPanel.add(genderPanel);
inputPanel.add(isIndianLabel);
inputPanel.add(isIndianCheckBox);




saveButton=new JButton("Save");
cancelButton=new JButton("Cancel");

JPanel buttonPanel=new JPanel();
buttonPanel.setLayout(new GridLayout(2,5));
buttonPanel.add(new JLabel("		"));
buttonPanel.add(saveButton);
buttonPanel.add(new JLabel("		"));
buttonPanel.add(cancelButton);
buttonPanel.add(new JLabel("		"));
buttonPanel.add(new JLabel("		"));
buttonPanel.add(new JLabel("		"));
buttonPanel.add(new JLabel("		"));
buttonPanel.add(new JLabel("		"));
buttonPanel.add(new JLabel("		"));



container=getContentPane();
container.setLayout(new BorderLayout());
container.add(headingPanel,BorderLayout.NORTH);
container.add(inputPanel,BorderLayout.CENTER);
container.add(buttonPanel,BorderLayout.SOUTH);

setLocation(100,100);
setSize(500,300);
setVisible(true);
setDefaultCloseOperation(EXIT_ON_CLOSE);
}
}
class swing2psp
{
public static void main(String gg[])
{
swing2 s=new swing2();
}
}