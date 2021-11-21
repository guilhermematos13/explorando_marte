package shared;

import javax.swing.JOptionPane;

public class Input {
	public int[] inputValue;
	public int[] useInput(String message, boolean formatInt) {
	boolean inputAccepted = false;
	while(!inputAccepted) {
	  try {
	    String value = JOptionPane.showInputDialog
	    		(message);
	    
	    if (value.isEmpty()) {
	    	JOptionPane.showMessageDialog(null, "Insira as informações!");
	    	
	    } else {
	      inputAccepted = true;
	      value = value.replace(" ", "");
	      if(formatInt) {
	    	  int[] formatValue = new int[value.length()];

			    for (int i = 0; i < value.length(); i++){
			    	if(i == 0 || i == 1) {
				    	formatValue[i] = value.charAt(i) - '0';
			    	}
			    }
			    return formatValue;
	      }
	     
	    }
	  } catch(Exception e) {
		  JOptionPane.showMessageDialog(null, "Algo deu errado!");
		  System.exit(0);
	  }
	}
	return null;
	}
	
}
