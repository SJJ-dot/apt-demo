package com.apt.sjj.api

import java.lang.annotation.ElementType
import java.lang.annotation.RetentionPolicy

@Retention(AnnotationRetention.BINARY)
@Target(AnnotationTarget.FIELD,AnnotationTarget.TYPE)
annotation class TestAnn