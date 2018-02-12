package com.devinspirare.commons;

import java.io.IOException;

import org.apache.commons.io.Charsets;
import org.apache.commons.io.IOUtils;
import org.junit.Test;

import com.devinspirare.commons.model.Prueba;
import com.fasterxml.jackson.core.JsonProcessingException;

import junit.framework.TestCase;

public class UtilsTest extends TestCase {

	private Prueba prueba;

	public void setUp() {
		prueba = new Prueba();
		prueba.setName("Zeler Benji");
		prueba.setLastName("Villarreal Marcelo");
		prueba.setAlfanumerico("123456789zxcvbnmasdfghjklqwertuiop");
		prueba.setTildacion("íónúáé£");
	}

	@Test
	public void testConvertJsonToObject() {
		try {
			String json = Utils.convertObjectToJson(prueba);
			assertTrue(json != null);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testConvertObjectToJson() throws IOException {
		ClassLoader classLoader = getClass().getClassLoader();
		String jsonObject = IOUtils.toString(classLoader.getResource("ObjetoPrueba.json"), Charsets.ISO_8859_1);
		assertNotNull(jsonObject);
	}

}
