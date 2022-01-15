public class BonusMilesService {
    public int calculate(float cost) {
        int priceMile = 20;
        return (int) cost / priceMile;
    }
}