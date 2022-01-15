public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        float price = 300.75F;
        int miles = service.calculate(price);
        System.out.println(miles);
    }
}
