package me.taesu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.PushBuilder;

/**
 * Created by taesu at : 2019-02-08
 *
 * 여기에 IndexController 클래스에 대한 설명을 기술해주세요
 *
 * @author taesu
 * @version 1.0
 * @since 1.0
 */
@Controller
public class IndexController {

    @GetMapping("")
    public String getIndexPage(Model model) {
        model.addAttribute("name", "Lee");
        model.addAttribute("message", "Hello Spring5");
        return "index";
    }

    @GetMapping("push")
    public String getPushIndexPage(Model model, PushBuilder pushBuilder) {
        model.addAttribute("name", "Lee");
        model.addAttribute("message", "Hello Spring5");

        pushBuilder.path("webjars/bootstrap/3.3.7-1/css/bootstrap-theme.min.css").push();
        pushBuilder.path("webjars/jquery-ui/1.12.1/jquery-ui.css").push();
        pushBuilder.path("webjars/jquery/3.1.1/jquery.min.js").push();
        pushBuilder.path("webjars/bootstrap/3.3.7-1/js/bootstrap.js").push();
        pushBuilder.path("webjars/d3js/5.5.0/d3.js").push();
        pushBuilder.path("webjars/jquery-ui/1.12.1/jquery-ui.js").push();
        pushBuilder.path("webjars/validate.js/0.12.0/validate.js").push();
        pushBuilder.path("webjars/requirejs/2.3.6/require.js").push();
        return "push-index";
    }
}
