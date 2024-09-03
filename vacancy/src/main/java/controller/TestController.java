package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @GetMapping("/")
    public String home() {
        return "index"; // 이 경우 src/main/resources/templates/index.html 반환
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello"; // src/main/resources/templates/hello.html 반환
    }

    @GetMapping("/map")
    public String map() {
        return "map"; // src/main/resources/templates/map.html 반환
    }
}