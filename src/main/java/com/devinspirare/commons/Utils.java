package com.devinspirare.commons;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * 
 * Utilidades Generales para DevInspirare
 * 
 * <p>
 * Esta clase provee metodos de utilidades estaticas para entrada / salida de operaciones.
 * </p>
 * <ul>
 * <li>convertJsonToObject- Se encarga de convertir un json a un object, excepción <code>IOException</code>
 * <li>convertObjectToJson - Se encarga de convertir de un objeto a json, excepción <code>JsonProcessingException</code>
 * </ul>
 * 
 * @author 
 * 		Zeler Benji Villarreal Marcelo
 *  * 
 * @version 
 * 		0.0.1
 */
public class Utils {
	
	private static ObjectMapper objectMapper = new ObjectMapper();
	
	/**
	 * 
	 * <li>convertJsonToObject- Se encarga de convertir un json a un object, excepción <code>IOException</code>
	 * @param json
	 * @param obj
	 * @return
	 * @throws IOException
	 */
	@SuppressWarnings("unchecked")
	public static <T> T convertJsonToObject(String json, T obj) throws IOException {
		return (T) objectMapper.readValue(json, obj.getClass());
	}
	
	/**
	 * <li>convertObjectToJson - Se encarga de convertir de un objeto a json, excepción <code>JsonProcessingException</code>
	 * @param obj
	 * @return
	 * @throws JsonProcessingException
	 */
	public static String convertObjectToJson(Object obj) throws JsonProcessingException {
		return objectMapper.writeValueAsString(obj);
	}
	
	/**
	 * <li>getStringDate - Obtienes el formato standard de la fecha de DevInspirare
	 * @param formatDate
	 * @param date
	 * @return String
	 */
	public static String getStringDate(Date date){
		SimpleDateFormat sdf = new SimpleDateFormat(Constants.FORMAT_DATE);
		return sdf.format(date);
	}
	
	/**
	 * <li> getStringDate - Obtienes la fecha en String, indicando previamente el formato que desea
	 * @param formatDate - Formato de fecha ejemplo : dd-MM-yyyy
	 * @param date - Fecha
	 * @return String
	 */
	public static String getStringDate(String formatDate, Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat(formatDate);
		return sdf.format(date);
	}
}
