package iam.thevoid.noxml.change.scroll

import android.view.MotionEvent

data class OnScroll(val e1: MotionEvent?, val e2: MotionEvent?, val distanceX: Float, val distanceY: Float)