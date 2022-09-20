package org.launchcode.studio7;

import java.util.Objects;

public abstract class BaseDisc {
    private String name;
    private int storageCapacity;
    private String discType;


    public BaseDisc(String aName, int aStorageCapacity, String aDiscType){
        name = aName;
        storageCapacity = aStorageCapacity;
        discType = aDiscType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public String getDiscType() {
        return discType;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseDisc baseDisc = (BaseDisc) o;
        return storageCapacity == baseDisc.storageCapacity && Objects.equals(name, baseDisc.name) && Objects.equals(discType, baseDisc.discType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, storageCapacity, discType);
    }
}
