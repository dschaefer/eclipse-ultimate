package doug.eclipse.ultimate.application;

import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Display;

public class InstallerApplication implements IApplication {

	@Override
	public Object start(IApplicationContext context) throws Exception {
		Display display = Display.getDefault();
		display.syncExec(() -> {
			WizardDialog dialog = new WizardDialog(null, new InstallWizard());
			dialog.setBlockOnOpen(true);
			dialog.open();
		});
		return 0;
	}

	@Override
	public void stop() {
	}

}
