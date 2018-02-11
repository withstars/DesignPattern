/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: withstars
 * Date: 2018-02-11
 * Time: 22:26
 * Mail: withstars@126.com
 */
public class BasketballGame extends Game{
    @Override
    void initialize() {
        System.out.println("BasketballGame is initializing!");
    }

    @Override
    void startPlay() {
        System.out.println("BasketballGame has started!");
    }

    @Override
    void endPlay() {
        System.out.println("BasketballGame has  ended!");
    }
}
