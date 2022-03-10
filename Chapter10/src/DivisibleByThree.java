											Header is missing

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.SwingConstants;

public class DivisibleByThree {

	private JFrame frame;
	private JTextField tf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DivisibleByThree window = new DivisibleByThree();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DivisibleByThree() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 515, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.activeCaption);
		panel.setBounds(0, 0, 499, 261);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		tf = new JTextField();
		tf.setFont(new Font("Myanmar Text", Font.ITALIC, 15));
		tf.setBounds(219, 25, 255, 31);
		panel.add(tf);
		tf.setColumns(10);
		
		JLabel lb2 = new JLabel("");
		lb2.setHorizontalAlignment(SwingConstants.CENTER);
		lb2.setFont(new Font("Myanmar Text", Font.ITALIC, 15));
		lb2.setBounds(219, 155, 255, 47);
		panel.add(lb2);
		
		JButton btn = new JButton("Check");
		btn.setFont(new Font("Myanmar Text", Font.BOLD | Font.ITALIC, 15));
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				//String called "msg" is initialized and assigned to text field "tf"
				String msg = tf.getText();
				
				//Integer named "y" is initialized to value of "msg"
				int y = Integer.parseInt(msg);
				
				//Conditional which checks if integer value of y is divisible by 3
				if(y%3==0) 
				{
					//Displays the y is divisible by 3
					lb2.setText(y + " is divisbile by three");
				} 
				
				//Displays y is not divisible by three, if it is not
				else 
				{
					lb2.setText(y + " is not divisible by three");
				}
				
			}
		});
		btn.setBounds(41, 155, 128, 47);
		panel.add(btn);
		
		
		JLabel lb = new JLabel("Enter An Integer:");
		lb.setFont(new Font("Myanmar Text", Font.BOLD | Font.ITALIC, 15));
		lb.setBounds(41, 25, 128, 47);
		panel.add(lb);
		

	}
}
