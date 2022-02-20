package nsan.com.br.investappapi.model

import org.springframework.data.relational.core.mapping.Table

@Table
data class Account(
    val code: String,
    val agent_id: Agent) {
}