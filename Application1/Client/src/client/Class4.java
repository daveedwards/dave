package client;

import java.util.List;

public class Class4 implements Interface1 {
    int h;

    /**
     * @associates <{client.Class5}>
     */
    private List newAtt;

    public Class4() {
        super();
    }

    public void setNewAtt(List newAtt) {
        this.newAtt = newAtt;
    }

    public List getNewAtt() {
        return newAtt;
    }
}
