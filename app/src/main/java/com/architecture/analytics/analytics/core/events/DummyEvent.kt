package com.architecture.analytics.analytics.core.events

import com.architecture.analytics.analytics.core.tracker.DummyParam


interface DummyEvent {
    fun toDummyParam() : DummyParam
}

