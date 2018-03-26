package org.liuchen.code.main;

import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;
import org.liuchen.code.frame.MainFrame;

import javax.swing.*;
import java.awt.*;

public class GeneratorMain {

    /**
     * UIManager中UI字体相关的key
     */
    public static String[] DEFAULT_FONT = new String[]{"Table.font", "TableHeader.font", "CheckBox.font",
            "Tree.font", "Viewport.font", "ProgressBar.font", "RadioButtonMenuItem.font", "ToolBar.font",
            "ColorChooser.font", "ToggleButton.font", "Panel.font", "TextArea.font", "Menu.font", "TableHeader.font",
            "TextField.font", "OptionPane.font", "MenuBar.font", "Button.font", "Label.font", "PasswordField.font",
            "ScrollPane.font", "MenuItem.font", "ToolTip.font", "List.font", "EditorPane.font", "Table.font",
            "TabbedPane.font", "RadioButton.font", "CheckBoxMenuItem.font", "TextPane.font", "PopupMenu.font",
            "TitledBorder.font", "ComboBox.font"};

    public static void main(String[] args) {
        EventQueue.invokeLater(
            () -> {
                try {
                    BeautyEyeLNFHelper.launchBeautyEyeLNF();
                    //设置本属性将改变窗口边框样式定义
                    BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.FrameBorderStyle.osLookAndFeelDecorated;
                    BeautyEyeLNFHelper.launchBeautyEyeLNF();

                    for (int i = 0; i < DEFAULT_FONT.length; i++) {
                        UIManager.put(DEFAULT_FONT[i], new Font("微软雅黑", Font.PLAIN, 13));
                    }
                    //设置主操作框可见
                    MainFrame codeMainFrame = new MainFrame();
                    codeMainFrame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        );
    }
}
