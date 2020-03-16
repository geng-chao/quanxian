package com.ruoyi.web.controller.monitor;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller()
@RequestMapping("/monitor/map")
public class MapController {

    @RequiresPermissions("monitor:map:view")
    @GetMapping()
    public  String map(){
        return "map";
    }
}
