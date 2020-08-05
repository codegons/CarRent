package com.codegons.utils;

public class ApplicationConstants {

	private ApplicationConstants() {
	}

	public static final String APPLICATION_NAME = "todo";
	

	// For Logging Filter
	public static final String BASE_PATH = "/api/v1";
	public static final String BASE_PATH_TOEKN = "/api/secure";
	public final static String TRANSACTION_ID_IDENTIFIER = "transactionId";
	public final static String REQUEST_URI_IDENTIFIER = "serviceName";
	public final static String RESPONSE_TIME_IDENTIFIER = " s e r v i c e - r e s p o n s e  - d u r a t i o n : ";//
	public final static String HOST_IDENTIFIER = "hostname";
	public final static String APP_VERSION = "version";
	public final static String LOG_LEVEL = "loglevel";
	public final static String HOST_IDENTIFIER_TAG = "hostidentifier";

	// Swagger documentation
	public final static String SWAGGER_CAT_DESCRIPTION_CAR = "Services for car rent";
	public final static String SWAGGER_TAG_DESCRIPTION_CAR = "car rent";
	public final static String SWAGGER_CAT_DESCRIPTION_AUTH = "Autherization Service";
	public final static String SWAGGER_TAG_DESCRIPTION_AUTH = "token";

	public final static String SWAGGER_CONTENT_DESCRIPTION = "application/json";

	
	// api security flag
	public final static boolean API_SECURITY_ENABLE = true;

}
