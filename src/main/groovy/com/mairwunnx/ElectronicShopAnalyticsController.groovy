package com.mairwunnx

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/electronicShopAnalytics")
class ElectronicShopAnalyticsController {

    @Get(uri = "/", produces = "text/plain")
    String index() {
        "Example Response"
    }
}