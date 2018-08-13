package Factory_File;

import java.io.File;
import java.util.ArrayList;

public class Client {

    public static void main(String[] args) {
        
        ArrayList fileList = new ArrayList();

        AbstractCreator creator = new ConcreteCreator();
        
        //  "." means the actual directoy.
        File file = new File(".");
        
        //  Get all files from the current directory.
        //  The current directory is the project folder.
        String[] filesOfCurrentDirectory = file.list();

        for (String elementOfFileList : filesOfCurrentDirectory) {
            fileList.add(creator.getRecord(elementOfFileList));
        }

        //  Casting the "fileListElement"-object to a "IFile" type makes it possible to
        //  execute the ".getInfo()" function on "fileListElement".
        //  Else, the current location in the memory in hexadecimal code is displayed.
        fileList.forEach((fileListElement) -> {
            System.out.println(((IFile) fileListElement).getInfo() + " @ " + fileListElement.toString());
        });

    }

}