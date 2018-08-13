package Factory_File;

public class ConcreteCreator extends AbstractCreator {
    
    @Override
    IFile getRecord(String fileName) {
        return new GenericFile(fileName);
    }

}