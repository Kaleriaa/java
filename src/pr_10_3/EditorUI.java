package pr_10_3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class EditorUI extends JFrame {
    private final ICreateDocument factory = new TextFactory();
    private IDocument idocument;
    private  JFileChooser fileChooser = null;

    JMenuBar menuBar = new JMenuBar();
    public EditorUI(){
        super("Системное меню");
        setDefaultCloseOperation( EXIT_ON_CLOSE );

        menuBar.add(createFileMenu());
        setJMenuBar(menuBar);
        setSize(500, 500);
        setVisible(true);
    }
    private JMenu createFileMenu(){
        fileChooser = new JFileChooser();
        JMenu file = new JMenu("File");
        JMenuItem create = new JMenuItem("New",
                new ImageIcon("save.jpg"));
        JMenuItem open = new JMenuItem("Open",
                new ImageIcon("images/open.png"));
        JMenuItem save = new JMenuItem("Save",
                new ImageIcon("src/save.jpg"));
        JMenuItem exit = new JMenuItem(new ExitAction());
        file.add(create);
        file.addSeparator();
        file.add(open);
        file.addSeparator();
        file.add(save);
        file.addSeparator();
        file.add(exit);
        create.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                idocument = factory.createNew();
                JOptionPane.showMessageDialog(EditorUI.this, idocument.print());
                JTextArea textArea = new JTextArea(2, 10);
                EditorUI.this.add(textArea);
            }
        });
        open.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                idocument = factory.createOpen();
                fileChooser.setDialogTitle("Выбор директории");
                fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
                int result = fileChooser.showOpenDialog(EditorUI.this);
                if (result == JFileChooser.APPROVE_OPTION ) {
                    JOptionPane.showMessageDialog(EditorUI.this,
                            fileChooser.getSelectedFile());
                    File f = fileChooser.getSelectedFile();
                        try {
                            Desktop.getDesktop().open(f);
                        } catch (IOException ex) {
                            ex.printStackTrace();
                        }
                    //JOptionPane.showMessageDialog(EditorUI.this, idocument.print());
                }
            }
        });

        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fileChooser.setDialogTitle("Сохранение файла");
                fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
                int result = fileChooser.showSaveDialog(EditorUI.this);
                if (result == JFileChooser.APPROVE_OPTION )
                    JOptionPane.showMessageDialog(EditorUI.this,
                            "Файл " + fileChooser.getSelectedFile() + " сохранен");
            }
        });

        return file;
    }
    class ExitAction extends AbstractAction
    {
        private static final long serialVersionUID = 1L;
        ExitAction() {
            putValue(NAME, "Exit");
        }
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        UIManager.put(
                "FileChooser.saveButtonText", "Сохранить");
        UIManager.put(
                "FileChooser.cancelButtonText", "Отмена");
        UIManager.put(
                "FileChooser.fileNameLabelText", "Наименование файла");
        UIManager.put(
                "FileChooser.filesOfTypeLabelText", "Типы файлов");
        UIManager.put(
                "FileChooser.lookInLabelText", "Директория");
        UIManager.put(
                "FileChooser.saveInLabelText", "Сохранить в директории");
        UIManager.put(
                "FileChooser.folderNameLabelText", "Путь директории");
        JFrame.setDefaultLookAndFeelDecorated(true);
        new EditorUI();
    }
}
