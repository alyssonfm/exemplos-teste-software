package exceptions;

public class AccountStackException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public AccountStackException() {
		super();
	}
	
	public AccountStackException(String ex){
		super(ex);
	}

}
