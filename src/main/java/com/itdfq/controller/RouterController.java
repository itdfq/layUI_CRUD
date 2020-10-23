package com.itdfq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @date: 2020/10/22 20:14
 * @author: itdfq
 * @Email: 909256107@qq.com
 * @Blog: itdfq.com
 *
 */
@Controller
public class RouterController {



    //table页
    @GetMapping("/table")
    public String table(){return "table"; }

    @GetMapping("/edit")
    public String edit(){return "edit"; }

    @GetMapping("/add")
    public String add(){return "add"; }





}
