package principal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import gui.MantenimientoAlumno;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JDesktopPane;

public class Principal extends JFrame implements ActionListener {
	

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JMenu mnRegistro;
	private JMenu mnMantenimiento;
	private JMenu mnConsulta;
	private JMenu mnReporte;
	private JMenu mnAyuda;
	private JMenuItem mntmMatricula;
	private JMenuItem mntmRetiro;
	private JMenuItem mntmMantenimientoAlumno;
	private JMenuItem mntmMantenimientoCurso;
	private JMenuItem mntmAlumnosYcursos;
	private JMenuItem mntmMatriculaYretiro;
	private JMenuItem mntmMatriculasPendientes;
	private JMenuItem mntmMatriculasVigentes;
	private JMenuItem mntmMatriculasPorCurso;
	private JMenuItem mntmSalir;
	private JMenuItem mntmCreditos;
	
	//constructores de enlaces creas nuevos objetos
	MantenimientoAlumno mantenimientoAlumno=new MantenimientoAlumno();
	private JDesktopPane desktopPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setTitle("COLEGIOS HATERS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 811, 680);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(244, 235, 113));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(128, 255, 128));
		menuBar.setBounds(0, 0, 672, 22);
		contentPane.add(menuBar);
		
		mnRegistro = new JMenu("REGISTRO");
		mnRegistro.addActionListener(this);
		mnRegistro.setFont(new Font("Arial Black", Font.PLAIN, 13));
		menuBar.add(mnRegistro);
		
		mntmMatricula = new JMenuItem("MATRICULA");
		mntmMatricula.addActionListener(this);
		mnRegistro.add(mntmMatricula);
		
		mntmRetiro = new JMenuItem("RETIRO");
		mntmRetiro.addActionListener(this);
		mnRegistro.add(mntmRetiro);
		
		mnMantenimiento = new JMenu("MANTENIMIENTO");
		mnMantenimiento.addActionListener(this);
		mnMantenimiento.setFont(new Font("Arial Black", Font.PLAIN, 13));
		menuBar.add(mnMantenimiento);
		
		mntmMantenimientoAlumno = new JMenuItem("ALUMNO");
		mntmMantenimientoAlumno.addActionListener(this);
		mnMantenimiento.add(mntmMantenimientoAlumno);
		
		mntmMantenimientoCurso = new JMenuItem("CURSO");
		mntmMantenimientoCurso.addActionListener(this);
		mnMantenimiento.add(mntmMantenimientoCurso);
		
		mnConsulta = new JMenu("CONSULTA");
		mnConsulta.addActionListener(this);
		mnConsulta.setFont(new Font("Arial Black", Font.PLAIN, 13));
		menuBar.add(mnConsulta);
		
		mntmAlumnosYcursos = new JMenuItem("ALUMNOS Y CURSOS");
		mntmAlumnosYcursos.addActionListener(this);
		mnConsulta.add(mntmAlumnosYcursos);
		
		mntmMatriculaYretiro = new JMenuItem("MATRICULA Y RETIRO");
		mntmMatriculaYretiro.addActionListener(this);
		mnConsulta.add(mntmMatriculaYretiro);
		
		mnReporte = new JMenu("REPORTES");
		mnReporte.addActionListener(this);
		mnReporte.setFont(new Font("Arial Black", Font.PLAIN, 13));
		menuBar.add(mnReporte);
		
		mntmMatriculasPendientes = new JMenuItem("MATRICULAS PENDIENTES");
		mntmMatriculasPendientes.addActionListener(this);
		mnReporte.add(mntmMatriculasPendientes);
		
		mntmMatriculasVigentes = new JMenuItem("MATRICULAS VIGENTES");
		mntmMatriculasVigentes.addActionListener(this);
		mnReporte.add(mntmMatriculasVigentes);
		
		mntmMatriculasPorCurso = new JMenuItem("MATRICULAS POR CURSO");
		mntmMatriculasPorCurso.addActionListener(this);
		mnReporte.add(mntmMatriculasPorCurso);
		
		mnAyuda = new JMenu("AYUDA");
		mnAyuda.addActionListener(this);
		mnAyuda.setFont(new Font("Arial Black", Font.PLAIN, 13));
		menuBar.add(mnAyuda);
		
		mntmSalir = new JMenuItem("SALIR");
		mntmSalir.addActionListener(this);
		mnAyuda.add(mntmSalir);
		
		mntmCreditos = new JMenuItem("CREDITOS");
		mntmCreditos.addActionListener(this);
		mnAyuda.add(mntmCreditos);
		
		desktopPane = new JDesktopPane();
		desktopPane.setBounds(10, 33, 775, 597);
		contentPane.add(desktopPane);
		//agrega el jinternal frame al panel 
		mantenimientoAlumno.setBounds(10, 11, 761, 562);
		desktopPane.add(mantenimientoAlumno);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mntmCreditos) {
			actionPerformedMnCreditos(e);
		}
		if (e.getSource() == mntmSalir) {
			actionPerformedMnSalir(e);
		}
		if (e.getSource() == mntmMatriculasPorCurso) {
			actionPerformedMnMatriculasPorCurso(e);
		}
		if (e.getSource() == mntmMatriculasVigentes) {
			actionPerformedMnMatriculasVigentes(e);
		}
		if (e.getSource() == mntmMatriculasPendientes) {
			actionPerformedMnMatriculasPendientes(e);
		}
		if (e.getSource() == mntmMatriculaYretiro) {
			actionPerformedMnMatriculaYretiro(e);
		}
		if (e.getSource() == mntmAlumnosYcursos) {
			actionPerformedMnAlumnosYcursos(e);
		}
		if (e.getSource() == mntmMantenimientoCurso) {
			actionPerformedMntmNewMenuItem_3(e);
		}
		if (e.getSource() == mntmMantenimientoAlumno) {
			actionPerformedMntmNewMenuItem_2(e);
		}
		if (e.getSource() == mntmRetiro) {
			actionPerformedMntmNewMenuItem_1(e);
		}
		if (e.getSource() == mnAyuda) {
			actionPerformedMnAyuda(e);
		}
		if (e.getSource() == mnReporte) {
			actionPerformedMnReporte(e);
		}
		if (e.getSource() == mnConsulta) {
			actionPerformedMnConsulta(e);
		}
		if (e.getSource() == mnMantenimiento) {
			actionPerformedMnMantenimiento(e);
		}
		if (e.getSource() == mnRegistro) {
			actionPerformedMnRegistro(e);
		}
		if (e.getSource() == mntmMatricula) {
			actionPerformedMntmNewMenuItem(e);
		}
	}
	protected void actionPerformedMntmNewMenuItem(ActionEvent e) {
	}
	protected void actionPerformedMnRegistro(ActionEvent e) {
	}
	protected void actionPerformedMnMantenimiento(ActionEvent e) {
	}
	protected void actionPerformedMnConsulta(ActionEvent e) {
	}
	protected void actionPerformedMnReporte(ActionEvent e) {
	}
	protected void actionPerformedMnAyuda(ActionEvent e) {
	}
	protected void actionPerformedMntmNewMenuItem_1(ActionEvent e) {
	}
	protected void actionPerformedMntmNewMenuItem_2(ActionEvent e) {
	// agrega  mantenimineto alumno al boton del jmenu para mostrar en el jpanel
		mantenimientoAlumno.setVisible(true);
	}
	protected void actionPerformedMntmNewMenuItem_3(ActionEvent e) {
	}
	protected void actionPerformedMnAlumnosYcursos(ActionEvent e) {
	}
	protected void actionPerformedMnMatriculaYretiro(ActionEvent e) {
	}
	protected void actionPerformedMnMatriculasPendientes(ActionEvent e) {
	}
	protected void actionPerformedMnMatriculasVigentes(ActionEvent e) {
	}
	protected void actionPerformedMnMatriculasPorCurso(ActionEvent e) {
	}
	protected void actionPerformedMnSalir(ActionEvent e) {
	}
	protected void actionPerformedMnCreditos(ActionEvent e) {
	}
	private static class __Tmp {
		private static void __tmp() {
			  javax.swing.JPanel __wbp_panel = new javax.swing.JPanel();
		}
	}
	public void centrar(JInternalFrame frm) {
		// Dimensiones de la pantalla
		Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
		// Dimensiones del formularioo
		Dimension ventana = frm.getSize();

		int posX = (int) (pantalla.getWidth() - ventana.getWidth()) / 2;
		frm.setLocation(posX, 40);
	}
}
