package nsan.com.br.investappapi.service

import nsan.com.br.investappapi.model.Asset
import nsan.com.br.investappapi.repository.AssetRepository
import org.springframework.stereotype.Service

@Service
class AssetService(val db: AssetRepository) {
    fun getAssets(): List<Asset> = db.getAssets()
}
