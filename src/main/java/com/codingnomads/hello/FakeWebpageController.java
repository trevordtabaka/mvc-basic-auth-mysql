package com.codingnomads.hello;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FakeWebpageController {

    @GetMapping("/fakewebpage")
    public String fakewebpage(@RequestParam(name="name", required=false, defaultValue="future amazing website page...orsomething") String name, Model model) {
        model.addAttribute("name", name);
        return "fakewebpage";
    }

}