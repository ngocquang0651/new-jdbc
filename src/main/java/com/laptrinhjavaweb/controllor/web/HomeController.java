package com.laptrinhjavaweb.controllor.web;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.laptrinhjavaweb.model.NewsModel;
import com.laptrinhjavaweb.service.ICategoryService;
import com.laptrinhjavaweb.service.INewService;

@WebServlet(urlPatterns = { "/trang-chu" })
public class HomeController extends HttpServlet {

	@Inject
	private ICategoryService categoryService;

	@Inject
	private INewService newService;
	private static final long serialVersionUID = -1452334356037796178L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/*
		 * String title = "bai viet 4"; String content = "bai biet 4"; Long categoryId =
		 * 1L; NewsModel newsModel=new NewsModel(); newsModel.setTilte(title);
		 * newsModel.setContent(content); newsModel.setCategoryId(categoryId);
		 * newService.save(newsModel); request.setAttribute("categories",
		 * categoryService.findALL());
		 */
		RequestDispatcher rd = request.getRequestDispatcher("/view/web/home.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}
}
