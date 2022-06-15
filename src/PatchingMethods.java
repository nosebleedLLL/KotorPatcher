import java.io.*;
import java.nio.file.Files;
import java.nio.file.attribute.FileTime;


public class PatchingMethods {
    public String Path;
    public String Filename;
    public String FileExtension;



    public PatchingMethods(String Path,String FileName,String FileExtension) {
        this.Path = Path;
        this.Filename = FileName;
        this.FileExtension = FileExtension;


    }

    @Override
    public String toString() {
        return Path+""+Filename+""+FileExtension;
    }



    public String CheckForFileType(String FileName) {
        String fileType = "Undetermined";
        final File file = new File(FileName);
        try{
            fileType = Files.probeContentType(file.toPath());

        }
       catch (IOException ioException){
            System.out.println("File type not detected for " + FileName);

        }

        return fileType;
    }


    public String editFile(String File) {
        String test= ".ini";
        if(CheckForFileType(test) == ".ini")
        {
            System.out.println("");
        }
        else if(CheckForFileType(test) == ".txt") {
            System.out.println("");
        }
        return File;
    }
}
