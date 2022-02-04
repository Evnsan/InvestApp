package nsan.com.br.investappapi.repository

import nsan.com.br.investappapi.model.Agent
import org.springframework.data.jdbc.repository.query.Query
import org.springframework.data.repository.CrudRepository

interface AgentRepository: CrudRepository <Agent, String> {
    @Query("Select * from agents")
    fun getAgents(): List<Agent>
}