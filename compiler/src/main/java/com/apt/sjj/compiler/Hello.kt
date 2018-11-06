package com.apt.sjj.compiler

import javax.annotation.processing.ProcessingEnvironment
import javax.annotation.processing.RoundEnvironment
import javax.lang.model.element.TypeElement
import javax.tools.Diagnostic

class Hello {
    companion object {
        @JvmStatic
        fun s(roundEnv : ProcessingEnvironment) {
            roundEnv.getMessager().printMessage(
                Diagnostic.Kind.WARNING,
                "Hello===============================Hello"
            )

        }
    }
}