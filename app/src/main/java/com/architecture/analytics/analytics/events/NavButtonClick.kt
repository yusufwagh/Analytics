package com.architecture.analytics.analytics.events

import android.os.Bundle
import com.architecture.analytics.analytics.core.events.*
import com.architecture.analytics.analytics.core.params.NavClickParams
import com.architecture.analytics.analytics.core.tracker.DummyParam
import com.architecture.analytics.analytics.core.tracker.FirebaseParam
import org.json.JSONObject


class NavButtonClick(
    override val params: List<NavClickParams>,
    override val trackers: List<Trackers> = listOf(Trackers.Firebase, Trackers.Dummy)
) :
    Event(params = params, trackers = trackers), DummyEvent,
    FirebaseEvent {

    override fun toDummyParam(): DummyParam {
        val json = JSONObject().apply {
            params.forEach {
                when (it) {
                    is NavClickParams.ID -> {
                        this.put(it.key, it.value)
                    }
                    is NavClickParams.Type -> {
                        this.put(it.key, it.value)
                    }
                }
            }
            this.put("it.key", "it.value")
        }
        return DummyParam.Click(json)
    }

    override fun toFirebaseParam(): FirebaseParam {
        val bundle = Bundle()
        params.forEach {
            when (it) {
                is NavClickParams.ID -> {
                    bundle.putInt(it.key, it.value)
                }
                is NavClickParams.Type -> {
                    bundle.putString(it.key, it.value)
                }
            }
        }
        return FirebaseParam.Click(bundle)
    }

}