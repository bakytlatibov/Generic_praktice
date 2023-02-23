public class Class  <T,T1>{
    private T value;
    private T1 value1;

    public Class(T value, T1 value1) {
        this.value = value;
        this.value1 = value1;
    }public Class(){

    }


    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public T1 getValue1() {
        return value1;
    }

    public void setValue1(T1 value1) {
        this.value1 = value1;
    }
    public <T extends Number >void maximum(T []numbers){

        int max=0;
        for (int i = 0; i <numbers.length ; i++) {
          max=Math.max(max, (Integer) numbers[i]);

    }System.out.println(max);
    }

    @Override
    public String toString() {
        return "Class{" +
                "value=" + value +
                ", value1=" + value1 +
                '}';
    }
}
