public class MyList<T>{


    Object[] array;
    int index = 0;

    public MyList(int initialCapacity){
        array = new Object[initialCapacity];
    }

    public MyList(){
        array = new Object[10];
    }

    public void add(T t){
        array[index++] = t;
    }

    public T get(int position){
        return (T) array[position];
    }

}
