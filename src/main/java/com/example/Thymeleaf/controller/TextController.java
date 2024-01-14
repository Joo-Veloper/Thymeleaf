package com.example.Thymeleaf.controller;

import com.example.Thymeleaf.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/text")
public class TextController {

    // Text Basic URL로 연결
    @GetMapping("/basic")
    //model 객체의 addAttribute를 통해 key라는 이름의 key값을 세팅
    public String basic(Model model) {
        //model 객체의 addAttribute를 통해 value라는 이름으로 value값 세팅
        model.addAttribute("key", "<b>value</b>");
        //return test/basic -> tempplates/test/basic/html.view 호출
        return "test/basic";
    }

    @GetMapping("/unescaped")
    public String unescaped(Model model) {
        model.addAttribute("key", "<b>value</b>");

        return "test/basic-unescaped";
    }

    @GetMapping("/variable")
    public String variable(Model model) {

        User wonuk = new User("wonuk", 100);
        User wongyu = new User("wongyu", 101);

        List<User> userList = new ArrayList<>();
        userList.add(wonuk);
        userList.add(wongyu);

        Map<String, User> userMap = new HashMap<>();
        userMap.put("wonuk", wonuk);
        userMap.put("wongyu", wongyu);

        model.addAttribute("wonuk", wonuk);
        model.addAttribute("wongyu", wongyu);

        model.addAttribute("userList", userList);
        model.addAttribute("userMap", userMap);

        return "test/variable";
    }

    @GetMapping("/object")
    public String object() {
        return "test/object";
    }

    @GetMapping("/url-link")
    public String urlLink(Model model) {
        model.addAttribute("test1", "value1");
        model.addAttribute("test2", "value2");

        return "test/url-link";
    }
    @GetMapping("/literal")
    public String literal(Model model) {
        model.addAttribute("key", "value");

        return "test/literal";
    }

    @GetMapping("/operation")
    public String operation(Model model) {
        model.addAttribute("null", null);
        model.addAttribute("key", "sparta");

        return "test/operation";
    }
    @GetMapping("/attribute")
    public String attribute() {
        return "test/attribute";
    }

    @GetMapping("/th-each")
    public String thEach(Model model) {
        List<User> userList = new ArrayList<>();

        userList.add(new User("user1", 21));
        userList.add(new User("user2", 22));
        userList.add(new User("user3", 23));
        userList.add(new User("user4", 24));

        model.addAttribute("userList", userList);

        return "test/th-each";
    }
    @GetMapping("/if-unless")
    public String condition(Model model) {
        List<User> list = new ArrayList<>();

        list.add(new User("user1", 10));
        list.add(new User("user2", 15));
        list.add(new User("user3", 20));
        list.add(new User("user4", 25));

        model.addAttribute("list", list);

        return "test/if-unless";
    }

    @GetMapping("/comments")
    public String comments(Model model) {
        model.addAttribute("test", "Sparta");

        return "test/comments";
    }

    @GetMapping("/block")
    public String block(Model model) {
        List<User> userList = new ArrayList<>();
        userList.add(new User("user1", 10));
        userList.add(new User("user2", 15));
        userList.add(new User("user3", 20));
        userList.add(new User("user4", 25));

        model.addAttribute("userList", userList);

        return "test/block";
    }

    @GetMapping("/inline")
    public String inline(Model model) {
        User user = new User("user", 10);

        model.addAttribute("user", user);

        return "test/inline";
    }

}
