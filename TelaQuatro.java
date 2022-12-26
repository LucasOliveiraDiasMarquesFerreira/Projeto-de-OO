package teste.java;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;

public class TelaQuatro {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaQuatro window = new TelaQuatro();
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
	public TelaQuatro() {
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 128));
		frame.setBounds(100, 100, 545, 384);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(65, 51, 393, 252);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Vacina 1");
		lblNewLabel.setFont(new Font("Monospaced", Font.BOLD, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(148, 11, 103, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Tipo:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Monospaced", Font.BOLD, 16));
		lblNewLabel_1.setBounds(47, 77, 55, 14);
		panel.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(112, 79, 202, 14);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Data:");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Monospaced", Font.BOLD, 16));
		lblNewLabel_2.setBounds(47, 129, 50, 14);
		panel.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(112, 131, 202, 14);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.setBackground(new Color(128, 255, 128));
		btnNewButton.setFont(new Font("Monospaced", Font.ITALIC, 16));
		btnNewButton.setBounds(47, 216, 103, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Excluir");
		btnNewButton_1.setFont(new Font("Monospaced", Font.ITALIC, 16));
		btnNewButton_1.setBackground(new Color(128, 255, 128));
		btnNewButton_1.setBounds(204, 216, 110, 23);
		panel.add(btnNewButton_1);
	}

}
