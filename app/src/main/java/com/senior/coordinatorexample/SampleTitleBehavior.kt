package com.senior.coordinatorexample

import android.content.Context
import android.util.AttributeSet
import android.view.View
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.recyclerview.widget.RecyclerView

class SampleTitleBehavior(context: Context, attrs: AttributeSet) : CoordinatorLayout.Behavior<View>(context,attrs){
    private var deltaY: Float = 0f

    // 使用该Behavior的View要监听哪个View的状态变化
    override fun layoutDependsOn(
        parent: CoordinatorLayout,
        child: View,
        dependency: View
    ): Boolean {
        return dependency is RecyclerView
    }

    // 被监听的View状态变化时回调
    override fun onDependentViewChanged(
        parent: CoordinatorLayout,
        child: View,
        dependency: View
    ): Boolean {
        if (deltaY == 0f) {
            deltaY = dependency.y - child.height
        }

        var dy = dependency.y - child.height
        dy = if (dy < 0) 0f else dy
        val y = -(dy / deltaY) * child.height
        child.translationY = y
        val alpha = 1 - dy / deltaY
        child.alpha = alpha
        return true
    }
}