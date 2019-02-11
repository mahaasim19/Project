package githubTesting;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUIMulti {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIMulti window = new GUIMulti();
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
	public GUIMulti() {
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
		
		JButton btnSum = new JButton("MULTIPLY");
		btnSum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int num1 = Integer.parseInt(textField.getText());
				int num2 = Integer.parseInt(textField_1.getText());
				JOptionPane.showMessageDialog(null,num1*num2,"output", JOptionPane.PLAIN_MESSAGE);
		
		JLabel lblBox = new JLabel("box 1");
		lblBox.setBounds(10, 37, 46, 14);
		frame.getContentPane().add(lblBox);
		
		JLabel lblBox_1 = new JLabel("box 2");
		lblBox_1.setBounds(10, 72, 46, 14);
		frame.getContentPane().add(lblBox_1);
		
		textField = new JTextField();
		textField.setBounds(74, 34, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(74, 69, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnMultiply = new JButton("multiply");
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnMultiply.setBounds(174, 147, 89, 23);
		frame.getContentPane().add(btnMultiply);
	}
			
		});
	}
}

			


