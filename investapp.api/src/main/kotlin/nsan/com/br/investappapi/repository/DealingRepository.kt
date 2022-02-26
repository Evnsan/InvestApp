package nsan.com.br.investappapi.repository

import nsan.com.br.investappapi.model.Asset
import nsan.com.br.investappapi.model.Dealing
import org.springframework.data.jdbc.repository.query.Query
import org.springframework.data.repository.CrudRepository

interface DealingRepository: CrudRepository<Dealing, String> {
    @Query("Select * from dealings")
    fun getDealings(): List<Dealing>
}