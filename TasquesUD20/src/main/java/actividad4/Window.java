/**
 * 
 */
package actividad4;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


/**
 * @author Víctor Lozano
 *
 */
public class Window implements WindowListener{
	
	private Actividad4App ventana;
	
	
	public Window(Actividad4App ventana) {
		this.ventana = ventana;
	}

	@Override
	public void windowOpened(WindowEvent e) {
		ventana.textArea.setText(ventana.textArea.getText() + "Ventana abierta por 1a vez");
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		ventana.textArea.setText(ventana.textArea.getText() + "\nVentana minimizada");
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		ventana.textArea.setText(ventana.textArea.getText() + "\nVentana maximizada");
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		ventana.textArea.setText(ventana.textArea.getText() + "\nVentana en pantalla");
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		ventana.textArea.setText(ventana.textArea.getText() + "\nVentana en pantalla");
		
	}
}
