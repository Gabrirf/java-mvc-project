package controlador;

import java.sql.Date;
import java.util.ArrayList;

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
	
	public ArrayList<Alumno> recogerTodosAlumnos(){
		// TODO: Llamar al modelo para recoger los alumnos
		ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
		alumnos.add(new Alumno(1,"Alfonso", new Date(0)));
		alumnos.add(new Alumno(2,"Rodolfo", new Date(10)));
		alumnos.add(new Alumno(3,"Antoñito", new Date(20)));
		return alumnos;
	}

}
