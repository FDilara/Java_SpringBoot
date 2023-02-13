package com.javaspringboot.springBoot.introductionInfos;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api")
public class MessageController {
    /*@GetMapping(path = "/message/{message}")
    public String getMessage(@PathVariable String message) {
        return "Your message is: " + message;
    }*/

    @GetMapping(path = "/message1/{m}")
    public String getMessage(@PathVariable("m") String message) {
        return "Your message is: " + message;
    }

    /*@GetMapping(path = "/message2")
    public String getMessage2(@RequestParam String message) {
        return "Your message is: " + message;
    }*/

    @GetMapping(path = "/message2")
    public String getMessage2(@RequestParam("m") String message) {
        return "Your message is: " + message;
    }


    @GetMapping(path = {"/message3", "/message3/{message}"})
    public String getMessage3(@PathVariable(name = "message", required = false) String message) {
        return "Your message is: " + message;
    }

    @GetMapping(path = "/message4")
    public String getMessage4(@RequestParam(name = "message", required = false, defaultValue = "My default message") String message) {
        return "Your message is: " + message;
    }

}
