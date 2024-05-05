package org.example;

import java.util.ArrayList;

public class CompositeExample
{
    public static void main(String[] args)
    {
        Component fileSystem = new Directory("Файловая система");
        // определяем новый диск
        Component diskC = new Directory("Диск С");
        // новые файлы
        Component pngFile = new File("12345.png");
        Component docxFile = new File("Document.docx");
        // добавляем файлы на диск С
        diskC.add(pngFile);
        diskC.add(docxFile);
        // добавляем диск С в файловую систему
        fileSystem.add(diskC);
        // выводим все данные
        fileSystem.print();
        System.out.println();
        // удаляем с диска С файл
        diskC.remove(pngFile);
        // создаем новую папку
        Component docsFolder = new Directory("Мои Документы");
        // добавляем в нее файлы
        Component txtFile = new File("readme.txt");
        Component csFile = new File("Program.cs");
        docsFolder.add(txtFile);
        docsFolder.add(csFile);
        diskC.add(docsFolder);

        fileSystem.print();

        System.out.println();
    }
}

abstract class Component
{
    protected String name;

    public Component(String name)
    {
        this.name = name;
    }


    public abstract void add(Component component);

    public abstract void remove(Component component);

    public void print()
{
    System.out.println(name);
}
}
class Directory extends Component
{
    private ArrayList<Component> components = new ArrayList<Component>();
 
    public Directory(String name)
    {
        super(name);
    }

    @Override
    public void add(Component component)
    {
        components.add(component);
    }

    @Override
    public void remove(Component component)
    {
        components.remove(component);
    }

    @Override
    public void print()
    {
        System.out.println("Узел " + name);
        System.out.println("Подузлы:");
        for(int i=0; i<components.size();i++)
        {
            components.get(i).print();
        }
    }
}

class File extends Component
{
    public File(String name)
    {
        super(name);
    }

    @Override
    public void add(Component component) {

    }

    @Override
    public void remove(Component component) {

    }
}
