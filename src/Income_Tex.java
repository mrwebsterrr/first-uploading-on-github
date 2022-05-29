public class Income_Tex {
    public static void main(String[] arg){
        int a=1200000;
        if (a<250000){
            System.out.println("No Income tex for you.");
        } else if (a<500000) {
            System.out.println("Your tax is: "+(a*5)/100);
        } else if (a<1000000) {
            System.out.println("Your tax is: "+(a*20)/100);
        } else if (a>=1000000) {
            System.out.println("Your tax is: "+(a*30)/100);
        }
    }
}