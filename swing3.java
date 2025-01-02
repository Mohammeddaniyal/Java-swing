import java.awt.*;
import javax.swing.*;
class swing3 extends JFrame
{
private JTable table;
private JScrollPane jsp;
private Object[][] data;
private String[] title;
private Container container;
private void populateDataStructure()
{
title=new String[3];
title[0]="S.No";
title[1]="Roll number";
title[2]="Name";
data=new Object[4][3];
data[0][0]=1;
data[0][1]=101;
data[0][2]="Danish";
data[1][0]=2;
data[1][1]=102;
data[1][2]="Arshad";
data[2][0]=3;
data[2][1]=103;
data[2][2]="Shadab";
data[3][0]=4;
data[3][1]=104;
data[3][2]="Faizan";
}
swing3()
{
populateDataStructure();
table=new JTable(data,title);
Font font=new Font("Times New Roman",Font.PLAIN,24);
table.setFont(font);
table.setRowHeight(30);
jsp=new JScrollPane(table,ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
container=getContentPane();
container.setLayout(new BorderLayout());
container.add(jsp);

Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
int width=600;
int height=600;
setSize(width,height);
int x=(d.width/2)-(width/2);
int y=(d.height/2)-(height/2);
setLocation(x,y);
setVisible(true);
setDefaultCloseOperation(EXIT_ON_CLOSE);
}
}
class swing3psp 
{
public static void main(String gg[])
{
swing3 s=new swing3();
}
}