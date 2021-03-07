/**
 * 
 */
package actividad6;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

/**
 * @author Víctor Lozano
 *
 */
public class Actividad6App extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textAltura;
	private JTextField textPeso;
	private JTextField textField;
	private JButton btnCalcular;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Actividad6App frame = new Actividad6App();
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
	public Actividad6App() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textAltura = new JTextField();
		textAltura.setBounds(97, 11, 86, 20);
		contentPane.add(textAltura);
		textAltura.setColumns(10);
		
		textPeso = new JTextField();
		textPeso.setBounds(283, 11, 86, 20);
		contentPane.add(textPeso);
		textPeso.setColumns(10);
		
		JLabel lblMetros = new JLabel("Altura(metros)");
		lblMetros.setBounds(10, 14, 94, 14);
		contentPane.add(lblMetros);
		
		JLabel lblPeso = new JLabel("Peso(kg)");
		lblPeso.setBounds(193, 14, 80, 14);
		contentPane.add(lblPeso);
		
		btnCalcular = new JButton("Calcular IMC");
		btnCalcular.setBounds(97, 57, 110, 23);
		contentPane.add(btnCalcular);
		btnCalcular.addActionListener(this);
		
		JLabel lblIMC = new JLabel("IMC");
		lblIMC.setBounds(217, 61, 46, 14);
		contentPane.add(lblIMC);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(273, 58, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Calcular IMC")) {
			Double peso = Double.parseDouble(textPeso.getText());
			Double altura = Double.parseDouble(textAltura.getText());
			Double resultado = peso / Math.pow(altura, 2);
			textField.setText(resultado.toString());
		}
		
	}
}
