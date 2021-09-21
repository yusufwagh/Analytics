package com.architecture.analytics.analytics.core.tracker

import com.architecture.analytics.analytics.core.events.Event

interface AnalyticsService {
    fun track(event: Event)
}