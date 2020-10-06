import java.util.ArrayList;
import java.nio.file.NotDirectoryException;
import java.io.File;
import java.util.NoSuchElementException;

public class FileExplorer {
    public static ArrayList<String> listContents(File currentFolder) throws NotDirectoryException{
        try{
            File directoryPath = new File(currentFolder);
        } catch (NotDirectoryException e){
            System.out.println("Not a directory");
        }
            String contents[] = directoryPath.list();
            ArrayList<String> list = new ArrayList<String>(Arrays.asList(contents));
            return list;
        
    }
    public static void main(String args[]){

    }

    
}
