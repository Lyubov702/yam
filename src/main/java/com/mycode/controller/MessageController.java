package com.mycode.controller;

import com.mycode.model.Message;
import com.mycode.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/message")
public class MessageController {

    @Autowired
    private MessageService messageService;

    @GetMapping
    public String getMessages(Model model) {
        model.addAttribute("allMessages", messageService.findAll());
        return "/message/list";
    }


/*
    @GetMapping(value = "/add")
    public String addMessage(Model model) {
        model.addAttribute("message", new Message());

        return "message/add";
    }

    @PostMapping(value = "/add")
    public String add(@ModelAttribute("message") Message message) {
        messageService.save(message);
        return "redirect:/message";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("id") Integer id) {
        messageService.deleteById(id);
        return "redirect:/message";
    }

*/

}
