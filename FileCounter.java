import java.io.File;

public class FileCounter {

    public static void main(String[] args) {
        String path = "/home/om/git/localrepo"; // Replace this with the path you want to count files and folders in
        File directory = new File(path);
        
        if (directory.exists() && directory.isDirectory()) {
            int fileCount = 0;
            int folderCount = 0;
            
            countFilesAndFolders(directory, fileCount, folderCount);
            
            System.out.println("Number of files: " + fileCount);
            System.out.println("Number of folders: " + folderCount);
        } else {
            System.out.println("The specified directory does not exist or is not a directory.");
        }
    }
    
    public static void countFilesAndFolders(File directory, int fileCount, int folderCount) {
        File[] files = directory.listFiles();
        
        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    fileCount++;
                } else if (file.isDirectory()) {
                    folderCount++;
                    countFilesAndFolders(file, fileCount, folderCount); // Recursively count files and folders in subdirectories
                }
            }
        } else {
            System.out.println("Unable to list files in the specified directory.");
        }
    }
}

