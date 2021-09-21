package com.architecture.analytics.analytics.core.params

sealed class NavClickParams(val key: String, open val value : Any) : Param {
    class Type(override val value: String) : NavClickParams(EVENT, value)
    class ID(override val value: Int) : NavClickParams(ID, value)
    companion object {
        private val EVENT = "Click"
        private val ID = "Item ID"
    }

}
