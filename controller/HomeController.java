package hello.hello_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/") // 웹 브라우저에서 루트 경로 /로 GET 요청이 들어왔을 때, 해당 메서드 실행
    public String home() {
        return "home"; // home.html 파일을 찾음
    }
}
