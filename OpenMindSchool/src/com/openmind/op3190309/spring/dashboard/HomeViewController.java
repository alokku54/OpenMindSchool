package com.openmind.op3190309.spring.dashboard;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeViewController {

	public HomeViewController() {
		// TODO Auto-generated constructor stub
	}
	@RequestMapping("/")
	public String showHomePage() {
		System.out.println("I'm running");
		return "index";
	}
	@GetMapping("/home")
//	@RequestMapping("/login")
	public String showHomePPage() {
		System.out.println("Someone is asking for login page.");
		return "home";
	}
	@RequestMapping("/who")
	public @ResponseBody String whoAreYou() {
		return "I'm spring";
	}
}
