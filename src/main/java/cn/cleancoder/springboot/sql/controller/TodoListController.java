package cn.cleancoder.springboot.sql.controller;

import javax.annotation.Resource;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cn.cleancoder.springboot.sql.mapper.CardMapper;
import cn.cleancoder.springboot.sql.model.Card;

@RestController
@EnableAutoConfiguration
@RequestMapping("/api/list/")
public class TodoListController {

	@Resource
	private CardMapper cardMapper;

	@RequestMapping(value="card",method=RequestMethod.GET)
	public Integer create() {

		Card card = new Card();
		card.setTitle("title test");
		card.setTodoListId(1);
		int id =cardMapper.insert(card);
		return id;
	}
}
