package shared;

import javax.swing.JOptionPane;

public class Input {
	
	public void useInput(String message, String value) {
	boolean inputAccepted = false;
	while(!inputAccepted) {
	  try {
	    value = JOptionPane.showInputDialog
	    		(message);
	    
	    if (value.isEmpty()) {
	    	JOptionPane.showMessageDialog(null, "Insira as informações!");
	    	
	    } else {
	      inputAccepted = true;
	    }
	  } catch(Exception e) {
		  JOptionPane.showMessageDialog(null, "Algo deu errado!");
	  }
	}
}
}
