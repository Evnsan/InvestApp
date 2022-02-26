package nsan.com.br.investappapi.service

import nsan.com.br.investappapi.model.Asset
import nsan.com.br.investappapi.model.Dealing
import nsan.com.br.investappapi.repository.AssetRepository
import nsan.com.br.investappapi.repository.DealingRepository
import org.springframework.stereotype.Service

@Service
class DealingService(val db: DealingRepository) {
    fun getDealings(): List<Dealing> = db.getDealings()
}
