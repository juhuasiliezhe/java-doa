package springbootget.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/getController")
public class getController {

	@RequestMapping("/methodPath")
	public void method() {
		System.out.println("正文getController/methodPath");
	}

}
