package com.architecture.analytics.analytics.core.tracker

import android.util.Log
import org.json.JSONObject

class DummyTracker {
    fun track(param: DummyParam) {
        Log.d("DummyTracker", param.toString())
    }
}


sealed class DummyParam(open val event: String, open val json: JSONObject) {
    data class Click(override val json: JSONObject) : DummyParam("Click", json)
    data class Custom(override val event: String, override val json: JSONObject) :
        DummyParam("Custom", json)
}
