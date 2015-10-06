/*
 * generated by Xtext 2.9.0.beta5
 */
package org.thicket.lang.xtext.idea.lang.psi.impl;

import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.eclipse.xtext.psi.impl.BaseXtextFile;
import org.thicket.lang.xtext.idea.lang.ThicketFileType;
import org.thicket.lang.xtext.idea.lang.ThicketLanguage;

public final class ThicketFileImpl extends BaseXtextFile {

	public ThicketFileImpl(FileViewProvider viewProvider) {
		super(viewProvider, ThicketLanguage.INSTANCE);
	}

	@Override
	public FileType getFileType() {
		return ThicketFileType.INSTANCE;
	}
}
