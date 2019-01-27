package stsm.buisness.entitys;

public enum Feature {
    SEEDSTARTER_SPECIFIC_SUBSTRATE("SEEDSTARTER_SPECIFIC_SUBSTRATE"),
    FERTILIZER("FERTILIZER"),
    PH_CORRECTOR("PH_CORRECTOR");

    public static final Feature[] ALL= {SEEDSTARTER_SPECIFIC_SUBSTRATE, FERTILIZER, PH_CORRECTOR};

    private String name;

    Feature(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
