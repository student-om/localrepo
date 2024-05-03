//Readme.md is a folder and name ending with git is also a folder
import java.io.File;
class FilesFolderExample{
	int javaFileCounter;
	int classFileCounter;
	int FolderCounter;
	int Pngfiles;
	int Otherfiles;
	
	public static void main(String args[]){
	FilesFolderExample fpp = new FilesFolderExample();
	fpp.setNumberOfFilesAndFolder("/home/om/git/localrepo");
	System.out.println(fpp.FolderCounter);
	System.out.println(fpp.javaFileCounter);
	System.out.println(fpp.classFileCounter);
	System.out.println(fpp.Pngfiles);
	System.out.println(fpp.Otherfiles);
	}
	
	public void setNumberOfFilesAndFolder(String path){
	File file = new File(path);
	//System.out.println(file.getPath());   /home/om/git/localrepo
	//System.out.println(file.getParent());  /home/om/git
	if(path.endsWith(".java")){
	javaFileCounter=1;
	FolderCounter=0;
	}
	
	else if(path.endsWith(".class")){
	classFileCounter=1;
	FolderCounter=0;
	}
	
	else if(!file.exists()){
	System.out.println("File does not exist");
	}
	
	
	
	else{
	File[] array;
	array = file.listFiles();

		for(int i=0;i<array.length;i++){
		String NewPath = array[i].getAbsolutePath();// path from ./home
		if(file.exists()){
			if(NewPath.endsWith(".java")){
			javaFileCounter++;
			}
			
			else if(NewPath.endsWith(".class")){
			classFileCounter++;
			}
			else if(NewPath.endsWith(".png")){
			Pngfiles++;
			}
			else if(NewPath.contains(".")){
			Otherfiles++;
			}
			
			
			else{
				if(array[i].isDirectory()){
				String foldername = array[i].toString();
				if(foldername.endsWith(".git") || foldername.endsWith(".md")){
				
				}
				else{
				setNumberOfFilesAndFolder(NewPath);
				FolderCounter++;
				}
				
				}
			}
			}
		}
	}
	
	}

}
