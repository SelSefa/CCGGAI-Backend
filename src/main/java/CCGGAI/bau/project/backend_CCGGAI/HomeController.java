package CCGGAI.bau.project.backend_CCGGAI;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/home")
@CrossOrigin(origins = "http://localhost:3000") // React'in çalıştığı port
public class HomeController {
    
    @GetMapping
    public String getMessage() {
        return "Merhaba React! Backend çalışıyor!";
    }
}