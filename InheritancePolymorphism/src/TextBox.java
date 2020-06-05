package InheritancePolymorphism.src;

public class TextBox extends Input {
    private String text = "";

    public TextBox(
        // boolean isEnabled, String text
    ) {
        // super(isEnabled);
        // this.text = text;
        System.out.println("ini class textbox");
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void clear() {
        this.text = "";
    }

    public void render() {
        System.out.println("render textbox");
    }

    @Override //anotation
    public String toString() {
        return this.text;
    }

}