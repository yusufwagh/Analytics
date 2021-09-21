package com.architecture.analytics.analytics.core.tracker

import android.os.Bundle
import android.util.Log

class FirebaseTracker  {
    fun track(param: FirebaseParam) {
        Log.d("FirebaseTracker" , param.toString())
    }
}

sealed class FirebaseParam(open val event: String, open val bundle: Bundle) {
    data class Click(override val bundle: Bundle) : FirebaseParam("Click", bundle)
    data class Custom(override val event: String, override val bundle: Bundle) : FirebaseParam("Custom", bundle)
}
