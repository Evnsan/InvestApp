package nsan.com.br.investappapi.service

import nsan.com.br.investappapi.model.Account
import nsan.com.br.investappapi.repository.AccountRepository
import org.springframework.stereotype.Service

@Service
class AccountService(val db: AccountRepository) {
    fun getAccounts(): List<Account> = db.getAccounts()
}
