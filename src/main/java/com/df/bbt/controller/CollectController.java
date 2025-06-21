package com.df.bbt.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.df.bbt.service.CollectService;
import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CollectController {

    @Autowired
    CollectService collectService;

    @GetMapping(value = "/getCollect.action", produces = "application/json;charset=UTF-8")
    public String getCollect(@RequestParam(value = "userAccount", defaultValue = "woshiguanliyuan") String userAccount,
                             @RequestParam(value = "pageCurrent", defaultValue = "1") Integer pageCurrent){
        List<JSONObject> collect = collectService.getCollect(userAccount, pageCurrent);
        return JSONArray.toJSONString(collect);
    }

    //post 根据用户的账号获取其收藏总页码数
    @PostMapping(value = "/getTotalCollectPage.action", produces = "application/json;charset=UTF-8")
    public String TotalCollectPage(@RequestBody JSONObject jsonObject){
        String userAccount = (String) jsonObject.get("userAccount");
        if(userAccount == null) userAccount="woshiguanliyuan";
        JSONObject result = collectService.getCollectTotalPage(userAccount);

        return result.toJSONString();
    }



}

