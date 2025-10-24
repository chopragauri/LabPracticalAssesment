class Box<T> {
    private T value;
    public void set(T value) {
        this.value = value;
    }
    public T get() {
        return value;
    }
}

public class Q7 {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.set("Gauri");
        String str = stringBox.get();
        System.out.println("String value: " + str);
        Box<Integer> integerBox = new Box<>();
        integerBox.set(123);
        int number = integerBox.get();
        System.out.println("Integer value: " + number);
    }
}
