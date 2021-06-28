package com.emp.controller;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.emp.model.service.EmpService;

/**
 * Servlet implementation class SearchEmpServlet
 */
@WebServlet("/searchEmp")
public class SearchEmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchEmpServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		String type=request.getParameter("searchType");
		String keyword=request.getParameter("searchKeyword");
		String gender=request.getParameter("gender");
		String salary=request.getParameter("salary");
		String lege=request.getParameter("le_ge");
		String[] jobcodes=request.getParameterValues("jobcode");
		
		
		
	
		//다수의 데이터 저장할 수 있는 객체로 전송
		//배열, 리스트, 맵, vo ->
		Map<String,Object> param=new HashMap();
		param.put("type", type);
		param.put("keyword", keyword);
		param.put("gender", gender);
		param.put("salary", salary);
		param.put("lege", lege);
		param.put("hlege",request.getParameter("h_le_ge"));
		param.put("hiredate", request.getParameter("hiredate"));
		param.put("jobcodes", jobcodes);
		
		
	
		
		request.setAttribute("list", new EmpService().searchEmp(param));

		
		request.getRequestDispatcher("/views/emp/empList.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
