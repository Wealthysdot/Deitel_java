package chapterFifteen;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.*;
import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;

class FilesProcessorTest {

    String filePath;

    @BeforeEach
    void setUp() {
        StringBuilder pathBuilder = new StringBuilder("C:");
        pathBuilder.append(File.separator);
        pathBuilder.append("Pentax");
        pathBuilder.append(File.separator);
        pathBuilder.append("Pent.txt");
        filePath = "C:/Pentax/Pent.txt";
    }

    @AfterEach
    void tearDown() {

    }

    @Test
    public void isValidPathWithNullPath(){
        assertThrows(FileNotFoundException.class,
                ()->FilesProcessor.isValid("null")
                );
    }

    @Test
    public void isValidPathWithEmptyPath(){
        assertThrows(FileNotFoundException.class,
                ()->FilesProcessor.isValid("")
        );
    }

    @Test
    void isValidPath(){
        try{
            boolean result = FilesProcessor.isValid(filePath);
            assertTrue(result);
        } catch (FileNotFoundException ex){
            System.err.println(ex.getMessage());
            ex.printStackTrace();
        }
    }

    @Test
    public void isValidPathWithInvalidPath(){
        filePath = "C:/fakePath.txt"  ;
        assertThrows(FileNotFoundException.class,
                ()->FilesProcessor.isValid(filePath)
        );
    }

    @Test
    void getFileName() throws FileNotFoundException {
        String fileName = "Pent.txt";
        String name = FilesProcessor.getFileName(fileName);
        assertNotNull(name);
        assertTrue(name.equals(fileName));


    }

       @Test
    void playWithFileSystem(){
        FileSystem defaultFileSystem = FileSystems.getDefault();
        assertNotNull(defaultFileSystem);
        Iterable<Path> rootDirectories = defaultFileSystem.getRootDirectories();
        Iterator<Path> directories = rootDirectories.iterator();
        while(directories.hasNext()) {
            System.out.println(directories.next());}
        }
//        directories = rootDirectories.iterator();
//        Path cDrive = directories.next();
//        assertNotNull(cDrive);
//
//        try{
//            DirectoryStream<Path> directoryStream = Files.newDirectoryStream(cDrive);
//            for(Path aPath: directoryStream) {
//                if (files.isDirectory(aPath) && !Files.isHidden(aPath))
//                    System.out.println(aPath);
//            }
//            }    catch (IOException e){
//            e.printStackTrace();
//    }

//    @Test
//    void createFil(){
//        try{
//            String filename = "C:/Pentax/pent.txt";
////            Formatter output =
//        }
//    }
    }


            

