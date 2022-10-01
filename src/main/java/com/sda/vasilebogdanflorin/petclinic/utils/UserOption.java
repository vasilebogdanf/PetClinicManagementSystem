package com.sda.vasilebogdanflorin.petclinic.utils;

public enum UserOption {
    ADD_VET(1,"Add a new value"),
    VIEW_ALL_VETS(2,"View all vets"),
    VIEW_VET_BY_ID(3,"View vet by id"),
    EXIT(99,"Exit!"),
    UNKNOWN(999999,"Invalid Option Selected");

    private final int numericOption;
    private  String displayValue;

    public static  UserOption findByNumericOption (int numericOption){
        for(UserOption value:UserOption.values()){
            if(numericOption== value.getNumericOption()){
                return value;
            }
        }
        return UNKNOWN;
    }

    UserOption(int numericOption, String displayValue) {
        this.numericOption = numericOption;
        this.displayValue = displayValue;
    }
    UserOption(int numericOption) {
        this.numericOption = numericOption;
    }

    public static void displayAllOption(){
        for (UserOption value : values()) {
            if(value!=UserOption.UNKNOWN)
            System.out.println(value.getNumericOption()+"->"+value.displayValue);
        }

    }
    public int getNumericOption() {
        return numericOption;
    }
    public String getDisplayValue() {
        return displayValue;
    }

}
