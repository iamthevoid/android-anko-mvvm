@file:Suppress(
	"unused", 
	"UsePropertyAccessSyntax", 
	"RemoveRedundantQualifierName", 
	"UnusedImport",
	"DeprecatedCallableAddReplaceWith",
    "DEPRECATION"
)

package iam.thevoid.noxml.rx2.extensions.actionbarcontainer

import androidx.appcompat.widget.ActionBarContainer

import io.reactivex.Flowable
import iam.thevoid.noxml.rx2.extensions.view.addSetter
import androidx.annotation.RequiresApi


fun ActionBarContainer.setVisibility(visibility: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(visibility) { this.setVisibility(it) }

fun ActionBarContainer.setPrimaryBackground(primaryBackground: io.reactivex.Flowable<out android.graphics.drawable.Drawable>) = 
	addSetter(primaryBackground) { this.setPrimaryBackground(it) }

fun ActionBarContainer.setStackedBackground(stackedBackground: io.reactivex.Flowable<out android.graphics.drawable.Drawable>) = 
	addSetter(stackedBackground) { this.setStackedBackground(it) }

fun ActionBarContainer.setSplitBackground(splitBackground: io.reactivex.Flowable<out android.graphics.drawable.Drawable>) = 
	addSetter(splitBackground) { this.setSplitBackground(it) }

fun ActionBarContainer.setTransitioning(transitioning: io.reactivex.Flowable<out kotlin.Boolean>) = 
	addSetter(transitioning) { this.setTransitioning(it) }

fun ActionBarContainer.setTabContainer(tabContainer: io.reactivex.Flowable<out androidx.appcompat.widget.ScrollingTabContainerView>) = 
	addSetter(tabContainer) { this.setTabContainer(it) }