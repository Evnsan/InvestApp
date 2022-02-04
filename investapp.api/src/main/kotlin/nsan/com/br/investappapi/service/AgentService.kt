package nsan.com.br.investappapi.service

import nsan.com.br.investappapi.model.Agent
import nsan.com.br.investappapi.repository.AgentRepository
import org.springframework.stereotype.Service

@Service
class AgentService(val db: AgentRepository) {
    fun getAgents(): List<Agent> = db.getAgents()
}