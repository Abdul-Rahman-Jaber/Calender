package Calender_;

//import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
//import java.awt.event.ItemEvent;
//import java.awt.event.ItemListener;
//import java.lang.reflect.Array;
import java.awt.event.ItemListener;

import javax.swing.JButton;
//1
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Calender_.CALENDER;
//import grafical.library;



public class Insert extends JFrame {
	private JTextField t1;
	private JTextField t2;
	//private JTextField t3;
	//private JTextField t4;
	//2
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
	
	
	public Insert() {
		super("Insert");
		c=new GridLayout(2,1);
		g=new GridLayout(2,7);
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
		//4
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
		b=new JButton("Insert");
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
		
		
		
		
	
		INSERT j=new INSERT();
		b.addActionListener(j);
		
		
	
	}
	
	//5
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
	
	
	
	
	
	
	
	
	
	
	public class INSERT implements ActionListener {
		public void actionPerformed(ActionEvent zz) {
			
			String rrrr=start[aa];
			String[]A=rrrr.split("\\:");
			String yyyy=end[bb];
			String[]B=yyyy.split("\\:");
			String []S;
			String []E;
			
			if((!(Integer.parseInt(B[0])>Integer.parseInt(A[0])))&&(!(Integer.parseInt(A[0])==23&&Integer.parseInt(B[0])==0))) {
				JOptionPane.showMessageDialog(Insert.this, " end time should be greater than start time ", "WARNING", JOptionPane.WARNING_MESSAGE);
			return;
		}
			
			for(int i=0;i<CALENDER.array.size();i++) {
			 ssss=CALENDER.array.get(i).get_Start_Time();
			 eeee=CALENDER.array.get(i).get_End_Time();
			S=ssss.split("\\:");
			E=eeee.split("\\:");
			
			
			//ÊØÇÈÞæ ÇáÈÏÇíÉ æÇáäåÇíÉ
			if((days[dd].equals(CALENDER.array.get(i).get_Day()))&&(names[kk].equals(CALENDER.array.get(i).get_Month()))&&(t5.getText().equals(CALENDER.array.get(i).get_Year()))&&(Integer.parseInt(A[0])==Integer.parseInt(S[0]))&&(Integer.parseInt(B[0])==Integer.parseInt(E[0]))) {
				JOptionPane.showMessageDialog(Insert.this, " there is another task here ", "WARNING", JOptionPane.WARNING_MESSAGE);
				return;
			}
			// ÇáäåÇíÉ Èíäåã
			if((days[dd].equals(CALENDER.array.get(i).get_Day()))&&(names[kk].equals(CALENDER.array.get(i).get_Month()))&&(t5.getText().equals(CALENDER.array.get(i).get_Year()))&&(Integer.parseInt(B[0])>Integer.parseInt(S[0]))&&(Integer.parseInt(B[0])<Integer.parseInt(E[0]))) {
				JOptionPane.showMessageDialog(Insert.this, " there in a confliction in time ", "WARNING", JOptionPane.WARNING_MESSAGE);
				return;
			}
			
			//ÇáÈÏÇíÉ Èíäåã
				if((days[dd].equals(CALENDER.array.get(i).get_Day()))&&(names[kk].equals(CALENDER.array.get(i).get_Month()))&&(t5.getText().equals(CALENDER.array.get(i).get_Year()))&&(Integer.parseInt(A[0])>Integer.parseInt(S[0]))&&(Integer.parseInt(A[0])<Integer.parseInt(E[0]))) {
					JOptionPane.showMessageDialog(Insert.this, " there in a confliction in time ", "WARNING", JOptionPane.WARNING_MESSAGE);
					return;
				}
				//ÇáÈÏÇíÉ ÚÇáÈÏÇíÉ ÇáäåÇíÉ ãÇ ÈÊåãäí
				if((days[dd].equals(CALENDER.array.get(i).get_Day()))&&(names[kk].equals(CALENDER.array.get(i).get_Month()))&&(t5.getText().equals(CALENDER.array.get(i).get_Year()))&&(Integer.parseInt(A[0])==Integer.parseInt(S[0]))) {
					JOptionPane.showMessageDialog(Insert.this, " there in a confliction in time ", "WARNING", JOptionPane.WARNING_MESSAGE);
					return;
				}
				//ÇáäåÇíÉ ÚÇáäåÇíÉ æÇáÈÏÇíÉ ãÇ ÈÊåãäí 
				if((days[dd].equals(CALENDER.array.get(i).get_Day()))&&(names[kk].equals(CALENDER.array.get(i).get_Month()))&&(t5.getText().equals(CALENDER.array.get(i).get_Year()))&&(Integer.parseInt(B[0])==Integer.parseInt(E[0]))) {
					JOptionPane.showMessageDialog(Insert.this, " there in a confliction in time ", "WARNING", JOptionPane.WARNING_MESSAGE);
					return;
				}
				
				
				
			}
			
			
			
			if((t1.getText()).equals("")||(t2.getText()).equals("")||(t5.getText()).equals("")) {
				JOptionPane.showMessageDialog(Insert.this, "there is some fields empty", "WARNING", JOptionPane.WARNING_MESSAGE);
				return ;
			}
			
			  String s=t5.getText();
				for(int i=0;i<s.length();i++) {
					if(!(s.charAt(i)>='0'&&s.charAt(i)<='9')){
						JOptionPane.showMessageDialog(Insert.this, "the year should be integer", "WARNING", JOptionPane.WARNING_MESSAGE);
						return ;
						
						}
			            }
			
			
			if ((Double.parseDouble(t5.getText()))<1970) {
				JOptionPane.showMessageDialog(Insert.this, "this is not valid year", "WARNING", JOptionPane.WARNING_MESSAGE);
			return ;
		}
			
          
            
			
			
			task a = new task();
			a.set_Title(t1.getText());
			a.set_Location(t2.getText());
			a.set_Day(days[dd]);
			a.set_Month(names[kk]);
			a.set_Year(t5.getText());
			a.set_Start_Time(start[aa]);
			a.set_End_Time(end[bb]);
			CALENDER.array.add(a);
			
			
			
		}
	}
	
	
	
		}
	
	
	
	
	
	



