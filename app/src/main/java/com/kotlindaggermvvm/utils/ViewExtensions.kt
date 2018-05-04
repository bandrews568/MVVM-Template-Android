package com.kotlindaggermvvm.utils

import android.support.v4.widget.SwipeRefreshLayout
import android.view.View
import android.view.ViewGroup

// Return all children in a list
val ViewGroup.children
    get() = (0 until childCount).map { getChildAt(it) }

fun View.gone() {
    this.visibility = View.GONE
}

fun View.invisible() {
    this.visibility = View.INVISIBLE
}

fun View.visible() {
    this.visibility = View.VISIBLE
}

fun View.enabled() {
    this.isEnabled = true
}

fun View.disabled() {
    this.isEnabled = false
}

fun SwipeRefreshLayout.startRefreshing() {
    this.isRefreshing = true
}

fun SwipeRefreshLayout.stopRefreshing() {
    this.isRefreshing = false
}