package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VacancyController {
	
	@GetMapping("/")
    public String newfile() {
        return "NewFile";  // map.html 템플릿을 렌더링
    }
	
	@GetMapping("/index")
    public String index() {
        return "index";  // map.html 템플릿을 렌더링
    }
	
	@GetMapping("/map")
    public String map() {
        return "map2";  // map.html 템플릿을 렌더링
    }
}