@file:Suppress(
	"unused", 
	"UsePropertyAccessSyntax", 
	"RemoveRedundantQualifierName", 
	"UnusedImport",
	"DeprecatedCallableAddReplaceWith",
    "DEPRECATION"
)

package iam.thevoid.noxml.rx2.extensions.absspinner

import android.widget.AbsSpinner

import io.reactivex.Flowable
import iam.thevoid.noxml.rx2.extensions.view.addSetter
import androidx.annotation.RequiresApi


fun AbsSpinner.setSelection(selection: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(selection) { this.setSelection(it) }

fun AbsSpinner.setAdapter(adapter: io.reactivex.Flowable<out android.widget.SpinnerAdapter>) = 
	addSetter(adapter) { this.setAdapter(it) }