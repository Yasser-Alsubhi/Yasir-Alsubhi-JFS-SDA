package ph1L3FH;

import java.io.FileReader;
import java.io.FileWriter;


public class FileHandling {

	public static void main(String[] args) {

		//in case there's some issue like the file we looking for not there
		try {
			//start reader for this file
			FileReader reader = new FileReader("Test.txt");
			// creat 'hello.txt'
			FileWriter writer = new FileWriter("hello.txt");
			
			int c = 0 ;
			
			// to read all letters in the file
			while((c=reader.read()) != -1) {
				// to write letter by letter
				writer.write(c);
				//to insure that it will return what the writer read
				writer.flush();
			}
			//stop read & write
			writer.close();
			reader.close();
			// to make sure that our program make it until here and also to inform the user about what's happening
			System.out.println("Reading   Test.txt ...\n"
							  +"Creating  Test.txt ...\n"
							  +"Writng    Test.txt ...\n"
							  +"    >>>DONE<<<");
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
	}

}

