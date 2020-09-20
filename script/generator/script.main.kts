#!/usr/bin/env kscript

@file:Repository("https://dl.bintray.com/holgerbrandl/github/")

@file:DependsOn("com.github.holgerbrandl:kscript-annotations:1.4")

@file:MavenRepository("google", "https://dl.google.com/dl/android/maven2/")

@file:DependsOnMaven("androidx.appcompat:appcompat:1.2.0")

import androidx.appcompat.app.AppCompatActivity

val t = AppCompatActivity()

println(t)
