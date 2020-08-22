package exception;

@SuppressWarnings("serial")
public class DocNumberException extends Exception {
	
	private String numDoc;

	public DocNumberException(String numDoc) {
		super("The document number can not enter.");
		this.numDoc=numDoc;
	}

	public String getNumDoc() {
		return numDoc;
	}

} 
