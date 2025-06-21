package com.df.bbt.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.df.bbt.service.ThroughService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ThroughController {

    @Autowired
    ThroughService throughService;

    @GetMapping(value = "/getThrough.action", produces = "application/json;charset=UTF-8")
    public String getThrough(@RequestParam(value = "userAccount", defaultValue = "woshiguanliyuan") String userAccount,
                             @RequestParam(value = "pageCurrent", defaultValue = "1") Integer pageCurrent){
        List<JSONObject> collect = throughService.getThrough(userAccount, pageCurrent);
        return JSONArray.toJSONString(collect);
    }

    //post 根据用户的账号获取其收藏总页码数
    @PostMapping(value = "/getTotalBrowsePage.action", produces = "application/json;charset=UTF-8")
    public String TotalThroughPage(@RequestBody JSONObject jsonObject){
        String userAccount = (String) jsonObject.get("userAccount");
        if(userAccount == null) userAccount="woshiguanliyuan";
        JSONObject result = throughService.getThroughTotalPage(userAccount);
        return result.toJSONString();
    }

    //post 删除浏览记录
    @PostMapping(value = "/deleteBrowse.action", produces = "application/json;charset=UTF-8")
    public String deleteBrowse(@RequestBody JSONObject jsonObject){
        JSONObject result = throughService.deleteBrowse((String) jsonObject.get("token"),
                Integer.parseInt((String) jsonObject.get("goodsId")));
        return result.toJSONString();
    }
}
