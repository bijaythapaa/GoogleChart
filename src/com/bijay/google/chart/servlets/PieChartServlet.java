package com.bijay.google.chart.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bijay.google.chart.data.PieChartData;
import com.bijay.google.chart.data.PieChartData.KeyValue;

@WebServlet("/PieChartServlet")
public class PieChartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public PieChartServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<KeyValue> pieDataList = PieChartData.getPieDataList();
		// pieDataList.forEach(e ->{
		// System.out.println(e.getKey()+" "+e.getValue());
		// });

		RequestDispatcher rd = request.getRequestDispatcher("servlet.jsp");
		request.setAttribute("pieDataList", pieDataList);
		rd.forward(request, response);

		// List<KeyValue> pieDataList = PieChartData.getPieDataList();
		// request.setAttribute("pieDataList", pieDataList);
		// RequestDispatcher rd = request.getRequestDispatcher("/servlet.jsp");
		// rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}
}
