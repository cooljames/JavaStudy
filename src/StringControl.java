import java.util.*;

import java.io.*;

public class StringControl {

	private static String line;

	public static void main(String[] james) throws NullPointerException {

		Scanner scan = new Scanner(System.in);
		System.out.println("���� ���� �̸��� �Է��ϼ���!");
		String FileName = scan.nextLine();
		System.out.println(FileName);

		String path = StringControl.class.getResource("").getPath(); // ���� Ŭ������  ���� ��θ�  �����´�.
		String pathLast = path.replace("bin/", "src/");
		System.out.println(pathLast); // --> ���� ��ΰ� ��µ�

		File realFile = new File(pathLast + FileName); // path ���� ���� ���� �̸��� ����Ų��.

		try {

			FileReader fileReader = new FileReader(realFile);

			BufferedReader bufferedReader = new BufferedReader(fileReader);

			while ((line = bufferedReader.readLine()) != null) {

				String trimLine = line.trim();
				String lineToRemove = "pakage";

				/*
				 * if(line.contains(lineToRemove)) continue;
				 * 
				 * line = null;
				 */

				System.out.println(line);
			}
			bufferedReader.close();
		}

		catch (FileNotFoundException e) {
			System.out.println(FileName + " ������ ã�� �� �����ϴ�.");
		}

		catch (IOException e) {
			System.out.println(FileName + " ������ ���� �� �����ϴ�.");
		}

		// int lengthS = line.length();
		
		
		String saveFile = scan.nextLine();
		System.out.println("�� ���� �̸��� �Է��ϼ���!");
		
		try {
			FileWriter fileWiter = new FileWriter(saveFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
