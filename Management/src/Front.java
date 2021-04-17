
import java.awt.*;
import javax.swing.*;
//import java.lang.Thread;
import java.awt.event.*;
interface ActionListener{
    void actionPerformed(ActionEvent ae);

}
class Front implements ActionListener {
    JFrame f;
    JLabel l1,id;
    JButton b;
    //Constructor
    Front(){
        f = new JFrame("Management System");
        f.setBackground(Color.yellow);
        f.setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Images/front.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1200,700,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        
        l1.setBounds(0,150,1360,530);
        f.add(l1);


        b = new JButton("CLICK HERE TO CONTINUE");
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        

        b.setBounds(500,600,300,70);
        b.addActionListener(null);

        id=new JLabel();
        id.setBounds(0,0,1360,750);
        id.setLayout(null);
        
   

        JLabel lid=new JLabel("MANAGEMENT SYSTEM");
        lid.setBounds(80,30,1500,100);
        lid.setFont(new Font("serif",Font.PLAIN,70));
        lid.setForeground(Color.red);
        id.add(lid);

        id.add(b);
        f.add(id);
        
        
        f.getContentPane().setBackground(Color.WHITE);

        f.setVisible(true);
        f.setSize(1360,750);
        f.setLocation(200,100);

    }
    @Override
    public void actionPerformed(ActionEvent ae){

        if(ae.getSource()==b){
            f.setVisible(false);
              new login();    
        }
    }

    public static void main(String[] arg){
        Front f = new Front();
    }
}
