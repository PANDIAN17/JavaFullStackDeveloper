import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileFinal {
	
	public static void main(String[] args) throws IOException {
		
		System.out.println("Welcome to Lockedme Website!!!!\n"+
				"*********************************************\n"+
										"Developer Name:Pandian Jayaraman\n"+
										"Language Used: Java 1.8\n"
										);
					System.out.println("Please choose one of the options below:\n"+
							"*********************************************\n"+
										"1.Return the current file names\n"+
										"2.add/delete/search a file");
		Scanner sc=new Scanner(System.in);
		System.out.println("File operations");
		while(true) {
			System.out.println("Enter your choice 1.Write 2.Read 3.Copy 4.Delete 5.Exit 6.Display 7.search");
			int choice=sc.nextInt();
			switch(choice) {
			case 1: 
	

	String s="Hi how are you this is the first file";
			
			//byte
			
			FileOutputStream fos=new FileOutputStream("C:\\Users\\jpand\\Software\\Test\\a.txt",true);
			
			byte b[]=s.getBytes();
			fos.write(b);
			fos.close();
			break;
			case 2: 
				FileInputStream fis=new FileInputStream("C:\\Users\\jpand\\Software\\Test\\a.txt");
				int i=0;
				while((i=fis.read())!=-1) {
					System.out.print((char)i);
						//fos.close();
				}
					break;
				case 3:
					FileOutputStream fos1 = new FileOutputStream("C:\\Users\\jpand\\Software\\Test\\b.txt");

					FileInputStream fis1 = new FileInputStream("C:\\Users\\jpand\\Software\\Test\\a.txt");
					
					int j=0;
					while ((j=fis1.read()) != -1) {
						fos1.write(j);
						
				}
					break;
				case 4:
					System.out.println("Please enter the name of the file to be deleted");
					String path = "C:\\Users\\jpand\\Desktop\\Test\\";
					String fileDel = sc.next();
					String finalfile = path+fileDel;
					File f = new File(finalfile);
					boolean flag1 = f.delete();
					if(flag1) {
						System.out.println("Selected file deleted Successfully"+f);
					}else
					{
							System.err.println("Failed to delete the file:" + f);
						
					}
					//f.close();
					break;
				case 5:
					System.exit(0);
					break;
				case 6:
					
					String path1 = "C:\\Users\\jpand\\Software\\Test\\";
					File  f1 = new File(path1);
					File filen[]= f1.listFiles();
					for(File ff:filen) {
						String s1 = ff+"";
						String ss[] =s1.split("\\\\");
						//System.out.println(ff);
						System.out.println(ss[ss.length - 1]);
					}
					break;
					
				case 7:
					String path2 = "C:\\Users\\jpand\\Software\\Test\\";
					File  f2 = new File(path2);
					System.out.println("Enter  the file name");
					String filesearch = sc.next();
					File filen1[]=f2.listFiles();
					int flag=0;
							for(File ff:filen1) {
								
									if(ff.getName().equals(filesearch)) {
										flag =1;
										break;
									}
									else {
										flag = 0;
									}
							}
							if(flag ==1) {
								
								System.out.println("File is found ");
							}
							else {
								System.out.println("File is not found ");
							}
							break;				
			}
	}


	}
}