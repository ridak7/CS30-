import java.awt.EventQueue;
import java.math.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class BreakAPlate {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BreakAPlate window = new BreakAPlate();
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
	public BreakAPlate() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(112, 128, 144));
		panel.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		ImageIcon img = new ImageIcon(this.getClass().getResource("/angry.jpeg"));
		ImageIcon img2 = new ImageIcon(this.getClass().getResource("/smiley.jpg"));
		ImageIcon img3 = new ImageIcon(this.getClass().getResource("/placeholder.jpeg"));
		ImageIcon img4 = new ImageIcon(this.getClass().getResource("/sticker.jpeg"));
		ImageIcon img5 = new ImageIcon(this.getClass().getResource("/tiger.jpeg"));
		
		JLabel lb = new JLabel("");
		lb.setIcon(img);
		lb.setBounds(10, 11, 100, 86);
		panel.add(lb);
		
		JLabel lb2 = new JLabel("");
		lb2.setHorizontalAlignment(SwingConstants.CENTER);
		lb2.setIcon(img);
		lb2.setBounds(162, 11, 100, 86);
		panel.add(lb2);
		
		JLabel lb3 = new JLabel("");
		lb3.setIcon(img);
		lb3.setBounds(324, 11, 100, 86);
		panel.add(lb3);
		
		JLabel lb4 = new JLabel("");
		lb4.setIcon(img3);
		lb4.setBounds(162, 164, 100, 86);
		panel.add(lb4);
		
		JButton btn = new JButton("Play");
		btn.setFont(new Font("Gill Sans MT", Font.BOLD | Font.ITALIC, 18));
		btn.setForeground(new Color(112, 128, 144));
		btn.setBackground(new Color(255, 255, 255));
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String eventName = btn.getText();//eventName is a String assigned to text shown on button for play or play again
				int randomNum = (int)(Math.random() * 3);//Random number between 0 and 3 is assigned with 0 included

				 if (eventName.equals("Play"))
				 {  
				 btn.setText("Play Again");//"Play Again" is displayed on button after every round
				 
				 switch(randomNum)//Switch which changes prize displayed based on plates broken between random number 0-3
				 {
				 
				 case 0:
					 lb.setIcon(img2);
					 lb4.setIcon(img4);
					 
				   break;
				   
				 case 1:
					 lb.setIcon(img2);
					 lb2.setIcon(img2);
					 lb4.setIcon(img4);
					 
				 break;
				 
				 case 2:
					 lb.setIcon(img2);
					 lb2.setIcon(img2);
					 lb3.setIcon(img2);
					 lb4.setIcon(img5);
					 
				 break;
				 
				 default:
				 
				 }  
				 
				 }
				 
				 else if(eventName.equals("Play Again"))//Display resets to original once user clicks play again
				 {
					 btn.setText("Play");
					 btn.setActionCommand("Play");
					 lb.setIcon(img);
					 lb2.setIcon(img);
					 lb3.setIcon(img);
					 lb4.setIcon(img3);
				 }

				
			}
		});
		btn.setBounds(131, 117, 166, 31);
		panel.add(btn);
		
		
	}
}
