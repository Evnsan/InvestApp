package nsan.com.br.investappapi.model

import org.springframework.data.relational.core.mapping.Table
import java.util.UUID

@Table
data class Agent(val id: UUID, val name: String?)
