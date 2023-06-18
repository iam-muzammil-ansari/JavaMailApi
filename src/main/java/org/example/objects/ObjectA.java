package org.example.objects;

public class ObjectA {

    private ObjectB objectB;

    public ObjectA(ObjectB objectB) {
        this.objectB = objectB;
    }

    public ObjectB getObjectB() {
        return objectB;
    }

    public void performAction() {
        System.out.println("Performing action in ObjectA");
        objectB.performAction();
    }

    @Override
    public String toString() {
        return "Car";
    }

    public void setObjectB(ObjectB objectB) {
        this.objectB = objectB;
    }
}
