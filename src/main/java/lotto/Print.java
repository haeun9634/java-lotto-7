package lotto;

import java.util.List;

public class Print {

    public static void printLottos(List<Lotto> lottos){
        for (Lotto lotto : lottos) {
            System.out.println(lotto);
        }
    }
}
