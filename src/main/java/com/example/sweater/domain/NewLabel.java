package com.example.sweater.domain;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import javafx.scene.control.Cell;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class NewLabel  {
private String str;
private Product product;
//public static final String FONT = "c:\\Windows\\Fonts\\times.ttf";
    public static final String FONT = "times.ttf";


    public NewLabel() {
    }


    public NewLabel(String str) {
        this.str = str;
    }

    public NewLabel(Product product) {
        this.product = product;
    }

    public void createPdf() throws DocumentException, IOException {

        Rectangle one = new Rectangle( 113.0F,159.0F);
        DateFormat df = new SimpleDateFormat( "HH-mm-ss" ) ;
        Document document = new Document(one);
        PdfWriter.getInstance(document, new FileOutputStream("pdf.pdf"));
        document.setMargins(2, 2, 2, 2);

        document.open();

      BaseFont bf = BaseFont.createFont(FONT, BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
       // Font font = FontFactory.getFont(String.valueOf(Font.FontFamily.TIMES_ROMAN), "Cp1250", true);
       Font font = new Font(/*Font.FontFamily.HELVETICA*/ bf, 5, Font.NORMAL);
       // Chunk chunk = new Chunk("Hello World" + product.getBarcode(), font);
        PdfPCell cell;

        float[] columnWidths = {2, 4};


        PdfPTable table = new PdfPTable(columnWidths);
        table.setWidthPercentage(100);
        table.setHorizontalAlignment(Element.ALIGN_LEFT);
        // the cell object

        // we add a cell with colspan 3
        cell = new PdfPCell(new Phrase("Импортер в Беларусь",font));
        table.addCell(cell);
        cell = new PdfPCell(new Phrase(product.getImporter(),font));
        table.addCell(cell);
          cell = new PdfPCell(new Phrase("Производитель",font));
        table.addCell(cell);
        cell = new PdfPCell(new Phrase(product.getManufacturer(),font));
        table.addCell(cell);
          cell = new PdfPCell(new Phrase("Тоговая марка",font));
        table.addCell(cell);
        cell = new PdfPCell(new Phrase(product.getTrademark(),font));
        table.addCell(cell);
          cell = new PdfPCell(new Phrase("Наименование",font));
        table.addCell(cell);
        cell = new PdfPCell(new Phrase(product.getProductName() + " " + product.getGender(),font));
        table.addCell(cell);
          cell = new PdfPCell(new Phrase("Артикул",font));
        table.addCell(cell);
        cell = new PdfPCell(new Phrase(product.getArticle(),font));
        table.addCell(cell);
          cell = new PdfPCell(new Phrase("Состав материала",font));
        table.addCell(cell);
        cell = new PdfPCell(new Phrase(product.getComposition(),font));
        table.addCell(cell);
          cell = new PdfPCell(new Phrase("Дата выпуска",font));
        table.addCell(cell);
        cell = new PdfPCell(new Phrase(product.getDateArrive(),font));
        table.addCell(cell);
          cell = new PdfPCell(new Phrase("Символы ухода",font));
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("символы",font));
        table.addCell(cell);
          cell = new PdfPCell(new Phrase("Цена",font));
        table.addCell(cell);
        cell = new PdfPCell(new Phrase(product.getRetailPrice(),font));
        table.addCell(cell);








        document.add(table);

        //document.add(chunk);
        document.close();
    }

    public byte [] getPDF() throws IOException, DocumentException {






        FileOutputStream fos = null;
        byte [] myByteFile = new byte[0];
        Rectangle one = new Rectangle( 113.0F,159.0F);
        DateFormat df = new SimpleDateFormat( "HH-mm-ss" ) ;
        Document document = new Document(one);


            fos = new FileOutputStream("pdf.pdf");
            PdfWriter writer  =    PdfWriter.getInstance(document, fos);


        document.setMargins(2, 2, 2, 2);

        document.open();
        BaseFont bf = null;
        try {
            bf = BaseFont.createFont(FONT, BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Font font = FontFactory.getFont(String.valueOf(Font.FontFamily.TIMES_ROMAN), "Cp1250", true);
        Font font = new Font(/*Font.FontFamily.HELVETICA*/ bf, 5, Font.NORMAL);
        PdfPCell cell;

        float[] columnWidths = {2, 4};


        PdfPTable table = new PdfPTable(columnWidths);
        table.setWidthPercentage(100);
        table.setHorizontalAlignment(Element.ALIGN_LEFT);
        // the cell object

        // we add a cell with colspan 3
        cell = new PdfPCell(new Phrase("Импортер в Беларусь",font));
        table.addCell(cell);
        cell = new PdfPCell(new Phrase(product.getImporter(),font));
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("Производитель",font));
        table.addCell(cell);
        cell = new PdfPCell(new Phrase(product.getManufacturer(),font));
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("Тоговая марка",font));
        table.addCell(cell);
        cell = new PdfPCell(new Phrase(product.getTrademark(),font));
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("Наименование",font));
        table.addCell(cell);
        cell = new PdfPCell(new Phrase(product.getProductName() + " " + product.getGender(),font));
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("Артикул",font));
        table.addCell(cell);
        cell = new PdfPCell(new Phrase(product.getArticle(),font));
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("Состав материала",font));
        table.addCell(cell);
        cell = new PdfPCell(new Phrase(product.getComposition(),font));
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("Дата выпуска",font));
        table.addCell(cell);
        cell = new PdfPCell(new Phrase(product.getDateArrive(),font));
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("Символы ухода",font));
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("символы",font));
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("Цена",font));
        table.addCell(cell);
        cell = new PdfPCell(new Phrase(product.getDateArrive(),font));
        table.addCell(cell);
       // cell = new PdfPCell(new Phrase("Штрихкод",font));
       // table.addCell(cell);

        cell = createBarcode(writer, String.format("%013d", product.getId()));
        cell.setColspan(2);
        table.addCell(cell);
      /*  cell = new PdfPCell(new Phrase(product.getRetailPrice(),font));
        table.addCell(cell);*/






              try {
            document.add(table);
        } catch (DocumentException e) {
            e.printStackTrace();
        }

        //document.add(chunk);


        document.close();





        try {
            myByteFile = Files.readAllBytes(Paths.get("pdf.pdf"));
        } catch (IOException e) {
            e.printStackTrace();
        }


        //---------------------------------------------------------------





        return myByteFile;

    }
    public static PdfPCell createBarcode(PdfWriter writer, String code) throws DocumentException, IOException {
        BarcodeEAN barcode = new BarcodeEAN();
        barcode.setCodeType(Barcode.EAN13);
        barcode.setCode(code);
        barcode.setBarHeight(10);

        PdfPCell cell = new PdfPCell(barcode.createImageWithBarcode(writer.getDirectContent(), BaseColor.BLACK, BaseColor.GRAY), true);

        return cell;
    }


    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}
