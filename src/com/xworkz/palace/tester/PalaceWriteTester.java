package com.xworkz.palace.tester;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PalaceWriteTester {

	public static void main(String[] args) {
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet = wb.createSheet("PalaceDTO");
		Map<String, Object[]> data = new TreeMap<String, Object[]>();
		data.put("1", new Object[] { "Id", "Palace", "Owned", "Year", "State", "City", "Country" });
		data.put("2",
				new Object[] { 1, "Bangalore Palace", "Rev. J. Garrett", 1878, "Karnataka", "Bangalore", "India" });
		data.put("3", new Object[] { 2, "Taj Falaknuma Palace", "Nizam", 1894, "Telangana", "Hyderabad", "India" });
		data.put("4", new Object[] { 3, "Padmanabhapuram Palace", "Ravi Varma Kulasekhara perumal", 1601, "Tamilnadu",
				"Kanyakumari", "India" });
		Set<String> keyset = data.keySet();
		int rownum = 0;
		for (String key : keyset) {
			// this creates a new row in the sheet
			Row row = sheet.createRow(rownum++);
			Object[] objArr = data.get(key);
			int cellnum = 0;
			for (Object obj : objArr) {
				// this line creates a cell in the next column of that row
				Cell cell = row.createCell(cellnum++);
				if (obj instanceof String)
					cell.setCellValue((String) obj);
				else if (obj instanceof Integer)
					cell.setCellValue((Integer) obj);
			}
			try {
				File file = new File("E:\\21Trans05\\Java\\sheets\\palace-table.xlsx");
				FileOutputStream fos = new FileOutputStream(file);
				wb.write(fos);
				fos.close();
				System.out.println("Written successfully on sheet");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
