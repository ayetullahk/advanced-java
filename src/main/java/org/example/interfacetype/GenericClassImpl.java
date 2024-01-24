package org.example.interfacetype;


//eğer bir generic interface implemet ederseniz class da generic olması gerekir
public class GenericClassImpl<T> implements Genericinterface<T>{
    @Override
    public void setValue(T t) {

    }

    @Override
    public T getValue() {
        return null;
    }
}
