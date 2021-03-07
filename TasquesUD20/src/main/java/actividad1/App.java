/**
 * 
 */
package actividad1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Rectangle;
import javax.swing.border.MatteBorder;
import java.awt.Color;

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
		setBounds(100, 100, 541, 415);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);

		JLabel etiqueta = new JLabel("Hola mundo");
		etiqueta.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		etiqueta.setBounds(92, 44, 65, 20);
		contentPane.add(etiqueta);
		JButton btnMas = new JButton("+");
		btnMas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int width = etiqueta.getWidth();
				int heigth = etiqueta.getHeight();
				etiqueta.setBounds(92, 44, width + 5, heigth + 5);
			}
		});
		btnMas.setBounds(new Rectangle(139, 120, 112, 39));
		contentPane.add(btnMas);

		JButton btnMenos = new JButton("-");
		btnMenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int width = etiqueta.getWidth();
				int heigth = etiqueta.getHeight();
				etiqueta.setBounds(92, 44, width - 5, heigth - 5);
			}
		});
		btnMenos.setBounds(10, 120, 112, 39);
		contentPane.add(btnMenos);

	}
}
