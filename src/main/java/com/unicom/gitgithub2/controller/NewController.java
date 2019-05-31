package com.unicom.gitgithub2.controller;

import com.unicom.gitgithub2.entity.News;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName:
 * @Author:Administrator Date:2019/5/31
 * Discription:
 */
@RestController
@RequestMapping(value = "news")
public class NewController {
    @RequestMapping(value="getALL")
        public List<News> getAll(){
            News news1=new News(1,"a","aaa");
            News news2=new News(1,"a","aaa");
            News news3=new News(1,"a","aaa");
            List<News> list=new ArrayList<>();
            list.add(news1);
            list.add(news1);
            list.add(news1);
            return list;
        }
}
