package streams.bufferedstreams;

import java.io.*;

public class BufferedFileCopy {
    public static void main(String[] args) {
        String sourceFile = "C:\\Users\\hp\\Desktop\\week4_generics\\generics\\src\\streams\\bufferedstreams\\source_large_file.txt";
        String destinationFileBuffered = "C:\\Users\\hp\\Desktop\\week4_generics\\generics\\src\\streams\\bufferedstreams\\destination_buffered.txt";
        String destinationFileUnbuffered = "C:\\Users\\hp\\Desktop\\week4_generics\\generics\\src\\streams\\bufferedstreams\\destination_unbuffered.txt";

        // ✅ Check if source file exists before proceeding
        File srcFile = new File(sourceFile);
        if (!srcFile.exists()) {
            System.out.println("Source file does not exist: " + sourceFile);
            return;
        }

        // ✅ Copy using Buffered Streams
        long bufferedTime = copyUsingBufferedStreams(sourceFile, destinationFileBuffered);
        System.out.println("Buffered Stream Copy Time: " + bufferedTime + " ns");

        // ✅ Copy using Unbuffered Streams
        long unbufferedTime = copyUsingUnbufferedStreams(sourceFile, destinationFileUnbuffered);
        System.out.println("Unbuffered Stream Copy Time: " + unbufferedTime + " ns");
    }

    public static long copyUsingBufferedStreams(String source, String destination) {
        long startTime = System.nanoTime();
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destination))) {

            byte[] buffer = new byte[4096]; // 4 KB buffer size
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            e.printStackTrace();  // ✅ Improved exception handling
        }
        return System.nanoTime() - startTime;
    }

    public static long copyUsingUnbufferedStreams(String source, String destination) {
        long startTime = System.nanoTime();
        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(destination)) {

            byte[] buffer = new byte[4096]; // 4 KB buffer size
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            e.printStackTrace();  
        }
        return System.nanoTime() - startTime;
    }
}
