package org.joonhee.jdbc.spring.Example;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ArticleMain {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("chap02.xml");
		ArticleService articleService = ctx.getBean("articleService",  org.joonhee.jdbc.spring.Example.ArticleService.class);
		MemberService memberService = ctx.getBean("memberService",  org.joonhee.jdbc.spring.Example.MemberService.class);

		articleService.addArticle();
		memberService.registerMember();

		ctx.close();
	}

}