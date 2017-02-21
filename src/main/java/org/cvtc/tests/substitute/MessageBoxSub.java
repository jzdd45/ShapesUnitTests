package org.cvtc.tests.substitute;

import javax.swing.JOptionPane;

public class MessageBoxSub implements DialogSub{

	public int show(String message) {
		JOptionPane.showMessageDialog(null, message);
		
		return JOptionPane.OK_OPTION;
	}

	
	
}
