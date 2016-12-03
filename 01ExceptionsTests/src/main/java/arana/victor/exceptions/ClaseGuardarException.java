package arana.victor.exceptions;

public class ClaseGuardarException extends Exception {

	private static final long serialVersionUID = 1L;

	public ClaseGuardarException() {
	}

	public ClaseGuardarException(String message) {
		super(message);
	}

	public ClaseGuardarException(String message, Throwable cause) {
		super(message, cause);
	}

}
