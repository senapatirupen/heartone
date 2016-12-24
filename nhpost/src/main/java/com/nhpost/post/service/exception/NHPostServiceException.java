package com.nhpost.post.service.exception;

// TODO: Auto-generated Javadoc
/**
 * The Class DataAccessException.
 */
public class NHPostServiceException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String errCode;
	private String errMsg;

	public String getErrCode() {
		return errCode;
	}

	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}

	public String getErrMsg() {
		return errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}

	public NHPostServiceException(String errCode, String errMsg) {
		this.errCode = errCode;
		this.errMsg = errMsg;
	}

	/**
	 * Instantiates a new data access exception.
	 */
	public NHPostServiceException() {
		super();
	}

	/**
	 * Instantiates a new data access exception.
	 *
	 * @param message
	 *            the message
	 */
	public NHPostServiceException(String message) {
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
	public NHPostServiceException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * Instantiates a new data access exception.
	 *
	 * @param cause
	 *            the cause
	 */
	public NHPostServiceException(Throwable cause) {
		super(cause);
	}

}
