package nsan.com.br.investappapi.controller

import nsan.com.br.investappapi.model.Asset
import nsan.com.br.investappapi.service.AssetService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class AssetController(val service: AssetService) {
    @GetMapping("/asset")
    fun assets(): List<Asset> = service.getAssets()
}