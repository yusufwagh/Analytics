package com.architecture.analytics.analytics.core.events

import com.architecture.analytics.analytics.core.params.Param

abstract class Event(open val params: List<Param>, open val trackers: List<Trackers>)

sealed class Trackers {
    object Firebase: Trackers()
    object Dummy: Trackers()
}
