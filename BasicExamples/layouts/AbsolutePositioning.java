package layouts;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;


public class AbsolutePositioning {
 
    public AbsolutePositioning(Display display) {  
        Shell shell = new Shell(display);
        
        Button btn1 = new Button(shell, SWT.PUSH);
        btn1.setText("Used setBounds()");
        btn1.setBounds(200, 50, 80, 30);

        Button btn2 = new Button(shell, SWT.PUSH);
        btn2.setText("Used setSize() with setLocation()");
        btn2.setSize(80, 30);
        btn2.setLocation(500, 100);
        
        shell.setText("ABSOLUTE");
        shell.pack();
        shell.open();

        while (!shell.isDisposed()) {
          if (!display.readAndDispatch()) {
            display.sleep();
          }
        }        
    }

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Display display = new Display();
        AbsolutePositioning ex = new AbsolutePositioning(display);
        display.dispose();
    }
}