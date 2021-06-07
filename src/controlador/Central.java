package controlador;

import java.sql.Date;

import beans.Alumno;
import modelo.Alumnos;
import vista.FormularioAlumno;

public class Central {

	public void abrirFormularioAlumno() {
		new FormularioAlumno();
		
	}

	public void crearAlumno(String nombre, Date fechaNacimiento) {
		// Llamar al modelo pasandole el alumno
		Alumno alumno = new Alumno(-1, nombre, fechaNacimiento);
		new Alumnos().crearAlumno(alumno);
		
	}

}
