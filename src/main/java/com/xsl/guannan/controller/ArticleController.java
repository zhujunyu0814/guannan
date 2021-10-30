package com.xsl.guannan.controller;


import com.xsl.guannan.domain.*;
import com.xsl.guannan.mapper.*;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;


@Controller
@RequestMapping("/article")
public class ArticleController {

    @SuppressWarnings("all")
    @Autowired
    ArticleMapper articleMapper;

    @SuppressWarnings("all")
    @Autowired
    ArticleReceiverMapper articleReceiverMapper;

    //判断前台传来的数据是要处理哪种事件
    /*
    *
    * */
    public  void putCommonCode(ModelMap map,Integer type){
        switch (type){
            case 1:{
                map.put("title","新建公告");
                map.put("typeName","公告");
                break;
            }
            case 2:{
                map.put("title","新建批办");
                map.put("typeName","批办");
                break;
            }
            case 3:{
                map.put("title","新建公文");
                map.put("typeName","公文");
                break;
            }
            case 4:{
                map.put("title","新建通知");
                map .put("typeName","通知");
            }

        }

    }

    @RequestMapping("/list")
    public  String articleList(Integer type,ModelMap map,Integer readStatus ,String from){
            putCommonCode(map,type);
            map.put("from",from);
            map.put("readStatus",readStatus);


        return "articleList";
    }

    @RequestMapping("/delete")
    public Map<String,Object> delete(Integer id ){

        /**
         *  1、根据id查找到这条数据
         *  2、将这条数据的deleteid更改为2
         *  3、更新接收表中的自己发的信息的状态改为删除状态  根据deleteid更新
         *  4、
         *  5、删除
         */
        Article article=articleMapper.selectByPrimaryKey(id);
        article.setIsDelete(2);
        articleMapper.updateByPrimaryKey(article);

        ArticleReceiverExample articleReceiverExample=new ArticleReceiverExample();
        articleReceiverExample.createCriteria().andArticleIdEqualTo(id);


        return null;

    }
}




















