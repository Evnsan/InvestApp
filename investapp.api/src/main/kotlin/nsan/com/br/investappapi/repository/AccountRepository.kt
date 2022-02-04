package nsan.com.br.investappapi.repository

import nsan.com.br.investappapi.model.Account
import org.springframework.data.jdbc.repository.query.Query
import org.springframework.data.repository.CrudRepository

interface AccountRepository: CrudRepository<Account, String> {
    @Query("Select * from accounts")
    fun getAccounts(): List<Account>
}