
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class A2 extends JFrame
{
Container c;
JLabel labNumber;
JTextField txtNumber;
JButton btnFind;

A2()
{
c=getContentPane();
c.setLayout(null);

labNumber = new JLabel("enter number");
txtNumber=new JTextField(10);
btnFind=new JButton("Find");

Font f=new Font("courier",Font.BOLD+Font.ITALIC,40);
labNumber.setFont(f);
txtNumber.setFont(f);
btnFind.setFont(f);


labNumber.setBounds(100,30,400,50);
txtNumber.setBounds(100,130,400,50);
btnFind.setBounds(100,250,300,50);


btnFind.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent ae)
{
try {

String s=txtNumber.getText();
int n=Integer.parseInt(s);
String res=n%2==0?"even":"odd";
JOptionPane.showMessageDialog(c,res,"rawas",JOptionPane.INFORMATION_MESSAGE);
}
catch(NumberFormatException e)
{
JOptionPane.showMessageDialog(c,"integers only","kya coder bnega re tu",JOptionPane.ERROR_MESSAGE);
txtNumber.setText("");
txtNumber.requestFocus();

}

}


});


 c.add(labNumber);
c.add(txtNumber);
c.add(btnFind);




setTitle("even odd app");;
setSize(600,600);
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
}

}

class A2Test
{
public static void main(String args[])
{
A2 a=new A2();

}

}


