package ru.itis.astashev.services.pdf;/**
 * Created by 1 on 01.06.2016.
 */

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import org.dom4j.DocumentException;
import org.springframework.stereotype.Component;
import ru.itis.astashev.entity.User;

import java.io.FileOutputStream;
import java.io.IOException;

@Component
public class PdfFile {

/*
    @Autowired
    PublisherService publisherService;
*/


    public String createPdf(User user)
            throws DocumentException, IOException, com.itextpdf.text.DocumentException {
        String CATALINA_HOME = "D:\\Inform\\Support\\apache-tomcat-8.0.26\\pdf\\";
        Document document = new Document();
        PdfWriter.getInstance(document, new FileOutputStream(CATALINA_HOME + user.getLogin() + ".pdf"));
        document.open();
        document.add(new Paragraph("User info"));
        document.add(new Paragraph("Name: " + user.getName()));
        document.add(new Paragraph("Email: " + user.getEmail()));
        document.add(new Paragraph("\n"));
        document.add(new Paragraph("\n"));
        document.add(new Paragraph("\n"));
        document.add(new Paragraph("\n"));
        document.add(new Paragraph("\n"));

        document.add(new Paragraph(user.getName() + "s statistic"));
        //  List<BooksApplication> booksApplication= user.getBooksApplication();
        PdfPTable t = new PdfPTable(6);
      /*  t.setSpacingBefore(25);
        t.setSpacingAfter(25);
        PdfPCell c1 = new PdfPCell(new Phrase("Email"));
        t.addCell(c1);
        PdfPCell c2 = new PdfPCell(new Phrase("Team"));
        t.addCell(c2);
        PdfPCell c3 = new PdfPCell(new Phrase("Goals"));
        t.addCell(c3);
        PdfPCell c4 = new PdfPCell(new Phrase("Card"));
        t.addCell(c4);

        t.addCell(user.getEmail());
        t.addCell(user.getTeam().getName());
        t.addCell(String.valueOf(user.getGoals()));
        t.addCell(String.valueOf(user.getCard()));
        document.add(t);*/

        document.add(new Paragraph("Email - " + user.getEmail()));
        document.add(new Paragraph("Team - " + user.getTeam().getName()));
        document.add(new Paragraph("Goals - " + String.valueOf(user.getGoals())));
        document.add(new Paragraph("Card - " + String.valueOf(user.getCard())));


        document.add(new Paragraph("\n"));
        document.add(new Paragraph("\n"));
        document.add(new Paragraph("\n"));
        document.add(new Paragraph("\n"));
        document.add(new Paragraph("\n"));
        document.add(new Paragraph("\n"));
        document.add(new Paragraph("\n"));
        document.add(new Paragraph("\n"));
        document.add(new Paragraph("OAFL"));

        document.close();
        return CATALINA_HOME + user.getLogin() + ".pdf";
    }
}