package nsan.com.br.investappapi.controller

import nsan.com.br.investappapi.model.Account
import nsan.com.br.investappapi.service.AccountService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
class AccountController(val service: AccountService) {
    @GetMapping("/account")
    fun accounts(): List<Account> = service.getAccounts()

    @GetMapping("/account/{agent_id}")
    fun findAccountsByAgentId(@PathVariable("agent_id") agent_id: UUID): List<Account> = service.findAccountsByAgentId(agent_id)
}