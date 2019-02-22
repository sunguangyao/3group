package com.itheima.contro;

import com.itheima.domain.Maven;
import com.itheima.services.Sevivces;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Contro {
    @Autowired
    private Sevivces sevivces;
    @RequestMapping("/user")
    public String Shou(Model model){
        Maven findybid = sevivces.findybid(1);
        model.addAttribute("item",findybid);
        return "itemDetail";
    }
}
