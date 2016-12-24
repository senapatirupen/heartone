package com.nhpost.post.dao.exception;

// TODO: Auto-generated Javadoc
/**
 * The Class DataAccessException.
 */
public class DataAccessException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Instantiates a new data access exception.
	 */
	public DataAccessException() {
		super();
	}

	/**
	 * Instantiates a new data access exception.
	 *
	 * @param message
	 *            the message
	 */
	public DataAccessException(String message) {
		super(message);
	}

	/**
	 * Instantiates a new data access exception.
	 *
	 * @param message
	 *            the message
	 * @param cause
	 *            the cause
	 */
	public DataAccessException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * Instantiates a new data access exception.
	 *
	 * @param cause
	 *            the cause
	 */
	public DataAccessException(Throwable cause) {
		super(cause);
	}

}
