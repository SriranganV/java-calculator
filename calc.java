package basic;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import java.awt.Color;
import java.awt.Component;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;

public class calc {



		private JFrame frmCalculator;
		private JTextField txtEnter;
		private  ButtonGroup buttonGroup = new ButtonGroup();
		private  ButtonGroup buttonGroup_1 = new ButtonGroup();
		private JButton btnNewButton_1 = new JButton("<--");
		private JButton btnNewButton_1_1 = new JButton("C");
		private JButton btnNewButton_1_2 = new JButton("+");
		private JButton btnNewButton_2 = new JButton("7");
		private JButton btnNewButton_3 = new JButton("8");
		private JButton btnNewButton_4 = new JButton("9");
		private JButton btnNewButton_5 = new JButton("-");
		private JButton btnNewButton_6 = new JButton("4");
		private JButton btnNewButton_7 = new JButton("5");
		private JButton btnNewButton_8 = new JButton("6");
		private JButton btnNewButton_9 = new JButton("×");
		private JButton btnNewButton_10 = new JButton("1");
		private JButton btnNewButton_11 = new JButton("2");
		private JButton btnNewButton_12 = new JButton("3");
		private	JButton btnNewButton_13 = new JButton("/");
		private	JButton btnNewButton_10_1 = new JButton("0");
		private JButton btnNewButton_10_3 = new JButton(".");
		private JButton btnNewButton_10_4 = new JButton("=");
		private JRadioButton rdbtnNewRadioButton = new JRadioButton("ON");
		private JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("OFF");
		private JLabel topLabel = new JLabel("");
		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						Calculator window = new Calculator();
						window.frmCalculator.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}

		/**
		 * Create the application.
		 * @return 
		 */
		public void Calculator() {
			initialize();
			rdbtnNewRadioButton.setEnabled(false);
		}
		double num,ans;
		int calculation;
		
		public void operation() {
			switch(calculation) {
			case 1:
				ans = num + Double.parseDouble(txtEnter.getText());
				txtEnter.setText(Double.toString(ans));
				break;
			case 2:
				ans = num - Double.parseDouble(txtEnter.getText());
				txtEnter.setText(Double.toString(ans));
				break;
			case 3:
				ans = num * Double.parseDouble(txtEnter.getText());
				txtEnter.setText(Double.toString(ans));
				break;
			case 4:
				ans = num / Double.parseDouble(txtEnter.getText());
				txtEnter.setText(Double.toString(ans));
				break;
			}
		}
		
		public void disable() {
			txtEnter.setEnabled(false);
			
			rdbtnNewRadioButton.setEnabled(true);
			rdbtnNewRadioButton_1.setEnabled(false);
			
			btnNewButton_1.setEnabled(false);
			btnNewButton_2.setEnabled(false);
			btnNewButton_1_1.setEnabled(false);
			btnNewButton_1_2.setEnabled(false);
			btnNewButton_3.setEnabled(false);
			btnNewButton_4.setEnabled(false);
			btnNewButton_5.setEnabled(false);
			btnNewButton_6.setEnabled(false);
			btnNewButton_7.setEnabled(false);
			btnNewButton_8.setEnabled(false);
			btnNewButton_9.setEnabled(false);
			btnNewButton_10.setEnabled(false);
			btnNewButton_10_1.setEnabled(false);
			btnNewButton_10_3.setEnabled(false);
			btnNewButton_10_4.setEnabled(false);
			btnNewButton_11.setEnabled(false);
			btnNewButton_12.setEnabled(false);
			btnNewButton_13.setEnabled(false);
		}
		
		public void enable() {
			txtEnter.setEnabled(true);
			
			rdbtnNewRadioButton.setEnabled(false);
			rdbtnNewRadioButton_1.setEnabled(true);
			
			btnNewButton_1.setEnabled(true);
			btnNewButton_2.setEnabled(true);
			btnNewButton_1_1.setEnabled(true);
			btnNewButton_1_2.setEnabled(true);
			btnNewButton_3.setEnabled(true);
			btnNewButton_4.setEnabled(true);
			btnNewButton_5.setEnabled(true);
			btnNewButton_6.setEnabled(true);
			btnNewButton_7.setEnabled(true);
			btnNewButton_8.setEnabled(true);
			btnNewButton_9.setEnabled(true);
			btnNewButton_10.setEnabled(true);
			btnNewButton_10_1.setEnabled(true);
			btnNewButton_10_3.setEnabled(true);
			btnNewButton_10_4.setEnabled(true);
			btnNewButton_11.setEnabled(true);
			btnNewButton_12.setEnabled(true);
			btnNewButton_13.setEnabled(true);
		}
		

		/**
		 * Initialize the contents of the frame.
		 */
		private void initialize() {
			
			frmCalculator = new JFrame();
			frmCalculator.getContentPane().setBackground(SystemColor.inactiveCaption);
			frmCalculator.getContentPane().setLayout(null);
			
			txtEnter = new JTextField();
			txtEnter.setFont(new Font("SansSerif", Font.BOLD, 20));
			txtEnter.setHorizontalAlignment(SwingConstants.RIGHT);
			txtEnter.setBounds(10, 11, 267, 25);
			txtEnter.setBackground(SystemColor.text);
			frmCalculator.getContentPane().add(txtEnter);
			txtEnter.setColumns(10);
			
			
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int length = txtEnter.getText().length();
					int index = txtEnter.getText().length() - 1;
					String store;
					
					if(length > 0) {
						StringBuilder forward = new StringBuilder(txtEnter.getText());
						forward.deleteCharAt(index);
						store = forward.toString();
						txtEnter.setText(store);
					}
				}
			});
			btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
			btnNewButton_1.setBounds(79, 47, 59, 41);
			frmCalculator.getContentPane().add(btnNewButton_1);
			
			
			btnNewButton_1_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					txtEnter.setText("");
				}
			});
			btnNewButton_1_1.setFont(new Font("SansSerif", Font.BOLD, 20));
			btnNewButton_1_1.setBounds(148, 47, 59, 41);
			frmCalculator.getContentPane().add(btnNewButton_1_1);
			
			
			btnNewButton_1_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					num = Double.parseDouble(txtEnter.getText());
					calculation = 1;
					txtEnter.setText("");
					topLabel.setText(num + "+");
				}
			});
			btnNewButton_1_2.setFont(new Font("SansSerif", Font.BOLD, 20));
			btnNewButton_1_2.setBounds(217, 47, 60, 41);
			frmCalculator.getContentPane().add(btnNewButton_1_2);
			
			
			btnNewButton_2.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					txtEnter.setText(txtEnter.getText() + "7");
				}
			});
			btnNewButton_2.setFont(new Font("SansSerif", Font.BOLD, 20));
			btnNewButton_2.setBounds(10, 99, 59, 41);
			frmCalculator.getContentPane().add(btnNewButton_2);
			
			
			btnNewButton_3.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					txtEnter.setText(txtEnter.getText() + "8");
				}
			});
			btnNewButton_3.setFont(new Font("SansSerif", Font.BOLD, 20));
			btnNewButton_3.setBounds(79, 99, 59, 41);
			frmCalculator.getContentPane().add(btnNewButton_3);
			
			
			btnNewButton_4.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					txtEnter.setText(txtEnter.getText() + "9");
				}
			});
			btnNewButton_4.setFont(new Font("SansSerif", Font.BOLD, 20));
			btnNewButton_4.setBounds(148, 99, 59, 41);
			frmCalculator.getContentPane().add(btnNewButton_4);
			
			
			btnNewButton_5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					num = Double.parseDouble(txtEnter.getText());
					calculation = 2;
					txtEnter.setText("");
					topLabel.setText(num + "-");
				}
			});
			btnNewButton_5.setFont(new Font("SansSerif", Font.BOLD, 20));
			btnNewButton_5.setBounds(218, 99, 59, 41);
			frmCalculator.getContentPane().add(btnNewButton_5);
			
			
			btnNewButton_6.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					txtEnter.setText(txtEnter.getText() + "4");
				}
			});
			btnNewButton_6.setFont(new Font("SansSerif", Font.BOLD, 20));
			btnNewButton_6.setBounds(10, 151, 59, 41);
			frmCalculator.getContentPane().add(btnNewButton_6);
			
			
			btnNewButton_7.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					txtEnter.setText(txtEnter.getText() + "5");
				}
			});
			btnNewButton_7.setFont(new Font("SansSerif", Font.BOLD, 20));
			btnNewButton_7.setBounds(79, 151, 59, 41);
			frmCalculator.getContentPane().add(btnNewButton_7);
			
			
			btnNewButton_8.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					txtEnter.setText(txtEnter.getText() + "6");
				}
			});
			btnNewButton_8.setFont(new Font("SansSerif", Font.BOLD, 20));
			btnNewButton_8.setBounds(148, 151, 59, 41);
			frmCalculator.getContentPane().add(btnNewButton_8);
			
			
			btnNewButton_9.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					num = Double.parseDouble(txtEnter.getText());
					calculation = 3;
					txtEnter.setText("");
					topLabel.setText(num + "*");
				}
			});
			btnNewButton_9.setFont(new Font("SansSerif", Font.BOLD, 20));
			btnNewButton_9.setBounds(217, 151, 59, 41);
			frmCalculator.getContentPane().add(btnNewButton_9);
			
			
			btnNewButton_10.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					txtEnter.setText(txtEnter.getText() + "1");
				}
			});
			btnNewButton_10.setFont(new Font("SansSerif", Font.BOLD, 20));
			btnNewButton_10.setBounds(10, 203, 59, 41);
			frmCalculator.getContentPane().add(btnNewButton_10);
			
			
			btnNewButton_11.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					txtEnter.setText(txtEnter.getText() + "2");
				}
			} );
			btnNewButton_11.setFont(new Font("SansSerif", Font.BOLD, 20));
			btnNewButton_11.setBounds(79, 203, 59, 41);
			frmCalculator.getContentPane().add(btnNewButton_11);
			
			
			btnNewButton_12.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					txtEnter.setText(txtEnter.getText() + "3");
				}
			});
			btnNewButton_12.setFont(new Font("SansSerif", Font.BOLD, 20));
			btnNewButton_12.setBounds(148, 203, 59, 41);
			frmCalculator.getContentPane().add(btnNewButton_12);
			
			
			btnNewButton_13.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					num = Double.parseDouble(txtEnter.getText());
					calculation = 4;
					txtEnter.setText("");
					topLabel.setText(num + "/");
				}
			});
			btnNewButton_13.setFont(new Font("SansSerif", Font.BOLD, 20));
			btnNewButton_13.setBounds(218, 203, 59, 41);
			frmCalculator.getContentPane().add(btnNewButton_13);
			
			
			btnNewButton_10_1.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					txtEnter.setText(txtEnter.getText() + "0");
					
				}
			});
			btnNewButton_10_1.setFont(new Font("SansSerif", Font.BOLD, 20));
			btnNewButton_10_1.setBounds(10, 255, 59, 41);
			frmCalculator.getContentPane().add(btnNewButton_10_1);
			
			
			btnNewButton_10_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					txtEnter.setText(txtEnter.getText() + ".");
				}
			});
			btnNewButton_10_3.setFont(new Font("SansSerif", Font.BOLD, 20));
			btnNewButton_10_3.setBounds(79, 255, 59, 41);
			frmCalculator.getContentPane().add(btnNewButton_10_3);
			btnNewButton_10_4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					operation();
					topLabel.setText("");
				}
			});
			
			
			btnNewButton_10_4.setFont(new Font("SansSerif", Font.BOLD, 20));
			btnNewButton_10_4.setBounds(148, 255, 129, 41);
			frmCalculator.getContentPane().add(btnNewButton_10_4);
			
			rdbtnNewRadioButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					enable();
				}
			});
			rdbtnNewRadioButton.setBackground(SystemColor.inactiveCaption);
			rdbtnNewRadioButton.setBounds(13, 43, 60, 23);
			frmCalculator.getContentPane().add(rdbtnNewRadioButton);
			
			
			rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					disable();
				}
			});
			rdbtnNewRadioButton_1.setBackground(SystemColor.inactiveCaption);
			rdbtnNewRadioButton_1.setBounds(13, 69, 60, 23);
			frmCalculator.getContentPane().add(rdbtnNewRadioButton_1);
			
			ButtonGroup bg = new ButtonGroup();
			bg.add(rdbtnNewRadioButton);
			bg.add(rdbtnNewRadioButton_1);
			
			topLabel.setForeground(new Color(255, 51, 102));
			topLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
			topLabel.setHorizontalAlignment(SwingConstants.RIGHT);
			topLabel.setBounds(231, 0, 46, 14);
			frmCalculator.getContentPane().add(topLabel);
			
			frmCalculator.setTitle("Calculator");
			frmCalculator.setBounds(150, 100, 303, 346);
			frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	}


