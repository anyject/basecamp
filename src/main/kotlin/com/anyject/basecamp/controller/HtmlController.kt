package com.anyject.basecamp.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HtmlController {

    @GetMapping ("/aa")
    fun index(model: Model): String {

        model["title"] = "Blog" /* = model.addAttribute("title", "Blog") / import org.springframework.ui.set  */
        print("HtmlController")
        val viewName = "test";
        return viewName
    }

}
