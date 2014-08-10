package edu.austincc.jsonapp;

import java.io.IOException;
import java.security.SecureRandom;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;


@WebServlet("/random")
public class RandomNumberServlet 
    extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	private SecureRandom rand = new SecureRandom();

	@SuppressWarnings("unchecked")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		JSONObject result = new JSONObject();
		result.put("number", rand.nextInt(100));
		
		response.setContentType("application/json");
		response.getOutputStream().print(result.toJSONString());
	}

}
