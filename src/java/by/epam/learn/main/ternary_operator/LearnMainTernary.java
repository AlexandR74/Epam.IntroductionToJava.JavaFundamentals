package java.by.epam.learn.main.ternary_operator;


/* необходимо назначить процент скидки покупателю от купленых товаров
 * если количество товара больше 3 то скидка 10%
 * если меньше либо равно 3 то скидки не будет.
 */
public class LearnMainTernary {
    public static void main(String[] args) {


        int bonus;

        int discount = 10;

        int purchaseItem = 5;

        final int DISCOUNT_LIMIT = 3;

        // выражение с IF
        //    if (purchaseItem > DISCOUNT_LIMIT) {
        //        bonus = discount;
        //    } else {
        //        bonus = 0;
        //      System.out.println(bonus);
        //    }


        //  тернальный оператор
        bonus = purchaseItem > DISCOUNT_LIMIT ? discount: 0;

    }
}



