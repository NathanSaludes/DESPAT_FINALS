package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AntiCovidMarketServlet")
public class AntiCovidMarketServlet extends HttpServlet {

	String[] alcoholArray = { "cleene", "biogenic", "doctorj" };
	ArrayList<String> alcoholList = new ArrayList<String>();

	private ArrayList<String> collectAlcohol() {
		for (String text : alcoholArray) {
			alcoholList.add(text);
		}
		return alcoholList;
	}

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		collectAlcohol();
		request.setAttribute("alcohols", alcoholList);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
