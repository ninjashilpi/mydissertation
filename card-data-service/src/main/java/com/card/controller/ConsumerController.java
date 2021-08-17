package com.card.controller;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import com.card.security.JwtTokenUtil;
import com.card.security.JwtUser;
import com.card.security.service.JwtUserDetailsService;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/v1/api/consumer")
@Api(tags = "Consumer")
public class ConsumerController {

    @Autowired
    JwtTokenUtil jwtTokenUtil;

    @Autowired
    @Qualifier("jwtUserDetailsService")
    private JwtUserDetailsService userDetailsService;


    /**
     *
     *  Detail of current user login , By jwt token
     *
     * **/
    @GetMapping(value = "/me")

    public JwtUser getAuthenticatedUser(HttpServletRequest request) {

        JwtUser user =  userDetailsService.getUserFromHeaderToken(request);
        return user;
    }

}
