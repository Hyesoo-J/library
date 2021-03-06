package de.buw.se4de;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.opencsv.CSVWriter;

public class DBConnectionStudent {

	public static List<List<String>> studentsDBList = new ArrayList<List<String>>();
	public static String[][] studentsDB;

    protected static String path = Paths.get("src/main/resources/studentsDB.csv").getParent() + "\\" + "studentsDB.csv";
//	protected static String path = Paths.get("resources/studentsDB.csv").getParent() + "\\" + "studentsDB.csv";

	public static void readStudentsDB() {
		String line = "";
		BufferedReader buffer = null;
		try {
			buffer = new BufferedReader(new FileReader(path));
			while ((line = buffer.readLine()) != null) {
				String[] data1D = line.split(",");
				studentsDBList.add(Arrays.asList(data1D));
				// System.out.println(data1D.toString());
			}
		} catch (FileNotFoundException var5) {
			throw new RuntimeException(var5);
		} catch (IOException var6) {
			throw new RuntimeException(var6);
		} finally {
			if (buffer != null) {
				try {
					buffer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		studentsDB = studentsDBList.stream().map((l) -> {
			return l.stream().toArray((x$0) -> {
				return new String[x$0];
			});
		}).toArray((x$0) -> {
			return new String[x$0][];
		});
	}

	public static void setStudent(String studentID, String studentPW, String name, String familyName, String programm,
			String faculty) {

		if (getIndex(studentID) != -1) {
			System.out.println("The student is already registered!");
		} else {
			var copy = new String[studentsDB.length + 1][studentsDB[0].length + 1];

			for (int i = 0; i < studentsDB.length; i++)
				for (int j = 0; j < studentsDB[i].length; j++)
					copy[i][j] = studentsDB[i][j];
			for (int i = 0; i < studentsDB[0].length; i++)
				copy[studentsDB.length][i] = "null";

			copy[studentsDB.length][0] = studentID;
			copy[studentsDB.length][1] = studentPW;
			copy[studentsDB.length][2] = name;
			copy[studentsDB.length][3] = familyName;
			copy[studentsDB.length][4] = programm;
			copy[studentsDB.length][5] = faculty;
			studentsDB = copy;
		}

	}

	public static int getIndex(String studentID) {
		int index = -1;

		for (int i = 0; i < studentsDB.length; i++) {
			if (studentsDB[i][0].toLowerCase().equals(studentID.toLowerCase()))
				return i;
		}

		return index;
	}

	public static void printStudents() {
		for (int i = 0; i < studentsDB.length; i++) {
			for (int j = 0; j < studentsDB[0].length; j++)
				System.out.println(studentsDB[i][j]);
		}
		System.out.println("");
	}

	public static void writeStudentsInDB() {
		List<String[]> replica = new ArrayList<String[]>();
		FileWriter outputFile = null;
		CSVWriter writer = null;
		
		try {
			// https://mkyong.com/java/how-to-export-data-to-csv-file-java/
			// create FileWriter object with file as parameter
			outputFile = new FileWriter(path);
			// https://stackoverflow.com/questions/13969254/unwanted-double-quotes-in-generated-csv-file
			// https://www.geeksforgeeks.org/writing-a-csv-file-in-java-using-opencsv/
			// create CSVWriter object filewriter object as parameter
			writer = new CSVWriter(outputFile, CSVWriter.DEFAULT_SEPARATOR, CSVWriter.NO_QUOTE_CHARACTER,
					CSVWriter.DEFAULT_ESCAPE_CHARACTER, CSVWriter.RFC4180_LINE_END);

			for (int i = 0; i < studentsDB.length; i++) {
				replica.add(studentsDB[i]);
			}
			writer.writeAll(replica);
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			if(writer != null) {
				try {
					writer.close();
				} catch (IOException e) {}
				writer = null;
			}
			if(outputFile != null) {
				try {
					outputFile.close();
				} catch (IOException e) {}
				outputFile = null;
			}
		}
	}
	
	public static boolean isValidId(String paramId, String paramPw) {
		for (String[] studentInfo :  studentsDB) {
			if(studentInfo.length > 1) {
				String id = studentInfo[0];
				String pw = studentInfo[1];
				if(id.equals(paramId)) {
					if(pw.equals(paramPw)) {
						return true;
					}else {
						return false;
					}
				}
			}else {
				System.out.println("invalid student information.");
			}
		}
		return false;
	}
}


