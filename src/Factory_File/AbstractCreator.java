package Factory_File;

public abstract class AbstractCreator {
	abstract IFile getRecord(String fileName);
}