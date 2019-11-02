package org.shahid.creational.singleton.shahid;

import java.io.Serializable;

public class ElvisField {
    public static final ElvisField INSTANCE = new ElvisField();
    private ElvisField(){}
}
class ElvisFactory {
    public static ElvisFactory elvisFactory = null;
    private ElvisFactory(){}

    public static ElvisFactory getElvisFactoryInstance(){
        if (elvisFactory==null){
            elvisFactory = new ElvisFactory();
        }
        return elvisFactory;
    }
}
class ElvisFactorySerializable implements Serializable{
	private static final long serialVersionUID = 1L;
	public static transient ElvisFactorySerializable instance = null;
    private ElvisFactorySerializable(){}
    public static ElvisFactorySerializable getInstance() {
        if (instance==null){
            instance = new ElvisFactorySerializable();
        }
        return instance;
    }

    private Object readResolve(){
        return instance;
    }
}
enum ElvisEnum {
    INSTANCE;
    private int id;
    private String name;
    ElvisEnum(){
    }

    public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
}
class Demo{
	public static void main(String[] args) {
		ElvisEnum elvisEnum = ElvisEnum.INSTANCE;
		elvisEnum.setId(12);
		System.out.println(elvisEnum.getId());
	}
}