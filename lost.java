import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.math.*;
import javax.swing.Timer;
import java.awt.font.*;
class lost
{
Timer t;
void convertor()
{
JFrame fc=new JFrame("convertor");
Font f1=new Font("Century Gothic", Font.BOLD, 13);
Font f5=new Font("Century Gothic", Font.PLAIN, 12);
JLabel lc1=new JLabel("Temprature scale convertor");
JLabel lc2=new JLabel("Speed/Veleocity convertor");
JLabel lc3=new JLabel("Length convertor");
JButton bc1=new JButton("Click to open");
JButton bc2=new JButton("Click to open");
JButton bc3=new JButton("Click to open");
fc.setSize(600,600);
lc1.setFont(f1);
lc2.setFont(f1);
lc3.setFont(f1);
bc1.setFont(f5);
bc2.setFont(f5);
bc3.setFont(f5);
lc1.setBounds(200,200,200,30);
lc2.setBounds(200,275,200,30);
lc3.setBounds(200,350,200,30);
bc1.setBounds(430,200,130,30);
bc2.setBounds(430,275,130,30);
bc3.setBounds(430,350,130,30);
bc1.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
temp();
}
});
bc2.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
speed();
}
});
bc3.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
len();
}
});
fc.add(lc1);fc.add(lc2);fc.add(bc1);fc.add(bc2);fc.add(lc3);fc.add(bc3);
fc.setLayout(null);
fc.setVisible(true);
fc.addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent e)
{
fc.dispose();
}
});
}
void temp()
{
JFrame ft=new JFrame("temprature scale convertor");
Font f2=new Font("Century Gothic", Font.BOLD, 16);
Font f5=new Font("Century Gothic", Font.PLAIN, 14);
JLabel lt1=new JLabel("Input value = ");
JLabel lt2=new JLabel("Resultant value = ");
CheckboxGroup g=new CheckboxGroup();
Checkbox cb1=new Checkbox("°F to °C",g,false);
Checkbox cb2=new Checkbox("°C to °F",g,false);
JTextField tf1=new JTextField();
JTextField tf2=new JTextField();
ft.setSize(600,600);
lt1.setFont(f2);
lt2.setFont(f2);
cb1.setFont(f5);
cb2.setFont(f5);
lt1.setBounds(150,150,200,35);
lt2.setBounds(150,230,200,35);
cb1.setBounds(175,300,80,35);
cb2.setBounds(350,300,80,35);
tf1.setBounds(375,150,120,35);
tf2.setBounds(375,230,120,35);
cb1.addItemListener(new ItemListener()
{
public void itemStateChanged(ItemEvent e)
{
try
{
double b;
b=Double.parseDouble(tf1.getText());
b=(b-32)*0.5556;
tf2.setText(b+"");
}catch(Exception m){tf1.setText("");tf2.setText("");}
tf1.addKeyListener(new KeyAdapter()
{
public void keyReleased(KeyEvent ee)
{
double a;
try
{
a=Double.parseDouble(tf1.getText());
a=(a-32)*0.5556;
tf2.setText(a+"");
}
catch(Exception mm)
{
tf1.setText("");
tf2.setText("");
}
}
});
}
});
cb2.addItemListener(new ItemListener()
{
public void itemStateChanged(ItemEvent e)
{
try
{
double b;
b=Double.parseDouble(tf1.getText());
b=(b*1.8)+32;
tf2.setText(b+"");
}catch(Exception m){tf1.setText("");tf2.setText("");}
tf1.addKeyListener(new KeyAdapter()
{
public void keyReleased(KeyEvent ee)
{
double a;
try
{
a=Double.parseDouble(tf1.getText());
a=(a*1.8)+32;
tf2.setText(a+"");
}
catch(Exception mm){tf1.setText("");tf2.setText("");}
}
});
}
});
ft.add(lt1);ft.add(lt2);ft.add(cb1);ft.add(cb2);ft.add(tf1);ft.add(tf2);
ft.setLayout(null);
ft.setVisible(true);
ft.addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent e)
{
ft.dispose();
}
});
}
void speed()
{
JFrame fs=new JFrame("speed convertor");
Font f2=new Font("Century Gothic", Font.BOLD, 16);
Font f5=new Font("Century Gothic", Font.PLAIN, 14);
JLabel ls1=new JLabel("Input value = ");
JLabel ls2=new JLabel("Resultant value = ");
JTextField ts1=new JTextField();
JTextField ts2=new JTextField();
CheckboxGroup g=new CheckboxGroup();
Checkbox cb1=new Checkbox("Km/h to M/h",g,false);
Checkbox cb2=new Checkbox("M/h to Km/h",g,false);
fs.setSize(600,600);
ls1.setFont(f2);
ls2.setFont(f2);
cb1.setFont(f5);
cb2.setFont(f5);
ls1.setBounds(150,150,145,35);
ls2.setBounds(150,200,145,35);
ts1.setBounds(325,150,70,35);
ts2.setBounds(325,200,70,35);
cb1.setBounds(175,275,120,35);
cb2.setBounds(315,275,120,35);
cb1.addItemListener(new ItemListener()
{
public void itemStateChanged(ItemEvent e)
{
try
{
double b=Double.parseDouble(ts1.getText());
b=b*0.62137119;
ts2.setText(b+"");
}
catch(Exception m){ts1.setText("");ts2.setText("");}
ts1.addKeyListener(new KeyAdapter()
{
public void keyReleased(KeyEvent ee)
{
try
{
double a=Double.parseDouble(ts1.getText());
a=a*0.62137119;
ts2.setText(""+a);
}
catch(Exception mm){ts1.setText("");ts2.setText("");}
}
});
}
});
cb2.addItemListener(new ItemListener()
{
public void itemStateChanged(ItemEvent e)
{
try
{
double b=Double.parseDouble(ts1.getText());
b=b*1.609344;
ts2.setText(""+b);
}
catch(Exception m){ts1.setText("");ts2.setText("");}
ts1.addKeyListener(new KeyAdapter()
{
public void keyReleased(KeyEvent ee)
{
try
{
double a=Double.parseDouble(ts1.getText());
a=a*1.609344;
ts2.setText(""+a);
}
catch(Exception mm){ts1.setText("");ts2.setText("");}
}
});
}
});
fs.add(ls1);fs.add(ls2);fs.add(ts1);fs.add(ts2);fs.add(cb1);fs.add(cb2);
fs.setLayout(null);
fs.setVisible(true);
fs.addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent e)
{
fs.dispose();
}
});
}
void len()
{
JFrame fl=new JFrame("length convertor");
Font f2=new Font("Century Gothic", Font.BOLD, 16);
Font f5=new Font("Century Gothic", Font.PLAIN, 14);
JLabel l1=new JLabel("Input value = ");
JLabel l2=new JLabel("Resultant value = ");
CheckboxGroup g=new CheckboxGroup();
Checkbox cb1=new Checkbox("metre to kilometre",g,false);
Checkbox cb2=new Checkbox("kilometre to metre",g,false);
JTextField tl1=new JTextField();
JTextField tl2=new JTextField();
fl.setSize(600,600);
l1.setFont(f2);
l2.setFont(f2);
cb1.setFont(f5);
cb2.setFont(f5);
l1.setBounds(150,150,145,35);
l2.setBounds(150,200,145,35);
cb1.setBounds(175,275,170,35);
cb2.setBounds(340,275,170,35);
tl1.setBounds(325,150,100,35);
tl2.setBounds(325,200,100,35);
cb1.addItemListener(new ItemListener()
{
public void itemStateChanged(ItemEvent e)
{
try
{
double b=Double.parseDouble(tl1.getText());
b=b/1000;
tl2.setText(b+"");
}
catch(Exception m){tl1.setText("");tl2.setText("");}
tl1.addKeyListener(new KeyAdapter()
{
public void keyReleased(KeyEvent ee)
{
try
{
double a=Double.parseDouble(tl1.getText());
a=a/1000;
tl2.setText(""+a);
}
catch(Exception mm){tl1.setText("");tl2.setText("");}
}
});
}
});
cb2.addItemListener(new ItemListener()
{
public void itemStateChanged(ItemEvent e)
{
try
{
double b=Double.parseDouble(tl1.getText());
b=b*1000;
tl2.setText(""+b);
}
catch(Exception m){tl1.setText("");tl2.setText("");}
tl1.addKeyListener(new KeyAdapter()
{
public void keyReleased(KeyEvent ee)
{
try
{
double a=Double.parseDouble(tl1.getText());
a=a*1000;
tl2.setText(""+a);
}
catch(Exception mm){tl1.setText("");tl2.setText("");}
}
});
}
});
fl.add(l1);fl.add(l2);fl.add(cb1);fl.add(cb2);fl.add(tl1);fl.add(tl2);
fl.setLayout(null);
fl.setVisible(true);
fl.addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent e)
{
fl.dispose();
}
});
}
void calc()
{
Frame fc=new Frame("calculator");
Font f2=new Font("Century Gothic", Font.BOLD, 13 );
Font f5=new Font("Century Gothic", Font.PLAIN, 12);
JLabel lc1=new JLabel("A = ");
JLabel lc2=new JLabel("B = ");
JLabel lr=new JLabel();
JLabel lc3=new JLabel("Result = ");
JTextField tc1=new JTextField();
JTextField tc2=new JTextField();
JButton bc1=new JButton("+");
JButton bc2=new JButton("-");
JButton bc3=new JButton("*");
JButton bc4=new JButton("/");
JButton bc5=new JButton(" = ");
JButton bc6=new JButton("C");
fc.setSize(500,500);
lc1.setFont(f2);
lc2.setFont(f2);
lr.setFont(f2);
lc3.setFont(f2);
bc1.setFont(f5);
bc2.setFont(f5);
bc3.setFont(f5);
bc4.setFont(f5);
bc5.setFont(f5);
bc6.setFont(f5);
lc1.setBounds(150,100,100,30);
lc2.setBounds(150,200,100,30);
lc3.setBounds(150,300,100,30);
tc1.setBounds(270,100,100,30);
tc2.setBounds(270,200,100,30);
bc1.setBounds(420,100,45,30);
bc2.setBounds(420,155,44,30);
bc3.setBounds(420,210,43,30);
bc4.setBounds(420,265,40,30);
bc5.setBounds(420,320,50,30);
bc6.setBounds(420,375,65,30);
lr.setBounds(270,300,100,30); 
bc1.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
try
{
String sc1=tc1.getText();
String sc2=tc2.getText();
int ic1=Integer.parseInt(sc1);
int ic2=Integer.parseInt(sc2);
int ir=ic1+ic2;
lr.setText(ir+"");
}
catch(Exception q)
{
JOptionPane.showMessageDialog(fc,"Please provide an integer input","Alert",JOptionPane.WARNING_MESSAGE);
}
}
});
bc2.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
try
{
int ic1=Integer.parseInt(tc1.getText());
int ic2=Integer.parseInt(tc2.getText());
int ir=ic1-ic2;
lr.setText(ir+"");
}
catch(Exception q)
{
JOptionPane.showMessageDialog(fc,"Please provide an integer input","Alert",JOptionPane.WARNING_MESSAGE);
}
}
});
bc3.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
try
{
int ic1=Integer.parseInt(tc1.getText());
int ic2=Integer.parseInt(tc2.getText());
int ir= ic1*ic2;
lr.setText(ir+"");
}
catch(Exception q)
{
JOptionPane.showMessageDialog(fc,"Please provide an integer input","Alert",JOptionPane.WARNING_MESSAGE);
}
}
});
bc4.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
try
{
int ic1=Integer.parseInt(tc1.getText());
int ic2=Integer.parseInt(tc2.getText());
int ir=ic1/ic2;
lr.setText(ir+"");
}
catch(Exception q)
{
JOptionPane.showMessageDialog(fc,"Please provide an integer input","Alert",JOptionPane.WARNING_MESSAGE);
}
}
});
bc5.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
try
{
String copy=lr.getText();
tc1.setText(copy);
}
catch(Exception q)
{
JOptionPane.showMessageDialog(fc,"Please provide an input first","Alert",JOptionPane.WARNING_MESSAGE);
}
}
});
bc6.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
String clear="";
tc1.setText(clear);
}
});
fc.addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent e)
{
fc.dispose();
}
});
fc.add(lc1);fc.add(lc2);fc.add(tc1);fc.add(tc2);fc.add(bc1);fc.add(bc2);fc.add(bc3);fc.add(bc4);fc.add(bc5);fc.add(bc6);fc.add(lr);fc.add(lc3);
fc.setLayout(null);
fc.setVisible(true);
}
void si()
{
Font f2=new Font("Century Gothic", Font.BOLD, 15);
Font f5=new Font("Century Gothic", Font.PLAIN, 12);
Frame f=new Frame("simple intrest calculator");
JLabel l1=new JLabel("P = ");
JLabel l2=new JLabel("R = ");
JLabel l3=new JLabel("T = ");
JLabel l4=new JLabel("SI = ");
JButton b=new JButton("Calcuate");
JTextField tf1=new JTextField();
JTextField tf2=new JTextField();
JTextField tf3=new JTextField();
JLabel r=new JLabel();
f.setSize(400,400);
l1.setFont(f2);
l2.setFont(f2);
l3.setFont(f2);
l4.setFont(f2);
r.setFont(f2);
b.setFont(f5);
l1.setBounds(100,100,35,30);
l2.setBounds(100,150,35,30);
l3.setBounds(100,200,35,30);
l4.setBounds(100,250,35,30);
b.setBounds(130,300,100,30);
tf1.setBounds(170,100,50,30);
tf2.setBounds(170,150,50,30);
tf3.setBounds(170,200,50,30);
r.setBounds(170,250,40,30);
b.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
try
{
double a=Double.parseDouble(tf1.getText());
double b=Double.parseDouble(tf2.getText());
double c=Double.parseDouble(tf3.getText());
double s=(a*b*c)/100;
r.setText(s+"");
}
catch(Exception q)
{
JOptionPane.showMessageDialog(f,"Please provide an integer or float input","Alert",JOptionPane.WARNING_MESSAGE);
}
}
});
f.add(l1);f.add(l2);f.add(l3);f.add(l4);f.add(r);f.add(b);f.add(tf1);f.add(tf2);f.add(tf3);
f.setLayout(null);
f.setVisible(true);
f.addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent e)
{
f.dispose();
}
});
}
void ci()
{
Font f2=new Font("Century Gothic", Font.BOLD, 15);
Font f5=new Font("Century Gothic", Font.PLAIN, 12);
Frame f=new Frame("Compound Intrest calculator");
JTextField tf1=new JTextField();
JTextField tf2=new JTextField();
JTextField tf3=new JTextField();
JLabel  l1=new JLabel("P = ");
JLabel l2=new JLabel("R = ");
JLabel l3=new JLabel("T = ");
JLabel l4=new JLabel("CI = ");
JLabel r=new JLabel();
JButton b=new JButton("Calculate");
l1.setFont(f2);
l2.setFont(f2);
l3.setFont(f2);
l4.setFont(f2);
r.setFont(f2);
b.setFont(f5);
f.setSize(400,400);
l1.setBounds(100,100,35,30);
l2.setBounds(100,150,35,30);
l3.setBounds(100,200,35,30);
l4.setBounds(100,250,35,30);
b.setBounds(130,300,100,30);
tf1.setBounds(170,100,50,30);
tf2.setBounds(170,150,50,30);
tf3.setBounds(170,200,50,30);
r.setBounds(170,250,40,30);
b.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
try
{
double a=Double.parseDouble(tf1.getText());
double b=Double.parseDouble(tf2.getText());
double c=Double.parseDouble(tf3.getText());
b=b/100;
b=b+1;
double ci=a*(Math.pow(b,c));
r.setText(ci+"");
}
catch(Exception q)
{
JOptionPane.showMessageDialog(f,"Please provide an integer or float input","Alert",JOptionPane.WARNING_MESSAGE);
}
}
});
f.add(l1);f.add(l2);f.add(l3);f.add(l4);f.add(r);f.add(b);f.add(tf1);f.add(tf2);f.add(tf3);
f.setLayout(null);
f.setVisible(true);
f.addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent e)
{
f.dispose();
}
});
}
void about()
{
Frame f=new Frame("About Us");
Font f2=new Font("Century Gothic", Font.BOLD, 15);
Font f5=new Font("Century Gothic", Font.PLAIN, 12);
JLabel l1=new JLabel("Developer team includes following members");
JLabel l2=new JLabel("1. SIDDHARTH CHAUDHARY");
JLabel l3=new JLabel("2. RISHABH GOYAL");
JLabel l4=new JLabel("3. UTKARSH RATHORE");
JLabel l5=new JLabel("4. PRASHANT  SHARMA");
l1.setFont(f2);
l2.setFont(f2);
l3.setFont(f2);
l4.setFont(f2);
l5.setFont(f2);
JButton b1=new JButton("Open Profile");
JButton b2=new JButton("Open Profile");
JButton b3=new JButton("Open Profile");
JButton b4=new JButton("Open Profile");
f.setSize(600,500);
b1.setFont(f5);
b2.setFont(f5);
b3.setFont(f5);
b4.setFont(f5);
l1.setBounds(80,70,330,30);
l2.setBounds(120,130,250,30);
l3.setBounds(120,200,180,30);
l4.setBounds(120,270,180,30);
l5.setBounds(120,340,180,30);
b1.setBounds(380,130,140,30);
b2.setBounds(380,200,140,30);
b3.setBounds(380,270,140,30);
b4.setBounds(380,340,140,30);
b1.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
sid();
}
});
b2.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
ri();
}
});
b3.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
muttu();
}
});
b4.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
panda();
}
});
f.add(l1);f.add(l2);f.add(l3);f.add(l4);f.add(l5);f.add(b1);f.add(b2);f.add(b3);f.add(b4);
f.setLayout(null);
f.setVisible(true);
f.addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent e)
{
f.dispose();
}
});
}
void sid()
{
Font f1=new Font("Century Gothic", Font.BOLD, 13);
Frame ff=new Frame("About Siddharth Chaudhary");
JLabel l2=new JLabel("Contribution for the project :");
JLabel l3=new JLabel("50%");
JLabel l4=new JLabel("Contact Details :-");
JLabel l5=new JLabel("E-mail ID : ");
JLabel l6=new JLabel("csiddharth581@gmail.com");
JLabel l7=new JLabel("Contact No. :");
JLabel l8=new JLabel("8851652875");
JLabel l9=new JLabel("Roll No:-");
JLabel l10=new JLabel("1609610088");
l2.setFont(f1);
l3.setFont(f1);
l4.setFont(f1);
l5.setFont(f1);
l6.setFont(f1);
l7.setFont(f1);
l8.setFont(f1);
l9.setFont(f1);
l10.setFont(f1);
ff.setSize(600,500);
l2.setBounds(150,200,200,30);
l3.setBounds(380,200,50,30);
l4.setBounds(150,270,200,30);
l5.setBounds(150,340,150,30);
l6.setBounds(330,340,220,30);
l7.setBounds(150,410,200,30);
l8.setBounds(380,410,180,30);
l9.setBounds(150,480,150,30);
l10.setBounds(330,480,180,30);
ff.addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent e)
{
ff.dispose();
}
});
ff.add(l2);ff.add(l3);ff.add(l4);ff.add(l5);ff.add(l6);ff.add(l7);ff.add(l8);ff.add(l9);ff.add(l10);
ff.setLayout(null);
ff.setVisible(true);
}
void ri()
{
Font f1=new Font("Century Gothic", Font.BOLD, 13);
Frame ff=new Frame("About Rishabh");
JLabel l2=new JLabel("Contribution for the project :");
JLabel l3=new JLabel("25%");
JLabel l4=new JLabel("Contact Details :-");
JLabel l5=new JLabel("E-mail ID : ");
JLabel l6=new JLabel("rishabh2021998@gmail.com");
JLabel l7=new JLabel("Contact No. :");
JLabel l8=new JLabel("8077798988");
JLabel l9=new JLabel("Roll No:-");
JLabel l10=new JLabel("1609610072");
ff.setSize(600,500);
l2.setFont(f1);
l3.setFont(f1);
l4.setFont(f1);
l5.setFont(f1);
l6.setFont(f1);
l7.setFont(f1);
l8.setFont(f1);
l9.setFont(f1);
l10.setFont(f1);
l2.setBounds(150,200,200,30);
l3.setBounds(380,200,50,30);
l4.setBounds(150,270,200,30);
l5.setBounds(150,340,150,30);
l6.setBounds(330,340,220,30);
l7.setBounds(150,410,200,30);
l8.setBounds(380,410,180,30);
l9.setBounds(150,480,150,30);
l10.setBounds(330,480,180,30);
ff.addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent e)
{
ff.dispose();
}
});
ff.add(l2);ff.add(l3);ff.add(l4);ff.add(l5);ff.add(l6);ff.add(l7);ff.add(l8);ff.add(l9);ff.add(l10);
ff.setLayout(null);
ff.setVisible(true);
}
void muttu()
{
Frame ff=new Frame("About Utkarsh");
Font f1=new Font("Century Gothic", Font.BOLD, 13);
JLabel l2=new JLabel("Contribution for the project :");
JLabel l3=new JLabel("25%");
JLabel l4=new JLabel("Contact Details :-");
JLabel l5=new JLabel("E-mail ID : ");
JLabel l6=new JLabel("rathoreutkarsh1998@gmail.com");
JLabel l7=new JLabel("Contact No. :");
JLabel l8=new JLabel("9411427026");
JLabel l9=new JLabel("Roll No:-");
JLabel l10=new JLabel("1609610098");
ff.setSize(600,500);
l2.setFont(f1);
l3.setFont(f1);
l4.setFont(f1);
l5.setFont(f1);
l6.setFont(f1);
l7.setFont(f1);
l8.setFont(f1);
l9.setFont(f1);
l10.setFont(f1);
l2.setBounds(150,200,200,30);
l3.setBounds(380,200,50,30);
l4.setBounds(150,270,200,30);
l5.setBounds(150,340,150,30);
l6.setBounds(330,340,220,30);
l7.setBounds(150,410,200,30);
l8.setBounds(380,410,180,30);
l9.setBounds(150,480,150,30);
l10.setBounds(330,480,180,30);
ff.addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent e)
{
ff.dispose();
}
});
ff.add(l2);ff.add(l3);ff.add(l4);ff.add(l5);ff.add(l6);ff.add(l7);ff.add(l8);ff.add(l9);ff.add(l10);
ff.setLayout(null);
ff.setVisible(true);
}
void panda()
{
Font f1=new Font("Century Gothic", Font.BOLD, 13);
Frame ff=new Frame("About Haramkhor PANDA");
JLabel l2=new JLabel("Contribution for the project :");
JLabel l3=new JLabel("0%");
JLabel l4=new JLabel("Contact Details :-");
JLabel l5=new JLabel("E-mail ID : ");
JLabel l6=new JLabel("sharma9818640094@gmail.com");
JLabel l7=new JLabel("Contact No. :");
JLabel l8=new JLabel("9910901458");
JLabel l9=new JLabel("Roll No:-");
JLabel l10=new JLabel("1609610061");
ff.setSize(600,500);
l2.setFont(f1);
l3.setFont(f1);
l4.setFont(f1);
l5.setFont(f1);
l6.setFont(f1);
l7.setFont(f1);
l8.setFont(f1);
l9.setFont(f1);
l10.setFont(f1);
l2.setBounds(150,200,200,30);
l3.setBounds(380,200,50,30);
l4.setBounds(150,270,200,30);
l5.setBounds(150,340,150,30);
l6.setBounds(330,340,220,30);
l7.setBounds(150,410,200,30);
l8.setBounds(380,410,180,30);
l9.setBounds(150,480,150,30);
l10.setBounds(330,480,180,30);
ff.addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent e)
{
ff.dispose();
}
});
ff.add(l2);ff.add(l3);ff.add(l4);ff.add(l5);ff.add(l6);ff.add(l7);ff.add(l8);ff.add(l9);ff.add(l10);
ff.setLayout(null);
ff.setVisible(true);
}
public static void main(String []args)
{
lost o=new lost();
o.kk();
}
void kk()
{
Frame f=new Frame("Loading Application");
JProgressBar p=new JProgressBar(0,2000);
Font f5=new Font("Century Gothic", Font.PLAIN, 13);
Label l=new Label("Please wait while the application is being loaded.....");
f.setSize(340,300);
int i=0;
l.setFont(f5);
p.setBounds(80,150,160,40);
l.setBounds(30,205,300,40);
p.setValue(0);
p.setStringPainted(true);
//p.setString("Please wait Loading Project");
f.add(p);f.add(l);
f.setLayout(null);
f.setVisible(true);
f.addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent q)
{
JOptionPane.showMessageDialog(f,"You cannot close the application while it is being loaded","Notification",JOptionPane.WARNING_MESSAGE);
}
});
{
while(i<=2000)
{
p.setValue(i);
i=i+50;
try{
Thread.sleep(150);
}
catch(Exception m){}
}
f.dispose();
ss();
}
}
void ss()
{
Frame f=new Frame("Calculator");
Label l=new Label("Developed by Lost Frequencies.");
Button b=new Button("Get started.");
Font f1=new Font("Century Gothic", Font.PLAIN, 22);
Font f5=new Font("Century Gothic", Font.PLAIN, 12);
b.setFont(f5);
l.setFont(f1);
f.setSize(420,400);
l.setBounds(75,150,310,30);
b.setBounds(200,200,130,30);
f.add(l);
f.setLayout(null);
f.setVisible(true);
t=new Timer(3000,new ActionListener(){
public void actionPerformed(ActionEvent e)
{
l.setText("");
try{Thread.sleep(600);}catch(Exception a){}
f.add(b);
l.setText("Let's even the odds");
t.stop();
}
});
t.start();
b.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent ee)
{
f.dispose();
start();
}
});
f.addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent e)
{
int a;
a=JOptionPane.showConfirmDialog(f,"Do you want to close the application?","Quit screen",JOptionPane.WARNING_MESSAGE);
if(a==JOptionPane.YES_OPTION)
{
f.dispose();
}
}
});
}
void start()
{
JButton b1=new JButton("Open");
JButton b2=new JButton("Open");
JButton b3=new JButton("Open");
JButton b4=new JButton("Open");
JButton ab=new JButton("About Us");
Frame f=new Frame("main screen");
Font f2=new Font("Century Gothic", Font.BOLD, 15);
Font f3=new Font("Century Gothic", Font.BOLD, 15);
Font f5=new Font("Century Gothic", Font.PLAIN, 12);
JLabel l1=new JLabel("1. Convertor");
JLabel l2=new JLabel("2. Calculator");
JLabel l3=new JLabel("3. Simple Intrest Calculator");
JLabel l4=new JLabel("4. Compound Intrest Calculator");
String s="Developed by Lost Frequencies©\n Version 1.3";
JLabel d=new JLabel(s);
d.setFont(f2);
l1.setFont(f3);
l2.setFont(f3);
l3.setFont(f3);
l4.setFont(f3);
b1.setFont(f5);
b2.setFont(f5);
b3.setFont(f5);
b4.setFont(f5);
ab.setFont(f5);
f.setSize(600,600);
l1.setBounds(100,150,100,30);
l2.setBounds(100,200,100,30);
l3.setBounds(100,250,250,30);
l4.setBounds(100,300,250,30);
b1.setBounds(370,150,100,30);
b2.setBounds(370,200,100,30);
b3.setBounds(370,250,100,30);
b4.setBounds(370,300,100,30);
ab.setBounds(475,500,100,30);
d.setBounds(35,500,340,30);
b1.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
convertor();
}
});
b2.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
calc();
}
});
b3.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
si();
}
});
b4.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
ci();
}
});
f.addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent e)
{
Font f2=new Font("Century Gothic", Font.BOLD, 13);
Font f5=new Font("Century Gothic", Font.PLAIN, 12);
Frame ff=new Frame("Quit screen");
JLabel lq=new JLabel("Are you sure you want to quit the application");
JButton b1=new JButton("Yes, I'm sure");
JButton b2=new JButton("No");
lq.setFont(f2);
b1.setFont(f5);
b2.setFont(f5);
ff.setSize(600,300);
lq.setBounds(200,100,300,35);
b1.setBounds(210,160,110,35);
b2.setBounds(350,160,80,35);
b1.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
f.dispose();
System.out.println("Application Closed Successfully.....");
JOptionPane.showMessageDialog(ff,"Application was closed successfully");
ff.dispose();
}
});
b2.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
ff.dispose();
}
});
ff.addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent e)
{
ff.dispose();
}
});
ff.add(lq);ff.add(b1);ff.add(b2);
ff.setLayout(null);
ff.setVisible(true);
}
});
ab.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
about();
}
});
f.add(l1);f.add(l2);f.add(l3);f.add(l4);f.add(d);f.add(b1);f.add(b2);f.add(b3);f.add(b4);f.add(ab);
f.setLayout(null);
f.setVisible(true);
}
}