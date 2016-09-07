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
			fw = new FileWriter(outputPath, false); // �w�]�Ofals~�p��Ƨ�������Ʒ|�R�����ƦL�s��
			bw = new BufferedWriter(fw);
			// for(int i = 0; i < data.length ; i++){
			bw.write(data + "\n"); // �[�W"\n"����r����"
			// bw.newLine(); //�Y�n�]�w�����s����ƱN�W��"\n"�R���ϥγo��
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
			fw = new FileWriter(outputPath, false); // �w�]�Ofals~�p��Ƨ�������Ʒ|�R�����ƦL�s��
			bw = new BufferedWriter(fw);
			for (int i = 0; i < data.length; i++) {
				bw.write(data + "\n"); // �[�W"\n"����r����"
				// bw.newLine(); //�Y�n�]�w�����s����ƱN�W��"\n"�R���ϥγo��
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
			fw = new FileWriter(outputPath, false); // �w�]�Ofals~�p��Ƨ�������Ʒ|�R�����ƦL�s��
			bw = new BufferedWriter(fw);
			System.out.println("ArrayList String");
			for (int i = 0; i < data.size(); i++) {
				bw.write(data.get(i) + "\n"); // �[�W"\n"����r����"
				// bw.newLine(); //�Y�n�]�w�����s����ƱN�W��"\n"�R���ϥγo��
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