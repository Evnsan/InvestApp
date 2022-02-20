package nsan.com.br.investappapi.service

import nsan.com.br.investappapi.model.Account
import nsan.com.br.investappapi.repository.AccountRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class AccountService(val db: AccountRepository) {
    fun getAccounts(): List<Account> = db.getAccounts()
    fun findAccountsByAgentId(agent_id: UUID): List<Account> = db.findAccountsByAgentId(agent_id)
}
