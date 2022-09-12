package com.example.RockPaperScissor;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class RockPaperScissorController {

    @GetMapping("/play")
    public String gameForm(Model model) {
        model.addAttribute("game", new Game());
        return "play";
    }

    @GetMapping("/")
    public String redirectForm(Model model) {
        model.addAttribute("game", new Game());
        return "play";
    }

    @PostMapping("/play")
    public String gameSubmit(@ModelAttribute Game game, Model model) {
        model.addAttribute("game", game);
        return "result";
    }


}