package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping(value = "")
    @ResponseBody
    public String programLang(){
        return  "<h1> Skills Tracker</h1>" +
                "<h2> We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                "<li> Java </li>" +
                "<li> Javascript </li>" +
                "<li> Python </li>" +
                "</ol>";
    }

    @GetMapping("form")
    public String form(){
        return "<html>" +
                "<body>" +
                "<form action='hello' method='post'>" +
                "Name: " +
                "<input type='text' name='name'>" +
                "<br>My favorite language" +
                "<select name='favoritelanguange'>\n" +
                "  <option value='Java'>Java</option>\n" +
                "  <option value='Javascript'>Javascript</option>\n" +
                "  <option value='Python'>Python</option>\n" +
                "</select>" +
                "<input type='submit' value='Greetings'>" +
                "</form>" +
                "</body>" +
                "</html>";

    }

}
