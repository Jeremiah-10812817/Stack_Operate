

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import java.util.ArrayList;



import javax.swing.JButton;

import javax.swing.JFrame;

import javax.swing.JOptionPane;

import javax.swing.JTextArea;

import javax.swing.SwingUtilities;



class Stack

{

 public ArrayList<String> list;

 public int top;



 public Stack()

 {

 list=new ArrayList();

 top=-1;

 }



 public void push(String s)

 {

 list.add(s);

 top++;

 }



 public void pop()

 {

 if(top!=-1)

 {

 list.remove(top);

 top--;

 }

 }



 public String toString()

 {

 String s="";

 for(int i=top;i>=0;i--)

 {

 s=s+list.get(i).toString()+"\n";

 }

 return s;

 }

}





public class TestFile extends JFrame

{



 public static void main(String[]args) throws InterruptedException

 {

 SwingUtilities.invokeLater(new Runnable(){

 public void run()

 {

 final Stack S=new Stack();



 JFrame frame=new JFrame("Kofi Addo");

 frame.setSize(500,400);

 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

 frame.setVisible(true);

 frame.setLocationRelativeTo(null);

 frame.setLayout(null);



 final JTextArea textArea= new JTextArea();

 JButton pushbutton =new JButton("Push");

 JButton popbutton =new JButton("Pop");



 pushbutton.setBounds(10, 0, 100, 40);

 popbutton.setBounds(370, 0, 100, 40);

 textArea.setBounds(0,50,500,400);



 pushbutton.setLayout(null);

 popbutton.setLayout(null);

 textArea.setLayout(null);



 frame.add(pushbutton);

 frame.add(popbutton);

 frame.add(textArea);





 pushbutton.addActionListener(new ActionListener() {

 @Override

 public void actionPerformed(ActionEvent e)

 {

 String val= JOptionPane.showInputDialog("Please enter word : ");

 S.push(val);

 textArea.setText(S.toString());

 }

 });



 popbutton.addActionListener(new ActionListener() {

 @Override

 public void actionPerformed(ActionEvent e)

 {

 S.pop();

 textArea.setText(S.toString());

 }

 });



 }



 });

 }

}