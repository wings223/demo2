package com.example.demo2;

import com.example.demo2.model.Tab1;
import com.example.demo2.repository.Tab1Dao;
import javafx.scene.control.Tab;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@SpringBootApplication
@Controller
@RequestMapping("/")
public class Demo2Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo2Application.class, args);
	}

@Autowired
private JdbcTemplate jdbcTemplate;
	@Autowired
	private Tab1Dao tab1Dao;
	@RequestMapping("/tab")
	@ResponseBody
	public List<Tab1> t2(){
		Tab1 tab=new Tab1();
//		tab.setC1(5);
		tab.setName("中文测试");
		tab1Dao.save(tab);
//		jdbcTemplate.execute("insert into tab1 (c2,name)values('ccc','中文插入测试')");
//		jdbcTemplate.update("UPDATE tab1 set name='中文'");
		return tab1Dao.findAll();
	}
}
