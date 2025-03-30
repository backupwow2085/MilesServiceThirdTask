public class BonusMilesService {
    public int calculate(int price) {
        int rublesPerMile = 20; // 1 миля за каждые 20 рублей
        return price / rublesPerMile; // Возвращаем количество миль
    }
}