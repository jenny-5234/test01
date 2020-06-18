package com.test01.Controller;

//import com.test01.Dto.FamilyDto;
//import com.test01.Service.FamilyServiceImpl;
//import com.test01.Service.FamilyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class HomeController {

    @RequestMapping(value = "/")
    public String index() {

        return "index";
    }
//    @Autowired
//    FamilyServiceImpl familyServiceImpl;
//
//    @GetMapping("/family")
//    public String list(Model model) {
//        List<FamilyDto> familylist = familyServiceImpl.getAllList();
//
//        model.addAttribute("familylist", familylist);
//
//        System.out.println(familylist);
//
//        return "family";
//    }

}
