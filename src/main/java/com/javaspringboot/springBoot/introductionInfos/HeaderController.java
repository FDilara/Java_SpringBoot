package com.javaspringboot.springBoot.introductionInfos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class HeaderController {

    @GetMapping(path = "/header")
    public String getHeader(@RequestHeader("My-Header") String myHeader) {
        return "Your header is: " + myHeader;
    }

}
