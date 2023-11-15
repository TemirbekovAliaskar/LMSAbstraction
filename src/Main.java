public class Main {
    public static void main(String[] args) {


        RealMadrid realMadrid = new RealMadrid(3,5);
        Arsenal arsenal = new Arsenal(4,9);
        ManchesterCity manchesterCity = new ManchesterCity(2,7);
        Liverpool liverpool = new Liverpool(4,9);
        Dordoi dordoi = new Dordoi(5,7);

        System.out.println("realMadrid.getPerimetr() = " + realMadrid.getPerimetr());
        System.out.println("arsenal.getPerimetr() = " + arsenal.getPerimetr());
        System.out.println("manchesterCity.getPerimetr() = " + manchesterCity.getPerimetr());
        System.out.println("liverpool.getPerimetr() = " + liverpool.getPerimetr());
        System.out.println("dordoi.getPerimetr() = " + dordoi.getPerimetr());
    }
}