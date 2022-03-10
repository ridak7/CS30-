										Header is missing

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;

public class MetricConversion {

	private JFrame frame;
	private final JComboBox cb = new JComboBox();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MetricConversion window = new MetricConversion();
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
	public MetricConversion() {
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
		panel.setBackground(new Color(46, 139, 87));
		panel.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lbl = new JLabel("Select a Conversion Type:");
		lbl.setForeground(new Color(255, 255, 255));
		lbl.setFont(new Font("Rockwell", Font.BOLD | Font.ITALIC, 22));
		lbl.setHorizontalAlignment(SwingConstants.CENTER);
		lbl.setBounds(10, 26, 414, 22);
		panel.add(lbl);
		
		JLabel lbl2 = new JLabel("");
		lbl2.setForeground(new Color(255, 255, 255));
		lbl2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl2.setFont(new Font("Rockwell", Font.BOLD, 24));
		lbl2.setBounds(10, 198, 414, 35);
		panel.add(lbl2);
		cb.setFont(new Font("Rockwell", Font.ITALIC, 24));
		
		cb.setModel(new DefaultComboBoxModel(new String[] {"Inches to Centimeters", "Feet to Meters", "Gallons to Litres", "Pounds to Kilograms"}));
		cb.setBounds(10, 87, 414, 35);
		panel.add(cb);
		
		cb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
		//Condition statement which when selected displays Inches to Centimeters
		if (cb.getSelectedItem().equals("Inches to Centimeters"))
		{
			lbl2.setText("1 inch = 2.54 centimeters");
		}
		
		//Condition statement which when selected displays Feet to Meters
		else if (cb.getSelectedItem().equals("Feet to Meters")) 
		{
			lbl2.setText("1 foot = 0.3048 meteres");	
		}
		
		//Condition statement which when selected displays Gallon to Litres
		else if (cb.getSelectedItem().equals("Gallons to Litres")) 
		{
			lbl2.setText("1 gallon = 4.5461 litres");
		}
		
		//Condition statement which when selected displays Pounds to Kilograms
		else if (cb.getSelectedItem().equals("Pounds to Kilograms")) 
		{
			lbl2.setText("1 pound = 0.4536 kilograms");
		}
			
	  }
	
			
  });
		
		
}
	
	
}


	
	
			



		
		
		
	


