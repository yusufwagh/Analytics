package com.architecture.analytics.analytics.core.events

import com.architecture.analytics.analytics.core.tracker.FirebaseParam


interface FirebaseEvent {
    fun toFirebaseParam() : FirebaseParam
}
