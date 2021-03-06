package com.sbs.example.mysqlTextBoard.container;

import java.util.Scanner;

import com.sbs.example.mysqlTextBoard.controller.ArticleController;
import com.sbs.example.mysqlTextBoard.controller.BuildController;
import com.sbs.example.mysqlTextBoard.controller.Controller;
import com.sbs.example.mysqlTextBoard.controller.UserController;
import com.sbs.example.mysqlTextBoard.dao.ArticleDao;
import com.sbs.example.mysqlTextBoard.dao.UserDao;
import com.sbs.example.mysqlTextBoard.service.ArticleService;
import com.sbs.example.mysqlTextBoard.service.BuildService;
import com.sbs.example.mysqlTextBoard.service.UserService;

public class Container {

	public static Scanner sc;
	public static ArticleDao articleDao;
	public static ArticleService articleService;
	public static Controller articleController;

	public static UserDao userDao;
	public static UserService userService;
	public static Controller userController;
	public static Controller buildController;
	
	public static BuildService buildService;

	
	static {
		sc = new Scanner(System.in);

		articleDao = new ArticleDao();
		articleService = new ArticleService();
		articleController = new ArticleController();

		userDao = new UserDao();
		userService = new UserService();
		userController = new UserController();
		
		buildService = new BuildService();
		buildController = new BuildController();
		
	}

}
