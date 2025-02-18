package arreglos;
import clase.Alumno;
import java.util.ArrayList;
import clase.Alumno;

public class ArregloAlumno {
	//atributos privados
	private ArrayList alu;
	//constructor
	public ArregloAlumno() {
		alu=new ArrayList();
		//datos de prueba
		adicionar(new Alumno(231,"jean","sanchez",47232431,33,908987678,1));
		adicionar(new Alumno(555,"CARO","VALE",47232431,33,933333333,2));
		adicionar(new Alumno(666,"lucho","opear",47232431,33,999999999,1));
		adicionar(new Alumno(777,"papo","rtgef",47232431,33,911111111,1));
	}
	public void adicionar(Alumno x) {
		alu.add(x);
	}
	public int tamanio() {
		return alu.size();
	}
	public Alumno obtener(int pos) {
		return (Alumno) alu.get(pos);
		
	}
	public Alumno buscar(int cod) {
		for(int i=0;i<tamanio();i++) {
			if(obtener(i).getCodAlumno()==cod)
				return obtener(i);
		}
		return null;
		
		
	}
	public void eliminar(Alumno x) {
		alu.remove(x);
	}

	
	
	
	
	
	
}
