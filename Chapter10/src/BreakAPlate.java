import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;

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
		panel.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		ImageIcon img = new ImageIcon(this.getClass().getResource("/smiley.jpg"));
		ImageIcon img2 = new ImageIcon(this.getClass().getResource("/angry.jpg"));
		ImageIcon img3 = new ImageIcon(this.getClass().getResource("/placeholder.gif"));
		ImageIcon img4 = new ImageIcon(this.getClass().getResource("/sticker.gif"));
		ImageIcon img5 = new ImageIcon(this.getClass().getResource("/tiger.gif"));
		
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
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(185, 219, 46, 14);
		panel.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(162, 133, 89, 23);
		panel.add(btnNewButton);
	}
}
