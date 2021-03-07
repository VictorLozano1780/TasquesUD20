/**
 * 
 */
package actividad8;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;


/**
 * @author Víctor Lozano
 *
 */
public class Actividad8App extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textCantidad;
	private JTextField textResultado;
	private JButton btnEurosPtas;
	private JButton btnPtasEuros;
	private JButton btnLimpiar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Actividad8App frame = new Actividad8App();
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
	public Actividad8App() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCantidad = new JLabel("Cantidad a convertir");
		lblCantidad.setBounds(10, 11, 113, 14);
		contentPane.add(lblCantidad);
		
		textCantidad = new JTextField();
		textCantidad.setBounds(133, 8, 86, 20);
		contentPane.add(textCantidad);
		textCantidad.setColumns(10);
		
		JLabel lblResultado = new JLabel("Resultado");
		lblResultado.setBounds(229, 11, 70, 14);
		contentPane.add(lblResultado);
		
		textResultado = new JTextField();
		textResultado.setEditable(false);
		textResultado.setBounds(309, 8, 86, 20);
		contentPane.add(textResultado);
		textResultado.setColumns(10);
		
		btnEurosPtas = new JButton("Euros a ptas");
		btnEurosPtas.setBounds(20, 36, 123, 23);
		contentPane.add(btnEurosPtas);
		btnEurosPtas.addActionListener(this);
		
		btnPtasEuros = new JButton("Ptas a euros");
		btnPtasEuros.setBounds(153, 36, 113, 23);
		contentPane.add(btnPtasEuros);
		btnPtasEuros.addActionListener(this);
		
		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setBounds(276, 36, 119, 23);
		contentPane.add(btnLimpiar);
		btnLimpiar.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
		if(e.getActionCommand().equals("Euros a ptas")) {
			Double cantidad = Double.parseDouble(textCantidad.getText());
			Double resultado = cantidad * 166.386;
			textResultado.setText(resultado.toString());
		}
		if(e.getActionCommand().equals("Ptas a euros")) {
			Double cantidad = Double.parseDouble(textCantidad.getText());
			Double resultado = cantidad / 166.386;
			textResultado.setText(resultado.toString());
		} 
		if(e.getActionCommand().equals("Limpiar")) {
			textResultado.setText("");
			textCantidad.setText("");
		}
		}catch (Exception excep) {
			JOptionPane.showMessageDialog(null, "Has introducido un formato erroneo");
		}
		
	}

}
