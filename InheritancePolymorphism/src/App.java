package InheritancePolymorphism.src;

public class App {
    public static void main(String[] args) throws Exception {
        
        // TextBox textBox = new TextBox();
        // Input input = new Input();


        //------------------------------------------
        // textBox.setText("hallo kawan");
        // textBox.clear();


        //-------------------------------------------
        // Input input = new Input();
        // Input input2 = new Input();
        // System.out.println(input.equals(input2));

        
        //------------------------------------------
        // membuat overridding agar saat di compare menjadi true
        // karena point 1 dan 2 mempunyai parameter yg sama

        // TextBox textBox = new TextBox();
        // textBox.setText("Hallow semua");

        // Point point1 = new Point(1, 2);
        // Point point2 = new Point(1, 2);

        // System.out.println(point1.equals(point1));

        // System.out.println(point1.hashCode());
        // System.out.println(point2.hashCode());


        //---------------------------------------------
        // showInput(input);

        Input [] inputs = { new TextBox(), new CheckBox()};

        for (int i = 0; i < inputs.length; i++) {
            inputs[i].render();
        }
    }


    public static void showInput(Input input) {
        if (input instanceof TextBox) {
            TextBox textBox = (TextBox) input;
            textBox.setText("text sudah di ganti");
        }
        
        System.out.println(input);
    }
}
