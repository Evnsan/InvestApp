package nsan.com.br.investappapi.controller

import nsan.com.br.investappapi.model.Asset
import nsan.com.br.investappapi.model.Dealing
import nsan.com.br.investappapi.service.AssetService
import nsan.com.br.investappapi.service.DealingService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class DealingController(val service: DealingService) {
    @GetMapping("/dealing")
    fun dealings(): List<Dealing> = service.getDealings()
}