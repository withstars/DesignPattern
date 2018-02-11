/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: withstars
 * Date: 2018-02-11
 * Time: 22:22
 * Mail: withstars@126.com
 */
public abstract class Game {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    public final void palyGame(){
        initialize();
        startPlay();
        endPlay();
    }
}
