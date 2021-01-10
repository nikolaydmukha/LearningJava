package main.java.home.netology.customutils.renamedirs;

import java.io.*;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи адрес: ");
        String dirName = scanner.nextLine();
        //root dir: C:\Users\n.dmukha\Desktop\Work\Omilia\JavaModules\MyModules\LearningJava\src\main\java\home\javarush\
        try (DirectoryStream<Path> rootDir = Files.newDirectoryStream(Paths.get(dirName))) {
            for (Path path : rootDir) {
                if (Files.isDirectory(path)) {
                    try (DirectoryStream<Path> streamSubDirs = Files.newDirectoryStream(path)) {    //sub dirs
                        for (Path subPath : streamSubDirs) {
                            System.out.println("Current Directory " + subPath);
                            for (final File f : subPath.toFile().listFiles()) {
                                if (f.isFile() && f.getName().equals("myTempFile.txt")) {
                                    renameFile(f.getName(), subPath);
//                                } else if (f.isFile() && f.getName().equals("Readme.md")){
//                                    removeTopLine(f.getName(), subPath);
//                                }
//                                }else if (f.isFile() && f.getName().equals("Readme.md")){
//                                    f.delete();
                                }
                            }
                        }
                    }
                }
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
    private static void renameFile(String toBeRenamedFile, Path path) {

        File file = new File(path.toString() + "\\" + toBeRenamedFile);
        File newFile = new File(path.toString() + "\\Readme.md");
        System.out.println(file.toString());
        if(file.renameTo(newFile)){
            System.out.println("File rename success");;
        }else{
            System.out.println("File rename failed");
        }
    }

    private static void removeTopLine (String readmeFile, Path path) throws IOException {
        File inputFile = new File(path.toString() + "\\" + readmeFile);
        File tempFile = new File(path.toString() + "\\" + "myTempFile.txt");

        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

        String lineToRemove = "taskKey=";
        String currentLine;

        while ((currentLine = reader.readLine()) != null) {

            // trim newline when comparing with lineToRemove
            String trimmedLine = currentLine.trim();

            if (trimmedLine.contains(lineToRemove)) continue;

            writer.write(currentLine + System.getProperty("line.separator"));
        }

        writer.close();
        reader.close();

        boolean successful = tempFile.renameTo(inputFile);
    }
}