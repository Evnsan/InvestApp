package nsan.com.br.investappapi.controller

import nsan.com.br.investappapi.model.Account
import nsan.com.br.investappapi.service.AccountService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class AccountController(val service: AccountService) {
    @GetMapping("/account")
    fun accounts(): List<Account> = service.getAccounts()
}