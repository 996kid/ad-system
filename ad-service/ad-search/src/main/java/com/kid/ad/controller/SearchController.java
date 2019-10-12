package com.kid.ad.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author yuyh
 * @desription
 * @date 2019/8/16
 */
@RestController
@Slf4j
public class SearchController {

    @Autowired
    private RestTemplate restTemplate;


}
