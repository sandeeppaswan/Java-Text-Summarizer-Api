package com.research.assistent;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/research")
@CrossOrigin(origins = "*")
@AllArgsConstructor
public class ResearchController {
    private final ResearchService researchService;
    @PostMapping("/process")
    public ResponseEntity<String> processContect(@RequestBody ResearchRequest request){
//        System.out.println("Received request: " + request);
//        try {
//            String result = researchService.processContent(request);
//            return ResponseEntity.ok(result);
//        } catch (Exception e) {
//            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error processing request: " + e.getMessage());
//        }
        String result = researchService.processContent(request);
        return ResponseEntity.ok(result);
    }
}
