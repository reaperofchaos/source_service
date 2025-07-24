package com.jomondb.source.config

import org.springframework.boot.actuate.health.Health
import org.springframework.boot.actuate.health.HealthIndicator
import org.springframework.stereotype.Component

@Component
class CustomHealthIndicator : HealthIndicator {
    override fun health(): Health {
        return Health.up().withDetail("status", "UP").build()
    }
}