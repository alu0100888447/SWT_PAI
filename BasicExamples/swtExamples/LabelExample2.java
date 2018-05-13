/*******************************************************************************
 * Copyright (c) 2000, 2005 IBM Corporation and others. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors: IBM Corporation - initial API and implementation
 *******************************************************************************/

package swtExamples;

/*
 * Label example snippet: create a label (a separator)
 *
 * For a list of all SWT example snippets see http://www.eclipse.org/swt/snippets/
 */
import org.eclipse.swt.*;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.widgets.*;
import org.eclipse.swt.layout.*;

public class LabelExample2 {

	static String newLine = System.getProperty("line.separator");
	private static Label positiongLabel;
	private static Shell shell;

	public static void main(String[] args) {
		Display display = new Display();
		shell = new Shell(display);

		positiongLabel = new Label(shell, SWT.BORDER);

		int x = 60;
		int y = 20;
		int width = 400;
		int height = 200;

		positiongLabel.setBounds(x, y, width, height);
		int toolbarSize = 30;

		shell.setBounds(200, 400, width + 2 * x, height + 2 * y + toolbarSize);
		shell.open();

		shell.addMouseMoveListener(e -> showSize(e));
		positiongLabel.addMouseMoveListener(e -> showSize(e));

		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) display.sleep();
		}
		display.dispose();
	}

	public static void showSize(MouseEvent e) {
		int x = e.x;
		int y = e.y;
		String s = "Bounds for Label: " + positiongLabel.getBounds() + newLine;
		s += "Bounds for Shell: " + shell.getBounds() + newLine;
		s += "Mouse pointer: " + x + " " + y;
		positiongLabel.setText(s);

	}
}