package vista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.Central;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.awt.event.ActionEvent;

public class FormularioAlumno extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;

	public FormularioAlumno() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Crear Alumno");
		btnNewButton.setBounds(120, 188, 185, 23);
		contentPane.add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(190, 31, 137, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(190, 71, 137, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(190, 133, 137, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"}));
		comboBox.setBounds(190, 100, 137, 22);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setBounds(99, 34, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblDia = new JLabel("Dia");
		lblDia.setBounds(99, 74, 46, 14);
		contentPane.add(lblDia);
		
		JLabel lblMes = new JLabel("Mes");
		lblMes.setBounds(99, 104, 46, 14);
		contentPane.add(lblMes);
		
		JLabel lblAo = new JLabel("A\u00F1o");
		lblAo.setBounds(99, 136, 46, 14);
		contentPane.add(lblAo);
		
		setVisible(true);
		
		/* ACCIONES */
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Llamar al controlador pasandole los datos del alumno
				String nombre = "Juanito";
				Date fechaNacimiento = new Date(0);
				new Central().crearAlumno(nombre, fechaNacimiento);
			}
		});
	}
}
