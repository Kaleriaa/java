package pr_10_3;

public class TextFactory implements ICreateDocument{
    @Override
    public IDocument createNew() {
        return new TextDocument();
    }

    @Override
    public IDocument createOpen() {
        return new TextDocument();
    }
}
