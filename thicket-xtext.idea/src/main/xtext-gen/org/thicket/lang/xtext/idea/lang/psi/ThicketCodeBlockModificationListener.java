/*
 * generated by Xtext 2.9.0.beta5
 */
package org.thicket.lang.xtext.idea.lang.psi;

import com.intellij.psi.util.PsiModificationTracker;
import org.eclipse.xtext.psi.BaseXtextCodeBlockModificationListener;
import org.thicket.lang.xtext.idea.lang.ThicketLanguage;

public class ThicketCodeBlockModificationListener extends BaseXtextCodeBlockModificationListener {

	public ThicketCodeBlockModificationListener(PsiModificationTracker psiModificationTracker) {
		super(ThicketLanguage.INSTANCE, psiModificationTracker);
	}

}
