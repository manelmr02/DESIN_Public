/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioSWT;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Button;

/**
 *
 * @author josemmr
 */
public class EjercicioSWT {
    public static void main(String[] args) {
        Display display = new Display();
        Shell shell = new Shell(display);
        shell.setText("Actividad 1.1 SWT");
        shell.setSize(300, 200);

        Combo combo = new Combo(shell, SWT.DROP_DOWN | SWT.READ_ONLY);
        combo.setBounds(50, 40, 200, 25);
        combo.setItems(new String[]{"Puesto 51", "Puesto 52", "Puesto 41"});
        combo.select(0);

        Button boton = new Button(shell, SWT.PUSH);
        boton.setText("Aceptar");
        boton.setBounds(100, 90, 100, 30);

        shell.open();
        while (!shell.isDisposed()) {
            if (!display.readAndDispatch()) display.sleep();
        }
        display.dispose();
    }
}

