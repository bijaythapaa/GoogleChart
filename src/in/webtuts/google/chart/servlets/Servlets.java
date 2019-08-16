package in.webtuts.google.chart.servlets;

import in.webtuts.google.chart.data.PieChartData;
import in.webtuts.google.chart.data.PieChartData.KeyValue;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlets")
public class Servlets extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Servlets() {
		super();
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<KeyValue> pieDataList = PieChartData.getPieDataList();
		request.setAttribute("pieDataList", pieDataList);
		RequestDispatcher rd = request.getRequestDispatcher("/servlet.jsp");
		rd.forward(request, response);

		// List<KeyValue> pieDataList = PieChartData.getPieDataList();
		// request.setAttribute("pieDataList", pieDataList);
		// RequestDispatcher rd = request.getRequestDispatcher("/servlet.jsp");
		// rd.forward(request, response);

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}
}
