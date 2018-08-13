package Factory_File;

public class GenericFile implements IFile {

    String fileName;

    public GenericFile(String newGenericFileName) {
        this.fileName = newGenericFileName;
    }

    @Override
    public String getInfo() {
        return this.fileName;
    }

}
