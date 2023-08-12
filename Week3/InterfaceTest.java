package Online_Code_Samples.Week3;

import java.util.ArrayList;
import java.util.List;

interface Interface {
    Object get();
    boolean add(Integer o);
    int size();
}

class IntegerTest implements Interface{

    List<Integer> integerList = new ArrayList<>();
    private int count = 0, size = 0;
    //Interface methods with @Override
    @Override
    public Integer get() {
        return integerList.get(count);
    }
    @Override
    public boolean add(Integer number) {
        count++;
        return integerList.add(number);
    }
    @Override
    public int size() {
        return integerList.size();
    }
    //Other methods
    public int getCount() {        return count;    }
    public void setCount(int count) {        this.count = count;    }
    public int getSize() {        return size;    }
}

