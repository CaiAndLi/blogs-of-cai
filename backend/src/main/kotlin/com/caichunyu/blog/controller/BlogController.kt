package com.caichunyu.blog.controller

import org.springframework.context.annotation.Lazy
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * @author caichunyu <caichunyu@kuaishou.com>
 * Created on 2022-07-31
 */
@RestController
@Lazy
@RequestMapping("/api")
class BlogController {

    @RequestMapping("/health-check")
    fun healthCheck() = "ok"
}
