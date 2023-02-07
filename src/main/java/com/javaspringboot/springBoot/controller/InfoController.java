package com.javaspringboot.springBoot.controller;

import org.springframework.web.bind.annotation.*;

//RestController annotation must be specified for to be a Rest Api.

@RestController
@RequestMapping(path = "/api") //Information on how to access ent-points under this controller
public class InfoController {

    //localhost:8080/api/info

    //Simple operation - Products listing

    //End-point is a door to the outside.
    //User comes to this door and returns according to the end-point

    @GetMapping("/info")
    public String productsInfo() {
        return "Notebook Information!";
    }

    //@GetMapping("/")
    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String get() {
        return "Notebook";
    }

    @PostMapping(path = "/save")
    public String save() {
        return "Data saved.";
    }

    @DeleteMapping(path = "/delete")
    public String delete() {
        return "Data deleted.";
    }

}
