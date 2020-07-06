import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.BevelBorder;
import java.awt.Font;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class JtableDemo {

	protected static final String DefaulttableModel = null;
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable table;
	private Object[] rows;
	DefaultTableModel model;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JtableDemo window = new JtableDemo();
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
	public JtableDemo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.ORANGE);
		frame.setBounds(100, 100, 722, 330);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(151, 12, 120, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(151, 43, 120, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(151, 74, 120, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("EMP ID");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Cambria", Font.BOLD, 12));
		lblNewLabel.setBounds(54, 14, 87, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("EMP NAME");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Cambria", Font.BOLD, 12));
		lblNewLabel_1.setBounds(54, 45, 87, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("EMP SALARY");
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setFont(new Font("Cambria", Font.BOLD, 12));
		lblNewLabel_2.setBounds(54, 76, 87, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		rows = new Object[4];
		
		JButton btnSubmit = new JButton("SUBMIT");
		btnSubmit.setFont(new Font("Cambria", Font.BOLD, 12));
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				rows[0] = textField.getText();
				rows[1] = textField_1.getText();
				rows[2] = textField_2.getText();
				
				model.addRow(rows);
				textField.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
			}
		});
		
		btnSubmit.setBounds(60, 160, 89, 23);
		frame.getContentPane().add(btnSubmit);
		
		JButton btnCancel = new JButton("CANCEL");
		btnCancel.setFont(new Font("Cambria", Font.BOLD, 12));
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
		});
		btnCancel.setBounds(159, 160, 89, 23);
		frame.getContentPane().add(btnCancel);
		model = new DefaultTableModel();
		Object columns[] = {"EMP ID","EMP NAME","EMP SALARY"};
		model.setColumnIdentifiers(columns);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(305, 12, 371, 229);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setColumnHeaderView(table);
		table.setFont(new Font("Cambria", Font.BOLD, 12));
		table.setModel(model);
		
		table.setColumnSelectionAllowed(true);
		table.setCellSelectionEnabled(true);
		table.setFillsViewportHeight(true);
		
		table.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
	}
}
