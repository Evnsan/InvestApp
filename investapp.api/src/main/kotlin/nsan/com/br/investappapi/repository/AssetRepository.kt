package nsan.com.br.investappapi.repository

import nsan.com.br.investappapi.model.Asset
import org.springframework.data.jdbc.repository.query.Query
import org.springframework.data.repository.CrudRepository

interface AssetRepository: CrudRepository<Asset, String> {
    @Query("Select * from assets")
    fun getAssets(): List<Asset>
}