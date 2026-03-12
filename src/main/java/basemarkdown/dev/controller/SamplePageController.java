package basemarkdown.dev.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Thymeleaf 샘플 페이지 컨트롤러.
 */
@Controller
@RequestMapping("/html")
public class SamplePageController {

    @GetMapping("/sample")
    public String sample(Model model) {
        model.addAttribute("name", "Basemarkdown");
        return "html/sample";
    }
}
