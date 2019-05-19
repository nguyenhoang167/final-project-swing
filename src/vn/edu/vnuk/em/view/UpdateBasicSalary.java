package vn.edu.vnuk.em.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;

@SuppressWarnings("serial")
public class UpdateBasicSalary extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable table;
	


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateBasicSalary frame = new UpdateBasicSalary();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public UpdateBasicSalary() {
		
		 
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(200, 200, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(416, 34, 207, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("CURRENT BASIC SALARY:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(185, 27, 187, 40);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("EDIT");
		btnNewButton_1.setBounds(209, 532, 131, 40);
		contentPane.add(btnNewButton_1);
		
		JButton btnApply = new JButton("APPLY");
		btnApply.setBounds(469, 532, 131, 40);
		contentPane.add(btnApply);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 69, 774, 451);
		contentPane.add(scrollPane);
		
		String[] columns = {"ID", "Name", "Salary"};
		Object[][] data = {
				{"A", "B", "C"},
		};
		
		table = new JTable(data, columns);
		scrollPane.setViewportView(table);
		table.setFillsViewportHeight(true);
		table.setPreferredScrollableViewportSize(new Dimension(500,70));
		table.setBackground(Color.WHITE);
		table.setBounds(45, 114, 757, 358);
		table.setEnabled(true);	
		
	}
}
