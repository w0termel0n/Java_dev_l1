import java.util.*;

public class Money {
    public static final record Denomination(String name, double amt, String form, String img) {}
    public static final Denomination[] money = {
            new Denomination("Penny",0.01,"coin","assets/penny.png"),
            new Denomination("Nickel",0.05,"coin","assets/nickel.png"),
            new Denomination("Dime",0.1,"coin","assets/dime.png"),
            new Denomination("Quarter",0.25,"coin","assets/quarter.png"),
            new Denomination("Dollar bill",1,"bill","assets/oned.png"),
            new Denomination("Five dollar bill",5,"bill","assets/fived.png"),
            new Denomination("Ten dollar bill",10,"bill","assets/tend.png"),
            new Denomination("Twenty dollar bill",20,"bill","assets/twend.png"),
            new Denomination("Fifty dollar bill",50,"bill","assets/fiftd.png"),
            new Denomination("Hundred dollar bill",100,"bill","assets/hundd.png"),
            new Denomination("Thousand dollar bill",1000,"bill","assets/thoud.png")
    };
}
