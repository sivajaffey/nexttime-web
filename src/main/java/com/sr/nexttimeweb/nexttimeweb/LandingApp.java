package com.sr.nexttimeweb.nexttimeweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class LandingApp {
    // public static void main(String args[]) {
    //     System.out.println("Welcome to nextime web, This app is build to show your time logs in public");
    // }
    @RequestMapping("/")
    @ResponseBody
    public String Landing() {
        return "Welcome to nextime web, This app is build to share your time logss public";
    }
}
