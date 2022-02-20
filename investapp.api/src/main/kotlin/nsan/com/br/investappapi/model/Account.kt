package nsan.com.br.investappapi.model

import org.springframework.data.jdbc.core.mapping.AggregateReference
import org.springframework.data.relational.core.conversion.AggregateChange
import org.springframework.data.relational.core.mapping.Table
import java.util.UUID

@Table
data class Account(
    val code: String,
    val agent_id: AggregateReference<Agent, UUID>
) {
}