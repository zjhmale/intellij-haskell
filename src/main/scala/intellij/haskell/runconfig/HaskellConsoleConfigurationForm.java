package intellij.haskell.runconfig;

import com.intellij.openapi.module.Module;
import com.intellij.openapi.module.ModuleType;
import com.intellij.openapi.options.ConfigurationException;
import com.intellij.openapi.options.SettingsEditor;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.TextFieldWithBrowseButton;
import com.intellij.ui.ListCellRendererWrapper;
import intellij.haskell.module.HaskellModuleType;
import intellij.haskell.util.HaskellUIUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class HaskellConsoleConfigurationForm extends SettingsEditor<HaskellConsoleConfiguration> {
    private JPanel myPanel;
    private TextFieldWithBrowseButton myWorkingDirPathField;
    private JComboBox myModuleComboBox;

    @Nullable
    private final Module myInitialModule;

    public HaskellConsoleConfigurationForm(@NotNull Project project, @Nullable Module module) {
        myInitialModule = module;
        myModuleComboBox.setEnabled(true);
        HaskellUIUtil.installWorkingDirectoryChooser(myWorkingDirPathField, project);
        myWorkingDirPathField.setText(project.getBasePath());
    }

    @Override
    protected void resetEditorFrom(@NotNull HaskellConsoleConfiguration config) {
        myModuleComboBox.removeAllItems();
        for (Module module : config.getValidModules()) {
            if (ModuleType.get(module) == HaskellModuleType.getInstance()) {
                //noinspection unchecked
                myModuleComboBox.addItem(module);
            }
        }
        myModuleComboBox.setSelectedItem(myInitialModule);
        //noinspection unchecked
        myModuleComboBox.setRenderer(getListCellRendererWrapper());

        myWorkingDirPathField.setText(config.getWorkingDirPath());
        myModuleComboBox.setSelectedItem(config.getConfigurationModule().getModule());
    }

    @Override
    protected void applyEditorTo(@NotNull HaskellConsoleConfiguration config) throws ConfigurationException {
        config.setModule((Module) myModuleComboBox.getSelectedItem());
        config.setWorkingDirPath(myWorkingDirPathField.getText());
    }

    @NotNull
    @Override
    protected JComponent createEditor() {
        return myPanel;
    }

    @Override
    protected void disposeEditor() {
        myPanel.setVisible(false);
    }

    @NotNull
    private static ListCellRendererWrapper<Module> getListCellRendererWrapper() {
        return new ListCellRendererWrapper<Module>() {
            @Override
            public void customize(JList list, @Nullable Module module, int index, boolean selected, boolean hasFocus) {
                if (module != null) {
                    setText(module.getName());
                }
            }
        };
    }
}
