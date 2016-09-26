package p2;

/**
 * Created by Administrator on 2016/9/25.
 */
public class Dog extends pet {
    @Override
    public String Feed(String Food) {
        return "ok";
    }

    @Override
    public String GetPetName() {
        return getClass().getName();
    }
}
