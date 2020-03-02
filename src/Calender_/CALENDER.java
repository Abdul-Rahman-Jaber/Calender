package Calender_;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import polynomial.Term;

import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CALENDER extends JFrame{
	public static ArrayList<task> array;
	private GridLayout gridlayout1;
	private JPanel panel;
	private JButton button1;
	private JButton button2;
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	private JLabel label4;
	private String month[] = {"January", "February","March", "April", "May", "June", "July","August", "September", "October", "November","December"};
	private GridLayout gridlayout2;
	private JPanel panel2;
	private JLabel label5;
	private JLabel label6;
	private JLabel label7;
	private JLabel label8;
	private JLabel label9;
	private JLabel label10;
	private JLabel label11;
	private JButton[] buttons;
	
	private JButton button11;
	private JButton button22;
	private JButton button33; 
	private JPanel pp;
	
	GregorianCalendar p;
	GregorianCalendar m;
	GregorianCalendar nex;
	
	
	//
	private JTextArea t;
	//
	public CALENDER() {
		
		super("Calender");
		array=new ArrayList<task>();
		
		//
		t=new JTextArea("  Title\t\tLocation\t\tStart Time\t\tEnd Time\n  ------------------------------------------------------------------------------------------------------------------------------------------------");
		t.setEnabled(false);
		t.setBackground(Color.BLACK);
		//
		button11=new JButton("Insert");
		button22=new JButton("Modify");
		button33=new JButton("Delete");
		pp=new JPanel();
		pp.setBackground(Color.BLUE);
		pp.add(button11);
		pp.add(button22);
		pp.add(button33);
		add(pp,BorderLayout.SOUTH);
		p=new GregorianCalendar();
		int x=p.get(Calendar.YEAR);
        int y=p.get(Calendar.MONTH);
		m=new GregorianCalendar(x,y,1);
		int beg =m.get(Calendar.DAY_OF_WEEK);
		gridlayout1=new GridLayout(1,6);
		panel=new JPanel();
		panel.setLayout(gridlayout1);
		button1=new JButton("<");
		button1.setFont(new Font("Serif",Font.BOLD,20));
		button1.setBackground(Color.PINK);
		button2=new JButton(">");
		button2.setFont(new Font("Serif",Font.BOLD,20));
		button2.setBackground(Color.PINK);
		Integer o=p.get(Calendar.MONTH);
		label1=new JLabel(month[o]);
		label1.setFont(new Font("Serif",Font.BOLD,17));
		label1.setForeground(Color.BLACK);
		label2=new JLabel(p.get(Calendar.YEAR)+"");
		label2.setFont(new Font("Serif",Font.BOLD,17));
		label2.setForeground(Color.BLUE);
	    label3=new JLabel("  ");
		label4=new JLabel("  ");
		panel.add(button1);
		panel.add(label3);
		panel.add(label1);
		panel.add(label2);
		panel.add(label4);
		panel.add(button2);
		panel.setBackground(Color.lightGray);
		add(panel,BorderLayout.NORTH);
		
		
		gridlayout2=new GridLayout(7,7,10,10);
		panel2=new JPanel();
		panel2.setLayout(gridlayout2);
		label5=new JLabel("     SU  ");
		label5.setFont(new Font("Serif",Font.BOLD,15));
		label5.setForeground(Color.red);
		label5.setBackground(Color.BLACK);
		label6=new JLabel("     MO  ");
		label6.setFont(new Font("Serif",Font.BOLD,15));
		label6.setForeground(Color.red);
		label6.setBackground(Color.BLACK);
		label7=new JLabel("     TU  ");
		label7.setFont(new Font("Serif",Font.BOLD,15));
		label7.setForeground(Color.red);
		label7.setBackground(Color.BLACK);
		label8=new JLabel("     WE  ");
		label8.setFont(new Font("Serif",Font.BOLD,15));
		label8.setForeground(Color.red);
		label8.setBackground(Color.BLACK);
		label9=new JLabel("     TH  ");
		label9.setFont(new Font("Serif",Font.BOLD,15));
		label9.setForeground(Color.red);
		label9.setBackground(Color.BLACK);
		label10=new JLabel("     FR  ");
		label10.setFont(new Font("Serif",Font.BOLD,15));
		label10.setForeground(Color.red);
		label10.setBackground(Color.BLACK);
		label11=new JLabel("     SA  ");
		label11.setFont(new Font("Serif",Font.BOLD,15));
		label11.setForeground(Color.red);
		label11.setBackground(Color.BLACK);
		panel2.add(label5);
		panel2.add(label6);
		panel2.add(label7);
		panel2.add(label8);
		panel2.add(label9);
		panel2.add(label10);
		panel2.add(label11);
		
		buttons=new JButton[42];
		for(int i=0;i<42;i++) {
			buttons[i]=new JButton();
			buttons[i].setBackground(Color.BLACK);
			buttons[i].setForeground(Color.WHITE);
			panel2.add(buttons[i]);
		}
		int v=1;
		int bg=beg-2;
		for (int i=beg-1;i<=p.getActualMaximum(Calendar.DAY_OF_MONTH)+bg;i++) {
			buttons[i].setText(v+"");
			v++;
	}
		panel2.setBackground(Color.YELLOW);
		add(panel2,BorderLayout.CENTER);
		//bolding
		int ff=0;
		for (int s=0;s<month.length;s++) {
			if(label1.getText().equals(month[s])) {
				ff=s;
				break;
		}
		}
	for(int e=beg-1;e<=p.getActualMaximum(Calendar.DAY_OF_MONTH)+bg;e++) {
		if((Integer.parseInt(buttons[e].getText())==p.get(Calendar.DATE))&&(Integer.parseInt(label2.getText())==p.get(Calendar.YEAR))&&(ff==p.get(Calendar.MONTH))) {          
				buttons[e].setForeground(Color.BLACK);
	         	buttons[e].setBackground(Color.WHITE);}
	
	}
	//end bolding
	for(int a=0;a<42;a++) {
		if(buttons[a].getText().equals("")) {
			buttons[a].setVisible(false);
		}
	}
	
		moving g=new moving();
		button1.addActionListener(g);
		button2.addActionListener(g);
		
		pressing h=new pressing();
		for(int i=0;i<42;i++) {
			buttons[i].addActionListener(h);
		}
		
		
		
		
		
		Inserting i=new Inserting();
		button11.addActionListener(i);
		
		Modifying d=new Modifying();
		button22.addActionListener(d);
		
		Deleting c=new Deleting();
		button33.addActionListener(c);
		
		
		
		
	}
	
	//******
	public void sorting(ArrayList<task> y) {
		String qw;
		String []A;
		String al;
		String []B;
		
		for (int i = 0; i < y.size(); i++) {
			for (int j = 0; j < (y.size()) - 1; j++) {
				task h = y.get(j);
				task l = y.get(j + 1);
				 qw=h.get_Start_Time();
				A=qw.split("\\:");
				 al=l.get_Start_Time();
				B=al.split("\\:");
				
				if (Integer.parseInt(A[0]) > Integer.parseInt(B[0])) {
					task r = new task();
					r.set_Title(h.get_Title());
					r.set_Location(h.get_Location());
					r.set_Day(h.get_Day());
					r.set_Month(h.get_Month());
					r.set_Year(h.get_Year());
					r.set_Start_Time(h.get_Start_Time());
					r.set_End_Time(h.get_End_Time());
					
					h.set_Title(l.get_Title());
					h.set_Location(l.get_Location());
					h.set_Day(l.get_Day());
					h.set_Month(l.get_Month());
					h.set_Year(l.get_Year());
					h.set_Start_Time(l.get_Start_Time());
					h.set_End_Time(l.get_End_Time());
					
					l.set_Title(r.get_Title());
					l.set_Location(r.get_Location());
					l.set_Day(r.get_Day());
					l.set_Month(r.get_Month());
					l.set_Year(r.get_Year());
					l.set_Start_Time(r.get_Start_Time());
					l.set_End_Time(r.get_End_Time());
					

				}
			}
		}
	}
	//******
	
	
	private class moving implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			for(int l=0;l<42;l++) {
					buttons[l].setVisible(true);
			}
			
			int l=0;
			int f=0;
			if(e.getSource()==button1) {
			for(int i=0;i<42;i++) {
				buttons[i].setText("");}
				for (int j=0;j<month.length;j++) {
					
					if(label1.getText().equals(month[j])) {
						l=j;
						break;
						
				}
				}
				if(l==0) {
					label1.setText(month[11]);
					label2.setText((Integer.parseInt(label2.getText())-1)+"");
				}
				else {
				label1.setText(month[l-1]);
				}
				int b=0;
				int c=Integer.parseInt(label2.getText());
                for (int i=0;i<month.length;i++) {
					if(label1.getText().equals(month[i])) {
						b=i;
						break;
				}
                }
				nex=new GregorianCalendar(c,b,1);
                int begin=nex.get(Calendar.DAY_OF_WEEK);
                int a=1;
                int g=begin-2;
        		for (int r=begin-1;r<=nex.getActualMaximum(Calendar.DAY_OF_MONTH)+g;r++) {
        			buttons[r].setText(a+"");
        			a++;
        	}
        		 
        		//bolding
        		for(int i=0;i<42;i++) {
        			buttons[i].setBackground(Color.BLACK);
        			buttons[i].setForeground(Color.WHITE);
        		}
        		
        		int fff=0;
        		for (int s=0;s<month.length;s++) {
        			if(label1.getText().equals(month[s])) {
        				fff=s;
        				break;
        		}
        		}
        	for(int q=begin-1;q<=nex.getActualMaximum(Calendar.DAY_OF_MONTH)+g;q++) {
        		if((Integer.parseInt(buttons[q].getText())==p.get(Calendar.DATE))&&(Integer.parseInt(label2.getText())==p.get(Calendar.YEAR))&&(fff==p.get(Calendar.MONTH))) {          
        				buttons[q].setForeground(Color.BLACK);
        	         	buttons[q].setBackground(Color.WHITE);}
        	
        	}
        	
        	for(int n=0;n<42;n++) {
        		if(buttons[n].getText().equals("")) {
        			buttons[n].setVisible(false);
        		}
        	}
        	
			}
			
			else if(e.getSource()==button2) {
				for(int m=0;m<42;m++) {
					buttons[m].setVisible(true);
				}
				
				for(int h=0;h<42;h++) {
					buttons[h].setText("");}
					for (int y=0;y<month.length;y++) {
						
						if(label1.getText().equals(month[y])) {
							f=y;
							break;	
					}
					}
					if(f==11) {
						label1.setText(month[0]);
						label2.setText((Integer.parseInt(label2.getText())+1)+"");
					}
					else {
					label1.setText(month[f+1]);
					}
					int n=0;
					int q=Integer.parseInt(label2.getText());
	                for (int p=0;p<month.length;p++) {
						if(label1.getText().equals(month[p])) {
							n=p;
							break;
					}
	                }
					nex=new GregorianCalendar(q,n,1);
	                int beginn=nex.get(Calendar.DAY_OF_WEEK);
	                int d=1;
	                int t=beginn-2;
	        		for (int v=beginn-1;v<=nex.getActualMaximum(Calendar.DAY_OF_MONTH)+t;v++) {
	        			buttons[v].setText(d+"");
	        			d++;
	        	}
	           
	        		//bolding
	        		for(int i=0;i<42;i++) {
	        			buttons[i].setBackground(Color.BLACK);
	        			buttons[i].setForeground(Color.WHITE);
	        		}
	        		
	        		int fff=0;
	        		for (int s=0;s<month.length;s++) {
	        			if(label1.getText().equals(month[s])) {
	        				fff=s;
	        				break;
	        		}
	        		}
	        	for(int c=beginn-1;c<=nex.getActualMaximum(Calendar.DAY_OF_MONTH)+t;c++) {
	        		if((Integer.parseInt(buttons[c].getText())==p.get(Calendar.DATE))&&(Integer.parseInt(label2.getText())==p.get(Calendar.YEAR))&&(fff==p.get(Calendar.MONTH))) {          
	        				buttons[c].setForeground(Color.BLACK);
	        	         	buttons[c].setBackground(Color.WHITE);}
	        	
	        	}
	        		
	        	for(int w=0;w<42;w++) {
	        		if(buttons[w].getText().equals("")) {
	        			buttons[w].setVisible(false);
	        		}
	        	}	
	        		
			}//else	
			}	
		}//end handler
	
	
	
	
	
	
	private class pressing implements ActionListener {
		public void actionPerformed(ActionEvent g) {
			
			t=new JTextArea("  Title\t\tLocation\t\tStart Time\t\tEnd Time\n  ------------------------------------------------------------------------------------------------------------------------------------------------");
			t.setEnabled(false);
			t.setBackground(Color.BLACK);
			
			//1
			int r=0;
			for(int i=0;i<42;i++) {
				if(g.getSource()==buttons[i]) {
					r=i;
					break;
				}
			}
			
			//******
			sorting(array);
			
			//******
			for(int j=0;j<array.size();j++) {
				if(((array.get(j).get_Year()).equals(label2.getText()))&&((array.get(j).get_Month()).equals(label1.getText()))&&((array.get(j).get_Day()).equals(buttons[r].getText()))) {
					t.append("\n"+"   "+array.get(j).get_Title()+"\t"+"\t"+array.get(j).get_Location()+"\t"+"\t"+array.get(j).get_Start_Time()+"\t"+"\t"+array.get(j).get_End_Time());
				}
			}
			//1
			
			
			
		
			
			Tasking u=new Tasking();
			u.add(new JScrollPane(t),BorderLayout.CENTER);
			u.setSize(620,500);
			u.setVisible(true);
			u.setResizable(false);
		
			
	
	
	
	
		}
		
	}
	
	private class Inserting implements ActionListener {
		public void actionPerformed(ActionEvent j) {
	
			Insert u=new Insert();
			u.setSize(620,130);
			u.setVisible(true);
			u.setResizable(false);
			
}
	}
	private class Modifying implements ActionListener {
		public void actionPerformed(ActionEvent g) {
			Modify w=new Modify();
			w.setSize(620,130);
			w.setVisible(true);
			w.setResizable(false);
		}
	}
	
	private class Deleting implements ActionListener {
		public void actionPerformed(ActionEvent g) {
			Delete s=new Delete();
			s.setSize(620,150);
			s.setVisible(true);
			s.setResizable(false);
		}
	}
	
	
	
	
	
	
	}
	
	
	
	

