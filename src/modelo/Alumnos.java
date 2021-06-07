package modelo;

import java.sql.Date;

import bbdd.Conexion;
import beans.Alumno;

public class Alumnos {

	public void crearAlumno(Alumno alumno) {
		String nombre = alumno.getNombre();
		Date fechaNacimiento = alumno.getFechaNacimiento();

		Conexion.ejecutarUpdate("INSERT INTO alumnos (nombre, fecha_nacimiento) VALUES ('"+nombre+"', '"+fechaNacimiento+"');");
		
	}
}
