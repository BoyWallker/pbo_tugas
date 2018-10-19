package pbo_tugas;
import javax.swing.*; 
import java.awt.event.*;

public class RentalPs extends JFrame 
{
JLabel lblnama=new JLabel("NAMA PENYEWA");    
JTextField txnama=new JTextField(20);    
JLabel lblid=new JLabel("ID PENYEWA");    
JTextField txnid=new JTextField(7);    
JLabel lblpembelian=new JLabel("JENIS PS");    
JRadioButton ps2=new JRadioButton("PS 2");    
JRadioButton ps3=new JRadioButton("PS 3");

JRadioButton ps4=new JRadioButton("PS 4");

ButtonGroup total=new ButtonGroup();    
JLabel lbltotal=new JLabel("WAKTU MENYEWA"); 

JCheckBox duajam=new JCheckBox("2 JAM");    
JCheckBox empatjam=new JCheckBox("4 JAM");    
JCheckBox delapanjam=new JCheckBox("8 JAM"); 
JCheckBox satujam=new JCheckBox("1 JAM");    
JCheckBox tigajam=new JCheckBox("3 JAM");    
JCheckBox enamjam=new JCheckBox("6 JAM");

JButton cetak=new JButton("Cetak");    
JTextArea hasil=new JTextArea();    
    
RentalPs()    
{       
 setTitle("RENTAL PS");       
 setLocation(300,200);       
 setSize(350,340);       
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
}  
 
 void KomponenVisual()    
 {       
  getContentPane().setLayout(null);
  getContentPane().add(lblnama);       
  lblnama.setBounds(10,10,100,20);       
  getContentPane().add(txnama);       
  txnama.setBounds(145,10,175,20);       
  getContentPane().add(lblid);       
  lblid.setBounds(10,33,80,20);       
  getContentPane().add(txnid);       
  txnid.setBounds(145,33,175,20);       
  getContentPane().add(lblpembelian);      
  lblpembelian.setBounds(10,56,80,20);  
  total.add(ps2);    
  total.add(ps3); 
  total.add(ps4);
  getContentPane().add(ps2);  
  ps2.setBounds(145,56,62,20);    
  getContentPane().add(ps3);
  ps3.setBounds(210,56,60,20);  
  getContentPane().add(ps4);
  ps4.setBounds(270,56,100,20);
  
  getContentPane().add(lbltotal);       
  lbltotal.setBounds(10,80,130,20);       
  getContentPane().add(duajam);       
  duajam.setBounds(145,80,100,20);       
  getContentPane().add(empatjam);       
  empatjam.setBounds(145,103,100,20);       
  getContentPane().add(delapanjam);       
  delapanjam.setBounds(145,126,100,20);      
  
  getContentPane().add(satujam);       
  satujam.setBounds(250,80,100,20);       
  getContentPane().add(tigajam);       
  tigajam.setBounds(250,103,100,20);       
  getContentPane().add(enamjam);       
  enamjam.setBounds(250,126,100,20);      
  
  getContentPane().add(cetak);       
  cetak.setBounds(10,150,310,20);       
  getContentPane().add(hasil);       
  hasil.setBounds(10,180,310,100);       
  setVisible(true); 
 }

 void AksiReaksi()    
 {       
  cetak.addActionListener(new ActionListener()       
  {          
   public void actionPerformed(ActionEvent e)          
   {             
    hasil.append(txnama.getText()+"\n");             
    hasil.append(txnid.getText()+"\n");             
    if(ps2.isSelected()==true)             
    {                
     hasil.append(ps2.getText()+"\n");             
    }             
    else             
    {                
    hasil.append(ps3.getText()+"\n");             
    }  
    if(duajam.isSelected()==true)             
    {                
     hasil.append(duajam.getText()+"\n");             
    }             
    if(empatjam.isSelected()==true)             
    {                
     hasil.append(empatjam.getText()+"\n");             
    }             
    if(delapanjam.isSelected()==true)             
    {                
     hasil.append(delapanjam.getText()+"\n");             
    } 
    
    if(satujam.isSelected()==true)             
    {                
     hasil.append(satujam.getText()+"\n");             
    }             
    if(tigajam.isSelected()==true)             
    {                
     hasil.append(tigajam.getText()+"\n");             
    }             
    if(enamjam.isSelected()==true)             
    {                
     hasil.append(enamjam.getText()+"\n");             
    }
    
  }       
  });    
 }  
  public static void main(String args[])    
  {       
   RentalPs e5=new RentalPs();       
   e5.KomponenVisual();       
   e5.AksiReaksi();    
  }

}