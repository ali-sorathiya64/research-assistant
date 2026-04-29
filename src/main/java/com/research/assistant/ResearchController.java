package com.research.assistant;


import com.research.assistant.service.ResearchRequest;
import com.research.assistant.service.ResearchService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/research")
@CrossOrigin(origins = "*")
@AllArgsConstructor
public class ResearchController {

    private final ResearchService researchService;




    @PostMapping("/process")
    public Mono<String> processContent(@RequestBody ResearchRequest request) {
        return researchService.processContent(request);
    }

}
