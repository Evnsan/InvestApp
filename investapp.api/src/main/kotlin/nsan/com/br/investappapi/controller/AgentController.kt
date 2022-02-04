package nsan.com.br.investappapi.controller

import nsan.com.br.investappapi.model.Agent
import nsan.com.br.investappapi.service.AgentService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class AgentController(val service: AgentService) {
    @GetMapping("/agent")
    fun agents(): List<Agent> = service.getAgents()
}
