package nsan.com.br.investappapi.model

import org.springframework.data.jdbc.core.mapping.AggregateReference
import org.springframework.data.relational.core.mapping.Table
import java.sql.Timestamp
import java.util.*

@Table
data class Dealing(
    val id: UUID,
    val timestamp: Timestamp,
    val value: Double,
    // I couldn't find a way to turn those values in a composite key to account aggregate
    val account_code: String,
    val account_agent_id: UUID,
    val asset_id: AggregateReference<Asset, UUID>
) {
}