package sm.model;

import com.alibaba.fastjson.JSON;

import java.io.Serializable;

public class BaseModel implements Serializable, Cloneable {

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }

    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
