package shared;

import javax.swing.JOptionPane;



public class Input {	
	
	// Input/Format number
	public int[] useInputNumberArray(String message) {
	boolean inputAccepted = false;
	while(!inputAccepted) {
	  try {
		String value = JOptionPane.showInputDialog(message);
	    
	    if (value.isEmpty()) {
	    	JOptionPane.showMessageDialog(null, "Insira as informações!");
	    	
	    } else {
	      inputAccepted = true;
	      value = value.replace(" ", "");
	      
	      int[] formatValue = new int[value.length()];

	      for (int i = 0; i < value.length(); i++){
			  if(i == 0 || i == 1) {
				   formatValue[i] = value.charAt(i) - '0';
			    	}
			    }
			    return formatValue;
	     
	    }
	  } catch(Exception e) {
		  JOptionPane.showMessageDialog(null, "Algo deu errado!");
		  System.exit(0);
	  }
	}
	return null;
	}
	
	//Input de Array String
	public char[] useInputTextArray(String message) {
		boolean inputAccepted = false;
		while(!inputAccepted) {
			try {
				String value = JOptionPane.showInputDialog(message);
				if(value.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Insira as informações!");
				} else {
					inputAccepted = true;
					value = value.replace(" ", "");
					
					char[] transformValue = new char[value.length()];
					for(int i = 0; i < value.length(); i++) {
						transformValue[i] = value.charAt(i);
					}
				        
					return transformValue;
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Algo deu errado!");
				System.exit(0);
			}
		}
		return null;
	}
	
	// Input de String
	public String useInputString(String message) {
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
		      return value;
		     
		    }
		  } catch(Exception e) {
			  JOptionPane.showMessageDialog(null, "Algo deu errado!");
			  System.exit(0);
		  }
		}
		return null;
		}
	
	
	
}
