package ClassDe;

import java.io.*;
import java.util.ArrayList;

public class DataWriter {
	FileWriter fw = null;
	BufferedWriter bw = null;
	String outputPath = "C:\\Users\\pllab\\Documents\\tcgenWT\\AstLib\\src\\newAST\\testInfo.txt ";

	public void writeInfo(String data) {
		try {
			// System.out.println("String");
			fw = new FileWriter(outputPath, false); // 預設是fals~如資料夾中有資料會刪除原資料印新的
			bw = new BufferedWriter(fw);
			// for(int i = 0; i < data.length ; i++){
			bw.write(data + "\n"); // 加上"\n"讓文字換行"
			// bw.newLine(); //若要設定成整行新的資料將上方"\n"刪除使用這行
			// }
		} catch (IOException e) {
		} finally {
			try {
				bw.close();
			} catch (IOException e) {
				
				
				
			}
		}
	}

	public void writeInfo(String data[]) {
		try {
			// System.out.println("String[]");
			fw = new FileWriter(outputPath, false); // 預設是fals~如資料夾中有資料會刪除原資料印新的
			bw = new BufferedWriter(fw);
			for (int i = 0; i < data.length; i++) {
				bw.write(data + "\n"); // 加上"\n"讓文字換行"
				// bw.newLine(); //若要設定成整行新的資料將上方"\n"刪除使用這行
			}
		} catch (IOException e) {
		} finally {
			try {
				bw.close();
			} catch (IOException e) {
				
			}
		}
	}

	public void writeInfo(ArrayList<String> data) {
		try {
			// System.out.println("ArrayList String");
			fw = new FileWriter(outputPath, false); // 預設是fals~如資料夾中有資料會刪除原資料印新的
			bw = new BufferedWriter(fw);
			System.out.println("ArrayList String");
			for (int i = 0; i < data.size(); i++) {
				bw.write(data.get(i) + "\n"); // 加上"\n"讓文字換行"
				// bw.newLine(); //若要設定成整行新的資料將上方"\n"刪除使用這行
			}
		} catch (IOException e) {
		} finally {
			try {
				bw.close();
			} catch (IOException e) {
			}
		}
	}

}