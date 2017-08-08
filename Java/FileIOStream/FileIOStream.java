import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;

/**
 * 文件流式处理静态模板
 * 需补全模板内容
 */
public class FileIOStream {
	public static void main(String args[]) {
		
		//需要补全的区域
		String fileinName = "Your File In Here";
		String fileoutName = "Your File Out Here";
		//需要补全的区域
		
		File filein = new File(fileinName);
		File fileout = new File(fileoutName);
		try {
			InputStreamReader read = new InputStreamReader(new FileInputStream(filein));
			BufferedReader bufferedReader = new BufferedReader(read);
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileout));
			String lineTxt = null;
			while((lineTxt = bufferedReader.readLine()) != null){ //lineTxt为读入的每行数据
				
				//////////////////
				//Your Code Here//
				//////////////////
				
			}
			read.close();
			bufferedWriter.flush();
			bufferedWriter.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
