package stsm.buisness.entitys;

public enum Type {
    PLASTIC("PLASTIC"),
    WOOD("WOOD");

    public static final Type[] ALL = {PLASTIC,WOOD};
    private final String name;

    Type(String name) {
        this.name = name;
    }

}
