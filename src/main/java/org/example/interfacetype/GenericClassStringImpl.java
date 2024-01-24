package org.example.interfacetype;


//norma bir sınıf oluşturmak için generic bir interface implement edilirse interface implemet edilirken
// tipini belirlemek zorundasın
public class GenericClassStringImpl implements Genericinterface<String>{
    @Override
    public void setValue(String s) {

    }

    @Override
    public String getValue() {
        return null;
    }
}
