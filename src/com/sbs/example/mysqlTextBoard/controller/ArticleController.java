package com.sbs.example.mysqlTextBoard.controller;

import java.util.List;

import com.sbs.example.mysqlTextBoard.container.Container;
import com.sbs.example.mysqlTextBoard.dto.Article;
import com.sbs.example.mysqlTextBoard.service.ArticleService;

public class ArticleController {

	private ArticleService articleService;

	public ArticleController() {
		articleService = Container.articleService;
	}

	public void doCmd(String cmd) {
		if (cmd.equals("article list")) {
			showList();
		}

	}

	private void showList() {
		System.out.println("== 게시물 리스트 ==");
		List<Article> articles = articleService.showList();
		System.out.println("번호 / 작성 / 수정 / 작성자 / 제목");
		for (Article article : articles) {
			System.out.printf("%d / %s / %s / %s / %s\n", article.id, article.regDate, article.updateDate,
					article.userId, article.title);
		}

	}

}
