package com.architecture.analytics.analytics.core

fun <T> create(list : ArrayList<T>.() -> Unit) : ArrayList<T> {
    val list1 = ArrayList<T>()
    list1.apply { list.invoke(list1) }
    return list1
}