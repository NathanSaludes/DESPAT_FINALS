package controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import utilities.DatabaseManager;

import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Alcohol;
import models.AlcoholFactory;
import models.SanitizerFactory;

@WebServlet("/AntiCovidMarketServlet")
public class AntiCovidMarketServlet extends HttpServlet {

	private String[] alcoholArray = { "cleene", "biogenic", "doctorj"};
	private String[] sanitizerArray = {"germx","equate","artnaturals"};
	
	private ArrayList<String> alcoholList = new ArrayList<String>();
	private ArrayList<String> sanitizerList = new ArrayList<String>();
	private ArrayList<Object> productList = new ArrayList<Object>();
	AlcoholFactory af;
	SanitizerFactory sf;
	
	public void init () throws ServletException {		
		//INITIALIZE DB CONF
		//Singleton pattern for connection init
		Connection conn = DatabaseManager.initialize();
		
		af = new AlcoholFactory();
		sf = new SanitizerFactory();
	}

	private void collectAlcohol() {
		for (String text : alcoholArray) {
			alcoholList.add(text);
		}
	}
	private void collectSanitizer() {
		for (String text : sanitizerArray) {
			sanitizerList.add(text);
		}
	}


	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		collectAlcohol();
		collectSanitizer();
		
		
		
//		CoronaVirus corona = new VirusFactory().getCoronaVirus(virus);
		for(int i=0;i<3;i++){
			productList.add(af.getAlcohol(alcoholList.get(i)));
			productList.add(sf.getSanitizer(sanitizerList.get(i)));
		}
		
		
		
		
		
		request.setAttribute("products", productList);
		
		System.out.println("/DESPATT/src/controllers/AntiCovidMarketServlet.java");
		response.sendRedirect("index.jsp");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	}

}
