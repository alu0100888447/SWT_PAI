/*******************************************************************************
 * Copyright (c) 2000, 2016 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *     Lars Vogel <Lars.Vogel@vogella.com> - Bug 502845
 *******************************************************************************/
package swtExamples;

/*
 * Button example snippet: set the default button
 *
 * For a list of all SWT example snippets see
 * http://www.eclipse.org/swt/snippets/
 */
import static org.eclipse.swt.events.SelectionListener.*;

import org.eclipse.swt.*;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.*;
import org.eclipse.swt.widgets.*;

public class ButtonExample {

public static void main (String [] args) {
	Display display = new Display ();
	Shell shell = new Shell (display);
	Label label = new Label (shell, SWT.NONE);
	label.setText ("Enter your name:");
	Text text = new Text (shell, SWT.BORDER);
	text.setLayoutData (new RowData (100, SWT.DEFAULT));
	Button ok = new Button (shell, SWT.PUSH);
	ok.setText ("OK");
	ok.addSelectionListener(new SelectionListener() {
		
		@Override
		public void widgetSelected(SelectionEvent arg0) {
			System.out.println(text.getText());
			
		}
		
		@Override
		public void widgetDefaultSelected(SelectionEvent arg0) {
			
			
		}
	});
	Button cancel = new Button (shell, SWT.PUSH);
	cancel.setText ("Cancel");
	cancel.addSelectionListener(new SelectionListener() {

		@Override
		public void widgetDefaultSelected(SelectionEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void widgetSelected(SelectionEvent arg0) {
			text.setText("");
			System.out.println("Cancel");
			
		}
		
	});
	shell.setDefaultButton (cancel);
	shell.setLayout (new RowLayout ());
	shell.pack ();
	shell.open ();
	while (!shell.isDisposed ()) {
		if (!display.readAndDispatch ()) display.sleep ();
	}
	display.dispose ();
}
}