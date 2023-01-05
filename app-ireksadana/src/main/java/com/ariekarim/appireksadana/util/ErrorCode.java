package com.ariekarim.appireksadana.util;

public enum ErrorCode {
	
	 AUTH_TOKEN_ERROR                    (10001, "Token error"),
	 AUTH_TOKEN_EMPTY                    (10002, "Token empty"),
	 AUTH_TOKEN_EXPIRED                  (10003, "Token expired"),
	 AUTH_TOKEN_INVALID                  (10004, "Token invalid"),
	 AUTH_FAILED                         (10005, "Authetication failed"),
	 CIF_EXIST							 (1090002, "Customer already exists"),
	 ID_NUMBER_EXIST					 (1090003, "ID Number already resgistered"),
	 CUSTOMER_MANDATORY_FIELD			 (1090003, "INCOMPLETE DATA FOR CUSTOMER DETAILS. PLEASE RECHECK"),
	 COMMON_ERROR        				 (99999, "GENERAL ERROR");
	
	protected int errorCode;
    protected String errorMsg;
    
    ErrorCode(int code, String msg) {
        
        this.errorCode = code;
        this.errorMsg = msg;
    }

	public int getErrorCode() {
		return errorCode;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

}
