package com.devinspirare.commons;

import java.io.IOException;

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
	
	@SuppressWarnings("unchecked")
	public static <T> T convertJsonToObject(String json, T obj) throws IOException {
		return (T) objectMapper.readValue(json, obj.getClass());
	}
	
	public static <T extends Object> String convertObjectToJson(T obj) throws JsonProcessingException {
		return objectMapper.writeValueAsString(obj);
	}
}
