package com.star.design.factory;


import com.star.design.factory.dto.color.Person;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.util.StringUtils;

import java.io.FileInputStream;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        try {
            FileInputStream fis  = new FileInputStream("D:\\我的文档\\72116253\\Desktop\\vivo 机型.xlsx");
            XSSFWorkbook xls = new XSSFWorkbook(fis);
//开始解析
            XSSFSheet sheet = xls.getSheetAt(0);//读取sheet 0
            if (sheet == null) {
                return;
            }
            List<Row> list = new ArrayList<>();
            //遍历行row
            String str ="";
            for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
                //获取每一行
                XSSFRow row = sheet.getRow(rowNum);
                String cellValue = getCellValue(row.getCell(0));
                if (row == null) {
                    continue;
                }
                str = str + cellValue;
                if (rowNum<sheet.getLastRowNum()){
                    str = str +",";
                }

            }
            List<Person> personList = row2bean(list);
            //excelExportDtos.remove(0);
            System.out.println(str);
        }catch (Exception e){
            e.printStackTrace();
        }
    }


    public static List<Person> row2bean(List<Row> rowList){
        List<Person> personList = new ArrayList<Person>();
        for(int i=1;i<rowList.size();i++){
            Person person = new Person();
            for(int j = 0;j<rowList.get(i).getLastCellNum();j++){
                String currentCellValue =getCellValue(rowList.get(i).getCell(j));
                String currentTop = getCellValue(rowList.get(0).getCell(j));
                if(!StringUtils.isEmpty(currentCellValue)){
                    switch(currentTop){    //switch循环判断excel表头，case为每条数据对应excel的数据内容，循环为Customer对象赋值
                        case "姓名":
                            person.setName(currentCellValue);
                            break;
                        case "年龄":
                            person.setAge(currentCellValue);
                            break;
                        default:
                            break;
                    }
                }

            }
            personList.add(person);
        }
        return personList;
    }

    /**
     * 描述：对表格中数值进行格式化
     *
     * @param cell
     * @return
     */
    public static String getCellValue(Cell cell) {
        String value = null;
        DecimalFormat df = new DecimalFormat("0"); // 格式化number String字符
        SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd"); // 日期格式化
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        DecimalFormat df2 = new DecimalFormat("0"); // 格式化数字

        switch (cell.getCellType()) {
            case Cell.CELL_TYPE_STRING:
                value = cell.getRichStringCellValue().getString();
                break;
            case Cell.CELL_TYPE_NUMERIC:
                if ("General".equals(cell.getCellStyle().getDataFormatString())) {
                    value = df.format(cell.getNumericCellValue());
                } else if ("m/d/yy".equals(cell.getCellStyle().getDataFormatString())) {
                    value = sdf.format(cell.getDateCellValue());
                } else {
                    //Sun Dec 31 15:03:00 CST 1899格式化时间15:03
                    value = sdf2.format(cell.getDateCellValue()).substring(11, 16);
                }
                break;
            case Cell.CELL_TYPE_BOOLEAN:
                //value = cell.getBooleanCellValue();
                value = "";
                break;
            case Cell.CELL_TYPE_BLANK:
                value = "";
                break;
            default:
                break;
        }
        return value;
    }






}
