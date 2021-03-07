/**
 * 
 */
package actividad7;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

/**
 * @author Víctor Lozano
 *
 */
public class Actividad7App extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textCantidad;
	private JTextField textResultado;
	private JButton btnEurosPtas;
	private JButton btnPtasEuros;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Actividad7App frame = new Actividad7App();
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
	public Actividad7App() {
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
		btnEurosPtas.setBounds(96, 36, 123, 23);
		contentPane.add(btnEurosPtas);
		btnEurosPtas.addActionListener(this);
		
		btnPtasEuros = new JButton("Ptas a euros");
		btnPtasEuros.setBounds(229, 36, 113, 23);
		contentPane.add(btnPtasEuros);
		btnPtasEuros.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
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
		
	}

}
