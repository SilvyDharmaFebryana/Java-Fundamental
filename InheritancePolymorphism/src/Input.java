package InheritancePolymorphism.src;

public abstract class Input {
    private boolean isEnabled = true;

    public Input(
        // boolean isEnabled
    ) {
        System.out.println("ini class input");
        // this.isEnabled = isEnabled;
    }

    public void disable() {
        this.isEnabled = false;
    }

    public boolean isEnabled() {
        return this.isEnabled;
    }

    public void render() {
        
    }

    @Override
    public String toString() {
        return "ini toStirng class input gaissssss yang udi di override";
    }


}