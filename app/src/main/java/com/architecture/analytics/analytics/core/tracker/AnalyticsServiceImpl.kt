package com.architecture.analytics.analytics.core.tracker

import com.architecture.analytics.analytics.core.events.DummyEvent
import com.architecture.analytics.analytics.core.events.Event
import com.architecture.analytics.analytics.core.events.FirebaseEvent
import com.architecture.analytics.analytics.core.events.Trackers

class AnalyticsServiceImpl(
    private val firebaseTracker: FirebaseTracker,
    private val dummyTracker: DummyTracker
) : AnalyticsService {
    override fun track(event: Event) {
        if (event.trackers.contains(Trackers.Firebase) && event is FirebaseEvent) {
            firebaseTracker.track(event.toFirebaseParam())
        }
        if (event.trackers.contains(Trackers.Dummy) && event is DummyEvent) {
            dummyTracker.track(event.toDummyParam())
        }
    }
}