import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.DefaultComboBoxModel;


public class EmployeeForm extends JFrame {

	private JPanel contentPane;
	private JTextField empIDTextField;
	private JTextField empNameTextField;
	private JTextField positionTextField;
	private JList employeeList;
	private JComboBox departmentComboBox;
	private DefaultListModel employeeListModel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeForm frame = new EmployeeForm();
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
	public EmployeeForm() {
		setTitle("Exercise 3F: Overloaded Constructors");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 323);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEmployeeId = new JLabel("Employee ID:");
		lblEmployeeId.setBounds(10, 152, 105, 14);
		contentPane.add(lblEmployeeId);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 414, 122);
		contentPane.add(scrollPane);
		
		employeeListModel = new DefaultListModel();
		employeeList = new JList(employeeListModel);
		scrollPane.setViewportView(employeeList);
		
		JLabel lblEmployeeName = new JLabel("Employee Name:");
		lblEmployeeName.setBounds(10, 177, 105, 14);
		contentPane.add(lblEmployeeName);
		
		JLabel lblDepartment = new JLabel("Department:");
		lblDepartment.setBounds(10, 202, 105, 14);
		contentPane.add(lblDepartment);
		
		JLabel lblPosition = new JLabel("Position:");
		lblPosition.setBounds(10, 227, 105, 14);
		contentPane.add(lblPosition);
		
		empIDTextField = new JTextField();
		empIDTextField.setText("101");
		empIDTextField.setBounds(154, 149, 86, 20);
		contentPane.add(empIDTextField);
		empIDTextField.setColumns(10);
		
		empNameTextField = new JTextField();
		empNameTextField.setText("Tonya Wise");
		empNameTextField.setBounds(154, 174, 132, 20);
		contentPane.add(empNameTextField);
		empNameTextField.setColumns(10);
		
		positionTextField = new JTextField();
		positionTextField.setText("Software Engineer");
		positionTextField.setBounds(154, 224, 105, 20);
		contentPane.add(positionTextField);
		positionTextField.setColumns(10);
		
		JButton btnNoArg = new JButton("No Arg");
		btnNoArg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				do_btnNoArg_actionPerformed(arg0);
			}
		});
		btnNoArg.setBounds(45, 252, 89, 23);
		contentPane.add(btnNoArg);
		
		JButton btn2Arg = new JButton("2 Arg");
		btn2Arg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btn2Arg_actionPerformed(e);
			}
		});
		btn2Arg.setBounds(177, 252, 89, 23);
		contentPane.add(btn2Arg);
		
		JButton btn4Arg = new JButton("4 Arg");
		btn4Arg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btn4Arg_actionPerformed(e);
			}
		});
		btn4Arg.setBounds(309, 252, 89, 23);
		contentPane.add(btn4Arg);
		
		departmentComboBox = new JComboBox();
		departmentComboBox.setModel(new DefaultComboBoxModel(new String[] {"Business Office", "Human Resources", "Manufacturing", "Shipping", "Maintenance"}));
		departmentComboBox.setBounds(154, 199, 161, 20);
		contentPane.add(departmentComboBox);
	}
	
	protected void do_btnNoArg_actionPerformed(ActionEvent arg0) {
		Employee arg = new Employee(); 
		employeeListModel.addElement(arg);
	}
	
	protected void do_btn2Arg_actionPerformed(ActionEvent e) {
		int empID = Integer.parseInt(empIDTextField.getText());
		// Call appropriate constructor
		Employee arg = new Employee(); 
		employeeListModel.addElement(arg);
	}
	
	protected void do_btn4Arg_actionPerformed(ActionEvent e) {
		int empID = Integer.parseInt(empIDTextField.getText());
		String dept = (String) departmentComboBox.getSelectedItem();
		// Call appropriate constructor
		Employee arg = new Employee(); 
		employeeListModel.addElement(arg);
	}
}