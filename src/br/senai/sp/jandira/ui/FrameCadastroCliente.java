package br.senai.sp.jandira.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.SystemColor;
import javax.swing.JScrollPane;

public class FrameCadastroCliente extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private final ButtonGroup Sexo = new ButtonGroup();
	private final ButtonGroup Linguagem = new ButtonGroup();

		
	public FrameCadastroCliente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 204, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("salvar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setFont(new Font("Arial Black", Font.PLAIN, 16));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(new Color(255, 102, 153));
		btnNewButton.setBounds(231, 194, 193, 56);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setBounds(10, 11, 46, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(10, 36, 193, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email::");
		lblEmail.setBounds(10, 67, 46, 14);
		contentPane.add(lblEmail);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(10, 92, 197, 20);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Data de Nasci:mento");
		lblNewLabel_1_1.setBounds(10, 123, 129, 14);
		contentPane.add(lblNewLabel_1_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(10, 148, 86, 20);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel_1 = new JLabel("Sexo:");
		lblNewLabel_1.setBounds(123, 123, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("F");
		rdbtnNewRadioButton.setBackground(new Color(204, 204, 255));
		Sexo.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(123, 144, 31, 24);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnM = new JRadioButton("M");
		rdbtnM.setBackground(new Color(204, 204, 255));
		Sexo.add(rdbtnM);
		rdbtnM.setBounds(123, 171, 39, 24);
		contentPane.add(rdbtnM);
		
		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setBounds(10, 194, 46, 14);
		contentPane.add(lblCidade);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(SystemColor.text);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"osasco", "carapicuiba", "itapevi"}));
		comboBox.setBounds(10, 214, 193, 22);
		contentPane.add(comboBox);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(293, 37, 107, 44);
		contentPane.add(scrollPane);
		
		JList list = new JList();
		scrollPane.setViewportView(list);
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"janeiro", "fevereiro", "abril", "mar\u00E7o", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		
	}
}
