package com.ccpa.compreqdtls.exception;

public class CCPAException extends Exception{
	
	
	private static final long serialVersionUID = 4948358514677721033L;
	
	public CCPAException(String errorCode, String userMessage, String devOpsMessage, String oMsg, Exception ex) {
		super();
		this.errorCode = errorCode;
		this.userMessage = userMessage;
		this.devOpsMessage = devOpsMessage;
		this.sTrace = getsTrace(ex);
		this.oMsg = oMsg;
		this.ex = ex;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getUserMessage() {
		return userMessage;
	}
	public void setUserMessage(String userMessage) {
		this.userMessage = userMessage;
	}
	public String getDevOpsMessage() {
		return devOpsMessage;
	}
	public void setDevOpsMessage(String devOpsMessage) {
		this.devOpsMessage = devOpsMessage;
	}
	public String getsTrace(Exception ex) {
		if(ex != null) {
			StringBuilder stb = new StringBuilder();
			for(StackTraceElement element : ex.getStackTrace()) {
				stb.append(element);
				stb.append(System.getProperty("line.separator"));
			}
			sTrace = stb.toString();
		}
		return sTrace;
	}
	
	public String getoMsg() {
		return oMsg;
	}
	public void setoMsg(String oMsg) {
		this.oMsg = oMsg;
	}
	public Exception getEx() {
		return ex;
	}
	public void setEx(Exception ex) {
		this.ex = ex;
	}
	private String errorCode;
	private String userMessage;
	private String devOpsMessage;
	private String sTrace;
	private String oMsg;
	private Exception ex;
	
	

}
