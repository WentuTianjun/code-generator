package org.liuchen.code.frame;

import javax.swing.*;

public class MainFrame extends JFrame {
    private JTextField basePath;
    private JTextField packageName;
    private JButton jButton1;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JPasswordField jdbc_password;
    private JTextField jdbc_url;
    private JTextField jdbc_username;
    private JTextField version;
    private JTextField moduleName;
    private ButtonGroup buttonGroup;
    private JRadioButton isTranslate;
    private JRadioButton isCamel;
    private JTextField tablePrefix;
    private JLabel jLabel8;
    private JTextField author;

    public MainFrame(){
        initComponents();
//        if(ObjectHelper.isNullOrEmptyString(SqliteUtil.getProperty("version"))){}

//        Toolkit tk = Toolkit.getDefaultToolkit();
    }

    private void initComponents() {
        jLabel1 = new JLabel();
        jdbc_url = new JTextField();
        jLabel2 = new JLabel();
        jdbc_username = new JTextField();
        jLabel3 = new JLabel();
        jdbc_password = new JPasswordField();
        jLabel4 = new JLabel();
        basePath = new JTextField();
        jLabel5 = new JLabel();
        packageName = new JTextField();
        jButton1 = new JButton();
        jLabel6 = new JLabel();
        version = new JTextField();
        jLabel7 = new JLabel();
        moduleName = new JTextField();

        buttonGroup = new ButtonGroup();
        isTranslate = new JRadioButton();
        isCamel = new JRadioButton();
        buttonGroup.add(isTranslate);
        buttonGroup.add(isCamel);
        tablePrefix = new JTextField();
        jLabel8 = new JLabel();
        author = new JTextField();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("数据库路径：");
        jLabel2.setText("用户名：");
        jLabel3.setText("密码：");
        jLabel4.setText("工程路径：");
        jLabel5.setText("工程包名：");
        jLabel6.setText("工程版本:");
        isTranslate.setText("通过翻译注释");
        isCamel.setText("数据库原始字段");
        jLabel7.setText("模块名:");
        jLabel8.setText("作者:");
        jButton1.setText("下一步");


        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        // 创建GroupLayout的水平连续组，，越先加入的ParallelGroup，优先级级别越高。
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup (layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel4)
                                                        .addComponent(jLabel6))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jdbc_username, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(basePath, GroupLayout.PREFERRED_SIZE, 281, GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(packageName, GroupLayout.PREFERRED_SIZE, 281, GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(version, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                .addComponent(jLabel7)
                                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                .addComponent(moduleName)
                                                                        ))
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)))
                                                .addContainerGap(23, Short.MAX_VALUE))

                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel1)
                                                                        .addComponent(jLabel2))
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(jLabel3)
                                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(jdbc_password, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE))
                                                                        .addComponent(jdbc_url, GroupLayout.PREFERRED_SIZE, 281, GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(310, 310, 310)
                                                                .addComponent(jButton1))
                                                        .addComponent(jLabel5))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addComponent(isCamel))
                                                                .addComponent(tablePrefix, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addComponent(isTranslate)
                                                                )
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel8))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                        .addComponent(author, GroupLayout.PREFERRED_SIZE, 281, GroupLayout.PREFERRED_SIZE)))
                                )
                        )
        );

        // 创建GroupLayout的垂直连续组，，越先加入的ParallelGroup，优先级级别越高。
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(jdbc_url, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(jdbc_username, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3)
                                        .addComponent(jdbc_password, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(basePath, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(packageName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6)
                                        .addComponent(version, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7)
                                        .addComponent(moduleName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(isCamel)
                                        .addComponent(tablePrefix, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                )
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(isTranslate))
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel8)
                                        .addComponent(author))
                                .addGap(18, 18, 18)
                                .addComponent(jButton1)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }
}
