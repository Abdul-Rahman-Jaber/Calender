package Calender_;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

//import Calender_.Insert.aaa;
//import Calender_.Insert.bbb;

//import Calender_.Insert.ddd;

//import Calender_.Insert.hhh;


//import Calender_.Insert.INSERT;

public class Modify extends JFrame{
	private JTextField t1;
	private JTextField t2;
	//private JTextField t3;
	//private JTextField t4;
	private JComboBox c1;
	private String names[] = {"January", "February","March", "April", "May", "June", "July","August", "September", "October", "November","December"};
	
	private JComboBox c2;
	private String days[] = {"1", "2","3", "4", "5", "6", "7","8", "9", "10", "11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};   
	
	private JComboBox c3;
	private String start[] = {"00:00", "01:00","02:00", "03:00", "04:00", "05:00", "06:00","07:00", "08:00", "09:00", "10:00","11:00","12:00","13:00","14:00","15:00","16:00","17:00","18:00","19:00","20:00","21:00","22:00","23:00"};
	
	
	private JComboBox c4;
	private String end[] = {"01:00","02:00", "03:00", "04:00", "05:00", "06:00","07:00", "08:00", "09:00", "10:00","11:00","12:00","13:00","14:00","15:00","16:00","17:00","18:00","19:00","20:00","21:00","22:00","23:00","00:00"};
	
	
	private JTextField t5;
	//private JTextField t6;
	//private JTextField t7;
	private JLabel l1;
	private JLabel l2;
	private JLabel l3;
	private JLabel l4;
	private JLabel l5;
	private JLabel l6;
	private JLabel l7;
	
	private JButton b;
	private JPanel p;
	private JPanel w;
	private GridLayout g;
	private GridLayout c;
	
	private int kk=0;
	private int dd=0;
	private int aa=0;
	private int bb=0;
	
	String eeee;
	String ssss;
	
	public Modify() {
		super("Modify");
		c=new GridLayout(2,1);
		g=new GridLayout(2,4);
		setLayout(c);
		l1=new JLabel ("     Title");
		l2=new JLabel ("     Location");
		l3=new JLabel ("     Day");
		l4=new JLabel ("     Month");
		l5=new JLabel ("     Year");
		l6=new JLabel ("     Start Time");
		l7=new JLabel ("     End Time");
		l1.setBackground(Color.RED);
		l1.setForeground(Color.WHITE);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.WHITE);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.WHITE);
		l4.setBackground(Color.RED);
		l4.setForeground(Color.WHITE);
		l5.setBackground(Color.RED);
		l5.setForeground(Color.WHITE);
		l6.setBackground(Color.RED);
		l6.setForeground(Color.WHITE);
		l7.setBackground(Color.RED);
		l7.setForeground(Color.WHITE);
		t1=new JTextField ();
		t2=new JTextField ();
		//t3=new JTextField ();
		//t4=new JTextField ();
		c1 = new JComboBox(names);
		c1.setMaximumRowCount(4);
		c2 = new JComboBox(days);
		c2.setMaximumRowCount(4);
		
		c3 = new JComboBox(start);
		c3.setMaximumRowCount(4);
		
		c4 = new JComboBox(end);
		c4.setMaximumRowCount(4);
		
		t5=new JTextField ();
		//t6=new JTextField ();
		//t7=new JTextField ();
		p=new JPanel();
		p.setLayout(g);
		p.add(l1);
		p.add(l2);
		p.add(l3);
		p.add(l4);
		p.add(l5);
		p.add(l6);
		p.add(l7);
		p.add(t1);
		p.add(t2);
		//p.add(t3);
		//p.add(t4);
		p.add(c2);
		p.add(c1);
		p.add(t5);
		p.add(c3);
		p.add(c4);
		//p.add(t6);
		//p.add(t7);
		p.setBackground(Color.RED);
		w=new JPanel();
		b=new JButton("Modify");
		b.setBackground(Color.WHITE);
		b.setForeground(Color.BLACK);
		b.setFont(new Font("Serif",Font.BOLD,18) );
		w.setBackground(Color.RED);
		w.add(b);
		add(p);
		add(w);
		
		
		hhh rr=new hhh();
		c1.addItemListener(rr);
		
		ddd ss=new ddd();
		c2.addItemListener(ss);
	
		aaa tt=new aaa();
		c3.addItemListener(tt);
		
		
		bbb yy=new bbb();
		c4.addItemListener(yy);
		
		
		MODIFY j=new MODIFY();
		b.addActionListener(j);
		
		
		
	
		
		
	}
	
	
	
	
	
	private class hhh implements ItemListener {
		public void itemStateChanged(ItemEvent event) {
			if(event.getStateChange()==ItemEvent.SELECTED) 
				 kk=c1.getSelectedIndex();
		}
	}
	
	
	private class ddd implements ItemListener {
		public void itemStateChanged(ItemEvent event) {
			if(event.getStateChange()==ItemEvent.SELECTED) 
				 dd=c2.getSelectedIndex();
		}
	}
	
	private class aaa implements ItemListener {
		public void itemStateChanged(ItemEvent event) {
			if(event.getStateChange()==ItemEvent.SELECTED) 
				 aa=c3.getSelectedIndex();
		}
	}
	
	private class bbb implements ItemListener {
		public void itemStateChanged(ItemEvent event) {
			if(event.getStateChange()==ItemEvent.SELECTED) 
				 bb=c4.getSelectedIndex();
		}
	}
	
	
	
	
	
	
	

	public class MODIFY implements ActionListener {
		public void actionPerformed(ActionEvent g) {
			
		
			if((t1.getText()).equals("")||(t2.getText()).equals("")||(t5.getText()).equals("")) {
				JOptionPane.showMessageDialog(Modify.this, "there is some fields empty", "WARNING", JOptionPane.WARNING_MESSAGE);
				return ;
			}
			
			
			  String s=t5.getText();
				for(int i=0;i<s.length();i++) {
					if(!(s.charAt(i)>='0'&&s.charAt(i)<='9')){
						JOptionPane.showMessageDialog(Modify.this, "the year should be integer", "WARNING", JOptionPane.WARNING_MESSAGE);
						return ;
						
						}
			            }
			
			
			if ((Double.parseDouble(t5.getText()))<1970) {
				JOptionPane.showMessageDialog(Modify.this, "this is not valid year", "WARNING", JOptionPane.WARNING_MESSAGE);
			return ;
		}
			
          
			boolean rr=false;
			for (int i=0;i<CALENDER.array.size();i++) {
				if((start[aa].equals(CALENDER.array.get(i).get_Start_Time()))&&(end[bb].equals(CALENDER.array.get(i).get_End_Time()))&&(days[dd].equals(CALENDER.array.get(i).get_Day()))&&(names[kk].equals(CALENDER.array.get(i).get_Month()))&&(t5.getText().equals(CALENDER.array.get(i).get_Year()))) {                                                                                                                                                                                                                                             
					CALENDER.array.get(i).set_Title(t1.getText());
					CALENDER.array.get(i).set_Location(t2.getText());
					CALENDER.array.get(i).set_Day(days[dd]);
					CALENDER.array.get(i).set_Month(names[kk]);
					CALENDER.array.get(i).set_Year(t5.getText());
					CALENDER.array.get(i).set_Start_Time(start[aa]);
					CALENDER.array.get(i).set_End_Time(end[bb]);
					rr=true;
					JOptionPane.showMessageDialog(Modify.this, "this task has been modified successfully", "WARNING", JOptionPane.WARNING_MESSAGE);
					
			}
			
			}
			if(!rr) {
				JOptionPane.showMessageDialog(Modify.this, "this task hasn't be found", "WARNING", JOptionPane.WARNING_MESSAGE);
				
			}
			
			
			
		}
		
		}
	
	
	
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


