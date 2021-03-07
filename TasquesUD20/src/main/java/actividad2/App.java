/**
 * 
 */
package actividad2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * @author Víctor Lozano
 *
 */
public class App extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App frame = new App();
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
	public App() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JButton btn1 = new JButton("Boton 1");
		btn1.setBounds(10, 41, 89, 23);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("Boton 2");
		btn2.setBounds(106, 41, 89, 23);
		contentPane.add(btn2);
		
		JLabel etiqueta = new JLabel("");
		etiqueta.setBounds(10, 11, 185, 14);
		contentPane.add(etiqueta);
		
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				etiqueta.setText("Has pulsado el Boton 1");
			}
		});
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				etiqueta.setText("Has pulsado el Boton 2");
			}
		});
	}

}
