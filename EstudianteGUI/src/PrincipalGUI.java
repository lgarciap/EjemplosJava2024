import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;

public class PrincipalGUI {

	private JFrame fVentanita;
	private JTextField tfMateria;
	private JTextField tfNota;
	private Semestre miSemestre;
	private int cantAsig;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		PrincipalGUI ventana =  new PrincipalGUI(); 
		ventana.fVentanita.setVisible(true);
	}

	/**
	 * Create the application.
	 */
	public PrincipalGUI() {
		miSemestre = new Semestre();
		cantAsig = 0;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Escucha MP_microfono = new Escucha();
		fVentanita = new JFrame();
		fVentanita.setTitle("Aplicación para Estudiantes");
		fVentanita.setBounds(100, 100, 523, 346);
		fVentanita.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel pDatos = new JPanel();
		pDatos.setBorder(new TitledBorder(null, "Ingreso de datos", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 128, 192)));
		fVentanita.getContentPane().add(pDatos, BorderLayout.NORTH);
		pDatos.setLayout(new GridLayout(0, 2, 5, 5));
		
		JLabel lblMateria = new JLabel("Nombre de la materia:");
		pDatos.add(lblMateria);
		
		tfMateria = new JTextField();
		pDatos.add(tfMateria);
		tfMateria.setColumns(10);
		
		JLabel lblNota = new JLabel("Nota:");
		pDatos.add(lblNota);
		
		tfNota = new JTextField();
		pDatos.add(tfNota);
		tfNota.setColumns(10);
		
		JLabel lblrelleno = new JLabel("");
		pDatos.add(lblrelleno);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(MP_microfono);
		pDatos.add(btnAgregar);
		
		JPanel pAcciones = new JPanel();
		pAcciones.setBorder(new TitledBorder(null, "Acciones", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		fVentanita.getContentPane().add(pAcciones, BorderLayout.CENTER);
		
		JPanel pResultados = new JPanel();
		pResultados.setBorder(new TitledBorder(null, "Resultados", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		fVentanita.getContentPane().add(pResultados, BorderLayout.SOUTH);
	}

	private class Escucha implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("Le di al botón "+cantAsig+" veces");
			try{
				if (cantAsig<50)
				miSemestre.llenarAsignaturas(cantAsig,tfMateria.getText(), Float.parseFloat(tfNota.getText()));
				else
				{
					tfMateria.setEnabled(false);
					tfNota.setEnabled(false);
				}
				tfMateria.setText("");
				tfNota.setText("");
				cantAsig++;
			}catch (Exception error){
				JOptionPane.showMessageDialog(fVentanita, "Ingrese un numero no sea malcriado", "Puso letras", JOptionPane.ERROR_MESSAGE);
				tfNota.setText("");
			}
			
		}
		
	}
}
