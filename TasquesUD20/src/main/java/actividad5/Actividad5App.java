/**
 * 
 */
package actividad5;

import java.awt.EventQueue;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextArea;

/**
 * @author Víctor Lozano
 *
 */
public class Actividad5App extends JFrame implements MouseListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextArea texto = new JTextArea();
	private JButton btn;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Actividad5App frame = new Actividad5App();
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
	public Actividad5App() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		btn = new JButton("Limpiar");
		btn.setBounds(154, 11, 89, 23);
		contentPane.add(btn);
		btn.addMouseListener(this);
		
		texto.setBounds(10, 36, 414, 214);
		contentPane.add(texto);
		texto.addMouseListener(this);
		
	}
	public void mouseClicked(MouseEvent e) {
		if(e.getSource() == texto) {
			texto.setText(texto.getText() + "Click en el texto|\n");	
		} 
		if(e.getSource() == btn) {
			texto.setText("");
		}
	}

	public void mousePressed(MouseEvent e) {
		if(e.getSource() == texto) {
			texto.setText(texto.getText() + "Mouse presionado|\n");
		}
		
	}

	public void mouseReleased(MouseEvent e) {
		if(e.getSource() == texto) {
			texto.setText(texto.getText() + "Mouse soltado|\n");
		}
		
	}

	public void mouseEntered(MouseEvent e) {
		if(e.getSource() == texto) {
			texto.setText(texto.getText() + "Mouse entra en texto|\n");
		}
		
	}

	public void mouseExited(MouseEvent e) {
		if(e.getSource() == texto) {
			texto.setText(texto.getText() + "Mouse sale del texto|\n");
		}
		
	}
}
