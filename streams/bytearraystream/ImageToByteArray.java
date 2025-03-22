package streams.bytearraystream;

import java.io.*;

public class ImageToByteArray {
    public static void main(String[] args) {
        // Define file paths
    	String sourceImage = "C:\\Users\\hp\\Desktop\\week4_generics\\generics\\src\\streams\\bytearraystream\\InShot_20220811_152446066.jpg";
    	String destinationImage = "C:\\Users\\hp\\Desktop\\week4_generics\\generics\\src\\streams\\bytearraystream\\output_image.jpg";

        try {
            // Convert image to byte array
            byte[] imageData = convertImageToByteArray(sourceImage);

            // Write byte array back to an image file
            writeByteArrayToImage(imageData, destinationImage);

            System.out.println("Image successfully copied!");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Convert image to byte array
    public static byte[] convertImageToByteArray(String imagePath) throws IOException {
        try (FileInputStream fis = new FileInputStream(imagePath);
             ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }
            return baos.toByteArray();
        }
    }

    // Write byte array back to an image
    public static void writeByteArrayToImage(byte[] imageData, String outputPath) throws IOException {
        try (ByteArrayInputStream bais = new ByteArrayInputStream(imageData);
             FileOutputStream fos = new FileOutputStream(outputPath)) {
            
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = bais.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
        }
    }
}
