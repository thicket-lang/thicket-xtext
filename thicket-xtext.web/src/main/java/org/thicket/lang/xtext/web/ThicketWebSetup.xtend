/*
 * generated by Xtext 2.9.0.beta5
 */
package org.thicket.lang.xtext.web

import com.google.inject.Guice
import com.google.inject.Injector
import com.google.inject.Provider
import com.google.inject.util.Modules
import java.util.concurrent.ExecutorService
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor
import org.thicket.lang.xtext.ThicketRuntimeModule
import org.thicket.lang.xtext.ThicketStandaloneSetup

/**
 * Initialization support for running Xtext languages in web applications.
 */
@FinalFieldsConstructor class ThicketWebSetup extends ThicketStandaloneSetup {
	
	val Provider<ExecutorService> executorServiceProvider;
	
	override Injector createInjector() {
		val runtimeModule = new ThicketRuntimeModule()
		val webModule = new ThicketWebModule(executorServiceProvider)
		return Guice.createInjector(Modules.override(runtimeModule).with(webModule))
	}
	
}
