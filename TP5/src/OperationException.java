
class OperationException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public OperationException() { //recupere Exception
		super();
	}
	public OperationException(String message) //Pour afficher un string
	{
		super(message);
	}
}