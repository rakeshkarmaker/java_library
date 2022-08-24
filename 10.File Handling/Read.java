import java.io.*;
import java.util.*;

class Read
{
	public static void main(String []args)
	{
		try{
		File file = new File("D:\\Write\\Ademo.txt");  //location must be the path where the file is saved
		Scanner sc = new Scanner(file);


				while(sc.hasNext())
				{
					String line1 = sc.nextLine();
					String line2 = sc.nextLine();
					//String line3 = sc.nextLine();

				 	System.out.println(line1);
					System.out.println(line2);
					//System.out.println(line3);
					System.out.println("////////////////////////////");
					System.out.println("File has been read ");

				}
			//bw.write(str:"Sajid\n");
			//bw.write(str:"Majid\n");
			//bw.write(str:"Bajid\n");
			System.out.println(file.getName());  // file name print
			System.out.println(file.length()+"Bytes");  // file size in byte
			sc.close();   //closing the file 
			
			//System.out.println(file.delete());

 			
		}


		catch(Exception ex)
		{
			return;
		}
	}
}