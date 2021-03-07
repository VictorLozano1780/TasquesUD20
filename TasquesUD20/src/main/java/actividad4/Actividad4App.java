/**
 * 
 */
package actividad4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextArea;

/**
 * @author Víctor Lozano
 *
 */
public class Actividad4App extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected JTextArea textArea = new JTextArea();
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Actividad4App frame = new Actividad4App();
					frame.setVisible(true);
					frame.addEventos(new Window(frame));
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * @param window
	 */
	protected void addEventos(Window window) {
		this.addWindowListener(window);
	}

	/**
	 * Create the frame.
	 */
	public Actividad4App() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);

		JLabel etiqueta = new JLabel("Eventos");
		etiqueta.setBounds(10, 104, 46, 14);
		contentPane.add(etiqueta);
		
		textArea.setBounds(73, 22, 320, 214);
		contentPane.add(textArea);
	}
}
