package cn.withstars;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: withstars
 * Date: 2018-03-04
 * Time: 19:30
 * Mail: withstars@126.com
 */
public abstract class Shape implements Cloneable {

    private String id;
    protected String type;

    abstract void draw();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object cloneObject = null;
        try {
            cloneObject=super.clone();
        }catch (Exception e){
            e.printStackTrace();
        }
        return cloneObject;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }
}
