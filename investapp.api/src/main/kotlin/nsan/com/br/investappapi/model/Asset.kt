package nsan.com.br.investappapi.model

import org.springframework.data.relational.core.mapping.Table
import java.util.UUID

@Table
data class Asset(val id: UUID, val title: String?, val description: String?) {
}