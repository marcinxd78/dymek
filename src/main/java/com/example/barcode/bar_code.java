/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.barcode;

import java.io.File;
import java.io.IOException;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;

/**
 *Klasa generująca kod qr
 */

public class    bar_code {
    
    public static void main(String[] args){
        String data = "Test-1";
        String format = "png";
        File file = new File("test.png");
        int width = 150;
        int height = 100;
        try {
            MultiFormatWriter writer = new MultiFormatWriter();
            BitMatrix matrix = writer.encode(data, BarcodeFormat.CODE_128, width, height);
            MatrixToImageWriter.writeToFile(matrix, format, file);
        } catch (WriterException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}