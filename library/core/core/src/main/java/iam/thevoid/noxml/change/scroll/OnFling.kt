package iam.thevoid.noxml.change.scroll

import android.view.MotionEvent

data class OnFling(val e1: MotionEvent?, val e2: MotionEvent?, val velocityX: Float, val velocityY: Float)