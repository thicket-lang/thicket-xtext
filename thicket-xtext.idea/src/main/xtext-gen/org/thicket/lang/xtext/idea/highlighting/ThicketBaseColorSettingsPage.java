/*
 * generated by Xtext 2.9.0.beta5
 */
package org.thicket.lang.xtext.idea.highlighting;

import org.eclipse.xtext.idea.highlighting.AbstractColorSettingsPage;
import org.thicket.lang.xtext.idea.lang.ThicketLanguage;

public class ThicketBaseColorSettingsPage extends AbstractColorSettingsPage {
	
	public ThicketBaseColorSettingsPage() {
		ThicketLanguage.INSTANCE.injectMembers(this);
	}

	@Override
	public String getDisplayName() {
		return ThicketLanguage.INSTANCE.getDisplayName();
	}
}