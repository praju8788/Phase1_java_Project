package FirstProject;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class LockUp_Project {
	//create File
	public static void genaretFile(String fileName) throws IOException 
	{
	    String filePath="C:\\Users\\Praju\\eclipse-workspace\\jsfsd\\src\\com\\mphasis\\basics\\";
	    ArrayList<String> aList=new ArrayList<String>();
	     System.out.println("enter file name to create");
	      String finalname=filePath+fileName;
	       File f=new File(finalname);
	       boolean b=f.createNewFile();

				if(b!=true) 
	             {
	        System.out.println("file is not created");
	             }
	            else 
	             {
	            aList.add(fileName);
	            System.out.println("file is created");
	             }
				System.out.println("Your list is .... "+aList);
	             }
	//Delete Function

	public static void deleteFile(String fileName) {

		String path="C:\\Users\\Praju\\eclipse-workspace\\jsfsd\\src\\com\\mphasis\\basics\\";
	    String finalfile=path+fileName;
	    File file=new File(finalfile);
	    file.delete();
	    System.out.println("file is deleted");
	    }

	//Searching Function

	public static void searchFile(String searchingFileName) {
	      String path="C:\\Users\\Praju\\eclipse-workspace\\jsfsd\\src\\com\\mphasis\\basics\\";
	      File f=new File(path);
	      File filename[]=f.listFiles();
	      int count=0;
	      for(File ff:filename) {
	      if(ff.getName().equals(searchingFileName))
	      {
	      count++;
	      break;
	      }else {
	      count=0;
	      }
	      }
	      if (count!=0) {
	      System.out.println("You have "+searchingFileName+" File :)");
	      }else {
	      System.out.println("File not found");
	       }
	       }
	//Display File...

	public  static void displayFile() {
	         String path="C:\\Users\\Praju\\eclipse-workspace\\jsfsd\\src\\com\\mphasis\\basics\\";
	         File f=new File(path);
	         File filename[]=f.listFiles();
	         System.out.println("Your File List.......");
	         for(File ff:filename) {
	         System.out.println(ff.getName());
	         }
	         }

	//Main Method Start....

	public static void main(String[] args) throws IOException {
	         try (Scanner scanner = new Scanner(System.in)) {
				boolean c=true;
				 
      //for stop Main menu;
				       while(c) {
				       System.out.println("-----------------Welcome in Lockup.com----------------");
				       System.out.println("Want to create File.. : Press 1");
				       System.out.println("Want Enter in Business-LevelOp :  Press 2");
				       System.out.println("Want to close the System :Press 3");
				       System.out.println();
				       int x=scanner.nextInt();
				       switch (x) {

						case 1:{
				        displayFile();
				        System.out.println();
				        break;
				        }
						
						case 2: 
				             {	while(true) {
				             System.out.println("What You Want?");
				             System.out.println();
				             System.out.println("Want to Create File : Press 1");
				             System.out.println("Want to Delete File : Press 2");
				             System.out.println("Want to Search File : Press 3");
				             System.out.println("Want to go to Main Menu : Press 4");
				             System.out.println();
				             int i=scanner.nextInt();
				             if(i<=0 || i>=6) {									
				           System.out.println("not entered valid number....  ");
				           System.out.println();
				           }else{
				        	   if(i==1) {
				        		   System.out.println("Enter the File Name for Create");
				        	   String  FileForCreate=scanner.next();
				                genaretFile(FileForCreate);
				                System.out.println();
				                }
				                else if(i==2) {
				                	System.out.println("Enter the File Name to Delete");
				                    String FileForDelete=scanner.next();
				                    deleteFile(FileForDelete);
				                    System.out.println();
				                    }
				                else if(i== 3) {
				                System.out.println("Enter name of the file for Searching");
				                String FileForSerching=scanner.next();
				                searchFile(FileForSerching);
				                System.out.println();
				                }
				                else if(i==4) {
				                System.out.println("Welcome to Main menu..........");
				                System.out.println();
				                break;
				                }
				             }
				             
				             }
				             break;
				       }
				       
				       case 3:{
				        System.out.println("System close...");
				        c=false;
				        break;
				       }
				       }
}
			}
	}
	}


