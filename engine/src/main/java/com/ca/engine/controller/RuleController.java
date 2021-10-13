package com.ca.engine.controller;

import com.ca.engine.dto.Response;
import com.ca.engine.dto.RuleDTO;
import com.ca.engine.dto.RuleManagementDTO;
import com.ca.engine.service.RuleService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/v1/engine")
public class RuleController {

    private RuleService ruleService;
    public RuleController(RuleService ruleService) {
        this.ruleService = ruleService;
    }

    @PostMapping("/saveRule")
    public Mono<ResponseEntity<Response>> saveRule(@RequestBody RuleDTO ruleDTO) {
      return   ruleService.saveRule(ruleDTO).map(x->
                ResponseEntity.ok().body(new Response(x.getId() + " rule saved")));
    }

    @PostMapping("/saveRuleManagement")
    public Mono<ResponseEntity<Response>> saveRule(@RequestBody RuleManagementDTO ruleManagementDTO) {
        return   ruleService.saveRuleManagement(ruleManagementDTO).map(x->
                ResponseEntity.ok().body(new Response(x.getId() + " rule management saved")));
    }

    @GetMapping("/triggerRuleManagement/{id}")
    public void triggerRule(@PathVariable Long id) {
        ruleService.triggerRule(id);
    }


}
