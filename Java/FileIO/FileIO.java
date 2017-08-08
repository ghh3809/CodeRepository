import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * 读写文件类
 * 包含3种读文件静态方法与1种写文件静态方法
 */
public class FileIO {
		
	/**
	 * 读取int类型源文件，并将结果存至ArrayList并返回
	 */
	public static ArrayList<Integer> readIntFile(String filename) {
		File filein = new File(filename); //读入数据路径
		ArrayList<Integer> data = new ArrayList<Integer>();
		try {
			InputStreamReader read = new InputStreamReader(new FileInputStream(filein));
			BufferedReader bufferedReader = new BufferedReader(read);
			String lineTxt = null;
			while((lineTxt = bufferedReader.readLine()) != null){
				data.add(Integer.valueOf(lineTxt)); //读入Integer
			}
			read.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
	}
	
	/**
	 * 读取double类型源文件，并将结果存至ArrayList并返回
	 */
	public static ArrayList<Double> readDoubleFile(String filename) {
		File filein = new File(filename); //读入数据路径
		ArrayList<Double> data = new ArrayList<Double>();
		try {
			InputStreamReader read = new InputStreamReader(new FileInputStream(filein));
			BufferedReader bufferedReader = new BufferedReader(read);
			String lineTxt = null;
			while((lineTxt = bufferedReader.readLine()) != null){
				data.add(Double.valueOf(lineTxt)); //读入Integer
			}
			read.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
	}
	
	/**
	 * 读取String类型源文件，并将结果存至ArrayList并返回
	 */
	public static ArrayList<String> readStringFile(String filename) {
		File filein = new File(filename); //读入数据路径
		ArrayList<String> data = new ArrayList<String>();
		try {
			InputStreamReader read = new InputStreamReader(new FileInputStream(filein));
			BufferedReader bufferedReader = new BufferedReader(read);
			String lineTxt = null;
			while((lineTxt = bufferedReader.readLine()) != null){
				data.add(lineTxt); //读入Integer
			}
			read.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
	}
	
	/**
	 * 向指定路径filename中写入数据result
	 */
	public static void writeFile(String filename, ArrayList<?> result) {
		File fileout = new File(filename);
		try {
        	BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileout));
        	for (int i = 0; i < result.size(); i ++) {
        		bufferedWriter.write("" + result.get(i));
            	bufferedWriter.newLine(); // 换行
        	}
			bufferedWriter.flush();
			bufferedWriter.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}