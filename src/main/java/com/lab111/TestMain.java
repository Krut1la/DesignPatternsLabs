package com.lab111;


import com.lab2.Cl1;
import com.lab2.Cl2;
import com.lab2.Cl3;
import com.lab3.FullAccessImage;
import com.lab3.LimitedAccessImageProxy;
import com.lab4.DirectoryBase;
import com.lab4.FileBase;
import com.lab4.FileSystemBase;
import com.lab4.FileSystemEntryDirectory;
import com.lab4.FileSystemEntryFile;
import com.lab5.ButtonBase;
import com.lab5.TextAreaBase;
import com.lab5.WindowBase;
import com.lab6.AddStrategy;
import com.lab6.GameField;
import com.lab6.SimpleGameField;
import com.lab6.SortStrategy;
import com.lab6.Strategy;
import com.lab7.DrawBrushCommand;
import com.lab7.DrawPencilCommand;
import com.lab7.Ivoker;
import com.lab7.Painter;
import com.lab7.Paper;
import com.lab7.ThickPaper;
import com.lab8.Aggregator;
import com.lab8.SuperAggregator;
import com.lab9.CoolDatabaseFactory;
import com.lab9.DataBaseFactory;
import com.lab9.Loader;
import com.lab9.NiceDatabaseFactory;
import com.lab9.Schema;
import com.lab9.Table;


/**
 * Template first class.
 * @author Alex
 *
 */
public final class TestMain {

  /**
   * Constructor.
   *
   */
  private TestMain() {
    super();
  }
  
  private static void runLab2() {
	    Cl1 class1 = new Cl1();
	    Cl2 class2 = new Cl2();
	    Cl3 class3 = new Cl3();
	    
	    class1.meth1();
	    class1.meth3();
	    
	    class2.meth1();
	    class2.meth2();
	    class2.meth3();

	    class3.meth3();  
  }
  
  private static void runLab3() {
	  FullAccessImage faImage = new FullAccessImage();
	  
	  LimitedAccessImageProxy laImage = new LimitedAccessImageProxy(faImage, 10, 50, 200, 300);
	  
	  faImage.getColorAt(1, 1);
	  faImage.getColorAt(12, 51);
	  
	  try {
		  laImage.getColorAt(1, 1);
	  }
	  catch (IllegalArgumentException ex)
	  {
		  System.out.println(ex.getMessage());
	  }
	  
	  try {
		  laImage.getColorAt(11, 51);
	  }
	  catch (IllegalArgumentException ex)
	  {
		  System.out.println(ex.getMessage());
	  }
  }
  
  private static void runLab4() {
	  FileSystemBase fileSystem = new FileSystemBase();
	  
	  fileSystem.getFileSystemEntries().add(new FileSystemEntryFile(new FileBase(), "file1.txt"));
	  fileSystem.getFileSystemEntries().add(new FileSystemEntryFile(new FileBase(), "file2.txt"));
	  fileSystem.getFileSystemEntries().add(new FileSystemEntryFile(new FileBase(), "file3.txt"));
	  
	  fileSystem.getFileSystemEntries().add(new FileSystemEntryDirectory(new DirectoryBase(), "Directory1"));
	  fileSystem.getFileSystemEntries().add(new FileSystemEntryDirectory(new DirectoryBase(), "Directory2"));
	  
	  fileSystem.create();
	  
	  System.out.println();
	  
	  fileSystem.destroy();
  }
  
  private static void runLab5() {
	  WindowBase winBase = new WindowBase();
	  
	  winBase.addControl(new ButtonBase());
	  winBase.addControl(new TextAreaBase());
	  winBase.addControl(new ButtonBase());
	  winBase.addControl(new WindowBase());
	  
	  
	  winBase.setSize(1000, 1000);
  }
  
  private static void runLab6() {
	  GameField testGameField = new SimpleGameField();
	  
	  Strategy strategy1 = new SortStrategy();
	  Strategy strategy2 = new AddStrategy();
	  
	  System.out.println(testGameField);
	  
	  strategy1.Apply(testGameField);
	  
	  System.out.println(testGameField);
	  
	  strategy2.Apply(testGameField);
	  
	  System.out.println(testGameField);
  }
  
  private static void runLab7() {
	  Paper paper = new ThickPaper();
	  
	  Ivoker invoker = new Painter();
	  
	  invoker.registerCommand("Paint brush", new DrawBrushCommand(paper));
	  invoker.registerCommand("Paint pencil", new DrawPencilCommand(paper));
	  
	  invoker.execute("Paint brush");
	  invoker.execute("Paint pencil");
	  invoker.execute("Paint brush");
	  invoker.execute("Paint pencil");	  
  }
  
  private static void runLab8() {
	  
	  Aggregator agregator = new SuperAggregator();
	  
	  agregator.iterate();
	  
  }
  
  private static void runLab9() {
	  DataBaseFactory factory1 = new CoolDatabaseFactory();
	  DataBaseFactory factory2 = new NiceDatabaseFactory();
	  
	  Loader loader = factory1.CreateLoader();
	  Table table = factory1.CreateTable();
	  Schema schema = factory1.CreateSchema();
	  
	  loader.load();
	  table.showData();
	  schema.showSchema();
	  
	  loader = factory2.CreateLoader();
	  table = factory2.CreateTable();
	  schema = factory2.CreateSchema();
	  
	  loader.load();
	  table.showData();
	  schema.showSchema();  
	  
  }
  
  /**
   * Invokes at application startup.
   * @param args Parameters from command line
   */
  public static void main(final String[] args) {
    System.out.println("Lab work results:");
    
    //runLab2();
    //runLab3();
    //runLab4();
    //runLab5();
    //runLab6();
    //runLab7();
    runLab8();
    //runLab9();
  }
}
