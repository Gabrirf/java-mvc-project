package vista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.Central;

import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TablaAlumnos extends JFrame {

	private JPanel contentPane;
	private JTable table;

	public TablaAlumnos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
		table.setBounds(10, 11, 573, 339);
		contentPane.add(table);
		
		JButton botonCrear = new JButton("Crear");
		botonCrear.setBounds(593, 11, 112, 56);
		contentPane.add(botonCrear);
		
		JButton botonBorrar = new JButton("Borrar");
		botonBorrar.setBounds(593, 78, 112, 56);
		contentPane.add(botonBorrar);
		
		JButton botonModificar = new JButton("Modificar");
		botonModificar.setBounds(593, 145, 112, 56);
		contentPane.add(botonModificar);
		
		JButton botonRefrescar = new JButton("Refrescar");
		botonRefrescar.setBounds(593, 294, 112, 56);
		contentPane.add(botonRefrescar);
		
		setVisible(true);
		
		/* ACCIONES */
		
		botonCrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Llamar al controlador para abrir formulario de alumno
				new Central().abrirFormularioAlumno();
			}
		});
	}
}
