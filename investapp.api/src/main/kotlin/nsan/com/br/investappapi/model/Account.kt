package nsan.com.br.investappapi.model

import org.springframework.data.relational.core.mapping.Table
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.ManyToOne

@Table
data class Account(
    val code: String,
    val agent_id: Agent) {
}