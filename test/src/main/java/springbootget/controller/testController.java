package springbootget.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/testController")
public class testController {

	@RequestMapping("/methodPath")
	public void method() {
		System.out.println("正文testController/methodPath");
	}

}
