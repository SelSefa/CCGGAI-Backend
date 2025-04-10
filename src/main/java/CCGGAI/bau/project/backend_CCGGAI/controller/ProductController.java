package CCGGAI.bau.project.backend_CCGGAI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import CCGGAI.bau.project.backend_CCGGAI.service.OpenAiServiceGPT;

import java.util.Map;

@RestController
@RequestMapping("/api/ai")
public class ProductController {
    
    @Autowired
    private OpenAiServiceGPT openAiService;
    
    @PostMapping("/generate-description")
    public String generateDescription(@RequestBody Map<String, String> payload) {
        String name = payload.get("name");
        String category = payload.get("category");
        return openAiService.generateDescription(name, category);
    }
    
    @GetMapping("/test")
    public String test() {
        return "Test is working!";
    }
}

    