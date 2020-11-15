package covertChannels;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;   

public class GUI implements ActionListener {

	private JLabel result;
	private JFrame frame;
	
	JButton Linux = new JButton("Linux");
	JButton Xen = new JButton("Xen");
	JButton Fiasco_OC = new JButton("Fiasco.OC");
	JButton TCTP = new JButton("TCTP");
	JButton SAP = new JButton("SAP");
	
	char OS, CCM;
	
	public GUI() {
		
		frame = new JFrame("Grid Layout");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 400);
		frame.setTitle("Covert Channels in Operating Systems");
		
		
		Linux.addActionListener(this);
		Linux.setSize(new Dimension(10, 10));
	
		Xen.addActionListener(this);
		Xen.setPreferredSize(new Dimension(100, 100));
		
		Fiasco_OC.addActionListener(this);
		Fiasco_OC.setPreferredSize(new Dimension(100, 100));
		
		TCTP.addActionListener(this);
		TCTP.setPreferredSize(new Dimension(100, 100));
		
		SAP.addActionListener(this);
		SAP.setPreferredSize(new Dimension(100, 100));
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(3, 4, 5, 10));	
		panel.setMaximumSize(new Dimension(100, 200));
		panel.setBackground(Color.WHITE);
		
		JLabel label1  = new JLabel("Select an Operating System: ");
		JLabel label2  = new JLabel("Select the Covert Channel Model: ");
		JLabel label3  = new JLabel("The average Decode Error Rate is: ");
		result = new JLabel("_ _ _ _ _ _");
		result.setForeground(Color.RED);
		JLabel ept1 = new JLabel(" ");
		JLabel ept2 = new JLabel(" ");
	
		panel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		
		panel.add(label1);
		panel.add(Linux);
		panel.add(Xen);
		panel.add(Fiasco_OC);
		panel.add(label2);
		panel.add(TCTP);
		panel.add(SAP);
		panel.add(ept1);
		panel.add(label3);
		panel.add(result);
		panel.add(ept2);
		
		frame.add(panel, BorderLayout.CENTER);
		frame.add(panel);
		frame.pack();
	}
	
	
	public static void main(String[] args) {
		new GUI();
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == Linux) {
			OS = 'L';
			result.setText("_ _ _ _ _ _");
			return;
		}
		else if(e.getSource() == Xen) {
			OS = 'X';
			result.setText("_ _ _ _ _ _"); 
			return;
		}
		else if(e.getSource() == Fiasco_OC) {
			OS = 'F';
			result.setText("_ _ _ _ _ _");
			return;
		}
		
		if( OS == 'L') {
			if(e.getSource() == TCTP) {
				result.setText("47.6 %");
			}
			else {
				result.setText("4.1 %");
			}
		}
		else if ( OS == 'X') {
			if(e.getSource() == TCTP) {
				result.setText("51.75 %");
			}
			else {
				result.setText("5.1 %");
			}
		}
		else if ( OS == 'F' ) {
			if(e.getSource() == TCTP) {
				result.setText("45.2 %");
			}
			else {
				result.setText("4.1 %");
			}
		}
	}
}

