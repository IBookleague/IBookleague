package com.ibookleague;

import com.ibookleague.book.Book;
import com.ibookleague.book.BookRepository;
import com.ibookleague.foreignbook.ForeignBookRepository;
import com.ibookleague.book.BookService;
import com.ibookleague.foreignbook.ForeignBook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.ClassPathResource;
import org.springframework.util.FileCopyUtils;

import java.io.FileInputStream;
import java.io.FileReader;

@SpringBootTest
class IbookleagueApplicationTests {

	@Autowired
	private BookRepository bookRepository;

//	@Test
//	void testJpa() {
//		try
//		{
//			FileInputStream file = new FileInputStream("/Users/suyeon/Desktop/SpringProject/review_and_rate/src/excel/korean_literary.xlsx");
//			XSSFWorkbook workbook = new XSSFWorkbook(file);
//
//			int rowindex=0;
//			XSSFSheet sheet=workbook.getSheetAt(0);
//			//행의 수
//			int rows=sheet.getPhysicalNumberOfRows();
//			for(rowindex=1;rowindex<rows;rowindex++){
//				//행을 읽는다
//				XSSFRow row=sheet.getRow(rowindex);
//				if(row !=null){
//					XSSFCell name = row.getCell(1);
//					XSSFCell author = row.getCell(2);
//					String book_name = String.valueOf(name);
//					String author_name = String.valueOf(author);
//					System.out.println(rowindex+"작품명 : " + name + "      작가명 : " + author);
//					Book b = new Book();
//					b.setSubject(book_name);
//					b.setAuthor(author_name);
//					this.bookRepository.save(b);
//
//				}
//
//			}
//
//		}catch(Exception e) {
//			e.printStackTrace();
//		}

//	}

}
