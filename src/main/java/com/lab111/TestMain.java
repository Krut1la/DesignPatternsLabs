package com.lab111;

import com.lab2.Cl1;
import com.lab2.Cl2;
import com.lab2.Cl3;
import com.lab3.FullAccessImage;
import com.lab3.LimitedAccessImageProxy;
import com.lab4.DirectoryBase;
import com.lab4.FileBase;
import com.lab4.FileSystem;
import com.lab4.FileSystemBase;
import com.lab4.FileSystemEntryDirectory;
import com.lab4.FileSystemEntryFile;

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
  
  /**
   * Invokes at application startup.
   * @param args Parameters from command line
   */
  public static void main(final String[] args) {
    System.out.println("Lab work results:");
    
    //runLab2();
    //runLab3();
    runLab4();

  }

}
