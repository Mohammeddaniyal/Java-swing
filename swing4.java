import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;
class StudentTableModel extends AbstractTableModel
{
private Object[][] data;
private String[] title;
StudentTableModel()
{
populateDataStructure();
}
private void populateDataStructure()
{
title=new String[3];
title[0]="S.No";
title[1]="Roll number";
title[2]="Name";
data=new Object[4][3];
/*
data[0][0]=1;
data[0][1]=101;
data[0][2]="Danish";

data[1][0]=2;
data[1][1]=102;
data[1][2]="Alpha";

data[2][0]=3;
data[2][1]=103;
data[2][2]="Beta";

data[3][0]=4;
data[3][1]=104;
data[3][2]="Tanish";
*/
}
public int getRowCount()
{
return data.length;
}
public int getColumnCount()
{
return title.length;
}
public String getColumnName(int columnIndex)
{
return title[columnIndex];
}
public Object getValueAt(int rowIndex,int columnIndex)
{
return data[rowIndex][columnIndex];
}
public boolean isCellEditable(int rowIndex,int columnIndex)
{
return false;
}
public Class getColumnClass(int columnIndex)
{
Class c=null;
try
{
if(columnIndex==0 || columnIndex==1)
{
c=Class.forName("java.lang.Integer");
}
if(columnIndex==2)
{
c=Class.forName("java.lang.String");
}
}catch(Exception e)
{
System.out.println(e);//this should never happen
}
return c;
}
}
class swing4 extends JFrame
{
private StudentTableModel studentTableModel;
private JTable table;
private JScrollPane jsp;
private Container container;
swing4()
{
studentTableModel=new StudentTableModel();
table=new JTable(studentTableModel);
Font font=new Font("Times New Roman",Font.PLAIN,24);
table.setFont(font);
table.setRowHeight(30);
jsp=new JScrollPane(table,ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
container=getContentPane();
container.setLayout(new BorderLayout());
container.add(jsp);
Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
int width=600;
int heigth=600;
setSize(width,heigth);
int x=(d.width/2)-(width/2);
int y=(d.height/2)-(heigth/2);
setLocation(x,y);
setVisible(true);
setDefaultCloseOperation(EXIT_ON_CLOSE);
}
}
class swing4psp
{
public static void main(String gg[])
{
swing4 s=new swing4();
}
}