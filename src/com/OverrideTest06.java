package com;

public class OverrideTest06{
    static {
        System.out.println("hello");
    }
    public static final String NAME="12312";

    public static void main(String[] args){
        System.out.println(NAME);
    }
    inin inin=new inin();
}

interface inthehouse{
    int one();
}
interface inthebuilding{
    String two();
}
interface inthekfc extends inthehouse,inthebuilding{
    int three();
    default int four(){
        return 123;
    }
}

class inin implements inthekfc{

    @Override
    public int one() {
        return 0;
    }

    @Override
    public String two() {
        return null;
    }

    @Override
    public int three() {
        return 0;
    }
    public int four(){
        return 123;
    }
}